// Generated from C:/Users/thuraya/IdeaProjects/projectcompiler/src/syntax\projectParser.g4 by ANTLR 4.10.1
package syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link projectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface projectParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link projectParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(projectParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(projectParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(projectParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatvarf}
	 * labeled alternative in {@link projectParser#float_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatvarf(projectParser.FloatvarfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doublevard}
	 * labeled alternative in {@link projectParser#double_d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublevard(projectParser.DoublevardContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(projectParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayINT}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayINT(projectParser.ArrayINTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySTRING}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySTRING(projectParser.ArraySTRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFLOAT}
	 * labeled alternative in {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFLOAT(projectParser.ArrayFLOATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Variable(projectParser.Var_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varVariable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varVariable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable(projectParser.Const_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dynamic_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable(projectParser.Dynamic_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dynamic_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dynamic_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by the {@code final_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable(projectParser.Final_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code final_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by the {@code final_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Variable_INPUT_D_Q_N}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Variable_INPUT_D_Q_I}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Variable_TEXT}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Variable(projectParser.Int_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_Variable(projectParser.Float_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Variable(projectParser.Double_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean_Variable}
	 * labeled alternative in {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_Variable(projectParser.Boolean_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_VAR_With_ID_ID}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_INT_With_ID_ID}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_VAR_With_ID_NUM}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_INT_With_ID_NUM}
	 * labeled alternative in {@link projectParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_ID}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_ID(projectParser.Print_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_NUM}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_NUM(projectParser.Print_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_TEXT}
	 * labeled alternative in {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_TEXT(projectParser.Print_TEXTContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(projectParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_WithInput}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_WithInput(projectParser.If_WithInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_WithBreak}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_WithBreak(projectParser.If_WithBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_WithContinue}
	 * labeled alternative in {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_WithContinue(projectParser.If_WithContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_WithInput}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_WithInput(projectParser.While_WithInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_WithBreak}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_WithBreak(projectParser.While_WithBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_WithContinue}
	 * labeled alternative in {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_WithContinue(projectParser.While_WithContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch_With_ID}
	 * labeled alternative in {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_With_ID(projectParser.Switch_With_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch_With_NUM}
	 * labeled alternative in {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_With_ID}
	 * labeled alternative in {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_With_ID(projectParser.Case_With_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_With_NUM}
	 * labeled alternative in {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_With_NUM(projectParser.Case_With_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code default_State}
	 * labeled alternative in {@link projectParser#defaultstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_State(projectParser.Default_StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code try_State}
	 * labeled alternative in {@link projectParser#tryCatchstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_State(projectParser.Try_StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditions_withID}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions_withID(projectParser.Conditions_withIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditions_withAND}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions_withAND(projectParser.Conditions_withANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditions_withOR}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions_withOR(projectParser.Conditions_withORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditions_withNUM}
	 * labeled alternative in {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions_withNUM(projectParser.Conditions_withNUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_State}
	 * labeled alternative in {@link projectParser#doWhilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_State(projectParser.While_StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(projectParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(projectParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(projectParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(projectParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(projectParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(projectParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_Function_NoARG(projectParser.Void_Function_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Function_NoARG(projectParser.String_Function_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Function_NoARG(projectParser.Int_Function_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Function_NoARG(projectParser.Double_Function_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_Function_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_Function_NoARG(projectParser.Float_Function_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_Function_Return_NoARG(projectParser.Void_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_Function_Return_NoARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_Function_ARG(projectParser.Void_Function_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Function_ARG(projectParser.String_Function_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Function_ARG(projectParser.Int_Function_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Function_ARG(projectParser.Double_Function_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_Function_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_Function_ARG(projectParser.Float_Function_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_Function_Return_ARG(projectParser.Void_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floate_Function_Return_ARG}
	 * labeled alternative in {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#argumentFunctionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_Statement}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Statement(projectParser.Class_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_Abstract}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Abstract(projectParser.Class_AbstractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_Extends}
	 * labeled alternative in {@link projectParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Extends(projectParser.Class_ExtendsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_State}
	 * labeled alternative in {@link projectParser#classstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_State(projectParser.Class_StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abstract_State}
	 * labeled alternative in {@link projectParser#abstractstatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_State(projectParser.Abstract_StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extends_ClassStatment_Withinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extends_ClassStatment_Withoutinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extends_ClassStateFull}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extends_ClassStateLess}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extends_ClassStateFullwithinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extends_ClassStateLesswithinput}
	 * labeled alternative in {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code container_withRow}
	 * labeled alternative in {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_withRow(projectParser.Container_withRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code container_withCol}
	 * labeled alternative in {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_withCol(projectParser.Container_withColContext ctx);
	/**
	 * Visit a parse tree produced by the {@code row_State}
	 * labeled alternative in {@link projectParser#rowStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_State(projectParser.Row_StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colo_state}
	 * labeled alternative in {@link projectParser#colStatemenst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColo_state(projectParser.Colo_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#texeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexeStatement(projectParser.TexeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hight_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code width_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code widthHight_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hightWidth_SizedBox}
	 * labeled alternative in {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textButton_withTexe}
	 * labeled alternative in {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButton_withTexe(projectParser.TextButton_withTexeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textButton_withContainer}
	 * labeled alternative in {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButton_withContainer(projectParser.TextButton_withContainerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code image_withAssetImage}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code image_withAsset}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withAsset(projectParser.Image_withAssetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code image_withNetWoek}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx);
	/**
	 * Visit a parse tree produced by the {@code image_withFile}
	 * labeled alternative in {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withFile(projectParser.Image_withFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expanded_withCol}
	 * labeled alternative in {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded_withCol(projectParser.Expanded_withColContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expanded_withRow}
	 * labeled alternative in {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded_withRow(projectParser.Expanded_withRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#flutterWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutterWidget(projectParser.FlutterWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(projectParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#inputclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputclass(projectParser.InputclassContext ctx);
}