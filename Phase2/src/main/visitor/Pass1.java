package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.Identifier;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.SophiaCompiler;

public class Pass1 extends Visitor<Void> {

    private boolean hasErr;
    private int numOfRepeatedClasses;

    public boolean getHasError(){
        return hasErr;
    }

    @Override
    public Void visit(Program program) {
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        SymbolTable.root = symbolTable;
        hasErr = false;
        numOfRepeatedClasses = 0;
        for(ClassDeclaration classDeclaration: program.getClasses()){
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        ClassSymbolTableItem classSymbolTableItem = new ClassSymbolTableItem(classDeclaration);
        try{
            SymbolTable.top.put(classSymbolTableItem);
        } catch (ItemAlreadyExistsException e){
            SophiaCompiler.outputs.add("Line:" + classDeclaration.getLine() + ":" + "Redefinition of class " + classDeclaration.getClassName().getName());
            hasErr = true;
            numOfRepeatedClasses++;
            classDeclaration.setClassName(new Identifier(classDeclaration.getClassName().getName() + "+" + Integer.toString(numOfRepeatedClasses)));
            try{
                classSymbolTableItem = new ClassSymbolTableItem(classDeclaration);
                SymbolTable.top.put(classSymbolTableItem);
            } catch (ItemAlreadyExistsException e1){
            }
        }
        SymbolTable newClassSymbolTable = new SymbolTable(SymbolTable.root);
        classSymbolTableItem.setClassSymbolTable(newClassSymbolTable);
        SymbolTable.push(newClassSymbolTable);

        for(FieldDeclaration fieldDeclaration: classDeclaration.getFields()){
            fieldDeclaration.accept(this);
        }

        ConstructorDeclaration constructorDeclaration = classDeclaration.getConstructor();
        if(constructorDeclaration != null){
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
        MethodSymbolTableItem constructorSymbolTableItem = new MethodSymbolTableItem(constructorDeclaration);
        try{
            SymbolTable.top.put(constructorSymbolTableItem);
        } catch (ItemAlreadyExistsException e){
            SophiaCompiler.outputs.add("Line:" + constructorDeclaration.getLine() + ":" + "Redefinition of method " + constructorDeclaration.getMethodName().getName());
            hasErr = true;
        }

        try{
            SymbolTable.top.getItem("Field_" + constructorDeclaration.getMethodName().getName(), true);
            SophiaCompiler.outputs.add("Line:" + constructorDeclaration.getLine() + ":" + "Name of method " + constructorDeclaration.getMethodName().getName() + " conflicts with a field's name");
            hasErr = true;
        } catch (ItemNotFoundException e1){
        }

        SymbolTable newMethodSymbolTable = new SymbolTable(SymbolTable.top);
        constructorSymbolTableItem.setMethodSymbolTable(newMethodSymbolTable);
        SymbolTable.push(newMethodSymbolTable);

        for(VarDeclaration args: constructorDeclaration.getArgs()){
            args.accept(this);
        }

        for(VarDeclaration localVars: constructorDeclaration.getLocalVars()){
            localVars.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(methodDeclaration);
        try{
            SymbolTable.top.put(methodSymbolTableItem);
        } catch (ItemAlreadyExistsException e){
            SophiaCompiler.outputs.add("Line:" + methodDeclaration.getLine() + ":" + "Redefinition of method " + methodDeclaration.getMethodName().getName());
            hasErr = true;
        }

        try{
            SymbolTable.top.getItem("Field_" + methodDeclaration.getMethodName().getName(), true);
            SophiaCompiler.outputs.add("Line:" + methodDeclaration.getLine() + ":" + "Name of method " + methodDeclaration.getMethodName().getName() + " conflicts with a field's name");
            hasErr = true;
        } catch (ItemNotFoundException e1){
        }

        SymbolTable newMethodSymbolTable = new SymbolTable(SymbolTable.top);
        methodSymbolTableItem.setMethodSymbolTable(newMethodSymbolTable);
        SymbolTable.push(newMethodSymbolTable);

        for(VarDeclaration args: methodDeclaration.getArgs()){
            args.accept(this);
        }

        for(VarDeclaration localVars: methodDeclaration.getLocalVars()){
            localVars.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        FieldSymbolTableItem fieldSymbolTableItem = new FieldSymbolTableItem(fieldDeclaration);
        try{
            SymbolTable.top.put(fieldSymbolTableItem);
        } catch (ItemAlreadyExistsException e){
            SophiaCompiler.outputs.add("Line:" + fieldDeclaration.getLine() + ":" + "Redefinition of field " + fieldDeclaration.getVarDeclaration().getVarName().getName());
            hasErr = true;
        }
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        LocalVariableSymbolTableItem localVariableSymbolTableItem = new LocalVariableSymbolTableItem(varDeclaration);
        try{
            SymbolTable.top.put(localVariableSymbolTableItem);
        } catch (ItemAlreadyExistsException e){
            SophiaCompiler.outputs.add("Line:" + varDeclaration.getLine() + ":" + "Redefinition of local variable " + varDeclaration.getVarName().getName());
            hasErr = true;
        }
        return null;
    }
}
