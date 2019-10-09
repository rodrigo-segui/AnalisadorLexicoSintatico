package linguagens;

import static linguagens.Tokens.*;

%%
%class LexicalAnalyzer
%type Tokens



WHITE = [\n| |\t|\r]
ID = [a-z|A-Z][a-z|A-Z|0-9]*
NUM = [0-9]*


%{
public String lexeme;
%}

%%

{WHITE} {lexeme = yytext(); return Espaco;}
("if" | "defun") {lexeme = yytext(); return palavrareservada;}

/*Demilitador esquerdo */
( "(" )    {lexeme = yytext(); return DelimEsq;}

/*Demilitador direito */
( ")" )    {lexeme = yytext(); return DelimDir;}

/* numeros */
{NUM}    {lexeme = yytext(); return Num;}

/*op unario */
/*("--" | "++")    {lexeme = yytext(); return  OpUn;}*/

/* condicional */
("eq" | "leq" | "neq" | "geq" | "lt" | "gt")    {lexeme = yytext(); return TesteCond;}

/* op binario */
("+" | "-" | "*" | "/" | "and" | "or" | "not")   {lexeme = yytext(); return OpBin;}

(#) {lexeme = yytext(); return fim;}
{ID} {lexeme = yytext(); return ID;}
