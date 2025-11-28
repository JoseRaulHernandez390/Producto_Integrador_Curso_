grammar MiLenguaje;

programa : instruccion+ EOF ;

instruccion
    : avanzar
    | girar
    | detener
    | esperar
    ;

avanzar : 'avanzar' '(' INT ')' ';' ;
girar   : 'girar' '(' ('izquierda' | 'derecha') ')' ';' ;
detener : 'detener' ';' ;
esperar : 'esperar' '(' INT ')' ';' ;

INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
