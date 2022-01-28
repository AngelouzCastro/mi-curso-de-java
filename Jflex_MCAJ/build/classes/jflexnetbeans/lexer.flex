package Jflex;
import static javaflexnetbeans.Token.*;
%%
%class Laxer
%type Token
L = [a-zA-Z]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"=" {return ASSIGN;}
"==" {return IGUALDAD;}
"+" {return SUMA;}
"*" {return MULT;}
"-" {return RESTA;}
"/" {return DIV;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
[-+]?|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}
