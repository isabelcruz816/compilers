grammar LittleDuck;

/* Syntax Rules */

program : 'program' ID ';' vars bloque ;

vars : 'var' var1 ;
var1 : ID var2 ':' tipo ';' var3 ;
var2 : ',' 'ID' var2 | ;
var3 : | var1 ;

bloque : '{' bloq1 '}' ;
bloq1 : estatuto bloq1 | ;

estatuto : asignacion | condicion | escritura ;

asignacion : ID '=' expresion ';' ;

condicion : 'if' '(' expresion ')' bloque cond1 ;
cond1 : ';' | 'else' bloque cond1 ;

expresion : exp expr1 ;
expr1 : | expr2 exp ;
expr2 : '<' | '>' | '<>' ;

exp : termino exp1 ;
exp1 : | '+' exp | '-' exp ;

termino : factor term1 ;
term1 : ('*' | '/') termino | ;

tipo : 'int' | 'float' ;

escritura : 'print' '(' print1 ')' ';' ;
print1 : expresion print2 
      | STRING print2 ;
print2 : ',' print1 | ;

factor : '(' expresion ')' | var_cte | ('*' | '/') var_cte ;

var_cte : ID | CTE_I | CTE_F ;

/* Lexer Rules */

ID : [a-zA-Z][a-zA-Z0-9]* ;

STRING : '"' .*? '"';

CTE_I : 'i' ;

CTE_F : 'f' ;

WHITESPACE : [ \t\n\r] -> skip ;