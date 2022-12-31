
/* Parser */

parser grammar projectParser;

prog : element+ EOF;
element : body ;
body : class
     | functionStatement
     | class+ body
     | functionStatement+ body
     ;

//( abstractstatment | classstatement+ | doWhilestatement | extendsClass |printstatement
//       | containerStatement | rowStatement | functionStatement
//       | colStatemenst )    #program
//       ;

float_f : NUM_FLOAT #floatvarf
        ;

double_d : NUM_DOUBLE #doublevard
         ;

arrayType : ARRAY HLEFT arraybody HRIGHT;

arraybody : NUM (COMMA NUM)* #arrayINT
           | ID (COMMA ID)* #arraySTRING
           | NUM_FLOAT (COMMA NUM_FLOAT)* #arrayFLOAT
           ;


initial :   VAR ID EQUAL NUM SEMECOLON                      #var_Variable
          | VAR ID EQUAL INPUT_D_Q_N  SEMECOLON             #varVariable_INPUT_D_Q_N
          | VAR ID EQUAL INPUT_D_Q_I  SEMECOLON             #varVariable_INPUT_D_Q_I
          | CONST ID EQUAL NUM SEMECOLON                    #const_Variable
          | CONST ID EQUAL INPUT_D_Q_N SEMECOLON            #const_Variable_INPUT_D_Q_N
          | CONST ID EQUAL INPUT_D_Q_I SEMECOLON            #const_Variable_INPUT_D_Q_I
          | DYNAMIC ID EQUAL NUM SEMECOLON                  #dynamic_Variable
          | DYNAMIC ID EQUAL INPUT_D_Q_N SEMECOLON          #dynamic_Variable_INPUT_D_Q_N
          | DYNAMIC ID EQUAL INPUT_D_Q_I SEMECOLON          #dynamic_Variable_INPUT_D_Q_I
          | FINAL ID EQUAL NUM SEMECOLON                    #final_Variable
          | FINAL ID EQUAL INPUT_D_Q_N SEMECOLON            #final_Variable_INPUT_D_Q_N
          | FINAL ID EQUAL INPUT_D_Q_I SEMECOLON            #final_Variable_INPUT_D_Q_I
          | STRING ID EQUAL INPUT_D_Q_N SEMECOLON           #string_Variable_INPUT_D_Q_N
          | STRING ID EQUAL INPUT_D_Q_I SEMECOLON           #string_Variable_INPUT_D_Q_I
          | STRING ID EQUAL QOUT rule QOUT SEMECOLON        #string_Variable_TEXT
          | INT ID EQUAL NUM SEMECOLON                      #int_Variable
          | FLOAT  ID EQUAL NUM_FLOAT  SEMECOLON            #float_Variable
          | DOUBLE ID EQUAL NUM_DOUBLE  SEMECOLON           #double_Variable
          | BOOLEAN ID EQUAL NUM_BOOL  SEMECOLON            #boolean_Variable
          ;

loop :   FOR HLEFT VAR ID EQUAL NUM SEMECOLON ID SINGLS ID SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT input CURLERIGHT   #for_VAR_With_ID_ID
       | FOR HLEFT INT ID EQUAL NUM SEMECOLON ID SINGLS ID SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT input CURLERIGHT   #for_INT_With_ID_ID
       | FOR HLEFT VAR ID EQUAL NUM SEMECOLON ID SINGLS NUM SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT input CURLERIGHT  #for_VAR_With_ID_NUM
       | FOR HLEFT INT ID EQUAL NUM SEMECOLON ID SINGLS NUM SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT input CURLERIGHT  #for_INT_With_ID_NUM
       ;


printstatement :  PRINT HLEFT INPUT_D_Q_I HRIGHT SEMECOLON        #print_ID
               |  PRINT HLEFT INPUT_D_Q_N HRIGHT SEMECOLON        #print_NUM
               |  PRINT HLEFT QOUT rule+ QOUT HRIGHT SEMECOLON    #print_TEXT
               ;

rule :  ID |  NUM
               |  ID+  rule+
               |  NUM+  rule+
               ;

ifstatement  : IF HLEFT conditions  HRIGHT CURLELEFT input CURLERIGHT      #if_WithInput
             | IF HLEFT conditions  HRIGHT BREAK     SEMECOLON             #if_WithBreak
             | IF HLEFT conditions  HRIGHT CONTINUE  SEMECOLON             #if_WithContinue
             ;

whilestatemen : WHILE HLEFT conditions  HRIGHT CURLELEFT input CURLERIGHT  #while_WithInput
              | WHILE HLEFT conditions  HRIGHT  BREAK SEMECOLON            #while_WithBreak
              | WHILE HLEFT conditions  HRIGHT  CONTINUE SEMECOLON         #while_WithContinue
              ;
/* my edit "neme" in 12/30 */
 switchstatement : SWITCH HLEFT ID HRIGHT  CURLELEFT casestatement+ defaultstatement CURLERIGHT       #switch_With_ID
                 | SWITCH HLEFT NUM HRIGHT CURLELEFT casestatement+  defaultstatement CURLERIGHT      #switch_With_NUM
                 ;
 casestatement   : CASE INPUT_D_Q_I TOWPOINT CURLELEFT  input+ CURLERIGHT BREAK SEMECOLON             #case_With_ID
                 | CASE NUM  TOWPOINT CURLELEFT  input+ CURLERIGHT BREAK SEMECOLON                    #case_With_NUM
                 ;

defaultstatement : DEFAULT TOWPOINT CURLELEFT input+ CURLERIGHT  BREAK SEMECOLON                       #default_State
                 ;

tryCatchstatement : TRY CURLELEFT input+ CURLERIGHT CATCH HLEFT ID HRIGHT CURLELFT input CURLERIGHT    #try_State
                  ;


conditions : conditions OR conditions   #conditions_withOR
           | conditions AND conditions  #conditions_withAND
           | ID SINGLS NUM              #conditions_withNUM
           | ID SINGLS ID               #conditions_withID
           ;

doWhilestatement: DO CURLELEFT input CURLERIGHT whilestatemen               #while_State
                ;

expr: expr MULTI expr    #multiplication
    | expr PLUS expr     #addition
    | expr MINUS expr    #subtraction
    | expr DIVIDE expr   #division
    | ID                 #identifier
    | NUM                #integer
    ;

functionStatement : VOID   ID HLEFT HRIGHT CURLELEFT input CURLERIGHT   #void_Function_NoARG
                  | STRING ID HLEFT HRIGHT CURLELEFT input CURLERIGHT   #string_Function_NoARG
                  | INT    ID HLEFT HRIGHT CURLELEFT input CURLERIGHT   #int_Function_NoARG
                  | DOUBLE ID HLEFT HRIGHT CURLELEFT input CURLERIGHT   #double_Function_NoARG
                  | FLOAT  ID HLEFT HRIGHT CURLELEFT input CURLERIGHT   #float_Function_NoARG
  /*  function type WITHOUT return "NO arg" */


  /*  function type WITH return "NO arg" */

                  | VOID   ID HLEFT HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #void_Function_Return_NoARG
                  | INT    ID HLEFT HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #int_Function_Return_NoARG
                  | STRING ID HLEFT HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #string_Function_Return_NoARG
                  | DOUBLE ID HLEFT HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #double_Function_Return_NoARG
                  | FLOAT  ID HLEFT HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #float_Function_Return_NoARG

  /*  function type WITHOUT return " arg" */

                  | VOID   ID HLEFT argumentFunctionType HRIGHT CURLELEFT input CURLERIGHT   #void_Function_ARG
                  | STRING ID HLEFT argumentFunctionType HRIGHT CURLELEFT input CURLERIGHT   #string_Function_ARG
                  | INT    ID HLEFT argumentFunctionType HRIGHT CURLELEFT input CURLERIGHT   #int_Function_ARG
                  | DOUBLE ID HLEFT argumentFunctionType HRIGHT CURLELEFT input CURLERIGHT   #double_Function_ARG
                  | FLOAT  ID HLEFT argumentFunctionType HRIGHT CURLELEFT input CURLERIGHT   #float_Function_ARG

   /*  function type WITH return " arg" */

                  | VOID   ID HLEFT argumentFunctionType HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #void_Function_Return_ARG
                  | INT    ID HLEFT argumentFunctionType HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #int_Function_Return_ARG
                  | STRING ID HLEFT argumentFunctionType HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #string_Function_Return_ARG
                  | DOUBLE ID HLEFT argumentFunctionType HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #double_Function_Return_ARG
                  | FLOAT  ID HLEFT argumentFunctionType HRIGHT CURLELEFT input returnStatement SEMECOLON CURLERIGHT   #floate_Function_Return_ARG
                  ;
/* my edit "neme" in 12/30 */
argumentFunctionType : VAR ID  | INT NUM  | DOUBLE NUM | FLOAT NUM | DYNAMIC NUM | STRING ID   /*#all_ARG_Type_andRepet*/
                     | VAR ID COMMA argumentFunctionType+                                      /*#var_ARG_Type_andRepet*/
                     | INT NUM COMMA argumentFunctionType+                                     /*#int_ARG_Type_andRepet*/
                     | DOUBLE NUM COMMA argumentFunctionType+                                  /*#double_ARG_Type_andRepet*/
                     | FLOAT NUM COMMA argumentFunctionType+                                   /*#float_ARG_Type_andRepet*/
                     | DYNAMIC NUM COMMA argumentFunctionType+                                 /*#dynamic_ARG_Type_andRepet*/
                     | STRING ID COMMA argumentFunctionType+                                   /*#string_ARG_Type_andRepet*/
                     ;

returnStatement : RETURN ID | RETURN INPUT_D_Q_I  | RETURN QOUT rule QOUT | RETURN ;

class : classstatement   #class_Statement
      | abstractstatment #class_Abstract
      | extendsClass     #class_Extends
      ;


classstatement : CLASS ID CURLELEFT inputclass+  CURLERIGHT                      #class_State
               ;

abstractstatment : ABSTRACT CLASS ID CURLELEFT CURLERIGHT                   #abstract_State
                 ;

extendsClass   : CLASS ID EXTENDS ID  CURLELEFT  inputclass  CURLERIGHT                                   #extends_ClassStatment_Withinput
               | CLASS ID EXTENDS ID  CURLELEFT         CURLERIGHT                                   #extends_ClassStatment_Withoutinput
               | CLASS ID EXTENDS STATEFULLWIDGET CURLELEFT OVERRIDE BUILD_WIDGET CURLELEFT
                  RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget HRIGHT CURLERIGHT CURLERIGHT   #extends_ClassStateFull
               | CLASS ID EXTENDS STATELESSWIDGET CURLELEFT OVERRIDE BUILD_WIDGET CURLELEFT
                  RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget HRIGHT CURLERIGHT CURLERIGHT   #extends_ClassStateLess
               | CLASS ID EXTENDS STATEFULLWIDGET CURLELEFT inputclass OVERRIDE BUILD_WIDGET CURLELEFT
                  RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget HRIGHT CURLERIGHT CURLERIGHT   #extends_ClassStateFullwithinput
               | CLASS ID EXTENDS STATELESSWIDGET CURLELEFT inputclass OVERRIDE BUILD_WIDGET CURLELEFT
                   RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget HRIGHT CURLERIGHT CURLERIGHT   #extends_ClassStateLesswithinput
               ;

/* flutter component */

containerStatement : CONTAINER HLEFT CHILD TOWPOINT rowStatement HRIGHT  COMMA    #container_withRow
                   | CONTAINER HLEFT CHILD TOWPOINT colStatemenst HRIGHT  COMMA   #container_withCol
                   ;

rowStatement  : ROW HLEFT CHILDREN TOWPOINT ARRAYLEFT flutterWidget ARRAYRIGHT HRIGHT COMMA  #row_State
              ;

colStatemenst : COLUMN HLEFT CHILDREN TOWPOINT ARRAYLEFT flutterWidget ARRAYRIGHT HRIGHT COMMA  #colo_state
               ;

texeStatement : TEXT HLEFT INPUT_D_Q_N HRIGHT COMMA
              | TEXT HLEFT INPUT_D_Q_I HRIGHT COMMA
              | TEXT HLEFT QOUT rule+ QOUT HRIGHT COMMA
              ;

sizedBox  : SIZEDBOX HLEFT HIGHT TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA        #hight_SizedBox
          | SIZEDBOX HLEFT WIDTH TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA        #width_SizedBox
          | SIZEDBOX HLEFT WIDTH HIGHT TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA  #widthHight_SizedBox
          | SIZEDBOX HLEFT HIGHT WIDTH TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA  #hightWidth_SizedBox
          ;

textButton  : TEXTBUTTON HLEFT CHILD TOWPOINT texeStatement HRIGHT  COMMA       #textButton_withTexe
            | TEXTBUTTON HLEFT CHILD TOWPOINT containerStatement HRIGHT  COMMA  #textButton_withContainer
            ;

imageState : IMAGE HLEFT IMAGE_CHILD TOWPOINT ASSETSIMAGE HLEFT IMAGE_INPUT_ASSET  HRIGHT  HRIGHT COMMA  #image_withAssetImage
           | IMAGE DOT ASSET HLEFT HRIGHT COMMA    #image_withAsset
           | IMAGE DOT NETWORK HLEFT HRIGHT COMMA  #image_withNetWoek
           | IMAGE DOT FILE HLEFT HRIGHT COMMA     #image_withFile
            ;




expandedStatment : EXPANDED HLEFT CHILD TOWPOINT colStatemenst  HRIGHT COMMA   #expanded_withCol
                 | EXPANDED HLEFT CHILD TOWPOINT rowStatement  HRIGHT COMMA    #expanded_withRow
                 ;
/*
//
//flutterWidget : containerStatement+ |
//             | rowStatement+
//             | colStatemenst+
//             | rowStatement+ colStatemenst+
//             | colStatemenst+ rowStatement+
//             | containerStatement+
//             | containerStatement+ rowStatement+ colStatemenst+
//             | containerStatement+ colStatemenst+ rowStatement+
//             | rowStatement+ containerStatement+ colStatemenst+
//             | rowStatement+ colStatemenst+ containerStatement+
//             | colStatemenst+ containerStatement+ rowStatement+
//             | colStatemenst+ rowStatement+ containerStatement+
//             | sizedBox+ textButton+ imageState+
//             | textButton+ sizedBox+ imageState+
//             | imageState+ sizedBox+ textButton+
//             | textButton+
//             | imageState+
//             | texeStatement+
//             | texeStatement+ sizedBox+ imageState+
//             | texeStatement+ imageState+
//             | texeStatement+ sizedBox+
//             | texeStatement+ imageState+ sizedBox+ texeStatement+
//             | texeStatement+ imageState+ sizedBox+
//             | texeStatement+ sizedBox+ imageState+ sizedBox+ texeStatement+
//             | texeStatement+
//             ;
*/

flutterWidget : containerStatement
              | rowStatement
              | colStatemenst
              | texeStatement
              | sizedBox
              | textButton
              | imageState
              | expandedStatment
              | containerStatement+ flutterWidget
              | rowStatement+ flutterWidget
              | colStatemenst+ flutterWidget
              | texeStatement+ flutterWidget
              | sizedBox+ flutterWidget
              | textButton+ flutterWidget
              | imageState+ flutterWidget
              | expandedStatment+ flutterWidget
              ;


input : initial
      | ifstatement
      | loop
      | doWhilestatement
      | whilestatemen
      | printstatement
      | arrayType
      | switchstatement
      | tryCatchstatement
      | expr
      | initial+ input
      | ifstatement+ input
      | loop+ input
      | doWhilestatement+ input
      | whilestatemen+ input
      | printstatement+ input
      | arrayType+ input
      | switchstatement+ input
      | tryCatchstatement+ input
      | expr+ input
      ;

 inputclass : initial
            | ifstatement
            | loop
            | doWhilestatement
            | whilestatemen
            | printstatement
            | arrayType
            | switchstatement
            | tryCatchstatement
            | expr
            | functionStatement
            | initial+ inputclass
            | ifstatement+ inputclass
            | loop+ inputclass
            | doWhilestatement+ inputclass
            | whilestatemen+ inputclass
            | printstatement+ inputclass
            | arrayType+ inputclass
            | switchstatement+ inputclass
            | tryCatchstatement+ inputclass
            | expr+ inputclass
            | functionStatement+ inputclass
            ;
/*
// initial+ |
//                   |  ifstatement+
//                   |  whilestatemen+
//                   |  loop+
//                   |  initial+ loop+ ifstatement+ whilestatemen+
//                   |  initial+ loop+
//                   |  loop+ ifstatement+
//                   |  loop+ printstatement+
//                   |  whilestatemen+ ifstatement+
//                   |  ifstatement+ whilestatemen+
//                   |  initial+ ifstatement+
//                   |  initial+ whilestatemen+
//                   |  ifstatement+ initial+
//                   |  whilestatemen+ initial+
//                   |  loop+ whilestatemen+
//                   |  whilestatemen+ loop+
//                   |  whilestatemen+ printstatement+
//                   |  initial+ whilestatemen+ ifstatement+
//                   |  initial+ ifstatement+ whilestatemen+
//                   |  doWhilestatement+
//                   |  ifstatement+ printstatement+
//                   |  printstatement+
//                   |  doWhilestatement+ printstatement+
//                   |  printstatement+ doWhilestatement+
//                   ;

*/

//inputFunction : initial
//              | ifstatement
//              | whilestatemen
//              | loop
//              | doWhilestatement
//              | printstatement
//              | initial+ inputFunction
//              | ifstatement+ inputFunction
//              | whilestatemen+ inputFunction
//              | loop+ inputFunction
//              | doWhilestatement+ inputFunction
//              | printstatement+ inputFunction
//              ;


/*

inputInnerClass : initial+ HRIGHT|
                           HRIGHT| ifstatement+ HRIGHT
                           |  whilestatemen+ HRIGHT
                           |  loop+ HRIGHT
                           ;
*/







