package main.visitor.typeChecker;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListNameType;
import main.ast.types.list.ListType;
import main.ast.types.single.BoolType;
import main.ast.types.single.ClassType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.compileErrorException.CompileErrorException;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;
import main.compileErrorException.typeErrors.UnsupportedTypeForPrint;
import main.compileErrorException.typeErrors.ConditionNotBool;
import main.compileErrorException.typeErrors.ContinueBreakNotInLoop;
import main.compileErrorException.typeErrors.ConstructorNotSameNameAsClass;
import main.compileErrorException.typeErrors.NoMainClass;
import main.compileErrorException.typeErrors.MainClassCantExtend;
import main.compileErrorException.typeErrors.CannotExtendFromMainClass;
import main.compileErrorException.typeErrors.NoConstructorInMainClass;
import main.compileErrorException.typeErrors.CannotHaveEmptyList;
import main.compileErrorException.typeErrors.ReturnValueNotMatchMethodReturnType;
import main.compileErrorException.typeErrors.MissingReturnStatement;
import main.compileErrorException.typeErrors.MainConstructorCantHaveArgs;
import main.compileErrorException.typeErrors.DuplicateListId;
import main.compileErrorException.typeErrors.ForeachCantIterateNoneList;
import main.compileErrorException.typeErrors.ForeachListElementsNotSameType;
import main.compileErrorException.typeErrors.ForeachVarNotMatchList;
import main.compileErrorException.typeErrors.ClassNotDeclared;

import java.util.ArrayList;

public class TypeChecker extends Visitor<Void> {
    private final Graph<String> classHierarchy;
    private final ExpressionTypeChecker expressionTypeChecker;
    private int numOfLoopBlcks = 0;
    private boolean hasMainClass = false; //set for error 25
    private Type returnTypeMethod = null; //set return type of method to check in error 14
    private boolean hasReturnStatement = false; //set for error 31

    public TypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(Program program) {
        for(ClassDeclaration classDeclaration : program.getClasses())
            classDeclaration.accept(this);
        //error 25
        if(!hasMainClass)
            program.addError(new NoMainClass());
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        this.expressionTypeChecker.setCurrentClassName(classDeclaration.getClassName());
        //error 17
        if(classDeclaration.getConstructor() != null){
            if(!classDeclaration.getClassName().getName().equals(classDeclaration.getConstructor().getMethodName().getName())){
                classDeclaration.addError(new ConstructorNotSameNameAsClass(classDeclaration.getConstructor().getLine()));
            }
        }

        //error 26 and error 28
        if(classDeclaration.getClassName().getName().equals("Main")){
            hasMainClass = true;
            //error 26
            if(classDeclaration.getParentClassName() != null)
                classDeclaration.addError(new MainClassCantExtend(classDeclaration.getLine()));
            //error 28
            if(classDeclaration.getConstructor() == null)
                classDeclaration.addError(new NoConstructorInMainClass(classDeclaration));
            //error29
            if(classDeclaration.getConstructor() != null){
                if(classDeclaration.getConstructor().getArgs().size() != 0)
                    classDeclaration.addError(new MainConstructorCantHaveArgs(classDeclaration.getConstructor().getLine()));
            }
        }

        //error 27
        if(classDeclaration.getParentClassName() != null) {
            if ((classDeclaration.getParentClassName().getName().equals("Main")) &&
                    !(classDeclaration.getClassName().getName().equals( "Main")))
                classDeclaration.addError(new CannotExtendFromMainClass(classDeclaration.getLine()));
        }

        //Start visiting
        //check parent's name exists
        if(classDeclaration.getParentClassName() != null){
            //error 2
            if(!classHierarchy.doesGraphContainNode(classDeclaration.getParentClassName().getName()))
                classDeclaration.addError(new ClassNotDeclared(classDeclaration.getLine(), classDeclaration.getParentClassName().getName()));
        }
        //check fields
        for(FieldDeclaration fieldDeclaration: classDeclaration.getFields())
            fieldDeclaration.accept(this);
        //check constructor
        ConstructorDeclaration constructorDeclaration = classDeclaration.getConstructor();
        if(constructorDeclaration != null)
            constructorDeclaration.accept(this);
        //check method
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods())
            methodDeclaration.accept(this);
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.expressionTypeChecker.setCurrentMethodName(constructorDeclaration.getMethodName());
        this.returnTypeMethod = constructorDeclaration.getReturnType();

        //check args
        for(VarDeclaration args: constructorDeclaration.getArgs())
            args.accept(this);
        //check local
        for(VarDeclaration localVar: constructorDeclaration.getLocalVars()){
            localVar.accept(this);
        }
        //check body
        for(Statement bodyStatement: constructorDeclaration.getBody())
            bodyStatement.accept(this);
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        this.expressionTypeChecker.setCurrentMethodName(methodDeclaration.getMethodName());

        //check args
        for(VarDeclaration args: methodDeclaration.getArgs())
            args.accept(this);
        //check local var
        for(VarDeclaration localVar: methodDeclaration.getLocalVars())
            localVar.accept(this);

        this.returnTypeMethod = methodDeclaration.getReturnType();
        for(Statement bodyStatement: methodDeclaration.getBody())
            bodyStatement.accept(this);
        //error 31
        if((!this.hasReturnStatement) && (!(methodDeclaration.getReturnType() instanceof NullType)))
            methodDeclaration.addError(new MissingReturnStatement(methodDeclaration));
        this.hasReturnStatement = false;
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        VarDeclaration varDeclaration = fieldDeclaration.getVarDeclaration();
        varDeclaration.accept(this);
        return null;
    }
    /**********************************************************************************************************/
    @Override

    public Void visit(VarDeclaration varDeclaration) {
        Type type = varDeclaration.getType();
        checkType(type, varDeclaration);
        return null;
    }

    private Void checkType(Type type, VarDeclaration varDeclaration) {
        //error 2
        if(type instanceof ClassType) {
            checkClassType((ClassType)type, varDeclaration);
        }

        //error 11 and 18
        if(type instanceof ListType) {
            checkListType((ListType) type, varDeclaration);
        }

        if(type instanceof FptrType) {
            checkFptrType((FptrType) type, varDeclaration);
        }
        return null;
    }

    private Void checkClassType(ClassType type, VarDeclaration varDeclaration){
        if(!this.classHierarchy.doesGraphContainNode(type.getClassName().getName())) {
            varDeclaration.addError(new ClassNotDeclared(varDeclaration.getLine(), type.getClassName().getName()));
        }
        return null;
    }

    private Void checkListType(ListType type, VarDeclaration varDeclaration) {
        ArrayList<ListNameType> elementsTypes = type.getElementsTypes();
        if(elementsTypes.size() == 0) {
            varDeclaration.addError(new CannotHaveEmptyList(varDeclaration.getLine()));
        }
        else {
            for(ListNameType l : elementsTypes) {
                checkType(l.getType(), varDeclaration);
            }
            if(!type.checkIfListHasTwoSameId()) {
                varDeclaration.addError(new DuplicateListId(varDeclaration.getLine()));
            }
        }
        return null;
    }

    private Void checkFptrType(FptrType type, VarDeclaration varDeclaration) {
        ArrayList<Type> argumentsTypes = ((FptrType) type).getArgumentsTypes();
        for(Type t : argumentsTypes) {
            checkType(t, varDeclaration);
        }
        checkType(((FptrType) type).getReturnType(), varDeclaration);
        return null;
    }

    /**********************************************************************************************************/
    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Expression left = assignmentStmt.getlValue();
        Expression right = assignmentStmt.getrValue();
        BinaryExpression binaryExpression = new BinaryExpression(left, right, BinaryOperator.assign);
        binaryExpression.setLine(assignmentStmt.getLine());

        //error 6 and 4
        binaryExpression.accept(this.expressionTypeChecker);
        if(binaryExpression.hasError()) {
            for(CompileErrorException c : binaryExpression.getErrors()) {
                assignmentStmt.addError(c);
            }
        }
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //error 5
        Expression condition = conditionalStmt.getCondition();
        Type conditionType = condition.accept(this.expressionTypeChecker);
        if((!(conditionType instanceof BoolType)) && (!(conditionType instanceof NoType)))
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));

        Statement thenBody = conditionalStmt.getThenBody();
        thenBody.accept(this);

        Statement elseBody = conditionalStmt.getElseBody();
        if(elseBody != null)
            elseBody.accept(this);
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        MethodCall methodCall = methodCallStmt.getMethodCall();
        methodCall.accept(this.expressionTypeChecker);
        //error 13
        if(this.expressionTypeChecker.voidMehtod) {
            methodCall.removeVoidError();
        }
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit(PrintStmt print) {
        //error 10
        Expression arg = print.getArg();
        Type argType = arg.accept(this.expressionTypeChecker);
        if((!(argType instanceof StringType)) && (!(argType instanceof BoolType)) &&
                (!(argType instanceof IntType)) && (!(argType instanceof NoType)))
            print.addError(new UnsupportedTypeForPrint(print.getLine()));
        return null;
    }
    /**********************************************************************************************************/
    @Override //error 14
    public Void visit(ReturnStmt returnStmt) {
        this.hasReturnStatement = true;
        Expression returnExpr = returnStmt.getReturnedExpr();
        if (returnExpr == null) {
            if (this.returnTypeMethod instanceof NullType)
                return null;
            else {
                returnStmt.addError(new ReturnValueNotMatchMethodReturnType(returnStmt));
                return null;
            }
        }
        Type returnType = returnExpr.accept(this.expressionTypeChecker);

        if (!(this.expressionTypeChecker.areTwoTypesEqual(this.returnTypeMethod, returnType))) {
            returnStmt.addError(new ReturnValueNotMatchMethodReturnType(returnStmt));
        }
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit (BreakStmt breakStmt){
        //error 9
        //break did not call in for and foreach because it is null
        if (this.numOfLoopBlcks <= 0)
            breakStmt.addError(new ContinueBreakNotInLoop(breakStmt.getLine(), 0));
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit (ContinueStmt continueStmt){
        //error 9
        //continue did not call in for and foreach because it is null
        if (this.numOfLoopBlcks <= 0)
            continueStmt.addError(new ContinueBreakNotInLoop(continueStmt.getLine(), 1));
        return null;
    }
    /**********************************************************************************************************/
    @Override //error 20 and 21 should become correct for all types
    public Void visit (ForeachStmt foreachStmt){
        this.numOfLoopBlcks++;
        Identifier variable = foreachStmt.getVariable();
        Type typeOfLeftOfIn = variable.accept(this.expressionTypeChecker);

        Expression list = foreachStmt.getList();
        Type typeOfRightOfIn = list.accept(this.expressionTypeChecker);

        //if typeOfRightOfIn = NoType we do not get error 19,20,21
        if(!(typeOfRightOfIn instanceof NoType)) {
            //error 19
            if (!(typeOfRightOfIn instanceof ListType))
                foreachStmt.addError(new ForeachCantIterateNoneList(foreachStmt.getLine()));
            else {
                if (!this.expressionTypeChecker.checkType(typeOfRightOfIn)) {
                    return null;
                }
                //error 20
                if(!this.expressionTypeChecker.hasOneType(((ListType) typeOfRightOfIn).getElementsTypes()))
                    foreachStmt.addError(new ForeachListElementsNotSameType(foreachStmt.getLine()));

                if (!this.expressionTypeChecker.checkType(typeOfLeftOfIn)) {
                    return null;
                }
                //error 21
                if((!this.expressionTypeChecker.areTwoTypesEqual(((ListType) typeOfRightOfIn).getElementsTypes().get(0).getType(), typeOfLeftOfIn)) ||
                        (!this.expressionTypeChecker.areTwoTypesEqual(typeOfLeftOfIn, ((ListType) typeOfRightOfIn).getElementsTypes().get(0).getType())))
                    foreachStmt.addError(new ForeachVarNotMatchList(foreachStmt));
            }
        }

        //check body
        Statement body = foreachStmt.getBody();
        body.accept(this);
        this.numOfLoopBlcks--;
        return null;
    }
    /**********************************************************************************************************/
    @Override
    public Void visit (ForStmt forStmt){
        this.numOfLoopBlcks++;
        //error 5
        Expression condition = forStmt.getCondition();
        Type conditionType = condition.accept(this.expressionTypeChecker);
        if ((!(conditionType instanceof BoolType)) && (!(conditionType instanceof NoType)))
            forStmt.addError(new ConditionNotBool(forStmt.getLine()));

        //check init
        AssignmentStmt initialize = forStmt.getInitialize();
        initialize.accept(this);
        //check update
        AssignmentStmt update = forStmt.getUpdate();
        update.accept(this);
        //check body
        Statement body = forStmt.getBody();
        body.accept(this);
        this.numOfLoopBlcks--;
        return null;
        }
    }
