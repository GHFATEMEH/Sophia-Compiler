grammar Sophia;

@header{
    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;
}

sophia returns[Program sophiaProgram]:
    p = program
    {$sophiaProgram = $p.programRet;}
    EOF
    ;

program returns[Program programRet]:
    {
        $programRet = new Program();
        $programRet.setLine(1);
    }
    (
        c = sophiaClass
        {$programRet.addClass($c.sophiaClassRet);}
    )*
    ;

sophiaClass returns[ClassDeclaration sophiaClassRet]:
    c1 = CLASS
    i = identifier
    {
        $sophiaClassRet = new ClassDeclaration($i.identifierRet);
        $sophiaClassRet.setLine($c1.getLine());
    }
    (EXTENDS i = identifier {$sophiaClassRet.setParentClassName($i.identifierRet);})? LBRACE
    ((
    (
        v = varDeclaration
        {
            FieldDeclaration field = new FieldDeclaration($v.varDeclarationRet);
            field.setLine($v.varDeclarationRet.getLine());
            $sophiaClassRet.addField(field);

        } |
        m = method {$sophiaClassRet.addMethod($m.methodRet);}
    )*
    c = constructor {$sophiaClassRet.setConstructor($c.constructorRet);}
    (
         v = varDeclaration
         {
             FieldDeclaration field = new FieldDeclaration($v.varDeclarationRet);
             field.setLine($v.varDeclarationRet.getLine());
             $sophiaClassRet.addField(field);
         } |
         m = method {$sophiaClassRet.addMethod($m.methodRet);}
    )*) |
    ((
         v = varDeclaration
         {
            FieldDeclaration field = new FieldDeclaration($v.varDeclarationRet);
            field.setLine($v.varDeclarationRet.getLine());
            $sophiaClassRet.addField(field);
         } |
         m = method {$sophiaClassRet.addMethod($m.methodRet);}
    )*)) RBRACE
    ;

varDeclaration returns[VarDeclaration varDeclarationRet]:
    i = identifier COLON
    t = type
    {
        $varDeclarationRet = new VarDeclaration($i.identifierRet, $t.typeRet);
        $varDeclarationRet.setLine($i.identifierRet.getLine());
    }
    SEMICOLLON
    ;

method returns[MethodDeclaration methodRet]:
   d = DEF
   (
        t = type
        i = identifier
        {
            $methodRet = new MethodDeclaration($i.identifierRet, $t.typeRet);
            $methodRet.setLine($d.getLine());
            $methodRet.setDoesReturn(true);
        } |
        VOID
        i = identifier
        {
            $methodRet = new MethodDeclaration($i.identifierRet, new NullType());
            $methodRet.setLine($d.getLine());
            $methodRet.setDoesReturn(false);
        }
   )
   LPAR ma = methodArguments RPAR LBRACE mb = methodBody RBRACE
   {
        $methodRet.setArgs($ma.methodArgumentsRet);
        $methodRet.setBody($mb.methodBodyRetBody);
        $methodRet.setLocalVars($mb.methodBodyRetLocalVars);
   }
   ;

constructor returns[ConstructorDeclaration constructorRet]:
    d = DEF
    i = identifier LPAR
    {
        $constructorRet = new ConstructorDeclaration($i.identifierRet);
        $constructorRet.setLine($d.getLine());
        $constructorRet.setDoesReturn(false);
    }
   ma = methodArguments RPAR LBRACE
   mb = methodBody RBRACE
   {
        $constructorRet.setArgs($ma.methodArgumentsRet);
        $constructorRet.setBody($mb.methodBodyRetBody);
        $constructorRet.setLocalVars($mb.methodBodyRetLocalVars);
   }
   ;

methodArguments returns[ArrayList<VarDeclaration> methodArgumentsRet]:
    {$methodArgumentsRet = new ArrayList<>();}
    (v = variableWithType {$methodArgumentsRet.add($v.variableWithTypeRet);}
    (COMMA v = variableWithType {$methodArgumentsRet.add($v.variableWithTypeRet);})*)?
    ;

variableWithType returns[VarDeclaration variableWithTypeRet]:
    i = identifier COLON
    t = type
    {
        $variableWithTypeRet = new VarDeclaration($i.identifierRet, $t.typeRet);
        $variableWithTypeRet.setLine($i.identifierRet.getLine());
    }
    ;

type returns[Type typeRet]:
    p = primitiveDataType {$typeRet = $p.primitiveDataTypeRet;} |
    l = listType {$typeRet = $l.listTypeRet;} |
    f = functionPointerType {$typeRet = $f.functionPointerTypeRet;} |
    c = classType {$typeRet = $c.classTypeRet;}
    ;

classType returns[ClassType classTypeRet]:
    i = identifier {$classTypeRet = new ClassType($i.identifierRet);}
    ;

listType returns[ListType listTypeRet]:
    LIST LPAR
    (
        (
            i = INT_VALUE SHARP
            t = type
            {$listTypeRet = new ListType($i.int, new ListNameType($t.typeRet));}
        ) |
        (l = listItemsTypes {$listTypeRet = new ListType($l.listItemsTypesRet);})
    ) RPAR
    ;

listItemsTypes returns[ArrayList<ListNameType> listItemsTypesRet]:
    {$listItemsTypesRet = new ArrayList<>();}
    l = listItemType {$listItemsTypesRet.add($l.listItemTypeRet);}
    (COMMA l = listItemType {$listItemsTypesRet.add($l.listItemTypeRet);})*
    ;

listItemType returns[ListNameType listItemTypeRet]:
    v = variableWithType {$listItemTypeRet = new ListNameType($v.variableWithTypeRet);} |
    t = type {$listItemTypeRet = new ListNameType($t.typeRet);}
    ;

functionPointerType returns[FptrType functionPointerTypeRet]:
    {$functionPointerTypeRet = new FptrType();}
    FUNC LESS_THAN
    (
        VOID {$functionPointerTypeRet.setArgumentsTypes(new ArrayList<>());} |
        t = typesWithComma {$functionPointerTypeRet.setArgumentsTypes($t.typesWithCommaRet);}
    ) ARROW
    (
         VOID {$functionPointerTypeRet.setReturnType(new NullType());} |
         ty = type {$functionPointerTypeRet.setReturnType($ty.typeRet);}
    ) GREATER_THAN
    ;

typesWithComma returns[ArrayList<Type> typesWithCommaRet]:
    {$typesWithCommaRet = new ArrayList<>();}
    t = type {$typesWithCommaRet.add($t.typeRet);}
    (COMMA t = type {$typesWithCommaRet.add($t.typeRet);})*
    ;

primitiveDataType returns[Type primitiveDataTypeRet]:
    INT {$primitiveDataTypeRet = new IntType();} |
    STRING {$primitiveDataTypeRet = new StringType();}|
    BOOLEAN {$primitiveDataTypeRet = new BoolType();}
    ;

methodBody returns[ArrayList<VarDeclaration> methodBodyRetLocalVars, ArrayList<Statement> methodBodyRetBody]:
    {
        $methodBodyRetLocalVars = new ArrayList<>();
        $methodBodyRetBody = new ArrayList<>();
    }
    (v = varDeclaration {$methodBodyRetLocalVars.add($v.varDeclarationRet);})*
    (s = statement {$methodBodyRetBody.add($s.statementRet);})*
    ;

statement returns[Statement statementRet]:
    f = forStatement {$statementRet = $f.forStatementRet;}
    | foreach = foreachStatement {$statementRet = $foreach.foreachStatementRet;}
    | ifstate = ifStatement {$statementRet = $ifstate.ifStatementRet;}
    | assign = assignmentStatement {$statementRet = $assign.assignmentStatementRet;}
    | print = printStatement {$statementRet = $print.printStatementRet;}
    | countinue = continueBreakStatement {$statementRet = $countinue.continueBreakStatementRet;}
    | methodcall = methodCallStatement {$statementRet = $methodcall.methodCallStatementRet;}
    | r = returnStatement {$statementRet = $r.returnStatementRet;}
    | b = block {$statementRet = $b.blockRet;}
    ;

block returns[BlockStmt blockRet]:
    {$blockRet = new BlockStmt();}
    lbrace = LBRACE {$blockRet.setLine($lbrace.getLine());}
    (s = statement {$blockRet.addStatement($s.statementRet);})*
    RBRACE
    ;

assignmentStatement returns[AssignmentStmt assignmentStatementRet]:
    a = assignment {$assignmentStatementRet = $a.assignmentRet;}
    SEMICOLLON
    ;

assignment returns[AssignmentStmt assignmentRet]:
    or = orExpression
    a = ASSIGN
    e = expression
    {
        $assignmentRet = new AssignmentStmt($or.orExpressionRet, $e.expressionRet);
        $assignmentRet.setLine($a.getLine());
    };

printStatement returns[PrintStmt printStatementRet]:
    p = PRINT
    LPAR
    e = expression
    {
        $printStatementRet = new PrintStmt($e.expressionRet);
        $printStatementRet.setLine($p.getLine());
    }
    RPAR
    SEMICOLLON
    ;

returnStatement returns[ReturnStmt returnStatementRet]:
    {$returnStatementRet = new ReturnStmt();}
    r = RETURN {$returnStatementRet.setLine($r.getLine());}
    (e = expression {$returnStatementRet.setReturnedExpr($e.expressionRet);})?
    SEMICOLLON
    ;

methodCallStatement returns[MethodCallStmt methodCallStatementRet]:
    m = methodCall
    {
        $methodCallStatementRet = new MethodCallStmt($m.methodCallRet);
        $methodCallStatementRet.setLine($m.methodCallRet.getLine());
    }
    SEMICOLLON
    ;

methodCall returns[MethodCall methodCallRet]:
    o = otherExpression {$methodCallRet = new MethodCall($o.otherExpressionRet);}
    (
        (lpar = LPAR m = methodCallArguments

        {
            MethodCall m = new MethodCall($methodCallRet.getInstance(), $m.methodCallArgumentsRet);
            m.setLine($lpar.getLine());
            $methodCallRet.setInstance(m);
        } RPAR) |
        (DOT i = identifier

        {
            ObjectOrListMemberAccess objectList = new ObjectOrListMemberAccess($methodCallRet.getInstance() ,$i.identifierRet);
            objectList.setLine($i.identifierRet.getLine());
            $methodCallRet.setInstance(objectList);
        }) |
        (lbrack = LBRACK e = expression

        {
            ListAccessByIndex listAccess = new ListAccessByIndex($methodCallRet.getInstance(), $e.expressionRet);
            listAccess.setLine($lbrack.getLine());
            $methodCallRet.setInstance(listAccess);
        } RBRACK)
    )*
    (l = LPAR m = methodCallArguments RPAR)
    {
        $methodCallRet.setArgs($m.methodCallArgumentsRet);
        $methodCallRet.setLine($l.getLine());
    }
    ;

methodCallArguments returns[ArrayList<Expression> methodCallArgumentsRet]:
    {$methodCallArgumentsRet = new ArrayList<>();}
    (e1 = expression {$methodCallArgumentsRet.add($e1.expressionRet);} (COMMA e2 = expression {$methodCallArgumentsRet.add($e2.expressionRet);})*)?;

continueBreakStatement returns[Statement continueBreakStatementRet]:
    (b = BREAK
    {
        $continueBreakStatementRet = new BreakStmt();
        $continueBreakStatementRet.setLine($b.getLine());
    }
    | c = CONTINUE
    {
        $continueBreakStatementRet = new ContinueStmt();
        $continueBreakStatementRet.setLine($c.getLine());
    }
    )
    SEMICOLLON
    ;

forStatement returns[ForStmt forStatementRet]:
    {$forStatementRet = new ForStmt();}
    f = FOR {$forStatementRet.setLine($f.getLine());}
    LPAR
    (init = assignment {$forStatementRet.setInitialize($init.assignmentRet);})?
    SEMICOLLON
    (e = expression {$forStatementRet.setCondition($e.expressionRet);})?
    SEMICOLLON
    (update = assignment {$forStatementRet.setUpdate($update.assignmentRet);})?
    RPAR
    s = statement {$forStatementRet.setBody($s.statementRet);}
    ;

foreachStatement returns[ForeachStmt foreachStatementRet]:
    f = FOREACH
    LPAR
    i = identifier
    IN
    e = expression
    {
        $foreachStatementRet = new ForeachStmt($i.identifierRet, $e.expressionRet);
        $foreachStatementRet.setLine($f.getLine());
    }
    RPAR
    s = statement {$foreachStatementRet.setBody($s.statementRet);}
    ;

ifStatement returns[ConditionalStmt ifStatementRet]:
    i = IF LPAR
    e = expression RPAR
    s = statement
    {
        $ifStatementRet = new ConditionalStmt($e.expressionRet, $s.statementRet);
        $ifStatementRet.setLine($i.getLine());
    }
    (ELSE s = statement {$ifStatementRet.setElseBody($s.statementRet);})?
    ;

expression returns[Expression expressionRet]:
    o = orExpression {$expressionRet = $o.orExpressionRet;}
    (
        a = ASSIGN
        e = expression
        {
            $expressionRet = new BinaryExpression($expressionRet, $e.expressionRet, BinaryOperator.assign);
            $expressionRet.setLine($a.getLine());
        }
    )?
    ;

orExpression returns[Expression orExpressionRet]:
    a = andExpression {$orExpressionRet = $a.andExpressionRet;}
    (
        o = OR
        a = andExpression
        {
            $orExpressionRet = new BinaryExpression($orExpressionRet, $a.andExpressionRet, BinaryOperator.or);
            $orExpressionRet.setLine($o.getLine());
        }
    )*
    ;

andExpression returns[Expression andExpressionRet]:
    e = equalityExpression {$andExpressionRet = $e.equalityExpressionRet;}
    (
        a = AND
        e = equalityExpression
        {
            $andExpressionRet = new BinaryExpression($andExpressionRet, $e.equalityExpressionRet, BinaryOperator.and);
            $andExpressionRet.setLine($a.getLine());
        }
    )*
    ;

equalityExpression returns[Expression equalityExpressionRet]:
    r = relationalExpression {$equalityExpressionRet = $r.relationalExpressionRet;}
    (
        e = EQUAL
        r = relationalExpression
        {
            $equalityExpressionRet = new BinaryExpression($equalityExpressionRet, $r.relationalExpressionRet, BinaryOperator.eq);
            $equalityExpressionRet.setLine($e.getLine());
        } |
        n = NOT_EQUAL
        r = relationalExpression
        {
            $equalityExpressionRet = new BinaryExpression($equalityExpressionRet, $r.relationalExpressionRet, BinaryOperator.neq);
            $equalityExpressionRet.setLine($n.getLine());
        }
    )*
    ;

relationalExpression returns[Expression relationalExpressionRet]:
    a = additiveExpression {$relationalExpressionRet = $a.additiveExpressionRet;}
    (
        g = GREATER_THAN
        a = additiveExpression
        {
            $relationalExpressionRet = new BinaryExpression($relationalExpressionRet, $a.additiveExpressionRet, BinaryOperator.gt);
            $relationalExpressionRet.setLine($g.getLine());
        } |
        l = LESS_THAN
        a = additiveExpression
        {
            $relationalExpressionRet = new BinaryExpression($relationalExpressionRet, $a.additiveExpressionRet, BinaryOperator.lt);
            $relationalExpressionRet.setLine($l.getLine());
        }
    )*
    ;

additiveExpression returns[Expression additiveExpressionRet]:
    m = multiplicativeExpression {$additiveExpressionRet = $m.multiplicativeExpressionRet;}
    (
        plus = PLUS
        m = multiplicativeExpression
        {
            $additiveExpressionRet = new BinaryExpression($additiveExpressionRet, $m.multiplicativeExpressionRet, BinaryOperator.add);
            $additiveExpressionRet.setLine($plus.getLine());
        } |
        minus = MINUS
        m = multiplicativeExpression
        {
            $additiveExpressionRet = new BinaryExpression($additiveExpressionRet, $m.multiplicativeExpressionRet, BinaryOperator.sub);
            $additiveExpressionRet.setLine($minus.getLine());
        }
    )*
    ;

multiplicativeExpression returns[Expression multiplicativeExpressionRet]:
    p = preUnaryExpression {$multiplicativeExpressionRet = $p.preUnaryExpressionRet;}
    (
        m = MULT
        p = preUnaryExpression
        {
            $multiplicativeExpressionRet = new BinaryExpression($multiplicativeExpressionRet, $p.preUnaryExpressionRet, BinaryOperator.mult);
            $multiplicativeExpressionRet.setLine($m.getLine());
        } |
        d = DIVIDE
        p = preUnaryExpression
        {
            $multiplicativeExpressionRet = new BinaryExpression($multiplicativeExpressionRet, $p.preUnaryExpressionRet, BinaryOperator.div);
            $multiplicativeExpressionRet.setLine($d.getLine());
        } |
        m = MOD
        p = preUnaryExpression
        {
            $multiplicativeExpressionRet = new BinaryExpression($multiplicativeExpressionRet, $p.preUnaryExpressionRet, BinaryOperator.mod);
            $multiplicativeExpressionRet.setLine($m.getLine());
        }
    )*
    ;

preUnaryExpression returns[Expression preUnaryExpressionRet]:
    (
        i = NOT
        p = preUnaryExpression
        {
            $preUnaryExpressionRet = new UnaryExpression($p.preUnaryExpressionRet, UnaryOperator.not);
            $preUnaryExpressionRet.setLine($i.getLine());
        } |
        i = MINUS
        p = preUnaryExpression
        {
            $preUnaryExpressionRet = new UnaryExpression($p.preUnaryExpressionRet, UnaryOperator.minus);
            $preUnaryExpressionRet.setLine($i.getLine());
        } |
        i = INCREMENT
        p = preUnaryExpression
        {
            $preUnaryExpressionRet = new UnaryExpression($p.preUnaryExpressionRet, UnaryOperator.preinc);
            $preUnaryExpressionRet.setLine($i.getLine());
        } |
        i = DECREMENT
        p = preUnaryExpression
        {
            $preUnaryExpressionRet = new UnaryExpression($p.preUnaryExpressionRet, UnaryOperator.predec);
            $preUnaryExpressionRet.setLine($i.getLine());
        }
    ) |
    post = postUnaryExpression {$preUnaryExpressionRet = $post.postUnaryExpressionRet;}
    ;

postUnaryExpression returns[Expression postUnaryExpressionRet]:
    a = accessExpression {$postUnaryExpressionRet = $a.accessExpressionRet;}
    (
        i = INCREMENT
        {
            $postUnaryExpressionRet = new UnaryExpression($a.accessExpressionRet, UnaryOperator.postinc);
            $postUnaryExpressionRet.setLine($i.getLine());
        } |
        d = DECREMENT
        {
            $postUnaryExpressionRet = new UnaryExpression($a.accessExpressionRet, UnaryOperator.postdec);
            $postUnaryExpressionRet.setLine($d.getLine());
        }
    )?
    ;

accessExpression returns[Expression accessExpressionRet]:
    o = otherExpression {$accessExpressionRet = $o.otherExpressionRet;}
    (
        (l = LPAR m = methodCallArguments
        {
            MethodCall method = new MethodCall($accessExpressionRet, $m.methodCallArgumentsRet);
            method.setLine($l.getLine());
            $accessExpressionRet = method;
        } RPAR) |
        (DOT i = identifier
        {
            ObjectOrListMemberAccess object = new ObjectOrListMemberAccess($accessExpressionRet ,$i.identifierRet);
            object.setLine($i.identifierRet.getLine());
            $accessExpressionRet = object;
        }) |
        (lbrack = LBRACK e = expression
        {
            ListAccessByIndex listAccess = new ListAccessByIndex($accessExpressionRet, $e.expressionRet);
            listAccess.setLine($lbrack.getLine());
            $accessExpressionRet = listAccess;
        } RBRACK)
    )*
    ;

otherExpression returns[Expression otherExpressionRet]:
    t = THIS
    {
        $otherExpressionRet = new ThisClass();
        $otherExpressionRet.setLine($t.getLine());
    } |
    n = newExpression {$otherExpressionRet = $n.newExpressionRet;} |
    v = values {$otherExpressionRet = $v.valuesRet;} |
    i = identifier {$otherExpressionRet = $i.identifierRet;} |
    LPAR (e = expression {$otherExpressionRet = $e.expressionRet;}) RPAR
    ;

newExpression returns[NewClassInstance newExpressionRet]:
    n = NEW
    c = classType
    LPAR
    m = methodCallArguments
    {
        $newExpressionRet = new NewClassInstance($c.classTypeRet, $m.methodCallArgumentsRet);
        $newExpressionRet.setLine($n.getLine());
    }
    RPAR
    ;

values returns[Value valuesRet]:
    b = boolValue
    {
        $valuesRet = $b.boolValueRet;
    }
    | s = STRING_VALUE
    {
        $valuesRet = new StringValue($s.text);
        $valuesRet.setLine($s.getLine());
    }
    | i = INT_VALUE
    {
        $valuesRet = new IntValue($i.int);
        $valuesRet.setLine($i.getLine());
    }
    | n = NULL
    {
        $valuesRet = new NullValue();
        $valuesRet.setLine($n.getLine());
    }
    | l = listValue
    {
        $valuesRet = $l.listValueRet;
    }
    ;

boolValue returns[BoolValue boolValueRet]:
    t = TRUE
    {
        $boolValueRet = new BoolValue(true);
        $boolValueRet.setLine($t.getLine());
    }
    |f = FALSE
    {
        $boolValueRet = new BoolValue(false);
        $boolValueRet.setLine($f.getLine());
    }
    ;

listValue returns[ListValue listValueRet]:
    l = LBRACK
    m = methodCallArguments
    {
        $listValueRet = new ListValue($m.methodCallArgumentsRet);
        $listValueRet.setLine($l.getLine());
    }
    RBRACK
    ;

identifier returns[Identifier identifierRet]:
    i = IDENTIFIER
    {
        $identifierRet = new Identifier($i.text);
        $identifierRet.setLine($i.getLine());
    };


DEF: 'def';
EXTENDS: 'extends';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
IN: 'in';
FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'bool';
STRING: 'string';
INT: 'int';
VOID: 'void';
NULL: 'null';
LIST: 'list';

TRUE: 'true';
FALSE: 'false';

THIS: 'this';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: '!=';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
AND: '&&';
OR: '||';
NOT: '!';
QUESTION_MARK: '?';

ASSIGN: '=';

INCREMENT: '++';
DECREMENT: '--';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

SHARP: '#';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"' {setText(getText().substring(1, getText().length()-1));};
COMMENT: ('//' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;