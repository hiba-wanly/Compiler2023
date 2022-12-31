// Generated from C:/Users/thuraya/IdeaProjects/projectcompiler/src/syntax\projectParser.g4 by ANTLR 4.10.1
package syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projectParser}.
 */
public interface projectParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projectParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(projectParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(projectParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(projectParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(projectParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(projectParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(projectParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatvarf}
	 * labeled alternative in {@link projectParser#float_f}.
	 * @param ctx the parse tree
	 */
	void enterFloatvarf(projectParser.FloatvarfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatvarf}
	 * labeled alternative in {@link projectParser#float_f}.
	 * @param ctx the parse tree
	 */
	void exitFloatvarf(projectParser.FloatvarfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doublevard}
	 * labeled alternative in {@link projectParser#double_d}.
	 * @param ctx the parse tree
	 */
	void enterDoublevard(projectParser.DoublevardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doublevard}
	 * labeled alternative in {@link projectParser#double_d}.
	 * @param ctx the parse tree
	 */
	void exitDoublevard(projectParser.DoublevardContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(projectParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(projectParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayINT}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArrayINT(projectParser.ArrayINTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayINT}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArrayINT(projectParser.ArrayINTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySTRING}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArraySTRING(projectParser.ArraySTRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySTRING}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArraySTRING(projectParser.ArraySTRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayFLOAT}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArrayFLOAT(projectParser.ArrayFLOATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayFLOAT}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArrayFLOAT(projectParser.ArrayFLOATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterVar_Variable(projectParser.Var_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitVar_Variable(projectParser.Var_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varVariable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varVariable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varVariable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varVariable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable(projectParser.Const_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable(projectParser.Const_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamic_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable(projectParser.Dynamic_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamic_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable(projectParser.Dynamic_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamic_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamic_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamic_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamic_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by the {@code final_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable(projectParser.Final_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code final_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable(projectParser.Final_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code final_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by the {@code final_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by the {@code final_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by the {@code final_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Variable_TEXT}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Variable_TEXT}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInt_Variable(projectParser.Int_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInt_Variable(projectParser.Int_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterFloat_Variable(projectParser.Float_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitFloat_Variable(projectParser.Float_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Variable(projectParser.Double_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Variable(projectParser.Double_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_Variable(projectParser.Boolean_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_Variable(projectParser.Boolean_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_VAR_With_ID_ID}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_VAR_With_ID_ID}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_INT_With_ID_ID}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_INT_With_ID_ID}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_VAR_With_ID_NUM}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_VAR_With_ID_NUM}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_INT_With_ID_NUM}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_INT_With_ID_NUM}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_ID}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_ID(projectParser.Print_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_ID}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_ID(projectParser.Print_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_NUM}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_NUM(projectParser.Print_NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_NUM}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_NUM(projectParser.Print_NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_TEXT}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_TEXT(projectParser.Print_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_TEXT}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_TEXT(projectParser.Print_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(projectParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(projectParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_WithInput}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIf_WithInput(projectParser.If_WithInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_WithInput}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIf_WithInput(projectParser.If_WithInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_WithBreak}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIf_WithBreak(projectParser.If_WithBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_WithBreak}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIf_WithBreak(projectParser.If_WithBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_WithContinue}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIf_WithContinue(projectParser.If_WithContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_WithContinue}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIf_WithContinue(projectParser.If_WithContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_WithInput}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void enterWhile_WithInput(projectParser.While_WithInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_WithInput}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void exitWhile_WithInput(projectParser.While_WithInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_WithBreak}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void enterWhile_WithBreak(projectParser.While_WithBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_WithBreak}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void exitWhile_WithBreak(projectParser.While_WithBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_WithContinue}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void enterWhile_WithContinue(projectParser.While_WithContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_WithContinue}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void exitWhile_WithContinue(projectParser.While_WithContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch_With_ID}
	 * labeled alternative in {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_With_ID(projectParser.Switch_With_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch_With_ID}
	 * labeled alternative in {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_With_ID(projectParser.Switch_With_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch_With_NUM}
	 * labeled alternative in {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch_With_NUM}
	 * labeled alternative in {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_With_ID}
	 * labeled alternative in {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void enterCase_With_ID(projectParser.Case_With_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_With_ID}
	 * labeled alternative in {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void exitCase_With_ID(projectParser.Case_With_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_With_NUM}
	 * labeled alternative in {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void enterCase_With_NUM(projectParser.Case_With_NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_With_NUM}
	 * labeled alternative in {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void exitCase_With_NUM(projectParser.Case_With_NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code default_State}
	 * labeled alternative in {@link projectParser#defaultstatement}.
	 * @param ctx the parse tree
	 */
	void enterDefault_State(projectParser.Default_StateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code default_State}
	 * labeled alternative in {@link projectParser#defaultstatement}.
	 * @param ctx the parse tree
	 */
	void exitDefault_State(projectParser.Default_StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_State}
	 * labeled alternative in {@link projectParser#tryCatchstatement}.
	 * @param ctx the parse tree
	 */
	void enterTry_State(projectParser.Try_StateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_State}
	 * labeled alternative in {@link projectParser#tryCatchstatement}.
	 * @param ctx the parse tree
	 */
	void exitTry_State(projectParser.Try_StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditions_withID}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions_withID(projectParser.Conditions_withIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditions_withID}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions_withID(projectParser.Conditions_withIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditions_withAND}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions_withAND(projectParser.Conditions_withANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditions_withAND}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions_withAND(projectParser.Conditions_withANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditions_withOR}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions_withOR(projectParser.Conditions_withORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditions_withOR}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions_withOR(projectParser.Conditions_withORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditions_withNUM}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions_withNUM(projectParser.Conditions_withNUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditions_withNUM}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions_withNUM(projectParser.Conditions_withNUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_State}
	 * labeled alternative in {@link projectParser#doWhilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_State(projectParser.While_StateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_State}
	 * labeled alternative in {@link projectParser#doWhilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_State(projectParser.While_StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(projectParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(projectParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(projectParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(projectParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(projectParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(projectParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(projectParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(projectParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(projectParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(projectParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(projectParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(projectParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoid_Function_NoARG(projectParser.Void_Function_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoid_Function_NoARG(projectParser.Void_Function_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterString_Function_NoARG(projectParser.String_Function_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitString_Function_NoARG(projectParser.String_Function_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInt_Function_NoARG(projectParser.Int_Function_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInt_Function_NoARG(projectParser.Int_Function_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Function_NoARG(projectParser.Double_Function_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Function_NoARG(projectParser.Double_Function_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloat_Function_NoARG(projectParser.Float_Function_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloat_Function_NoARG(projectParser.Float_Function_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoid_Function_Return_NoARG(projectParser.Void_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoid_Function_Return_NoARG(projectParser.Void_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoid_Function_ARG(projectParser.Void_Function_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoid_Function_ARG(projectParser.Void_Function_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterString_Function_ARG(projectParser.String_Function_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitString_Function_ARG(projectParser.String_Function_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInt_Function_ARG(projectParser.Int_Function_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInt_Function_ARG(projectParser.Int_Function_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Function_ARG(projectParser.Double_Function_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Function_ARG(projectParser.Double_Function_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloat_Function_ARG(projectParser.Float_Function_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloat_Function_ARG(projectParser.Float_Function_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoid_Function_Return_ARG(projectParser.Void_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoid_Function_Return_ARG(projectParser.Void_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floate_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floate_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#argumentFunctionType}.
	 * @param ctx the parse tree
	 */
	void enterArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#argumentFunctionType}.
	 * @param ctx the parse tree
	 */
	void exitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_Statement}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass_Statement(projectParser.Class_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_Statement}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass_Statement(projectParser.Class_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_Abstract}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass_Abstract(projectParser.Class_AbstractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_Abstract}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass_Abstract(projectParser.Class_AbstractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_Extends}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass_Extends(projectParser.Class_ExtendsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_Extends}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass_Extends(projectParser.Class_ExtendsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_State}
	 * labeled alternative in {@link projectParser#classstatement}.
	 * @param ctx the parse tree
	 */
	void enterClass_State(projectParser.Class_StateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_State}
	 * labeled alternative in {@link projectParser#classstatement}.
	 * @param ctx the parse tree
	 */
	void exitClass_State(projectParser.Class_StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstract_State}
	 * labeled alternative in {@link projectParser#abstractstatment}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_State(projectParser.Abstract_StateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstract_State}
	 * labeled alternative in {@link projectParser#abstractstatment}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_State(projectParser.Abstract_StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extends_ClassStatment_Withinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extends_ClassStatment_Withinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extends_ClassStatment_Withoutinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extends_ClassStatment_Withoutinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extends_ClassStateFull}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extends_ClassStateFull}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extends_ClassStateLess}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extends_ClassStateLess}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extends_ClassStateFullwithinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extends_ClassStateFullwithinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extends_ClassStateLesswithinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extends_ClassStateLesswithinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code container_withRow}
	 * labeled alternative in {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 */
	void enterContainer_withRow(projectParser.Container_withRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code container_withRow}
	 * labeled alternative in {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 */
	void exitContainer_withRow(projectParser.Container_withRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code container_withCol}
	 * labeled alternative in {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 */
	void enterContainer_withCol(projectParser.Container_withColContext ctx);
	/**
	 * Exit a parse tree produced by the {@code container_withCol}
	 * labeled alternative in {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 */
	void exitContainer_withCol(projectParser.Container_withColContext ctx);
	/**
	 * Enter a parse tree produced by the {@code row_State}
	 * labeled alternative in {@link projectParser#rowStatement}.
	 * @param ctx the parse tree
	 */
	void enterRow_State(projectParser.Row_StateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code row_State}
	 * labeled alternative in {@link projectParser#rowStatement}.
	 * @param ctx the parse tree
	 */
	void exitRow_State(projectParser.Row_StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colo_state}
	 * labeled alternative in {@link projectParser#colStatemenst}.
	 * @param ctx the parse tree
	 */
	void enterColo_state(projectParser.Colo_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colo_state}
	 * labeled alternative in {@link projectParser#colStatemenst}.
	 * @param ctx the parse tree
	 */
	void exitColo_state(projectParser.Colo_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#texeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTexeStatement(projectParser.TexeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#texeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTexeStatement(projectParser.TexeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hight_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterHight_SizedBox(projectParser.Hight_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hight_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code width_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterWidth_SizedBox(projectParser.Width_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code width_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widthHight_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widthHight_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hightWidth_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hightWidth_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textButton_withTexe}
	 * labeled alternative in {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 */
	void enterTextButton_withTexe(projectParser.TextButton_withTexeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textButton_withTexe}
	 * labeled alternative in {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 */
	void exitTextButton_withTexe(projectParser.TextButton_withTexeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textButton_withContainer}
	 * labeled alternative in {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 */
	void enterTextButton_withContainer(projectParser.TextButton_withContainerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textButton_withContainer}
	 * labeled alternative in {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 */
	void exitTextButton_withContainer(projectParser.TextButton_withContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code image_withAssetImage}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void enterImage_withAssetImage(projectParser.Image_withAssetImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code image_withAssetImage}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void exitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code image_withAsset}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void enterImage_withAsset(projectParser.Image_withAssetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code image_withAsset}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void exitImage_withAsset(projectParser.Image_withAssetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code image_withNetWoek}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void enterImage_withNetWoek(projectParser.Image_withNetWoekContext ctx);
	/**
	 * Exit a parse tree produced by the {@code image_withNetWoek}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void exitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx);
	/**
	 * Enter a parse tree produced by the {@code image_withFile}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void enterImage_withFile(projectParser.Image_withFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code image_withFile}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void exitImage_withFile(projectParser.Image_withFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expanded_withCol}
	 * labeled alternative in {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 */
	void enterExpanded_withCol(projectParser.Expanded_withColContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expanded_withCol}
	 * labeled alternative in {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 */
	void exitExpanded_withCol(projectParser.Expanded_withColContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expanded_withRow}
	 * labeled alternative in {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 */
	void enterExpanded_withRow(projectParser.Expanded_withRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expanded_withRow}
	 * labeled alternative in {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 */
	void exitExpanded_withRow(projectParser.Expanded_withRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#flutterWidget}.
	 * @param ctx the parse tree
	 */
	void enterFlutterWidget(projectParser.FlutterWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#flutterWidget}.
	 * @param ctx the parse tree
	 */
	void exitFlutterWidget(projectParser.FlutterWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(projectParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(projectParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#inputclass}.
	 * @param ctx the parse tree
	 */
	void enterInputclass(projectParser.InputclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#inputclass}.
	 * @param ctx the parse tree
	 */
	void exitInputclass(projectParser.InputclassContext ctx);
}