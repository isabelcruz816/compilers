grammar LittleDuck;

/* Syntax Rules */

program : 'program' ID ';' vars bloque ;

vars : "var" var1 ;
var1 : ID var2 ":" TIPO ";" var3 ;
var2 : "," "ID" var2 | EPSILON ;
var3 : epsilon | var1 ;

bloque : "{" bloq1 "}" ;
bloq1 : estatuto bloq1 | epsilon ;

estatuo : asignacion | condicion | escritura ;

asignacion : ID "=" expresion ";" ;

condicion : "if" "(" expresion ")" bloque cond1 ;
cond1 : ";" | "else" bloque cond1 ;

expresion : exp expr1 ;
expr1 : epsilon | expr2 exp ;
expr2 : "<" | ">" | "<>" ;

exp : termino exp1 ;
exp1 : epsilon | "+" exp | "-" exp ;

termino : factor term1 ;
term1 : ["*" | "/"] termino | epsilon ;

tipo : "int" | "float" ;

escritura : "print" "(" prin1 ")" ";" ;
print1 : expresion print2 | string print2 ;
print2 : "," print1 | epsilon ;

factor : "(" expresion ")" | var_cte | ["*" | "/"] var_cte ;

var_cte : ID | CTE_I | CTE_F ;


/* Lexer Rules */

DIGIT : ['0'-'9']+ ;

digits : DIGIT+ ;

ID : 'a'-'z' ['a'-'z' | 'A'-'Z' | DIGIT ] ;

number : DIGITS ["."DIGITS]["E"['+' | '-']DIGITS]

STRING : '"' .*? '"' ;

CTE_I : "i" ;

CTE_F : "f" ;

EPSILON : '' ;

WHITESPACE : [ \t\n\r] -> skip