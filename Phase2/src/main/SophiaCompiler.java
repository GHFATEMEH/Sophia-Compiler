package main;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;
import main.visitor.ASTTreePrinter;
import main.visitor.Pass1;
import main.visitor.Pass2;
import main.symbolTable.items.SymbolTableItem;
import java.util.*;

public class SophiaCompiler {

    public static Set<String> outputs;

    public void compile(CharStream textStream) {
        outputs = new HashSet<String>();
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);
        Program program = sophiaParser.sophia().sophiaProgram;
        Pass1 pass1 = new Pass1();
        pass1.visit(program);
        setParents(program);
        Pass2 pass2 = new Pass2();
        pass2.visit(program);
        for( String strCurrentNumber : outputs ){
            System.out.println( strCurrentNumber );
        }
        if (!pass1.getHasError() && !pass2.getHasError()) {
            ASTTreePrinter ASTPrinter = new ASTTreePrinter();
            ASTPrinter.visit(program);
        }
    }

    private void setParents(Program program) {
        for(ClassDeclaration classDeclaration: program.getClasses()){
            if (classDeclaration.getParentClassName() != null) {
                try{
                    SymbolTableItem classSymbolTableItem = SymbolTable.root.getItem("Class_" + classDeclaration.getClassName().getName(), true);
                    SymbolTable classSymbolTable = ((ClassSymbolTableItem)classSymbolTableItem).getClassSymbolTable();
                    try{
                        SymbolTableItem parentClassSymbolTableItem = SymbolTable.root.getItem("Class_" + classDeclaration.getParentClassName().getName(), true);
                        SymbolTable parentClassSymbolTable = ((ClassSymbolTableItem)parentClassSymbolTableItem).getClassSymbolTable();
                        classSymbolTable.pre = parentClassSymbolTable;
                    } catch (ItemNotFoundException e1){
                    }
                } catch (ItemNotFoundException e){
                }
            }
        }
    }
}
