package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.SophiaCompiler;

public class Pass2 extends Visitor<Void> {

    private boolean hasErr;

    public boolean getHasError(){
        return hasErr;
    }

    @Override
    public Void visit(Program program) {
        hasErr = false;
        for(ClassDeclaration classDeclaration: program.getClasses()){
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        try {
            SymbolTableItem classSymbolTableItem = SymbolTable.top.getItem("Class_" + classDeclaration.getClassName().getName(), true);
            SymbolTable.push(((ClassSymbolTableItem)classSymbolTableItem).getClassSymbolTable());
        } catch (ItemNotFoundException e){
        }

        for(FieldDeclaration fieldDeclaration: classDeclaration.getFields()){
            fieldDeclaration.accept(this);
        }

        ConstructorDeclaration constructorDeclaration = classDeclaration.getConstructor();
        if(constructorDeclaration != null) {
            constructorDeclaration.accept(this);
        }

        for(MethodDeclaration methodDeclaration: classDeclaration.getMethods()){
            methodDeclaration.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {

        try {
            SymbolTable.top.getItem("Method_" + constructorDeclaration.getMethodName().getName(), false);
            SophiaCompiler.outputs.add("Line:" + constructorDeclaration.getLine() + ":" + "Redefinition of method " + constructorDeclaration.getMethodName().getName());
            hasErr = true;
        } catch (ItemNotFoundException e){
        }

        try{
            SymbolTable.top.getItem("Field_" + constructorDeclaration.getMethodName().getName(), false);
            SophiaCompiler.outputs.add("Line:" + constructorDeclaration.getLine() + ":" + "Name of method " + constructorDeclaration.getMethodName().getName() + " conflicts with a field's name");
            hasErr = true;
        } catch (ItemNotFoundException e1){
        }

        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        try {
            SymbolTable.top.getItem("Method_" + methodDeclaration.getMethodName().getName(), false);
            SophiaCompiler.outputs.add("Line:" + methodDeclaration.getLine() + ":" + "Redefinition of method " + methodDeclaration.getMethodName().getName());
            hasErr = true;
        } catch (ItemNotFoundException e){
        }

        try{
            SymbolTable.top.getItem("Field_" + methodDeclaration.getMethodName().getName(), false);
            SophiaCompiler.outputs.add("Line:" + methodDeclaration.getLine() + ":" + "Name of method " + methodDeclaration.getMethodName().getName() + " conflicts with a field's name");
            hasErr = true;
        } catch (ItemNotFoundException e1){
        }

        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        try {
            SymbolTable.top.getItem("Field_" + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
            SophiaCompiler.outputs.add("Line:" + fieldDeclaration.getLine() + ":" + "Redefinition of field " + fieldDeclaration.getVarDeclaration().getVarName().getName());
            hasErr = true;
        } catch (ItemNotFoundException e){
            SymbolTable currentParent =  SymbolTable.top.pre;
            while (currentParent != null) {
                try{
                    SymbolTableItem methodItem = currentParent.getItemInCurrSymbolTable("Method_" + fieldDeclaration.getVarDeclaration().getVarName().getName());
                    SophiaCompiler.outputs.add("Line:" + ((MethodSymbolTableItem)methodItem).getMethodDeclaration().getLine() + ":" + "Name of method " + fieldDeclaration.getVarDeclaration().getVarName().getName() + " conflicts with a field's name");
                } catch (ItemNotFoundException e1){
                }
                currentParent = currentParent.pre;
            }
        }

        return null;
    }
}
