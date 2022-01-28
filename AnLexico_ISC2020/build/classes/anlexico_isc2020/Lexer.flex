package anlexico_isc2020;
import static anlexico_isc2020.Token.*;

%%

%class Lexer
%type Token
LITERAL=[a-zA-Z]
DIGITO=[0-9]
BLANCO=[ \t\r\n]
%{
    public String lexeme;
%}

%%

{BLANCO}        { /* Ignore*/}
"//"            { /* Ignore*/}
"="             { return ASIGNAR; }
"=="            { return IGUAL; }
"+"             { return SUMA; }
";"             { return PUNTO_Y_COMA; }
"{"             { return LLAVE ABIRTA; }
"}"             { return LLAVE CERRADA; }
"("             { return PARETESIS_ABIERTO; }
")"             { return PARETESIS_CERRADO; }
"mientras"      { return PALABRA_RESERVADA; }
"si"            { return PALABRA_RESERVADA; }
{LITERAL}({LITERAL}|{DIGITO})*      { lexeme = yytext(); return ID; }
("(-"{DIGITO}+")")|{DIGITO}         { lexeme = yytext(); return INT; }
.               { return ERROR; }