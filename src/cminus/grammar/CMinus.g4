grammar CMinus;

/*
C-Minus Syntactic Rules
*/
program
    : declaration_list
    ;

declaration_list
    : declaration_list declaration
    | declaration
    ;

declaration
    : var_declaration
    | fun_declaration
    ;

var_declaration
    : type_specifier IDENTIFIER SEMICOLON
    | type_specifier IDENTIFIER LEFT_BRACKET NUM RIGHT_BRACKET SEMICOLON
    ;

type_specifier
    : INT
    | VOID
    ;

fun_declaration
    : type_specifier IDENTIFIER LEFT_PAREN params RIGHT_PAREN compound_stmt
    ;

params
    : param_list | VOID
    ;

param_list
    : param_list COMMA param
    | param
    ;

param
    : type_specifier IDENTIFIER
    | type_specifier IDENTIFIER LEFT_BRACKET RIGHT_BRACKET
    ;

compound_stmt
    : LEFT_BRACE local_declarations statement_list RIGHT_BRACE
    ;

local_declarations
    : local_declarations var_declaration
    | //empty
    ;

statement_list
    : statement_list statement
    | //empty
    ;

statement
    : expression_stmt
    | compound_stmt
    | selection_stmt
    | iteration_stmt
    | return_stmt
    ;

expression_stmt
    : expression SEMICOLON
    | SEMICOLON
    ;

selection_stmt
    : IF LEFT_PAREN expression RIGHT_PAREN statement
    | IF LEFT_PAREN expression RIGHT_PAREN statement ELSE statement
    ;

iteration_stmt
    : WHILE LEFT_PAREN expression RIGHT_PAREN statement
    ;

return_stmt
    : RETURN SEMICOLON
    | RETURN expression SEMICOLON
    ;

expression
    : var ASSIGN expression
    | simple_expression
    ;

var : IDENTIFIER | IDENTIFIER LEFT_BRACKET expression RIGHT_BRACKET
    ;

simple_expression
    : additive_expression relop additive_expression
    | additive_expression
    ;

relop
    : LESS_EQUAL | LESS | GREATER | GREATER_EQUAL | EQUAL | NOT_EQUAL
    ;

additive_expression
    : additive_expression addop term
    |term
    ;

addop
    : PLUS | MINUS
    ;

term
    : term mulop factor
    | factor
    ;

mulop
    : TIMES
    | DIVIDE
    ;

factor
    : LEFT_PAREN expression RIGHT_PAREN
    | var | call | NUM
    ;

call
    : IDENTIFIER LEFT_PAREN args RIGHT_PAREN
    ;

args
    : arg_list
    | //empty
    ;

arg_list
    : arg_list COMMA expression
    | expression
    ;

/*
C-Minus Lexical Rules
*/

//C-Minus Keywords
ELSE : 'else';
IF : 'if';
INT : 'int';
RETURN : 'return';
VOID : 'void';
WHILE : 'while';

//C-Minus Special Symbols
PLUS : '+';
MINUS : '-';
TIMES : '*';
DIVIDE : '/';
LESS : '<';
LESS_EQUAL : '<=';
GREATER : '>';
GREATER_EQUAL : '>=';
EQUAL : '==';
NOT_EQUAL : '!=';
ASSIGN : '=';
SEMICOLON : ';';
COMMA : ',';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';
LEFT_BRACE : '{';
RIGHT_BRACE   : '}';

//C-Minus Letters and degits
fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
NUM : (DIGIT)(DIGIT)*;
IDENTIFIER : (LETTER)(LETTER)*;

//C-Minus whitespaces and comments
WHITESPACE
    :   [ \t]+
        -> skip
    ;

NEWLINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BLOCKCOMMENT
    :   '/*' .*? '*/'
        -> skip
    ;