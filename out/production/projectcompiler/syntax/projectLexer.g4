
/* Lexer */


lexer grammar projectLexer;


//ID : [a-zA-Z];
//NEWLINE : ('\r'? '\n' | '\r')+ ;
//SAYS : S A Y S ;
//SHOUTS : S H O U T S ;
//
////COMMENT: '--' ~[\r\n]* -> skip;
////WS : [ \t\n]+ -> skip;
//HELLOO : 'hello';
//WHITESPACE : [ \t\n\r]+ -> skip ;
//// WORD : [a-zA-Z]+ ;
//WORD : (LOWERCASE | UPPERCASE | '_')+ ;
////CHAR:('a'..'z' | 'A'..'Z')+ ;
////WS :  [ \t\n]+ -> skip;  //(' ' | '\t' )+  -> skip;
//INT_TYPE : ('int@' | 'float' | 'double');
//EXP : ('+' | '-' | '*' | '/' );
//NUM:[0-9];
//
////TEXT : ~[\])]+ ;
//TOWPOINT : ':';
//Equal : '=';
//


INPUT_D_Q_N  :  '"'WS NUM WS'"'  | '"'NUM'"' | '"'NUM WS'"' | '"'WS NUM '"';
INPUT_D_Q_I  :  '"'WS ID WS '"'  | '"'ID'"'  | '"' ID WS '"'| '"'WS ID  '"';

/*
INPUTS  :'"'ID+'"' | '"'WS ID+'"' |'"'WS ID+ WS '"' |'"'ID+ WS'"'
        | '"'NUM+'"' |'"' WS NUM+'"' |'"' WS NUM+ WS'"' |'"' WS NUM+ '"'
        | '"'ID+ INPUTS+ '"' | '"'WS ID+ INPUTS+ WS'"' | '"'ID+ WS INPUTS+ '"' | '"'ID+ WS INPUTS+ '"'
         | '"'NUM+ INPUTS+'"';
*/


QOUT : '"';

/*
INPUT_D_Q_IN :  '"'WS ID WS NUM WS ID+'"' | '"' ID+ NUM+ '"'
              | '"'ID+ WS NUM+ WS '"' |'"' ID+ NUM+ WS '"'
              | '"'WS ID+ NUM+ WS '"' |'"'  ID WS NUM WS '"'
              | '"'ID WS NUM  '"'


             |'"' ID+ WS ID+ NUM+ ID+  WS '"' |'"' ID+ NUM+ ID+ WS '"'
             |'"' WS ID+ NUM+ ID+ WS '"' |'"'  ID WS NUM ID+ WS '"'
             |'"' ID WS NUM  '"'


              ;





INPUT_D_Q_NI :  '"'WS NUM+ WS ID+ WS '"'
             | '"' NUM ID+'"'  |'"' NUM WS ID+ WS '"' | '"' NUM ID+ WS '"'
             |'"'WS NUM ID+ WS '"' | '"' NUM WS ID+ WS '"' |'"' NUM WS ID  '"' ;


*/
/*
INPUT_D_Q_NI :  '"' WS VARNAMEE WS'"';
INPUT_D_Q_I :  '"'WS VARNAMEE WS'"';
INPUT_D_Q_IN :  '"'WS VARNAMEE WS'"';
INPUT_D_Q_N :  '"'WS VARNAMEE WS'"';
*/

NUM_BOOL : TRUE | FALSE;


AT: '@';
MINUS :'-';
PLUS : '+';
MULTI : '*' ;
DIVIDE : '/';
LINE_COMMENT : '//';
COMMENTSTART : '/* ';
COMMENTEND : '*/ ';
COMMA : ','  ;

/*BACKSLASH : '/';*/
ARRAYRIGHT:']';
ARRAYLEFT:'[';
CURLERIGHT :'}';
CURLELEFT :'{';
HRIGHT:')';
HLEFT :'(';
UNDERSCORE : '_';
QUISTION : '?';
EXCLAMATION:'!';
AND : '&&';
OR : '||' ;
DOT : '.';

SINGLS : '>' | '<' | '==' | '!=' | '<= ' | '=>'  ;
PLUSORMINUS : '++' | '--';

/* Data type */
VAR      : 'var';
CONST    : 'const';
FINAL    : 'final';
DYNAMIC  : 'dynamic';
INT      : 'int';
STRING   : 'String';
FLOAT    : 'float';
DOUBLE   : 'double';
LIST     : 'list';
MAPS     : 'map';
SET      : 'Set';
HASH     : 'Hash';
INTEGER  : 'Integer';
ARRAY    : 'array';
BOOLEAN  : 'bool';

/* Data type */

/* Kayword */

MAIN     : 'main';
VOID     : 'void';
CLASS    : 'class';
ABSTRACT : 'abstract';
THIS     : 'this';
SWITCH   : 'switch';
CASE     : 'case' ;
IMPORT   : 'import';
SUPER    : 'super';
EXTENDS  : 'extends';
NEW      : 'new' ;
PRINT    : 'print';
BREAK    : 'break';
CONTINUE : 'continue';
WHILE    : 'while';
RETURN   : 'return';
THEN     : 'then';
DEFAULT  :'default';
STATIC   :'static';
DO       : 'do';
TRY      : 'try';
CATCH    : 'catch';
THROW    : 'throw';
ELSE     : 'else';
IS       : 'is' ;
ENUM     : 'enum';
WITH     : 'with' ;


/* Kayword */

/* flutter */

STATEFULLWIDGET :'StateFullWidget';
STATELESSWIDGET: 'StateLessWidget';
WIDGET : 'widget';
BUILD_WIDGET  : 'Widget build(BuildContext context)';
STACK  : 'Stack';
COLUMN : 'Column';
ROW    : 'Row';
BODY   : 'body';
CHILD  : 'child';
CHILDREN : 'children';
CONTEXT : 'context';
CONTAINER :'Container';
TEXTBUTTON:'TextButton';
TEXT : 'Text';
EXPANDED :'Expanded';
SIZEDBOX : 'SizedBox';
HIGHT :'hight';
WIDTH :'width';
IMAGE : 'Image';
IMAGE_CHILD : 'image';
ASSET : 'asset';
FILE : 'file';
NETWOK : 'netwok';
ASSETSIMAGE:'AssetImage';
IMAGE_INPUT_ASSET : '"' 'assets/'ID'.jpg' '"'      |'"' 'assets/'ID'.png''"'
                  | '"' 'assets/'ID NUM'.jpg' '"'  |'"' 'assets/'ID NUM'.png''"'
                  | '"' 'assets/'NUM ID'.jpg' '"'  |'"' 'assets/'NUM ID'.png''"'

                   ;

OVERRIDE : '@override'
      ;
SCAFFOLD : 'Scaffold' ;


/* flutter */

NUM_FLOAT :  NUM+ DOT NUM* ;
NUM_DOUBLE : NUM+ DOT NUM*    ;
TRUE : 'true';
FALSE : 'false';
TOWPOINT : ':' ;
SEMECOLON :';';
EQUAL    : '=' ;
FOR :'for';
IF : 'if';



ID : [a-zA-Z]+;
NUM: '0'| '-'?[1-9] [0-9]*;
WS : [ \t\n]+  -> skip;
COMMENT: '--' ~[\n\r]* -> skip;
STRINGWITHQOYCHAR : ('a'..'z' )+;
//STRINGWITHQOYNUM : '0'..'9'+ ;
WHITESPACE : ' '+  ;




fragment UPPERCASE : [A-Z] ;
fragment LOWERCASE : [a-z] ;
//fragment VARNAMEE :' '*[a-zA-Z_] WS [a-zA-Z0-9_]*' '*;
//fragment DIGIT : [0-9];

fragment S : ('S'|'s') ;
fragment A : ('A'|'a') ;
fragment Y : ('Y'|'y') ;
fragment H : ('H'|'h') ;
fragment O : ('O'|'o') ;
fragment U : ('U'|'u') ;
fragment T : ('T'|'t') ;
fragment F : ('F'|'f') ;
fragment R : ('R'|'r') ;


