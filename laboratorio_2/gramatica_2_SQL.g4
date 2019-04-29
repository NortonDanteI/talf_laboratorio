/*nombre de la gramatica*/
grammar gramatica_2_SQL;
/* 
Ejemplos: 
1) SELECT * FROM Coches ORDER BY marca, modelo ASC;
2) SELECT ALL matricula, marca, modelo, color, numero_kilometros, num_plazas 
FROM Coches
ORDER BY marca,modelo;
5) SELECT ALL matricula, marca, modelo, color, numero_kilometros, num_plazas
FROM Coches
WHERE matricula = 'MF234ZD' OR matricula = 'FK938ZL' ;
6) SELECT ALL matricula,marca, modelo, color, numero_kilometros, num_plazas
FROM coches
WHERE NOT matricula = 'MF-234-ZD';
7) SELECT DISTINCT marca, modelo FROM coches;
8) DELETE FROM tabla WHERE columna1 = 'valor1';
9) UPDATE My_table SET field1 = 'a' WHERE field2 = 'N';
*/

/* 
Una gramática libre de contexto (o de contexto libre) es una gramática formal en la que cada regla de producción es de la forma:
V -> w
Donde V es un símbolo no terminal y w es una cadena de terminales y/o no terminales. 
*/

consulta: (select | update | delete);

select: SELECT (ASTERISCO| ( (ALL | DISTINCT) (nombre_de_campo_coma* ID))) from;
update: UPDATE ID SET condicion_coma* condicion where;
delete: DELETE from;

from: FROM ID (PUNTO_COMA | order_by | where);

order_by: ORDER_BY nombre_de_campo_coma* condicion_asc_desc; 
where: WHERE NOT* condicion_AND_OR* condicion PUNTO_COMA;

condicion_asc_desc: ID (ASC|DESC) PUNTO_COMA;
nombre_de_campo_coma: ID COMA;

condicion_AND_OR: condicion (AND|OR);
condicion_coma: condicion COMA;
condicion: ID IGUAL COMILLA ID COMILLA;

/*TERMINALES*/

SELECT:'SELECT';
DELETE:'DELETE';
UPDATE:'UPDATE';

ALL:'ALL';
DISTINCT:'DISTINCT';

FROM:'FROM';
WHERE:'WHERE';
NOT:'NOT';

OR:'OR';
AND:'AND';

SET:'SET';
ASC:'ASC';
DESC:'DESC';
ID: [a-zA-Z_][a-zA-Z0-9_\-]*;

ORDER_BY:'ORDER BY';

PUNTO_COMA:';';

ASTERISCO:'*';

COMA:',';

IGUAL:'=';
COMILLA :'\'';

WS: [ \t\n\r]+ -> skip;