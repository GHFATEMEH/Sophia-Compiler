package main.visitor.typeChecker;

import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.list.ListNameType;
import main.ast.types.list.ListType;
import main.ast.types.single.ClassType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.compileErrorException.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

import main.ast.types.single.BoolType;
import main.ast.types.functionPointer.FptrType;

import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    private final Graph<String> classHierarchy;
    public Identifier currentClassName;
    public Identifier currentMethodName;
    public boolean voidMehtod;

    public ExpressionTypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    public void setCurrentClassName(Identifier className){ this.currentClassName = className;}
    public void setCurrentMethodName(Identifier methodName){ this.currentMethodName = methodName;}


    /*********************************************************************************************/
    @Override //error 4 and 6
    public Type visit(BinaryExpression binaryExpression) {
        BinaryOperator op = binaryExpression.getBinaryOperator();
        binaryExpression.valType = ValueType.rval;
        if (op == BinaryOperator.and || op == BinaryOperator.or) {
            return checkBoolExpression(binaryExpression);
        }
        else if (op == BinaryOperator.eq || op == BinaryOperator.neq) {
            return checkEqualityExpression(binaryExpression);
        }
        else if (op == BinaryOperator.assign) {
            binaryExpression.valType = ValueType.lval;
            return checkAssignExpression(binaryExpression);
        }
        else {
            return checkIntExpression(binaryExpression);
        }
    }

    private Type checkBoolExpression(BinaryExpression binaryExpression) {
        Type firstOperandType = binaryExpression.getFirstOperand().accept(this);
        Type secondOperandType = binaryExpression.getSecondOperand().accept(this);

        if(!checkType(firstOperandType) || !(checkType(secondOperandType))) {
            return new NoType();
        }

        if ((firstOperandType instanceof BoolType) && (secondOperandType instanceof BoolType)) {
            return new BoolType();
        }
        else if (((firstOperandType instanceof BoolType) && (secondOperandType instanceof NoType)) ||
                ((firstOperandType instanceof NoType) && (secondOperandType instanceof BoolType)) ||
                ((firstOperandType instanceof NoType) && (secondOperandType instanceof NoType))) {
            return new NoType();
        }
        else {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
    }

    private Type checkIntExpression(BinaryExpression binaryExpression) {
        Type firstOperandType = binaryExpression.getFirstOperand().accept(this);
        Type secondOperandType = binaryExpression.getSecondOperand().accept(this);
        if(!checkType(firstOperandType) || !(checkType(secondOperandType))) {
            return new NoType();
        }
        BinaryOperator op = binaryExpression.getBinaryOperator();
        if (op == BinaryOperator.gt || op == BinaryOperator.lt) {
            if ((firstOperandType instanceof IntType) && (secondOperandType instanceof IntType)) {
                return new BoolType();
            }
            else if (((firstOperandType instanceof IntType) && (secondOperandType instanceof NoType)) ||
                    ((firstOperandType instanceof NoType) && (secondOperandType instanceof IntType)) ||
                    ((firstOperandType instanceof NoType) && (secondOperandType instanceof NoType))) {
                return new NoType();
            }
            else {
                binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getBinaryOperator().name()));
                return new NoType();
            }
        }
        if ((firstOperandType instanceof IntType) && (secondOperandType instanceof IntType)) {
            return new IntType();
        }
        else if (((firstOperandType instanceof IntType) && (secondOperandType instanceof NoType)) ||
                ((firstOperandType instanceof NoType) && (secondOperandType instanceof IntType)) ||
                ((firstOperandType instanceof NoType) && (secondOperandType instanceof NoType))) {
            return new NoType();
        }
        else {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
    }

    private Type checkEqualityExpression(BinaryExpression binaryExpression) {
        Type firstOperandType = binaryExpression.getFirstOperand().accept(this);
        Type secondOperandType = binaryExpression.getSecondOperand().accept(this);

        if(!checkType(firstOperandType) || !(checkType(secondOperandType))) {
            return new NoType();
        }
        if((firstOperandType instanceof ListType) || (secondOperandType instanceof ListType)){
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }

        else if((firstOperandType instanceof NoType) || (secondOperandType instanceof NoType))
            return new NoType();
        else if((firstOperandType instanceof NullType) &&
          ( (secondOperandType instanceof NullType) || (secondOperandType instanceof FptrType) ||
                  (secondOperandType instanceof ClassType)))
            return new BoolType();
        else if((secondOperandType instanceof NullType) &&
                ( (firstOperandType instanceof ClassType) || (firstOperandType instanceof FptrType)))
            return new BoolType();
        else if ((firstOperandType instanceof IntType) && (secondOperandType instanceof IntType)) {
            return new BoolType();
        }
        else if ((firstOperandType instanceof BoolType) && (secondOperandType instanceof BoolType)) {
            return new BoolType();
        }
        else if ((firstOperandType instanceof StringType) && (secondOperandType instanceof StringType)) {
            return new BoolType();
        }
        else if (((firstOperandType instanceof ClassType) && (secondOperandType instanceof ClassType)) &&
                (((ClassType) firstOperandType).getClassName().getName().equals(((ClassType) secondOperandType).getClassName().getName()))){
            return new BoolType();
        }
        else if (((firstOperandType instanceof FptrType) && (secondOperandType instanceof FptrType)) &&
                (checkIfTwoFptrsEqual((FptrType)firstOperandType, (FptrType)secondOperandType) &&
                        checkIfTwoFptrsEqual((FptrType)secondOperandType, (FptrType)firstOperandType))){
            return new BoolType();
        }
        else {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
    }

    private Type checkAssignExpression(BinaryExpression binaryExpression) {
        boolean hasErr = false;
        Type leftType = binaryExpression.getFirstOperand().accept(this);
        Type rightType = binaryExpression.getSecondOperand().accept(this);

        if(checkType(leftType)) {
            if (binaryExpression.getFirstOperand().valType == ValueType.rval) {
                binaryExpression.addError(new LeftSideNotLvalue(binaryExpression.getLine()));
                hasErr = true;
            }
        }

        if (!areTwoTypesEqual(leftType, rightType)) {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), BinaryOperator.assign.name()));
            return new NoType();
        }

        if (hasErr) {
            return new NoType();
        }

        if ((leftType instanceof  NoType) || (rightType instanceof NoType)) {
            return new NoType();
        }

        return leftType;
    }

    // second <: first
    public boolean areTwoTypesEqual(Type first, Type second) {
        if (!checkType(first) || !(checkType(second))) {
            return true;
        }

        if ((first instanceof NoType) || (second instanceof NoType)) {
            return true;
        }

        if (first instanceof FptrType) {
            return checkFptrAssign((FptrType)first, second);
        }

        if (first instanceof ListType) {
            return checkListAssign((ListType)first, second);
        }

        if (first instanceof BoolType) {
            return checkBoolAssign(second);
        }

        if (first instanceof ClassType) {
            return checkClassAssign((ClassType)first, second);
        }

        if (first instanceof IntType) {
            return checkIntAssign(second);
        }

        if (first instanceof StringType) {
            return checkStringAssign(second);
        }

        if (first instanceof NullType) {
            return checkNullAssign(second);
        }
        return false;
    }

    private boolean checkFptrAssign(FptrType fptr, Type first) {
        if (!(first instanceof FptrType) && !(first instanceof NullType)) {
            return false;
        }
        if (first instanceof NullType) {
            return true;
        }
        return checkIfTwoFptrsEqual(fptr, (FptrType)first);
    }

    public boolean checkIfTwoFptrsEqual(FptrType first, FptrType second) {
        //check return type
        if (!areTwoTypesEqual(first.getReturnType(), second.getReturnType())) {
            return false;
        }
        //check arg type
        ArrayList<Type> firstArgs = first.getArgumentsTypes();
        ArrayList<Type> secondArgs = second.getArgumentsTypes();
        return checkIfTwoArrlistsEqual(firstArgs, secondArgs);
    }
    public boolean checkListAssign(ListType listType, Type first) {
        if (!(first instanceof ListType) && !(first instanceof NullType)) {
            return false;
        }
        if (first instanceof NullType) {
            return true;
        }
        return checkIfTwoArrlistsEqual(listType.getTypeList(), ((ListType)first).getTypeList());
    }

    // second <: first
    private boolean checkIfTwoArrlistsEqual(ArrayList<Type> first, ArrayList<Type> second) {
        if (first.size() != second.size()) {
            return false;
        }
        for (int i = 0; i < first.size(); i++) {
            if (!areTwoTypesEqual(first.get(i), second.get(i))) {
                return false;
            }
        }
        return true;
    }
    private boolean checkBoolAssign(Type second) {
        if (!(second instanceof BoolType)) {
            return false;
        }
        return true;
    }
    private boolean checkClassAssign(ClassType classType, Type first) {
        if (!(first instanceof ClassType) && !(first instanceof NullType)) {
            return false;
        }
        Identifier leftName = classType.getClassName();
        Identifier rightName = ((ClassType)first).getClassName();
        if (leftName.getName().equals(rightName.getName())) {
            return true;
        }
        if (classHierarchy.isSecondNodeAncestorOf(rightName.getName(), leftName.getName())) {
            return true;
        }
        return false;
    }
    private boolean checkIntAssign(Type first) {
        if (!(first instanceof IntType)) {
            return false;
        }
        return true;
    }
    private boolean checkStringAssign(Type first) {
        if (!(first instanceof StringType)) {
            return false;
        }
        return true;
    }
    private boolean checkNullAssign(Type first) {
        if (!(first instanceof NullType)) {
            return false;
        }
        return true;
    }
    /*********************************************************************************************/
    @Override //error 4 and 7
    public Type visit(UnaryExpression unaryExpression) {
        UnaryOperator unaryOperator = unaryExpression.getOperator();
        Expression unaryOperand = unaryExpression.getOperand();
        Type unaryExpressionType = unaryOperand.accept(this);
        unaryExpression.valType = ValueType.rval;
        if(unaryOperator == UnaryOperator.minus){
            if(unaryExpressionType instanceof IntType)
                return new IntType();
            else if(unaryExpressionType instanceof NoType)
                return new NoType();
            else{
                unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine(),unaryOperator.name()));
                return new NoType();
            }
        }
        if((unaryOperator == UnaryOperator.postdec) || (unaryOperator == UnaryOperator.postinc)
            || (unaryOperator == UnaryOperator.predec) || (unaryOperator == UnaryOperator.preinc)){
            if(unaryOperand.valType == ValueType.rval) {
                unaryExpression.addError(new IncDecOperandNotLvalue(unaryExpression.getLine(), unaryOperator.name()));
            }
            if(unaryExpressionType instanceof IntType){
                return new IntType();
            }
            else if(unaryExpressionType instanceof  NoType)
                return new NoType();
            else{
                unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine(),unaryOperator.name()));
                return new NoType();
            }
        }
        if(unaryOperator == UnaryOperator.not){
            if(unaryExpressionType instanceof BoolType)
                return new BoolType();
            else if(unaryExpressionType instanceof NoType)
                return new NoType();
            else {
                unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine(), unaryOperator.name()));
                return new NoType();
            }
        }
        return null;
    }
    /*********************************************************************************************/
    @Override //error 3 and 24 and 30
    public Type visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        Expression instance = objectOrListMemberAccess.getInstance();
        Identifier memberName = objectOrListMemberAccess.getMemberName();
        Type instanceType = instance.accept(this);
        if (instanceType instanceof NoType) {
            objectOrListMemberAccess.valType = instance.valType;
            return new NoType();
        }
        //error 30
        else if (!(instanceType instanceof ClassType) && !(instanceType instanceof ListType)) {
            objectOrListMemberAccess.addError(new MemberAccessOnNoneObjOrListType(objectOrListMemberAccess.getLine()));
            objectOrListMemberAccess.valType = instance.valType;
            return new NoType();
        }

        //error 3
        if (instanceType instanceof ClassType) {
            objectOrListMemberAccess.valType = ValueType.lval;
            if (doesObjHaveMember(memberName, ((ClassType) instanceType).getClassName())) {
                Type type =  getObjMember(objectOrListMemberAccess);
                if (instance.valType == ValueType.rval) {
                    objectOrListMemberAccess.valType = ValueType.rval;
                }
                return type;
            } else {
                objectOrListMemberAccess.addError(new MemberNotAvailableInClass(objectOrListMemberAccess.getLine(), memberName.getName(), ((ClassType) instanceType).getClassName().getName()));
                if (instance.valType == ValueType.rval) {
                    objectOrListMemberAccess.valType = ValueType.rval;
                }
                return new NoType();
            }
        }
        //error 24
        if (instanceType instanceof ListType) {
            objectOrListMemberAccess.valType = ValueType.lval;
            if (!checkType(instanceType)) {
                if (instance.valType == ValueType.rval) {
                    objectOrListMemberAccess.valType = ValueType.rval;
                }
                return new NoType();
            }
            if (doesListHaveField(memberName, (ListType) instanceType)) {
                Type returnType = getListMember(memberName, (ListType) instanceType);
                if (instance.valType == ValueType.rval) {
                    objectOrListMemberAccess.valType = ValueType.rval;
                }
                return returnType;
            } else {
                objectOrListMemberAccess.addError(new ListMemberNotFound(objectOrListMemberAccess.getLine(), memberName.getName()));
                if (instance.valType == ValueType.rval) {
                    objectOrListMemberAccess.valType = ValueType.rval;
                }
                return new NoType();
            }
        }
        return null;
    }

    private boolean doesObjHaveMember(Identifier memberName, Identifier className) {
        try {
            ClassSymbolTableItem classItem = (ClassSymbolTableItem)(SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className.getName(), true));
            SymbolTable classSymbolTable = classItem.getClassSymbolTable();
            try {
                classSymbolTable.getItem("Method_" + memberName.getName(), true);
                return true;
            } catch (Exception e) {
                try {
                    classSymbolTable.getItem("Field_" + memberName.getName(), true);
                    return true;
                } catch (Exception e1) {
                    if (memberName.getName().equals(className.getName())) {
                        return true;
                    }
                    return false;
                }
            }
        } catch (Exception ignored) {
            return true;
        }
    }

    private Type getObjMember(ObjectOrListMemberAccess objectOrListMemberAccess) {
        Identifier memberName = objectOrListMemberAccess.getMemberName();
        ClassType classType = (ClassType)objectOrListMemberAccess.getInstance().accept(this);
        Identifier className = classType.getClassName();
        try {
            ClassSymbolTableItem classItem = (ClassSymbolTableItem)(SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className.getName(), true));
            SymbolTable classSymbolTable = classItem.getClassSymbolTable();
            try {
                MethodSymbolTableItem methodItem = (MethodSymbolTableItem)classSymbolTable.getItem("Method_" + memberName.getName(), true);
                objectOrListMemberAccess.valType = ValueType.rval;
                return new FptrType(methodItem.getArgTypes(), methodItem.getReturnType());
            } catch (Exception e) {
                try {
                    FieldSymbolTableItem fieldItem = (FieldSymbolTableItem)classSymbolTable.getItem("Field_" + memberName.getName(), true);
                    return fieldItem.getType();
                } catch (Exception e1) {
                    if (memberName.getName().equals(className.getName())) {
                        objectOrListMemberAccess.valType = ValueType.rval;
                        return new FptrType(null, new NullType());
                    }
                    return new NoType();
                }
            }
        } catch (Exception ignored) {
            return new NoType();
        }
    }

    private boolean doesListHaveField(Identifier memberName, ListType listType) {
        ArrayList<ListNameType> elementsTypes = listType.getElementsTypes();
        for (ListNameType i : elementsTypes) {
            if (i.getName().getName().equals(memberName.getName())) {
                return true;
            }
        }
        return false;
    }

    private Type getListMember(Identifier memberName, ListType listType) {
        ArrayList<ListNameType> elementsTypes = listType.getElementsTypes();
        for (ListNameType i : elementsTypes) {
            if (i.getName().getName().equals(memberName.getName())) {
                return i.getType();
            }
        }
        return null;
    }
    /*********************************************************************************************/
    @Override //error 1
    public Type visit(Identifier identifier) {
        identifier.valType = ValueType.lval;
        try{
            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root
                    .getItem("Class_" + this.currentClassName.getName(), true);
            SymbolTable classSymbolTable = classSymbolTableItem.getClassSymbolTable();
            try{
                MethodSymbolTableItem methodSymbolTableItem = (MethodSymbolTableItem) classSymbolTable
                        .getItem("Method_" + this.currentMethodName.getName(),true);
                SymbolTable methodSymbolTable = methodSymbolTableItem.getMethodSymbolTable();
                try {
                    methodSymbolTable.getItem("Var_" + identifier.getName(), true);
                    return methodSymbolTableItem.getMethodDeclaration().getVarTypeByName(identifier.getName());
                }catch (Exception e) {
                    identifier.addError(new VarNotDeclared(identifier.getLine(), identifier.getName()));
                    return new NoType();
                }

            } catch (Exception ignored) {}

            } catch (Exception ignored) {}

        return null;
    }
    /*********************************************************************************************/
    //a[string] return type
    @Override //error 22 and 23 and 12
    public Type visit(ListAccessByIndex listAccessByIndex) {
        listAccessByIndex.valType = ValueType.lval;
        boolean hasErr = false;
        Type instanceType = listAccessByIndex.getInstance().accept(this);
        Type indexType = listAccessByIndex.getIndex().accept(this);
        //error 22
        if (!(instanceType instanceof ListType) && !(instanceType instanceof NoType)) {
            listAccessByIndex.valType = listAccessByIndex.getInstance().valType;
            listAccessByIndex.addError(new ListAccessByIndexOnNoneList(listAccessByIndex.getLine()));
        }
        //error 23
        if (!(indexType instanceof IntType) && !(indexType instanceof NoType)) {
            listAccessByIndex.addError(new ListIndexNotInt(listAccessByIndex.getLine()));

        }
        //error 12
        //list["a"]
        if (instanceType instanceof ListType) {
            if (!checkType(instanceType)) {
                return new NoType();
            }
            if(!hasOneType(((ListType) instanceType).getElementsTypes()) && !(listAccessByIndex.getIndex() instanceof IntValue)){
                listAccessByIndex.addError(new CantUseExprAsIndexOfMultiTypeList(listAccessByIndex.getLine()));
                return new NoType();
            }
            else if (!hasOneType(((ListType) instanceType).getElementsTypes()) && (listAccessByIndex.getIndex() instanceof IntValue)){
                if (((IntValue)listAccessByIndex.getIndex()).getConstant() < ((ListType) instanceType).getElementsTypes().size()) {
                    return ((ListType) instanceType).getElementsTypes().get(((IntValue)listAccessByIndex.getIndex()).getConstant()).getType();
                }
                else {
                    return ((ListType) instanceType).getElementsTypes().get(0).getType();
                }
            }
            else if (indexType instanceof NoType) {
                return new NoType();
            }
            else {
                return ((ListType) instanceType).getElementsTypes().get(0).getType();
            }
        }

        listAccessByIndex.valType = listAccessByIndex.getInstance().valType;
        return new NoType();
    }

    public boolean hasOneType(ArrayList<ListNameType> elementsTypes) {
        Type type = elementsTypes.get(0).getType();
        for (ListNameType l : elementsTypes) {
            if (!areTwoTypesEqual(l.getType(), type) || !areTwoTypesEqual(type, l.getType())) {
                return false;
            }
        }
        return true;
    }
    /*********************************************************************************************/
    @Override //error 8 and 15 and 13(part of)
    public Type visit(MethodCall methodCall) {
        Type instanceType = methodCall.getInstance().accept(this);
        ArrayList<Expression> args = methodCall.getArgs();
        voidMehtod = false;
        methodCall.valType = ValueType.rval;

        //void return val: farz mikonim error darim va zamani k nadashte bashim remove esh mikonim toye typeChecker
        if (instanceType instanceof FptrType) {
            if (((FptrType) instanceType).getReturnType() instanceof NullType) {
                methodCall.addError(new CantUseValueOfVoidMethod(methodCall.getLine()));
                methodCall.voidErrIndex = methodCall.getErrorListSize() - 1;
                voidMehtod = true;
            }
            if (checkArgsOfMethod(((FptrType) instanceType).getArgumentsTypes(), args)) {
                if (voidMehtod) {
                    return new NullType();
                }
                return checkType(((FptrType) instanceType).getReturnType()) ? ((FptrType) instanceType).getReturnType() : new NoType();
                }
            else {
                methodCall.addError(new MethodCallNotMatchDefinition(methodCall.getLine()));
                return new NoType();
            }
        }
        else if (instanceType instanceof NoType) {
            return new NoType();
        }
        else {
            methodCall.addError(new CallOnNoneFptrType(methodCall.getLine()));
            return new NoType();
        }

    }

    private boolean checkArgsOfMethod(ArrayList<Type> defArgs, ArrayList<Expression> args) {
        if ((defArgs == null && args != null) || (defArgs != null && args == null)) {
            return false;
        }
        ArrayList<Type> argsType = new ArrayList<>();
        for (int i = 0; i < args.size(); i++) {
            argsType.add(args.get(i).accept(this));
        }
        return checkIfTwoArrlistsEqual(defArgs, argsType);
    }
    /*********************************************************************************************/
    @Override //error 16 and 2
    public Type visit(NewClassInstance newClassInstance) {
        ClassType classType = newClassInstance.getClassType();
        newClassInstance.valType = ValueType.rval;
        if (!(classHierarchy.doesGraphContainNode(classType.getClassName().getName()))) {
            newClassInstance.addError(new ClassNotDeclared(newClassInstance.getLine(), classType.getClassName().getName()));
            return new NoType();
        }
        if (!checkConstructor(newClassInstance)) {
            newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
            return new NoType();
        }
        return classType;
    }

    private boolean checkConstructor(NewClassInstance newClassInstance) {
        ArrayList<Expression> args = newClassInstance.getArgs();
        String className = newClassInstance.getClassType().getClassName().getName();
        try {
            ClassSymbolTableItem classItem = (ClassSymbolTableItem) SymbolTable.root.getItem("Class_" + className, true);
            SymbolTable classSymbolTable = classItem.getClassSymbolTable();
            try {
                MethodSymbolTableItem constructorItem = (MethodSymbolTableItem) classSymbolTable.getItem("Method_" + className, true);
                ArrayList<Type> constructorArgs = constructorItem.getArgTypes();
                return checkArgsOfMethod(constructorArgs, args);
            } catch (Exception e) {
                return checkArgsOfMethod(null, args);
            }
        } catch (Exception ignored) {
            return true;
        }
    }
    /*********************************************************************************************/
    @Override
    public Type visit(ThisClass thisClass) {
        thisClass.valType = ValueType.rval;
        return new ClassType(currentClassName);
    }
    /*********************************************************************************************/
    @Override
    public Type visit(ListValue listValue) {
        listValue.valType = ValueType.rval;
        ArrayList<Expression> elements = listValue.getElements();
        ListType listType = new ListType();
        for (Expression e : elements) {
            Type elementType = e.accept(this);
            listType.addElementType(new ListNameType(elementType));
        }
        return listType;
    }
    /*********************************************************************************************/
    @Override
    public Type visit(NullValue nullValue) {
        nullValue.valType = ValueType.rval;
        return new NullType();
    }
    /*********************************************************************************************/
    @Override
    public Type visit(IntValue intValue) {
        intValue.valType = ValueType.rval;
        return new IntType();
    }
    /*********************************************************************************************/
    @Override
    public Type visit(BoolValue boolValue) {
       boolValue.valType = ValueType.rval;
        return new BoolType();
    }
    /*********************************************************************************************/
    @Override
    public Type visit(StringValue stringValue) {
        stringValue.valType = ValueType.rval;
        return new StringType();
    }

    /*********************************************************************************************/
    //check types and return a bool
    public boolean checkType(Type type) {
        if(type instanceof ClassType) {
            return checkClassType((ClassType)type);
        }

        if(type instanceof ListType) {
            return checkListType((ListType) type);
        }

        if(type instanceof FptrType) {
            return checkFptrType((FptrType) type);
        }
        return true;
    }

    private boolean checkClassType(ClassType type){
        if(!this.classHierarchy.doesGraphContainNode(type.getClassName().getName())) {
            return false;
        }
        return true;
    }

    private boolean checkListType(ListType type) {
        ArrayList<ListNameType> elementsTypes = type.getElementsTypes();
        if(elementsTypes.size() == 0) {
            return false;
        }
        else {
            for(ListNameType l : elementsTypes) {
                if(checkType(l.getType()))
                    continue;
                else
                    return false;
            }
            if(!((ListType)type).checkIfListHasTwoSameId()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkFptrType(FptrType type) {
        ArrayList<Type> argumentsTypes = ((FptrType) type).getArgumentsTypes();
        for(Type t : argumentsTypes) {
            if(checkType(t))
                continue;
            else
                return false;
        }
        return checkType(((FptrType) type).getReturnType());
    }

}
