//nombre de la gramatica
grammar gramatica_1;

/*----gramatica libre de contexto-----TERMINALES--*/
program: PROGRAM ID ABRE_LLAVE
	sentence*
	CIERRA_LLAVE;      

sentence: var_decl | var_asignar | println;

var_decl: VAR ID PUNTO_COMA;
var_asignar: ID ASIGNACION expression PUNTO_COMA ;
println: PRINTLN expression PUNTO_COMA ;

expression: NUMBER|ID;
/*-----gramatica regular----NO TERMINALES-- */
PROGRAM: 'program';
VAR:'var';
PRINTLN:'println';

SUMA:'+';
MENOS:'-';
MULTIPLICAR:'*';
DIVIDIR:'/';

AND:'&&';
OR:'||';
NOT:'!';

MAYORQUE:'>';
MENORQUE:'<';
MAYORIGUALQUE:'>=';
MENORIGUALQUE:'<=';
IGUALQUE:'==';
DISTINTODE:'!=';

ASIGNACION:'=';

ABRE_LLAVE:'{';
CIERRA_LLAVE:'}';

ABRE_PARENTESIS:'(';
CIERRA_PARENTESIS:')';

PUNTO_COMA:';';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER:[0-9]+;

WS: [ \t\n\r]+ -> skip;