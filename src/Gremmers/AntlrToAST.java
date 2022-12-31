package Gremmers;

import syntax.projectParser;
import syntax.projectParserBaseVisitor;
import org.antlr.v4.runtime.Token;

public class AntlrToAST extends projectParserBaseVisitor<AST>{

    public AntlrToAST() {}

    @Override
    public AST visitElement(projectParser.ElementContext ctx) {
//        return super.visitElement(ctx);
        return (AST) visitBody(ctx.body());//visitbody
    }

    @Override
    public AST visitBody(projectParser.BodyContext ctx) {
        return super.visitBody(ctx);
//         for (int i=0; i<ctx.children.size();i++){
//             if(ctx.getChild(i)==class){
//
//             }
//         }






    }

    @Override
    public AST visitFloatvarf(projectParser.FloatvarfContext ctx) {
//        return super.visitFloatvarf(ctx);
        Float float_p = new Float();
        float_p.setFLOAT(ctx.NUM_FLOAT().toString().trim());
        return float_p;
    }

    @Override
    public AST visitDoublevard(projectParser.DoublevardContext ctx) {
//        return super.visitDoublevard(ctx);
        Double double_p = new Double();
        double_p.setDouble(ctx.NUM_DOUBLE().toString().trim());
        return double_p;
    }

    @Override
    public AST visitArrayType(projectParser.ArrayTypeContext ctx) {
        return super.visitArrayType(ctx);
    }

    @Override
    public AST visitArrayINT(projectParser.ArrayINTContext ctx) {
//        return super.visitArrayINT(ctx);
        IntArray intArray = new IntArray();
        for(int i=0; i<ctx.NUM().size();i++){
            intArray.addChild(Integer.parseInt(ctx.NUM().get(i).getText()));
        }
        return intArray;
    }

    @Override
    public AST visitArraySTRING(projectParser.ArraySTRINGContext ctx) {
//        return super.visitArraySTRING(ctx);
        StringArray stringArray = new StringArray();
        for(int i=0; i<ctx.ID().size();i++){
            stringArray.addChild(ctx.ID().get(i).getText());
        }
        return stringArray;
    }

    @Override
    public AST visitArrayFLOAT(projectParser.ArrayFLOATContext ctx) {
//        return super.visitArrayFLOAT(ctx);
        FloatArray floatArray = new FloatArray();
        for(int i=0; i<ctx.NUM_FLOAT().size();i++){
            floatArray.addChild(ctx.NUM_FLOAT().get(i).getText());
        }
        return floatArray;
    }

    @Override
    public AST visitVar_Variable(projectParser.Var_VariableContext ctx) {
//        return super.visitVar_Variable(ctx);
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx) {
//        return super.visitVarVariable_INPUT_D_Q_N(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx) {
//        return super.visitVarVariable_INPUT_D_Q_I(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitConst_Variable(projectParser.Const_VariableContext ctx) {
//        return super.visitConst_Variable(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx) {
//        return super.visitConst_Variable_INPUT_D_Q_N(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx) {
//        return super.visitConst_Variable_INPUT_D_Q_I(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDynamic_Variable(projectParser.Dynamic_VariableContext ctx) {
//        return super.visitDynamic_Variable(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx) {
//        return super.visitDynamic_Variable_INPUT_D_Q_N(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx) {
//        return super.visitDynamic_Variable_INPUT_D_Q_I(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFinal_Variable(projectParser.Final_VariableContext ctx) {
//        return super.visitFinal_Variable(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx) {
//        return super.visitFinal_Variable_INPUT_D_Q_N(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx) {
//        return super.visitFinal_Variable_INPUT_D_Q_I(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx) {
//        return super.visitString_Variable_INPUT_D_Q_N(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_N().getText());
        String value = ctx.INPUT_D_Q_N().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx) {
//        return super.visitString_Variable_INPUT_D_Q_I(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.INPUT_D_Q_I().getText());
        String value = ctx.INPUT_D_Q_I().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx) {
        return super.visitString_Variable_TEXT(ctx);

    }

    @Override
    public AST visitInt_Variable(projectParser.Int_VariableContext ctx) {
//        return super.visitInt_Variable(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM().getText());
        String value = ctx.NUM().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitFloat_Variable(projectParser.Float_VariableContext ctx) {
//        return super.visitFloat_Variable(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM_FLOAT().getText());
        String value = ctx.NUM_FLOAT().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitDouble_Variable(projectParser.Double_VariableContext ctx) {
//        return super.visitDouble_Variable(ctx);
        Token idToken = ctx.ID().getSymbol(); //first element
        int line = idToken.getLine(); //num of line
        int column = idToken.getCharPositionInLine() +  1;

        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
//            int value = Integer.parseInt(ctx.NUM_DOUBLE().getText());
        String value = ctx.NUM_DOUBLE().getText();
        return new varVariable(type,id,value);
    }

    @Override
    public AST visitBoolean_Variable(projectParser.Boolean_VariableContext ctx) {
        return super.visitBoolean_Variable(ctx);
    }

    @Override
    public AST visitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx) {
        return super.visitFor_VAR_With_ID_ID(ctx);
    }

    @Override
    public AST visitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx) {
        return super.visitFor_INT_With_ID_ID(ctx);
    }

    @Override
    public AST visitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx) {
        return super.visitFor_VAR_With_ID_NUM(ctx);
    }

    @Override
    public AST visitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx) {
        return super.visitFor_INT_With_ID_NUM(ctx);
    }

    @Override
    public AST visitPrint_ID(projectParser.Print_IDContext ctx) {
        return super.visitPrint_ID(ctx);
    }

    @Override
    public AST visitPrint_NUM(projectParser.Print_NUMContext ctx) {
        return super.visitPrint_NUM(ctx);
    }

    @Override
    public AST visitPrint_TEXT(projectParser.Print_TEXTContext ctx) {
        return super.visitPrint_TEXT(ctx);
    }

    @Override
    public AST visitRule(projectParser.RuleContext ctx) {
        return super.visitRule(ctx);
    }

    @Override
    public AST visitIf_WithInput(projectParser.If_WithInputContext ctx) {
        return super.visitIf_WithInput(ctx);
    }

    @Override
    public AST visitIf_WithBreak(projectParser.If_WithBreakContext ctx) {
        return super.visitIf_WithBreak(ctx);
    }

    @Override
    public AST visitIf_WithContinue(projectParser.If_WithContinueContext ctx) {
        return super.visitIf_WithContinue(ctx);
    }

    @Override
    public AST visitWhile_WithInput(projectParser.While_WithInputContext ctx) {
        return super.visitWhile_WithInput(ctx);
    }

    @Override
    public AST visitWhile_WithBreak(projectParser.While_WithBreakContext ctx) {
        return super.visitWhile_WithBreak(ctx);
    }

    @Override
    public AST visitWhile_WithContinue(projectParser.While_WithContinueContext ctx) {
        return super.visitWhile_WithContinue(ctx);
    }

    @Override
    public AST visitSwitch_With_ID(projectParser.Switch_With_IDContext ctx) {
        return super.visitSwitch_With_ID(ctx);
    }

    @Override
    public AST visitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx) {
        return super.visitSwitch_With_NUM(ctx);
    }

    @Override
    public AST visitCase_With_ID(projectParser.Case_With_IDContext ctx) {
        return super.visitCase_With_ID(ctx);
    }

    @Override
    public AST visitCase_With_NUM(projectParser.Case_With_NUMContext ctx) {
        return super.visitCase_With_NUM(ctx);
    }

    @Override
    public AST visitDefault_State(projectParser.Default_StateContext ctx) {
        return super.visitDefault_State(ctx);
    }

    @Override
    public AST visitTry_State(projectParser.Try_StateContext ctx) {
        return super.visitTry_State(ctx);
    }

    @Override
    public AST visitConditions_withID(projectParser.Conditions_withIDContext ctx) {
        return super.visitConditions_withID(ctx);
    }

    @Override
    public AST visitConditions_withAND(projectParser.Conditions_withANDContext ctx) {
        return super.visitConditions_withAND(ctx);
    }

    @Override
    public AST visitConditions_withOR(projectParser.Conditions_withORContext ctx) {
        return super.visitConditions_withOR(ctx);
    }

    @Override
    public AST visitConditions_withNUM(projectParser.Conditions_withNUMContext ctx) {
        return super.visitConditions_withNUM(ctx);
    }

    @Override
    public AST visitWhile_State(projectParser.While_StateContext ctx) {
        return super.visitWhile_State(ctx);
    }

    @Override
    public AST visitDivision(projectParser.DivisionContext ctx) {
//        return super.visitDivision(ctx);
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Division(left,right);
    }

    @Override
    public AST visitIdentifier(projectParser.IdentifierContext ctx) {
//        return super.visitIdentifier(ctx);
        Token idtoken = ctx.ID().getSymbol();
        int line = idtoken.getLine();
        int column = idtoken.getCharPositionInLine() + 1 ;

        String id = ctx.getChild(0).getText();
        return new Variable(id);
    }

    @Override
    public AST visitSubtraction(projectParser.SubtractionContext ctx) {
//        return super.visitSubtraction(ctx);
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Subtraction(left,right);
    }

    @Override
    public AST visitInteger(projectParser.IntegerContext ctx) {
//        return super.visitInteger(ctx);
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public AST visitMultiplication(projectParser.MultiplicationContext ctx) {
//        return super.visitMultiplication(ctx);
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Multiplication(left,right);
    }

    @Override
    public AST visitAddition(projectParser.AdditionContext ctx) {
//        return super.visitAddition(ctx);
        AST left = visit(ctx.getChild(0));
        AST right = visit(ctx.getChild(2));
        return new Addition(left,right);
    }

    @Override
    public AST visitVoid_Function_NoARG(projectParser.Void_Function_NoARGContext ctx) {
        return super.visitVoid_Function_NoARG(ctx);
    }

    @Override
    public AST visitString_Function_NoARG(projectParser.String_Function_NoARGContext ctx) {
        return super.visitString_Function_NoARG(ctx);
    }

    @Override
    public AST visitInt_Function_NoARG(projectParser.Int_Function_NoARGContext ctx) {
        return super.visitInt_Function_NoARG(ctx);
    }

    @Override
    public AST visitDouble_Function_NoARG(projectParser.Double_Function_NoARGContext ctx) {
        return super.visitDouble_Function_NoARG(ctx);
    }

    @Override
    public AST visitFloat_Function_NoARG(projectParser.Float_Function_NoARGContext ctx) {
        return super.visitFloat_Function_NoARG(ctx);
    }

    @Override
    public AST visitVoid_Function_Return_NoARG(projectParser.Void_Function_Return_NoARGContext ctx) {
        return super.visitVoid_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx) {
        return super.visitInt_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx) {
        return super.visitString_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx) {
        return super.visitDouble_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx) {
        return super.visitFloat_Function_Return_NoARG(ctx);
    }

    @Override
    public AST visitVoid_Function_ARG(projectParser.Void_Function_ARGContext ctx) {
        return super.visitVoid_Function_ARG(ctx);
    }

    @Override
    public AST visitString_Function_ARG(projectParser.String_Function_ARGContext ctx) {
        return super.visitString_Function_ARG(ctx);
    }

    @Override
    public AST visitInt_Function_ARG(projectParser.Int_Function_ARGContext ctx) {
        return super.visitInt_Function_ARG(ctx);
    }

    @Override
    public AST visitDouble_Function_ARG(projectParser.Double_Function_ARGContext ctx) {
        return super.visitDouble_Function_ARG(ctx);
    }

    @Override
    public AST visitFloat_Function_ARG(projectParser.Float_Function_ARGContext ctx) {
        return super.visitFloat_Function_ARG(ctx);
    }

    @Override
    public AST visitVoid_Function_Return_ARG(projectParser.Void_Function_Return_ARGContext ctx) {
        return super.visitVoid_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx) {
        return super.visitInt_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx) {
        return super.visitString_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx) {
        return super.visitDouble_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx) {
        return super.visitFloate_Function_Return_ARG(ctx);
    }

    @Override
    public AST visitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx) {
        return super.visitArgumentFunctionType(ctx);
    }

    @Override
    public AST visitReturnStatement(projectParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public AST visitClass_Statement(projectParser.Class_StatementContext ctx) {
        return super.visitClass_Statement(ctx);
    }

    @Override
    public AST visitClass_Abstract(projectParser.Class_AbstractContext ctx) {
        return super.visitClass_Abstract(ctx);
    }

    @Override
    public AST visitClass_Extends(projectParser.Class_ExtendsContext ctx) {
        return super.visitClass_Extends(ctx);
    }

    @Override
    public AST visitClass_State(projectParser.Class_StateContext ctx) {
        return super.visitClass_State(ctx);
    }

    @Override
    public AST visitAbstract_State(projectParser.Abstract_StateContext ctx) {
        return super.visitAbstract_State(ctx);
    }

    @Override
    public AST visitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx) {
        return super.visitExtends_ClassStatment_Withinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx) {
        return super.visitExtends_ClassStatment_Withoutinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx) {
        return super.visitExtends_ClassStateFull(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx) {
        return super.visitExtends_ClassStateLess(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx) {
        return super.visitExtends_ClassStateFullwithinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx) {
        return super.visitExtends_ClassStateLesswithinput(ctx);
    }

    @Override
    public AST visitContainer_withRow(projectParser.Container_withRowContext ctx) {
        return super.visitContainer_withRow(ctx);
    }

    @Override
    public AST visitContainer_withCol(projectParser.Container_withColContext ctx) {
        return super.visitContainer_withCol(ctx);
    }

    @Override
    public AST visitRow_State(projectParser.Row_StateContext ctx) {
        return super.visitRow_State(ctx);
    }

    @Override
    public AST visitColo_state(projectParser.Colo_stateContext ctx) {
        return super.visitColo_state(ctx);
    }

    @Override
    public AST visitTexeStatement(projectParser.TexeStatementContext ctx) {
        return super.visitTexeStatement(ctx);
    }

    @Override
    public AST visitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx) {
        return super.visitHight_SizedBox(ctx);
    }

    @Override
    public AST visitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx) {
        return super.visitWidth_SizedBox(ctx);
    }

    @Override
    public AST visitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx) {
        return super.visitWidthHight_SizedBox(ctx);
    }

    @Override
    public AST visitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx) {
        return super.visitHightWidth_SizedBox(ctx);
    }

    @Override
    public AST visitTextButton_withTexe(projectParser.TextButton_withTexeContext ctx) {
        return super.visitTextButton_withTexe(ctx);
    }

    @Override
    public AST visitTextButton_withContainer(projectParser.TextButton_withContainerContext ctx) {
        return super.visitTextButton_withContainer(ctx);
    }

    @Override
    public AST visitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx) {
        return super.visitImage_withAssetImage(ctx);
    }

    @Override
    public AST visitImage_withAsset(projectParser.Image_withAssetContext ctx) {
        return super.visitImage_withAsset(ctx);
    }

    @Override
    public AST visitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx) {
        return super.visitImage_withNetWoek(ctx);
    }

    @Override
    public AST visitImage_withFile(projectParser.Image_withFileContext ctx) {
        return super.visitImage_withFile(ctx);
    }

    @Override
    public AST visitExpanded_withCol(projectParser.Expanded_withColContext ctx) {
        return super.visitExpanded_withCol(ctx);
    }

    @Override
    public AST visitExpanded_withRow(projectParser.Expanded_withRowContext ctx) {
        return super.visitExpanded_withRow(ctx);
    }

    @Override
    public AST visitFlutterWidget(projectParser.FlutterWidgetContext ctx) {
        return super.visitFlutterWidget(ctx);
    }

    @Override
    public AST visitInput(projectParser.InputContext ctx) {
        return super.visitInput(ctx);
    }
}
