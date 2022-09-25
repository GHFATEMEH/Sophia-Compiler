grammar Sophia;

sophia
    : class_def* EOF
    ;

class_def
    : CLASS  ( (ClassName=identifier {System.out.println("ClassDec:" + $ClassName.text);}) |
    (ClassName=identifier EXTENDS ParentClassName=identifier {System.out.println("ClassDec:" + $ClassName.text + "," + $ParentClassName.text);}))
    LCBRACK (variable_def | method)* (constructor)? (variable_def | method)* RCBRACK
    ;

method
    : DEF (types | VOID) MethodName=identifier {System.out.println("MethodDec:" + $MethodName.text);} LPAR (argument(COMMA argument)* | ) RPAR LCBRACK method_body RCBRACK
    ;

constructor
    :   DEF ConstructorName=identifier {System.out.println("ConstructorDec:" + $ConstructorName.text);} LPAR (argument (COMMA argument)* | ) RPAR LCBRACK method_body RCBRACK
    ;

method_body
    : (variable_def)* (statement)*
    ;

variable_def
    : VarName=identifier {System.out.println("VarDec:" + $VarName.text);} COLON types DELIM
    ;

statement
    : if_statement | for_statemnet | foreach_statement | print_statement |
    {System.out.println("MethodCall");} method_call DELIM |
    scope_statement | return_statement | break_statement | continue_statement | expression DELIM
    ;

if_statement
    :   {System.out.println("Conditional:if");}
        IF LPAR expression RPAR statement (else_statement)?
    ;

else_statement
	:   {System.out.println("Conditional:else");}
	    ELSE statement
	;

scope_statement
    : LCBRACK (statement)* RCBRACK
    ;

for_statemnet
    :   {System.out.println("Loop:for");}
        FOR LPAR (assign_statement)? DELIM (expression)? DELIM (assign_statement)? RPAR statement
    ;

foreach_statement
    :   {System.out.println("Loop:foreach");}
        FOREACH LPAR identifier IN expression RPAR statement
    ;

break_statement
    :   {System.out.println("Control:break");}
        BREAK DELIM
    ;

continue_statement
    :   {System.out.println("Control:continue");}
        CONTINUE DELIM
    ;

return_statement
    :   {System.out.println("Return");}
        RETURN expression DELIM
    ;

print_statement
    :   {System.out.println("Built-in:print");}
        PRINT LPAR expression RPAR DELIM
    ;

assign_statement
    : orExpression (ASSIGN  expression {System.out.println("Operator:" + $ASSIGN.text);})+
    ;

expression
    : orExpression (ASSIGN expression {System.out.println("Operator:" + $ASSIGN.text);})*
    ;

orExpression
    : andExpression (OR andExpression {System.out.println("Operator:" + $OR.text);})*
    ;

andExpression
    : equalExpression (AND  equalExpression {System.out.println("Operator:" + $AND.text);})*
    ;

equalExpression
    : relationExpression (((OperatorSymbol = EQUAL) | (OperatorSymbol = NOTEQUAL)) relationExpression {System.out.println("Operator:" + $OperatorSymbol.text);})*
    ;

relationExpression
    : add_and_subtract_expression (((OperatorSymbol = LESSTHAN) | (OperatorSymbol = GREATERTHAN)) add_and_subtract_expression {System.out.println("Operator:" + $OperatorSymbol.text);})*
    ;

add_and_subtract_expression
    : multiple_expression (((OperatorSymbol = PLUS) | (OperatorSymbol = DASH)) multiple_expression {System.out.println("Operator:" + $OperatorSymbol.text);})*
    ;

multiple_expression
    : pre_unary_expression (((OperatorSymbol = STAR) | (OperatorSymbol = DIVISON) | (OperatorSymbol = PERCENT)) pre_unary_expression {System.out.println("Operator:" + $OperatorSymbol.text);})*
    ;

pre_unary_expression
    : post_unary_expression | (( (OperatorSymbol = DASH) | (OperatorSymbol = PLUSPLUS) | (OperatorSymbol = MINUSMINUS) | (OperatorSymbol = NOT))
    pre_unary_expression {System.out.println("Operator:" + $OperatorSymbol.text);})*
    ;

post_unary_expression
    : list_element_expression ((OperatorSymbol = MINUSMINUS | OperatorSymbol = PLUSPLUS){System.out.println("Operator:" + $OperatorSymbol.text);})*
    ;

list_element_expression
    : other_expression ((LBRACK expression RBRACK) | (DOT identifier) | parameter_passing)*
    ;

other_expression
    : (LPAR expression RPAR) | identifier | build_class | primitive | NULL | init_list | THIS
    ;

parameter_passing
    : LPAR ( (expression(COMMA expression)*) | ) RPAR
    ;

types
    : basic_types | function_pointer_type | identifier | list_type
    ;

function_pointer_type
    : FUNC LESSTHAN (VOID | (types (COMMA types)*)) ARROW (types | VOID) GREATERTHAN
    ;

list_type
    : LIST LPAR ( (types (COMMA types)*) | (argument (COMMA argument)*) | (INTEGER HASHTAG types) ) RPAR
    ;

init_list
    : LBRACK (expression(COMMA expression)*)? RBRACK
    ;

argument
    : identifier COLON types
    ;

basic_types
    : INT | STRING | BOOL
    ;

primitive
    : INTEGER | TRUE | FALSE | STR
    ;

method_call
    : other_expression ((LBRACK expression RBRACK) | (DOT identifier) | parameter_passing)* parameter_passing
    ;

build_class
    : NEW identifier LPAR (expression(COMMA expression)*)? RPAR
    ;

identifier
    : IDENTIFIER
    ;


CLASS
    : 'class'
    ;

EXTENDS
    : 'extends'
    ;

THIS
    : 'this'
    ;

DEF
    : 'def'
    ;

FUNC
    : 'func'
    ;

RETURN
    : 'return'
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;

FOR
    : 'for'
    ;

FOREACH
    : 'foreach'
    ;

CONTINUE
    : 'continue'
    ;

BREAK
    : 'break'
    ;

FALSE
    : 'false'
    ;

TRUE
    : 'true'
    ;

IN
    : 'in'
    ;

INT
    : 'int'
    ;

STRING
    : 'string'
    ;

BOOL
    : 'bool'
    ;

VOID
    : 'void'
    ;

LIST
    : 'list'
    ;

NULL
    : 'null'
    ;

NEW
    : 'new'
    ;

PRINT
    : 'print'
    ;

LCBRACK
    : '{'
    ;

RCBRACK
    : '}'
    ;

LPAR
    : '('
    ;

RPAR
    : ')'
    ;

LBRACK
    : '['
    ;

RBRACK
    : ']'
    ;

DELIM
    : ';'
    ;

COLON
    : ':'
    ;

DOT
    : '.'
    ;

COMMA
    : ','
    ;

HASHTAG
    : '#'
    ;

ARROW
    : '->'
    ;

PLUSPLUS
    : '++'
    ;

MINUSMINUS
    : '--'
    ;

PLUS
    : '+'
    ;

DASH
    : '-'
    ;

STAR
    : '*'
    ;

DIVISON
    : '/'
    ;

PERCENT
    : '%'
    ;

LESSTHAN
    : '<'
    ;

GREATERTHAN
    : '>'
    ;

NOTEQUAL
    : '!='
    ;

EQUAL
    : '=='
    ;

ASSIGN
    : '='
    ;

AND
    : '&&'
    ;

OR
    : '||'
    ;

NOT
    : '!'
    ;

IDENTIFIER
    : [A-Za-z_][A-Za-z0-9_]*
    ;

INTEGER
    : '0' | [1-9][0-9]*
    ;

STR
    : '"' ~('"')* '"'
    ;

COMMENT
    : '//' (~('\r' | '\n'))*
    ;

WS
    : [ \t\r\n] -> skip
    ;