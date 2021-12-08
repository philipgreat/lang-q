grammar LangQ;

@header{package com.skynet.lingqparser; }

r  
    : 'Q.' REQTYPE '().' REQEXPR+ ;

REQTYPE : [a-z]+ ;
REQEXPR : [a-z]+ ;

WS : [ \t\r\n]+ -> skip ;





