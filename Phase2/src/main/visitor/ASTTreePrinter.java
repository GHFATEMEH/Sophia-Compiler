package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;


public class ASTTreePrinter extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        System.out.println("Line:" + program.getLine() + ":" + program.toString());
        for(ClassDeclaration classDeclaration: program.getClasses()){
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        System.out.println("Line:" + classDeclaration.getLine() + ":" + classDeclaration.toString());

        //class name
        Identifier className = classDeclaration.getClassName();
        className.accept(this);

        // parent name
        Identifier parentClassName = classDeclaration.getParentClassName();
        if(parentClassName != null){
            parentClassName.accept(this);
        }

        // field
        for(FieldDeclaration fieldDeclaration: classDeclaration.getFields()){
            fieldDeclaration.accept(this);
        }

        // constructor
        ConstructorDeclaration constructorDeclaration = classDeclaration.getConstructor();
        if(constructorDeclaration != null) {
            constructorDeclaration.accept(this);
        }

        // method
        for(MethodDeclaration methodDeclaration: classDeclaration.getMethods()){
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        System.out.println("Line:" + constructorDeclaration.getLine() + ":" + constructorDeclaration.toString());

        // method name
        Identifier methodName = constructorDeclaration.getMethodName();
        methodName.accept(this);

        // args
        for(VarDeclaration args: constructorDeclaration.getArgs()){
            args.accept(this);
        }

        // localVars
        for(VarDeclaration localVars: constructorDeclaration.getLocalVars()){
            localVars.accept(this);
        }

        // body
        for(Statement body: constructorDeclaration.getBody()){
            body.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        System.out.println("Line:" + methodDeclaration.getLine() + ":" + methodDeclaration.toString());

        // method name
        Identifier methodName = methodDeclaration.getMethodName();
        methodName.accept(this);

        // args
        for(VarDeclaration args: methodDeclaration.getArgs()){
            args.accept(this);
        }

        // localVars
        for(VarDeclaration localVars: methodDeclaration.getLocalVars()){
            localVars.accept(this);
        }

        // body
        for(Statement body: methodDeclaration.getBody()){
            body.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        System.out.println("Line:" + fieldDeclaration.getLine() + ":" + fieldDeclaration.toString());

        VarDeclaration varDeclaration = fieldDeclaration.getVarDeclaration();
        varDeclaration.accept(this);
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        System.out.println("Line:" + varDeclaration.getLine() + ":" + varDeclaration.toString());

        Identifier varName = varDeclaration.getVarName();
        varName.accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        System.out.println("Line:" + assignmentStmt.getLine() + ":" + assignmentStmt.toString());

        Expression lValue = assignmentStmt.getlValue();
        lValue.accept(this);

        Expression rValue = assignmentStmt.getrValue();
        rValue.accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        System.out.println("Line:" + blockStmt.getLine() + ":" + blockStmt.toString());
        for(Statement statements: blockStmt.getStatements()){
            statements.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        System.out.println("Line:" + conditionalStmt.getLine() + ":" + conditionalStmt.toString());

        Expression condition = conditionalStmt.getCondition();
        condition.accept(this);

        Statement thenBody = conditionalStmt.getThenBody();
        thenBody.accept(this);

        Statement elseBody = conditionalStmt.getElseBody();
        if(elseBody != null){
            elseBody.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        System.out.println("Line:" + methodCallStmt.getLine() + ":" + methodCallStmt.toString());

        MethodCall methodCall = methodCallStmt.getMethodCall();
        methodCall.accept(this);

        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        System.out.println("Line:" + print.getLine() + ":" + print.toString());

        Expression arg = print.getArg();
        arg.accept(this);

        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        System.out.println("Line:" + returnStmt.getLine() + ":" + returnStmt.toString());

        Expression returnedExpr = returnStmt.getReturnedExpr();
        if(returnedExpr != null){
            returnedExpr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        System.out.println("Line:" + breakStmt.getLine() + ":" + breakStmt.toString());
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        System.out.println("Line:" + continueStmt.getLine() + ":" + continueStmt.toString());
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        System.out.println("Line:" + foreachStmt.getLine() + ":" + foreachStmt.toString());

        Identifier variable = foreachStmt.getVariable();
        variable.accept(this);

        Expression list = foreachStmt.getList();
        list.accept(this);

        Statement body = foreachStmt.getBody();
        body.accept(this);
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        System.out.println("Line:" + forStmt.getLine() + ":" + forStmt.toString());

        AssignmentStmt initialize = forStmt.getInitialize();
        if(initialize != null){
            initialize.accept(this);
        }

        Expression condition = forStmt.getCondition();
        if(condition != null){
            condition.accept(this);
        }

        AssignmentStmt update = forStmt.getUpdate();
        if(update != null){
            update.accept(this);
        }

        Statement body = forStmt.getBody();
        body.accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        System.out.println("Line:" + binaryExpression.getLine() + ":" + binaryExpression.toString());

        Expression firstOperand = binaryExpression.getFirstOperand();
        firstOperand.accept(this);

        Expression secondOperand = binaryExpression.getSecondOperand();
        secondOperand.accept(this);
        //binary operator
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        System.out.println("Line:" + unaryExpression.getLine() + ":" + unaryExpression.toString());

        Expression operand = unaryExpression.getOperand();
        operand.accept(this);
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        System.out.println("Line:" + objectOrListMemberAccess.getLine() + ":" + objectOrListMemberAccess.toString());

        Expression instance = objectOrListMemberAccess.getInstance();
        instance.accept(this);

        Identifier memberName = objectOrListMemberAccess.getMemberName();
        memberName.accept(this);

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println("Line:" + identifier.getLine() + ":" + identifier.toString());
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        System.out.println("Line:" + listAccessByIndex.getLine() + ":" + listAccessByIndex.toString());

        Expression instance = listAccessByIndex.getInstance();
        instance.accept(this);

        Expression index = listAccessByIndex.getIndex();
        index.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        System.out.println("Line:" + methodCall.getLine() + ":" + methodCall.toString());

        Expression instance = methodCall.getInstance();
        instance.accept(this);

        for(Expression args: methodCall.getArgs()){
            args.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        System.out.println("Line:" + newClassInstance.getLine() + ":" + newClassInstance.toString());

        for(Expression args: newClassInstance.getArgs()){
            args.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        System.out.println("Line:" + thisClass.getLine() + ":" + thisClass.toString());
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        System.out.println("Line:" + listValue.getLine() + ":" + listValue.toString());

        for(Expression elements: listValue.getElements()){
            elements.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        System.out.println("Line:" + nullValue.getLine() + ":" + nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        System.out.println("Line:" + intValue.getLine() + ":" + intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        System.out.println("Line:" + boolValue.getLine() + ":" + boolValue.toString());
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        System.out.println("Line:" + stringValue.getLine() + ":" + stringValue.toString());
        return null;
    }

}
