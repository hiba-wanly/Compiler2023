// Generated from C:/Users/thuraya/IdeaProjects/projectcompiler/src/syntax\projectParser.g4 by ANTLR 4.10.1
package syntax;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class projectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM_FLOAT=1, NUM_DOUBLE=2, ARRAY=3, HLEFT=4, HRIGHT=5, NUM=6, COMMA=7, 
		ID=8, VAR=9, EQUAL=10, SEMECOLON=11, INPUT_D_Q_N=12, INPUT_D_Q_I=13, CONST=14, 
		DYNAMIC=15, FINAL=16, STRING=17, QOUT=18, INT=19, FLOAT=20, DOUBLE=21, 
		BOOLEAN=22, NUM_BOOL=23, FOR=24, SINGLS=25, PLUSORMINUS=26, CURLELEFT=27, 
		CURLERIGHT=28, PRINT=29, IF=30, BREAK=31, CONTINUE=32, WHILE=33, SWITCH=34, 
		CASE=35, TOWPOINT=36, DEFAULT=37, TRY=38, CATCH=39, CURLELFT=40, OR=41, 
		AND=42, DO=43, MULTI=44, PLUS=45, MINUS=46, DIVIDE=47, VOID=48, RETURN=49, 
		CLASS=50, ABSTRACT=51, EXTENDS=52, STATEFULLWIDGET=53, OVERRIDE=54, BUILD_WIDGET=55, 
		SCAFFOLD=56, BODY=57, STATELESSWIDGET=58, CONTAINER=59, CHILD=60, ROW=61, 
		CHILDREN=62, ARRAYLEFT=63, ARRAYRIGHT=64, COLUMN=65, TEXT=66, SIZEDBOX=67, 
		HIGHT=68, WIDTH=69, TEXTBUTTON=70, IMAGE=71, IMAGE_CHILD=72, ASSETSIMAGE=73, 
		IMAGE_INPUT_ASSET=74, DOT=75, ASSET=76, NETWORK=77, FILE=78, EXPANDED=79;
	public static final int
		RULE_prog = 0, RULE_element = 1, RULE_body = 2, RULE_float_f = 3, RULE_double_d = 4, 
		RULE_arrayType = 5, RULE_arraybody = 6, RULE_initial = 7, RULE_loop = 8, 
		RULE_printstatement = 9, RULE_rule = 10, RULE_ifstatement = 11, RULE_whilestatemen = 12, 
		RULE_switchstatement = 13, RULE_casestatement = 14, RULE_defaultstatement = 15, 
		RULE_tryCatchstatement = 16, RULE_conditions = 17, RULE_doWhilestatement = 18, 
		RULE_expr = 19, RULE_functionStatement = 20, RULE_argumentFunctionType = 21, 
		RULE_returnStatement = 22, RULE_class = 23, RULE_classstatement = 24, 
		RULE_abstractstatment = 25, RULE_extendsClass = 26, RULE_containerStatement = 27, 
		RULE_rowStatement = 28, RULE_colStatemenst = 29, RULE_texeStatement = 30, 
		RULE_sizedBox = 31, RULE_textButton = 32, RULE_imageState = 33, RULE_expandedStatment = 34, 
		RULE_flutterWidget = 35, RULE_input = 36, RULE_inputclass = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "element", "body", "float_f", "double_d", "arrayType", "arraybody", 
			"initial", "loop", "printstatement", "rule", "ifstatement", "whilestatemen", 
			"switchstatement", "casestatement", "defaultstatement", "tryCatchstatement", 
			"conditions", "doWhilestatement", "expr", "functionStatement", "argumentFunctionType", 
			"returnStatement", "class", "classstatement", "abstractstatment", "extendsClass", 
			"containerStatement", "rowStatement", "colStatemenst", "texeStatement", 
			"sizedBox", "textButton", "imageState", "expandedStatment", "flutterWidget", 
			"input", "inputclass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM_FLOAT", "NUM_DOUBLE", "ARRAY", "HLEFT", "HRIGHT", "NUM", "COMMA", 
			"ID", "VAR", "EQUAL", "SEMECOLON", "INPUT_D_Q_N", "INPUT_D_Q_I", "CONST", 
			"DYNAMIC", "FINAL", "STRING", "QOUT", "INT", "FLOAT", "DOUBLE", "BOOLEAN", 
			"NUM_BOOL", "FOR", "SINGLS", "PLUSORMINUS", "CURLELEFT", "CURLERIGHT", 
			"PRINT", "IF", "BREAK", "CONTINUE", "WHILE", "SWITCH", "CASE", "TOWPOINT", 
			"DEFAULT", "TRY", "CATCH", "CURLELFT", "OR", "AND", "DO", "MULTI", "PLUS", 
			"MINUS", "DIVIDE", "VOID", "RETURN", "CLASS", "ABSTRACT", "EXTENDS", 
			"STATEFULLWIDGET", "OVERRIDE", "BUILD_WIDGET", "SCAFFOLD", "BODY", "STATELESSWIDGET", 
			"CONTAINER", "CHILD", "ROW", "CHILDREN", "ARRAYLEFT", "ARRAYRIGHT", "COLUMN", 
			"TEXT", "SIZEDBOX", "HIGHT", "WIDTH", "TEXTBUTTON", "IMAGE", "IMAGE_CHILD", 
			"ASSETSIMAGE", "IMAGE_INPUT_ASSET", "DOT", "ASSET", "NETWORK", "FILE", 
			"EXPANDED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "projectParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public projectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(projectParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				element();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << CLASS) | (1L << ABSTRACT))) != 0) );
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		try {
			int _alt;
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				class_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				functionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						class_();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(92);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(94);
						functionStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(97); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(99);
				body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_fContext extends ParserRuleContext {
		public Float_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_f; }
	 
		public Float_fContext() { }
		public void copyFrom(Float_fContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatvarfContext extends Float_fContext {
		public TerminalNode NUM_FLOAT() { return getToken(projectParser.NUM_FLOAT, 0); }
		public FloatvarfContext(Float_fContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFloatvarf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFloatvarf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFloatvarf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_fContext float_f() throws RecognitionException {
		Float_fContext _localctx = new Float_fContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_float_f);
		try {
			_localctx = new FloatvarfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(NUM_FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_dContext extends ParserRuleContext {
		public Double_dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_d; }
	 
		public Double_dContext() { }
		public void copyFrom(Double_dContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoublevardContext extends Double_dContext {
		public TerminalNode NUM_DOUBLE() { return getToken(projectParser.NUM_DOUBLE, 0); }
		public DoublevardContext(Double_dContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDoublevard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDoublevard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDoublevard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_dContext double_d() throws RecognitionException {
		Double_dContext _localctx = new Double_dContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_double_d);
		try {
			_localctx = new DoublevardContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(NUM_DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(projectParser.ARRAY, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArraybodyContext arraybody() {
			return getRuleContext(ArraybodyContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ARRAY);
			setState(108);
			match(HLEFT);
			setState(109);
			arraybody();
			setState(110);
			match(HRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraybodyContext extends ParserRuleContext {
		public ArraybodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody; }
	 
		public ArraybodyContext() { }
		public void copyFrom(ArraybodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayINTContext extends ArraybodyContext {
		public List<TerminalNode> NUM() { return getTokens(projectParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(projectParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public ArrayINTContext(ArraybodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterArrayINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitArrayINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitArrayINT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraySTRINGContext extends ArraybodyContext {
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public ArraySTRINGContext(ArraybodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterArraySTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitArraySTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitArraySTRING(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayFLOATContext extends ArraybodyContext {
		public List<TerminalNode> NUM_FLOAT() { return getTokens(projectParser.NUM_FLOAT); }
		public TerminalNode NUM_FLOAT(int i) {
			return getToken(projectParser.NUM_FLOAT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public ArrayFLOATContext(ArraybodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterArrayFLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitArrayFLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitArrayFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraybodyContext arraybody() throws RecognitionException {
		ArraybodyContext _localctx = new ArraybodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arraybody);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new ArrayINTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(NUM);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					match(NUM);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				_localctx = new ArraySTRINGContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(122);
					match(ID);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NUM_FLOAT:
				_localctx = new ArrayFLOATContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(NUM_FLOAT);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					match(NUM_FLOAT);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialContext extends ParserRuleContext {
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
	 
		public InitialContext() { }
		public void copyFrom(InitialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Float_VariableContext extends InitialContext {
		public TerminalNode FLOAT() { return getToken(projectParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM_FLOAT() { return getToken(projectParser.NUM_FLOAT, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Float_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFloat_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFloat_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFloat_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_VariableContext extends InitialContext {
		public TerminalNode DYNAMIC() { return getToken(projectParser.DYNAMIC, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Dynamic_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDynamic_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDynamic_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDynamic_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_VariableContext extends InitialContext {
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Int_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInt_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInt_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInt_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Variable_INPUT_D_Q_NContext extends InitialContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public String_Variable_INPUT_D_Q_NContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Variable_INPUT_D_Q_N(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Final_Variable_INPUT_D_Q_NContext extends InitialContext {
		public TerminalNode FINAL() { return getToken(projectParser.FINAL, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Final_Variable_INPUT_D_Q_NContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFinal_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFinal_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFinal_Variable_INPUT_D_Q_N(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Variable_INPUT_D_Q_IContext extends InitialContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public String_Variable_INPUT_D_Q_IContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Variable_INPUT_D_Q_I(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Const_VariableContext extends InitialContext {
		public TerminalNode CONST() { return getToken(projectParser.CONST, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Const_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConst_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConst_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConst_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarVariable_INPUT_D_Q_NContext extends InitialContext {
		public TerminalNode VAR() { return getToken(projectParser.VAR, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public VarVariable_INPUT_D_Q_NContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVarVariable_INPUT_D_Q_N(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVarVariable_INPUT_D_Q_N(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVarVariable_INPUT_D_Q_N(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Final_Variable_INPUT_D_Q_IContext extends InitialContext {
		public TerminalNode FINAL() { return getToken(projectParser.FINAL, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Final_Variable_INPUT_D_Q_IContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFinal_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFinal_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFinal_Variable_INPUT_D_Q_I(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Boolean_VariableContext extends InitialContext {
		public TerminalNode BOOLEAN() { return getToken(projectParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM_BOOL() { return getToken(projectParser.NUM_BOOL, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Boolean_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterBoolean_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitBoolean_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitBoolean_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Var_VariableContext extends InitialContext {
		public TerminalNode VAR() { return getToken(projectParser.VAR, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Var_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVar_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVar_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVar_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_VariableContext extends InitialContext {
		public TerminalNode DOUBLE() { return getToken(projectParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM_DOUBLE() { return getToken(projectParser.NUM_DOUBLE, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Double_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDouble_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDouble_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDouble_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarVariable_INPUT_D_Q_IContext extends InitialContext {
		public TerminalNode VAR() { return getToken(projectParser.VAR, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public VarVariable_INPUT_D_Q_IContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVarVariable_INPUT_D_Q_I(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVarVariable_INPUT_D_Q_I(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVarVariable_INPUT_D_Q_I(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Const_Variable_INPUT_D_Q_NContext extends InitialContext {
		public TerminalNode CONST() { return getToken(projectParser.CONST, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Const_Variable_INPUT_D_Q_NContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConst_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConst_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConst_Variable_INPUT_D_Q_N(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Variable_TEXTContext extends InitialContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public List<TerminalNode> QOUT() { return getTokens(projectParser.QOUT); }
		public TerminalNode QOUT(int i) {
			return getToken(projectParser.QOUT, i);
		}
		public RuleContext rule_() {
			return getRuleContext(RuleContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public String_Variable_TEXTContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Variable_TEXT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Variable_TEXT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Variable_TEXT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_Variable_INPUT_D_Q_NContext extends InitialContext {
		public TerminalNode DYNAMIC() { return getToken(projectParser.DYNAMIC, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Dynamic_Variable_INPUT_D_Q_NContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDynamic_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDynamic_Variable_INPUT_D_Q_N(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDynamic_Variable_INPUT_D_Q_N(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Const_Variable_INPUT_D_Q_IContext extends InitialContext {
		public TerminalNode CONST() { return getToken(projectParser.CONST, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Const_Variable_INPUT_D_Q_IContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConst_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConst_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConst_Variable_INPUT_D_Q_I(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_Variable_INPUT_D_Q_IContext extends InitialContext {
		public TerminalNode DYNAMIC() { return getToken(projectParser.DYNAMIC, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Dynamic_Variable_INPUT_D_Q_IContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDynamic_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDynamic_Variable_INPUT_D_Q_I(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDynamic_Variable_INPUT_D_Q_I(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Final_VariableContext extends InitialContext {
		public TerminalNode FINAL() { return getToken(projectParser.FINAL, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Final_VariableContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFinal_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFinal_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFinal_Variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initial);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Var_VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(VAR);
				setState(139);
				match(ID);
				setState(140);
				match(EQUAL);
				setState(141);
				match(NUM);
				setState(142);
				match(SEMECOLON);
				}
				break;
			case 2:
				_localctx = new VarVariable_INPUT_D_Q_NContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(VAR);
				setState(144);
				match(ID);
				setState(145);
				match(EQUAL);
				setState(146);
				match(INPUT_D_Q_N);
				setState(147);
				match(SEMECOLON);
				}
				break;
			case 3:
				_localctx = new VarVariable_INPUT_D_Q_IContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(VAR);
				setState(149);
				match(ID);
				setState(150);
				match(EQUAL);
				setState(151);
				match(INPUT_D_Q_I);
				setState(152);
				match(SEMECOLON);
				}
				break;
			case 4:
				_localctx = new Const_VariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(CONST);
				setState(154);
				match(ID);
				setState(155);
				match(EQUAL);
				setState(156);
				match(NUM);
				setState(157);
				match(SEMECOLON);
				}
				break;
			case 5:
				_localctx = new Const_Variable_INPUT_D_Q_NContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(CONST);
				setState(159);
				match(ID);
				setState(160);
				match(EQUAL);
				setState(161);
				match(INPUT_D_Q_N);
				setState(162);
				match(SEMECOLON);
				}
				break;
			case 6:
				_localctx = new Const_Variable_INPUT_D_Q_IContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(CONST);
				setState(164);
				match(ID);
				setState(165);
				match(EQUAL);
				setState(166);
				match(INPUT_D_Q_I);
				setState(167);
				match(SEMECOLON);
				}
				break;
			case 7:
				_localctx = new Dynamic_VariableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				match(DYNAMIC);
				setState(169);
				match(ID);
				setState(170);
				match(EQUAL);
				setState(171);
				match(NUM);
				setState(172);
				match(SEMECOLON);
				}
				break;
			case 8:
				_localctx = new Dynamic_Variable_INPUT_D_Q_NContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				match(DYNAMIC);
				setState(174);
				match(ID);
				setState(175);
				match(EQUAL);
				setState(176);
				match(INPUT_D_Q_N);
				setState(177);
				match(SEMECOLON);
				}
				break;
			case 9:
				_localctx = new Dynamic_Variable_INPUT_D_Q_IContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				match(DYNAMIC);
				setState(179);
				match(ID);
				setState(180);
				match(EQUAL);
				setState(181);
				match(INPUT_D_Q_I);
				setState(182);
				match(SEMECOLON);
				}
				break;
			case 10:
				_localctx = new Final_VariableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				match(FINAL);
				setState(184);
				match(ID);
				setState(185);
				match(EQUAL);
				setState(186);
				match(NUM);
				setState(187);
				match(SEMECOLON);
				}
				break;
			case 11:
				_localctx = new Final_Variable_INPUT_D_Q_NContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(188);
				match(FINAL);
				setState(189);
				match(ID);
				setState(190);
				match(EQUAL);
				setState(191);
				match(INPUT_D_Q_N);
				setState(192);
				match(SEMECOLON);
				}
				break;
			case 12:
				_localctx = new Final_Variable_INPUT_D_Q_IContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(193);
				match(FINAL);
				setState(194);
				match(ID);
				setState(195);
				match(EQUAL);
				setState(196);
				match(INPUT_D_Q_I);
				setState(197);
				match(SEMECOLON);
				}
				break;
			case 13:
				_localctx = new String_Variable_INPUT_D_Q_NContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(198);
				match(STRING);
				setState(199);
				match(ID);
				setState(200);
				match(EQUAL);
				setState(201);
				match(INPUT_D_Q_N);
				setState(202);
				match(SEMECOLON);
				}
				break;
			case 14:
				_localctx = new String_Variable_INPUT_D_Q_IContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(203);
				match(STRING);
				setState(204);
				match(ID);
				setState(205);
				match(EQUAL);
				setState(206);
				match(INPUT_D_Q_I);
				setState(207);
				match(SEMECOLON);
				}
				break;
			case 15:
				_localctx = new String_Variable_TEXTContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(208);
				match(STRING);
				setState(209);
				match(ID);
				setState(210);
				match(EQUAL);
				setState(211);
				match(QOUT);
				setState(212);
				rule_();
				setState(213);
				match(QOUT);
				setState(214);
				match(SEMECOLON);
				}
				break;
			case 16:
				_localctx = new Int_VariableContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(216);
				match(INT);
				setState(217);
				match(ID);
				setState(218);
				match(EQUAL);
				setState(219);
				match(NUM);
				setState(220);
				match(SEMECOLON);
				}
				break;
			case 17:
				_localctx = new Float_VariableContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(221);
				match(FLOAT);
				setState(222);
				match(ID);
				setState(223);
				match(EQUAL);
				setState(224);
				match(NUM_FLOAT);
				setState(225);
				match(SEMECOLON);
				}
				break;
			case 18:
				_localctx = new Double_VariableContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(226);
				match(DOUBLE);
				setState(227);
				match(ID);
				setState(228);
				match(EQUAL);
				setState(229);
				match(NUM_DOUBLE);
				setState(230);
				match(SEMECOLON);
				}
				break;
			case 19:
				_localctx = new Boolean_VariableContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(231);
				match(BOOLEAN);
				setState(232);
				match(ID);
				setState(233);
				match(EQUAL);
				setState(234);
				match(NUM_BOOL);
				setState(235);
				match(SEMECOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class For_INT_With_ID_IDContext extends LoopContext {
		public TerminalNode FOR() { return getToken(projectParser.FOR, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public List<TerminalNode> SEMECOLON() { return getTokens(projectParser.SEMECOLON); }
		public TerminalNode SEMECOLON(int i) {
			return getToken(projectParser.SEMECOLON, i);
		}
		public TerminalNode SINGLS() { return getToken(projectParser.SINGLS, 0); }
		public TerminalNode PLUSORMINUS() { return getToken(projectParser.PLUSORMINUS, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public For_INT_With_ID_IDContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFor_INT_With_ID_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFor_INT_With_ID_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFor_INT_With_ID_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_VAR_With_ID_NUMContext extends LoopContext {
		public TerminalNode FOR() { return getToken(projectParser.FOR, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode VAR() { return getToken(projectParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public List<TerminalNode> NUM() { return getTokens(projectParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(projectParser.NUM, i);
		}
		public List<TerminalNode> SEMECOLON() { return getTokens(projectParser.SEMECOLON); }
		public TerminalNode SEMECOLON(int i) {
			return getToken(projectParser.SEMECOLON, i);
		}
		public TerminalNode SINGLS() { return getToken(projectParser.SINGLS, 0); }
		public TerminalNode PLUSORMINUS() { return getToken(projectParser.PLUSORMINUS, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public For_VAR_With_ID_NUMContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFor_VAR_With_ID_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFor_VAR_With_ID_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFor_VAR_With_ID_NUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_VAR_With_ID_IDContext extends LoopContext {
		public TerminalNode FOR() { return getToken(projectParser.FOR, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode VAR() { return getToken(projectParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public List<TerminalNode> SEMECOLON() { return getTokens(projectParser.SEMECOLON); }
		public TerminalNode SEMECOLON(int i) {
			return getToken(projectParser.SEMECOLON, i);
		}
		public TerminalNode SINGLS() { return getToken(projectParser.SINGLS, 0); }
		public TerminalNode PLUSORMINUS() { return getToken(projectParser.PLUSORMINUS, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public For_VAR_With_ID_IDContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFor_VAR_With_ID_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFor_VAR_With_ID_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFor_VAR_With_ID_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_INT_With_ID_NUMContext extends LoopContext {
		public TerminalNode FOR() { return getToken(projectParser.FOR, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(projectParser.EQUAL, 0); }
		public List<TerminalNode> NUM() { return getTokens(projectParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(projectParser.NUM, i);
		}
		public List<TerminalNode> SEMECOLON() { return getTokens(projectParser.SEMECOLON); }
		public TerminalNode SEMECOLON(int i) {
			return getToken(projectParser.SEMECOLON, i);
		}
		public TerminalNode SINGLS() { return getToken(projectParser.SINGLS, 0); }
		public TerminalNode PLUSORMINUS() { return getToken(projectParser.PLUSORMINUS, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public For_INT_With_ID_NUMContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFor_INT_With_ID_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFor_INT_With_ID_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFor_INT_With_ID_NUM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new For_VAR_With_ID_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(FOR);
				setState(239);
				match(HLEFT);
				setState(240);
				match(VAR);
				setState(241);
				match(ID);
				setState(242);
				match(EQUAL);
				setState(243);
				match(NUM);
				setState(244);
				match(SEMECOLON);
				setState(245);
				match(ID);
				setState(246);
				match(SINGLS);
				setState(247);
				match(ID);
				setState(248);
				match(SEMECOLON);
				setState(249);
				match(ID);
				setState(250);
				match(PLUSORMINUS);
				setState(251);
				match(HRIGHT);
				setState(252);
				match(CURLELEFT);
				setState(253);
				input();
				setState(254);
				match(CURLERIGHT);
				}
				break;
			case 2:
				_localctx = new For_INT_With_ID_IDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(FOR);
				setState(257);
				match(HLEFT);
				setState(258);
				match(INT);
				setState(259);
				match(ID);
				setState(260);
				match(EQUAL);
				setState(261);
				match(NUM);
				setState(262);
				match(SEMECOLON);
				setState(263);
				match(ID);
				setState(264);
				match(SINGLS);
				setState(265);
				match(ID);
				setState(266);
				match(SEMECOLON);
				setState(267);
				match(ID);
				setState(268);
				match(PLUSORMINUS);
				setState(269);
				match(HRIGHT);
				setState(270);
				match(CURLELEFT);
				setState(271);
				input();
				setState(272);
				match(CURLERIGHT);
				}
				break;
			case 3:
				_localctx = new For_VAR_With_ID_NUMContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(FOR);
				setState(275);
				match(HLEFT);
				setState(276);
				match(VAR);
				setState(277);
				match(ID);
				setState(278);
				match(EQUAL);
				setState(279);
				match(NUM);
				setState(280);
				match(SEMECOLON);
				setState(281);
				match(ID);
				setState(282);
				match(SINGLS);
				setState(283);
				match(NUM);
				setState(284);
				match(SEMECOLON);
				setState(285);
				match(ID);
				setState(286);
				match(PLUSORMINUS);
				setState(287);
				match(HRIGHT);
				setState(288);
				match(CURLELEFT);
				setState(289);
				input();
				setState(290);
				match(CURLERIGHT);
				}
				break;
			case 4:
				_localctx = new For_INT_With_ID_NUMContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(FOR);
				setState(293);
				match(HLEFT);
				setState(294);
				match(INT);
				setState(295);
				match(ID);
				setState(296);
				match(EQUAL);
				setState(297);
				match(NUM);
				setState(298);
				match(SEMECOLON);
				setState(299);
				match(ID);
				setState(300);
				match(SINGLS);
				setState(301);
				match(NUM);
				setState(302);
				match(SEMECOLON);
				setState(303);
				match(ID);
				setState(304);
				match(PLUSORMINUS);
				setState(305);
				match(HRIGHT);
				setState(306);
				match(CURLELEFT);
				setState(307);
				input();
				setState(308);
				match(CURLERIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintstatementContext extends ParserRuleContext {
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
	 
		public PrintstatementContext() { }
		public void copyFrom(PrintstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Print_IDContext extends PrintstatementContext {
		public TerminalNode PRINT() { return getToken(projectParser.PRINT, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Print_IDContext(PrintstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterPrint_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitPrint_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitPrint_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_TEXTContext extends PrintstatementContext {
		public TerminalNode PRINT() { return getToken(projectParser.PRINT, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public List<TerminalNode> QOUT() { return getTokens(projectParser.QOUT); }
		public TerminalNode QOUT(int i) {
			return getToken(projectParser.QOUT, i);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public Print_TEXTContext(PrintstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterPrint_TEXT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitPrint_TEXT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitPrint_TEXT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_NUMContext extends PrintstatementContext {
		public TerminalNode PRINT() { return getToken(projectParser.PRINT, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public Print_NUMContext(PrintstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterPrint_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitPrint_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitPrint_NUM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printstatement);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Print_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(PRINT);
				setState(313);
				match(HLEFT);
				setState(314);
				match(INPUT_D_Q_I);
				setState(315);
				match(HRIGHT);
				setState(316);
				match(SEMECOLON);
				}
				break;
			case 2:
				_localctx = new Print_NUMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(PRINT);
				setState(318);
				match(HLEFT);
				setState(319);
				match(INPUT_D_Q_N);
				setState(320);
				match(HRIGHT);
				setState(321);
				match(SEMECOLON);
				}
				break;
			case 3:
				_localctx = new Print_TEXTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(PRINT);
				setState(323);
				match(HLEFT);
				setState(324);
				match(QOUT);
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(325);
					rule_();
					}
					}
					setState(328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM || _la==ID );
				setState(330);
				match(QOUT);
				setState(331);
				match(HRIGHT);
				setState(332);
				match(SEMECOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(projectParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(projectParser.NUM, i);
		}
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rule);
		try {
			int _alt;
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(338);
						match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(341); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(344); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(343);
						rule_();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(346); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(348);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(351); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(354); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(353);
						rule_();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(356); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	 
		public IfstatementContext() { }
		public void copyFrom(IfstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_WithContinueContext extends IfstatementContext {
		public TerminalNode IF() { return getToken(projectParser.IF, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CONTINUE() { return getToken(projectParser.CONTINUE, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public If_WithContinueContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterIf_WithContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitIf_WithContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitIf_WithContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_WithBreakContext extends IfstatementContext {
		public TerminalNode IF() { return getToken(projectParser.IF, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode BREAK() { return getToken(projectParser.BREAK, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public If_WithBreakContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterIf_WithBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitIf_WithBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitIf_WithBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_WithInputContext extends IfstatementContext {
		public TerminalNode IF() { return getToken(projectParser.IF, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public If_WithInputContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterIf_WithInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitIf_WithInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitIf_WithInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifstatement);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new If_WithInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(IF);
				setState(361);
				match(HLEFT);
				setState(362);
				conditions(0);
				setState(363);
				match(HRIGHT);
				setState(364);
				match(CURLELEFT);
				setState(365);
				input();
				setState(366);
				match(CURLERIGHT);
				}
				break;
			case 2:
				_localctx = new If_WithBreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(IF);
				setState(369);
				match(HLEFT);
				setState(370);
				conditions(0);
				setState(371);
				match(HRIGHT);
				setState(372);
				match(BREAK);
				setState(373);
				match(SEMECOLON);
				}
				break;
			case 3:
				_localctx = new If_WithContinueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(IF);
				setState(376);
				match(HLEFT);
				setState(377);
				conditions(0);
				setState(378);
				match(HRIGHT);
				setState(379);
				match(CONTINUE);
				setState(380);
				match(SEMECOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatemenContext extends ParserRuleContext {
		public WhilestatemenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatemen; }
	 
		public WhilestatemenContext() { }
		public void copyFrom(WhilestatemenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_WithInputContext extends WhilestatemenContext {
		public TerminalNode WHILE() { return getToken(projectParser.WHILE, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public While_WithInputContext(WhilestatemenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterWhile_WithInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitWhile_WithInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitWhile_WithInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_WithContinueContext extends WhilestatemenContext {
		public TerminalNode WHILE() { return getToken(projectParser.WHILE, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CONTINUE() { return getToken(projectParser.CONTINUE, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public While_WithContinueContext(WhilestatemenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterWhile_WithContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitWhile_WithContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitWhile_WithContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_WithBreakContext extends WhilestatemenContext {
		public TerminalNode WHILE() { return getToken(projectParser.WHILE, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode BREAK() { return getToken(projectParser.BREAK, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public While_WithBreakContext(WhilestatemenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterWhile_WithBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitWhile_WithBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitWhile_WithBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatemenContext whilestatemen() throws RecognitionException {
		WhilestatemenContext _localctx = new WhilestatemenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whilestatemen);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new While_WithInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(WHILE);
				setState(385);
				match(HLEFT);
				setState(386);
				conditions(0);
				setState(387);
				match(HRIGHT);
				setState(388);
				match(CURLELEFT);
				setState(389);
				input();
				setState(390);
				match(CURLERIGHT);
				}
				break;
			case 2:
				_localctx = new While_WithBreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(WHILE);
				setState(393);
				match(HLEFT);
				setState(394);
				conditions(0);
				setState(395);
				match(HRIGHT);
				setState(396);
				match(BREAK);
				setState(397);
				match(SEMECOLON);
				}
				break;
			case 3:
				_localctx = new While_WithContinueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(WHILE);
				setState(400);
				match(HLEFT);
				setState(401);
				conditions(0);
				setState(402);
				match(HRIGHT);
				setState(403);
				match(CONTINUE);
				setState(404);
				match(SEMECOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchstatementContext extends ParserRuleContext {
		public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstatement; }
	 
		public SwitchstatementContext() { }
		public void copyFrom(SwitchstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Switch_With_IDContext extends SwitchstatementContext {
		public TerminalNode SWITCH() { return getToken(projectParser.SWITCH, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public DefaultstatementContext defaultstatement() {
			return getRuleContext(DefaultstatementContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public List<CasestatementContext> casestatement() {
			return getRuleContexts(CasestatementContext.class);
		}
		public CasestatementContext casestatement(int i) {
			return getRuleContext(CasestatementContext.class,i);
		}
		public Switch_With_IDContext(SwitchstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterSwitch_With_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitSwitch_With_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitSwitch_With_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_With_NUMContext extends SwitchstatementContext {
		public TerminalNode SWITCH() { return getToken(projectParser.SWITCH, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public DefaultstatementContext defaultstatement() {
			return getRuleContext(DefaultstatementContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public List<CasestatementContext> casestatement() {
			return getRuleContexts(CasestatementContext.class);
		}
		public CasestatementContext casestatement(int i) {
			return getRuleContext(CasestatementContext.class,i);
		}
		public Switch_With_NUMContext(SwitchstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterSwitch_With_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitSwitch_With_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitSwitch_With_NUM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchstatement);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Switch_With_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(SWITCH);
				setState(409);
				match(HLEFT);
				setState(410);
				match(ID);
				setState(411);
				match(HRIGHT);
				setState(412);
				match(CURLELEFT);
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(413);
					casestatement();
					}
					}
					setState(416); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE );
				setState(418);
				defaultstatement();
				setState(419);
				match(CURLERIGHT);
				}
				break;
			case 2:
				_localctx = new Switch_With_NUMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(SWITCH);
				setState(422);
				match(HLEFT);
				setState(423);
				match(NUM);
				setState(424);
				match(HRIGHT);
				setState(425);
				match(CURLELEFT);
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(426);
					casestatement();
					}
					}
					setState(429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE );
				setState(431);
				defaultstatement();
				setState(432);
				match(CURLERIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasestatementContext extends ParserRuleContext {
		public CasestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestatement; }
	 
		public CasestatementContext() { }
		public void copyFrom(CasestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Case_With_IDContext extends CasestatementContext {
		public TerminalNode CASE() { return getToken(projectParser.CASE, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public TerminalNode BREAK() { return getToken(projectParser.BREAK, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public Case_With_IDContext(CasestatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterCase_With_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitCase_With_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitCase_With_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case_With_NUMContext extends CasestatementContext {
		public TerminalNode CASE() { return getToken(projectParser.CASE, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public TerminalNode BREAK() { return getToken(projectParser.BREAK, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public Case_With_NUMContext(CasestatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterCase_With_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitCase_With_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitCase_With_NUM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasestatementContext casestatement() throws RecognitionException {
		CasestatementContext _localctx = new CasestatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_casestatement);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Case_With_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(CASE);
				setState(437);
				match(INPUT_D_Q_I);
				setState(438);
				match(TOWPOINT);
				setState(439);
				match(CURLELEFT);
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440);
					input();
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << NUM) | (1L << ID) | (1L << VAR) | (1L << CONST) | (1L << DYNAMIC) | (1L << FINAL) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << FOR) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << TRY) | (1L << DO))) != 0) );
				setState(445);
				match(CURLERIGHT);
				setState(446);
				match(BREAK);
				setState(447);
				match(SEMECOLON);
				}
				break;
			case 2:
				_localctx = new Case_With_NUMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(CASE);
				setState(450);
				match(NUM);
				setState(451);
				match(TOWPOINT);
				setState(452);
				match(CURLELEFT);
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(453);
					input();
					}
					}
					setState(456); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << NUM) | (1L << ID) | (1L << VAR) | (1L << CONST) | (1L << DYNAMIC) | (1L << FINAL) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << FOR) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << TRY) | (1L << DO))) != 0) );
				setState(458);
				match(CURLERIGHT);
				setState(459);
				match(BREAK);
				setState(460);
				match(SEMECOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultstatementContext extends ParserRuleContext {
		public DefaultstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultstatement; }
	 
		public DefaultstatementContext() { }
		public void copyFrom(DefaultstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Default_StateContext extends DefaultstatementContext {
		public TerminalNode DEFAULT() { return getToken(projectParser.DEFAULT, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public TerminalNode BREAK() { return getToken(projectParser.BREAK, 0); }
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public Default_StateContext(DefaultstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDefault_State(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDefault_State(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDefault_State(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultstatementContext defaultstatement() throws RecognitionException {
		DefaultstatementContext _localctx = new DefaultstatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defaultstatement);
		int _la;
		try {
			_localctx = new Default_StateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(DEFAULT);
			setState(465);
			match(TOWPOINT);
			setState(466);
			match(CURLELEFT);
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(467);
				input();
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << NUM) | (1L << ID) | (1L << VAR) | (1L << CONST) | (1L << DYNAMIC) | (1L << FINAL) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << FOR) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << TRY) | (1L << DO))) != 0) );
			setState(472);
			match(CURLERIGHT);
			setState(473);
			match(BREAK);
			setState(474);
			match(SEMECOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchstatementContext extends ParserRuleContext {
		public TryCatchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchstatement; }
	 
		public TryCatchstatementContext() { }
		public void copyFrom(TryCatchstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_StateContext extends TryCatchstatementContext {
		public TerminalNode TRY() { return getToken(projectParser.TRY, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public List<TerminalNode> CURLERIGHT() { return getTokens(projectParser.CURLERIGHT); }
		public TerminalNode CURLERIGHT(int i) {
			return getToken(projectParser.CURLERIGHT, i);
		}
		public TerminalNode CATCH() { return getToken(projectParser.CATCH, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELFT() { return getToken(projectParser.CURLELFT, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public Try_StateContext(TryCatchstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterTry_State(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitTry_State(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitTry_State(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchstatementContext tryCatchstatement() throws RecognitionException {
		TryCatchstatementContext _localctx = new TryCatchstatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tryCatchstatement);
		int _la;
		try {
			_localctx = new Try_StateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(TRY);
			setState(477);
			match(CURLELEFT);
			setState(479); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				input();
				}
				}
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << NUM) | (1L << ID) | (1L << VAR) | (1L << CONST) | (1L << DYNAMIC) | (1L << FINAL) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << FOR) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << TRY) | (1L << DO))) != 0) );
			setState(483);
			match(CURLERIGHT);
			setState(484);
			match(CATCH);
			setState(485);
			match(HLEFT);
			setState(486);
			match(ID);
			setState(487);
			match(HRIGHT);
			setState(488);
			match(CURLELFT);
			setState(489);
			input();
			setState(490);
			match(CURLERIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Conditions_withIDContext extends ConditionsContext {
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode SINGLS() { return getToken(projectParser.SINGLS, 0); }
		public Conditions_withIDContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConditions_withID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConditions_withID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConditions_withID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Conditions_withANDContext extends ConditionsContext {
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public TerminalNode AND() { return getToken(projectParser.AND, 0); }
		public Conditions_withANDContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConditions_withAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConditions_withAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConditions_withAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Conditions_withORContext extends ConditionsContext {
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public TerminalNode OR() { return getToken(projectParser.OR, 0); }
		public Conditions_withORContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConditions_withOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConditions_withOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConditions_withOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Conditions_withNUMContext extends ConditionsContext {
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode SINGLS() { return getToken(projectParser.SINGLS, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public Conditions_withNUMContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterConditions_withNUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitConditions_withNUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitConditions_withNUM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		return conditions(0);
	}

	private ConditionsContext conditions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionsContext _localctx = new ConditionsContext(_ctx, _parentState);
		ConditionsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_conditions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new Conditions_withNUMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(493);
				match(ID);
				setState(494);
				match(SINGLS);
				setState(495);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new Conditions_withIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(ID);
				setState(497);
				match(SINGLS);
				setState(498);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Conditions_withORContext(new ConditionsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(501);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(502);
						match(OR);
						setState(503);
						conditions(5);
						}
						break;
					case 2:
						{
						_localctx = new Conditions_withANDContext(new ConditionsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(504);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(505);
						match(AND);
						setState(506);
						conditions(4);
						}
						break;
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DoWhilestatementContext extends ParserRuleContext {
		public DoWhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhilestatement; }
	 
		public DoWhilestatementContext() { }
		public void copyFrom(DoWhilestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_StateContext extends DoWhilestatementContext {
		public TerminalNode DO() { return getToken(projectParser.DO, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public WhilestatemenContext whilestatemen() {
			return getRuleContext(WhilestatemenContext.class,0);
		}
		public While_StateContext(DoWhilestatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterWhile_State(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitWhile_State(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitWhile_State(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhilestatementContext doWhilestatement() throws RecognitionException {
		DoWhilestatementContext _localctx = new DoWhilestatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doWhilestatement);
		try {
			_localctx = new While_StateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(DO);
			setState(513);
			match(CURLELEFT);
			setState(514);
			input();
			setState(515);
			match(CURLERIGHT);
			setState(516);
			whilestatemen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(projectParser.DIVIDE, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(projectParser.MINUS, 0); }
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ExprContext {
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public IntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(projectParser.MULTI, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(projectParser.PLUS, 0); }
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(519);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(523);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(524);
						match(MULTI);
						setState(525);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(526);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(527);
						match(PLUS);
						setState(528);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(529);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(530);
						match(MINUS);
						setState(531);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(532);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(533);
						match(DIVIDE);
						setState(534);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionStatementContext extends ParserRuleContext {
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
	 
		public FunctionStatementContext() { }
		public void copyFrom(FunctionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Float_Function_NoARGContext extends FunctionStatementContext {
		public TerminalNode FLOAT() { return getToken(projectParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Float_Function_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFloat_Function_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFloat_Function_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFloat_Function_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Function_Return_NoARGContext extends FunctionStatementContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public String_Function_Return_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Function_Return_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Function_Return_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Function_Return_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_Function_Return_NoARGContext extends FunctionStatementContext {
		public TerminalNode DOUBLE() { return getToken(projectParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Double_Function_Return_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDouble_Function_Return_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDouble_Function_Return_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDouble_Function_Return_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Function_ARGContext extends FunctionStatementContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public String_Function_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Function_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Function_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Function_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_Function_Return_NoARGContext extends FunctionStatementContext {
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Int_Function_Return_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInt_Function_Return_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInt_Function_Return_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInt_Function_Return_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Void_Function_Return_NoARGContext extends FunctionStatementContext {
		public TerminalNode VOID() { return getToken(projectParser.VOID, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Void_Function_Return_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVoid_Function_Return_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVoid_Function_Return_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVoid_Function_Return_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_Function_Return_NoARGContext extends FunctionStatementContext {
		public TerminalNode FLOAT() { return getToken(projectParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Float_Function_Return_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFloat_Function_Return_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFloat_Function_Return_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFloat_Function_Return_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_Function_NoARGContext extends FunctionStatementContext {
		public TerminalNode DOUBLE() { return getToken(projectParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Double_Function_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDouble_Function_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDouble_Function_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDouble_Function_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_Function_ARGContext extends FunctionStatementContext {
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Int_Function_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInt_Function_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInt_Function_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInt_Function_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_Function_ARGContext extends FunctionStatementContext {
		public TerminalNode DOUBLE() { return getToken(projectParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Double_Function_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDouble_Function_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDouble_Function_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDouble_Function_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Floate_Function_Return_ARGContext extends FunctionStatementContext {
		public TerminalNode FLOAT() { return getToken(projectParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Floate_Function_Return_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFloate_Function_Return_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFloate_Function_Return_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFloate_Function_Return_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_Function_Return_ARGContext extends FunctionStatementContext {
		public TerminalNode DOUBLE() { return getToken(projectParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Double_Function_Return_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterDouble_Function_Return_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitDouble_Function_Return_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitDouble_Function_Return_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_Function_ARGContext extends FunctionStatementContext {
		public TerminalNode FLOAT() { return getToken(projectParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Float_Function_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFloat_Function_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFloat_Function_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFloat_Function_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Function_Return_ARGContext extends FunctionStatementContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public String_Function_Return_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Function_Return_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Function_Return_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Function_Return_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Void_Function_NoARGContext extends FunctionStatementContext {
		public TerminalNode VOID() { return getToken(projectParser.VOID, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Void_Function_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVoid_Function_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVoid_Function_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVoid_Function_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Function_NoARGContext extends FunctionStatementContext {
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public String_Function_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterString_Function_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitString_Function_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitString_Function_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_Function_NoARGContext extends FunctionStatementContext {
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Int_Function_NoARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInt_Function_NoARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInt_Function_NoARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInt_Function_NoARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Void_Function_Return_ARGContext extends FunctionStatementContext {
		public TerminalNode VOID() { return getToken(projectParser.VOID, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Void_Function_Return_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVoid_Function_Return_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVoid_Function_Return_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVoid_Function_Return_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_Function_Return_ARGContext extends FunctionStatementContext {
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMECOLON() { return getToken(projectParser.SEMECOLON, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Int_Function_Return_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInt_Function_Return_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInt_Function_Return_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInt_Function_Return_ARG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Void_Function_ARGContext extends FunctionStatementContext {
		public TerminalNode VOID() { return getToken(projectParser.VOID, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public ArgumentFunctionTypeContext argumentFunctionType() {
			return getRuleContext(ArgumentFunctionTypeContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Void_Function_ARGContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterVoid_Function_ARG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitVoid_Function_ARG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitVoid_Function_ARG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionStatement);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Void_Function_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(VOID);
				setState(541);
				match(ID);
				setState(542);
				match(HLEFT);
				setState(543);
				match(HRIGHT);
				setState(544);
				match(CURLELEFT);
				setState(545);
				input();
				setState(546);
				match(CURLERIGHT);
				}
				break;
			case 2:
				_localctx = new String_Function_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(STRING);
				setState(549);
				match(ID);
				setState(550);
				match(HLEFT);
				setState(551);
				match(HRIGHT);
				setState(552);
				match(CURLELEFT);
				setState(553);
				input();
				setState(554);
				match(CURLERIGHT);
				}
				break;
			case 3:
				_localctx = new Int_Function_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(INT);
				setState(557);
				match(ID);
				setState(558);
				match(HLEFT);
				setState(559);
				match(HRIGHT);
				setState(560);
				match(CURLELEFT);
				setState(561);
				input();
				setState(562);
				match(CURLERIGHT);
				}
				break;
			case 4:
				_localctx = new Double_Function_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				match(DOUBLE);
				setState(565);
				match(ID);
				setState(566);
				match(HLEFT);
				setState(567);
				match(HRIGHT);
				setState(568);
				match(CURLELEFT);
				setState(569);
				input();
				setState(570);
				match(CURLERIGHT);
				}
				break;
			case 5:
				_localctx = new Float_Function_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(572);
				match(FLOAT);
				setState(573);
				match(ID);
				setState(574);
				match(HLEFT);
				setState(575);
				match(HRIGHT);
				setState(576);
				match(CURLELEFT);
				setState(577);
				input();
				setState(578);
				match(CURLERIGHT);
				}
				break;
			case 6:
				_localctx = new Void_Function_Return_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				match(VOID);
				setState(581);
				match(ID);
				setState(582);
				match(HLEFT);
				setState(583);
				match(HRIGHT);
				setState(584);
				match(CURLELEFT);
				setState(585);
				input();
				setState(586);
				returnStatement();
				setState(587);
				match(SEMECOLON);
				setState(588);
				match(CURLERIGHT);
				}
				break;
			case 7:
				_localctx = new Int_Function_Return_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(590);
				match(INT);
				setState(591);
				match(ID);
				setState(592);
				match(HLEFT);
				setState(593);
				match(HRIGHT);
				setState(594);
				match(CURLELEFT);
				setState(595);
				input();
				setState(596);
				returnStatement();
				setState(597);
				match(SEMECOLON);
				setState(598);
				match(CURLERIGHT);
				}
				break;
			case 8:
				_localctx = new String_Function_Return_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(600);
				match(STRING);
				setState(601);
				match(ID);
				setState(602);
				match(HLEFT);
				setState(603);
				match(HRIGHT);
				setState(604);
				match(CURLELEFT);
				setState(605);
				input();
				setState(606);
				returnStatement();
				setState(607);
				match(SEMECOLON);
				setState(608);
				match(CURLERIGHT);
				}
				break;
			case 9:
				_localctx = new Double_Function_Return_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(610);
				match(DOUBLE);
				setState(611);
				match(ID);
				setState(612);
				match(HLEFT);
				setState(613);
				match(HRIGHT);
				setState(614);
				match(CURLELEFT);
				setState(615);
				input();
				setState(616);
				returnStatement();
				setState(617);
				match(SEMECOLON);
				setState(618);
				match(CURLERIGHT);
				}
				break;
			case 10:
				_localctx = new Float_Function_Return_NoARGContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(620);
				match(FLOAT);
				setState(621);
				match(ID);
				setState(622);
				match(HLEFT);
				setState(623);
				match(HRIGHT);
				setState(624);
				match(CURLELEFT);
				setState(625);
				input();
				setState(626);
				returnStatement();
				setState(627);
				match(SEMECOLON);
				setState(628);
				match(CURLERIGHT);
				}
				break;
			case 11:
				_localctx = new Void_Function_ARGContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(630);
				match(VOID);
				setState(631);
				match(ID);
				setState(632);
				match(HLEFT);
				setState(633);
				argumentFunctionType();
				setState(634);
				match(HRIGHT);
				setState(635);
				match(CURLELEFT);
				setState(636);
				input();
				setState(637);
				match(CURLERIGHT);
				}
				break;
			case 12:
				_localctx = new String_Function_ARGContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(639);
				match(STRING);
				setState(640);
				match(ID);
				setState(641);
				match(HLEFT);
				setState(642);
				argumentFunctionType();
				setState(643);
				match(HRIGHT);
				setState(644);
				match(CURLELEFT);
				setState(645);
				input();
				setState(646);
				match(CURLERIGHT);
				}
				break;
			case 13:
				_localctx = new Int_Function_ARGContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(648);
				match(INT);
				setState(649);
				match(ID);
				setState(650);
				match(HLEFT);
				setState(651);
				argumentFunctionType();
				setState(652);
				match(HRIGHT);
				setState(653);
				match(CURLELEFT);
				setState(654);
				input();
				setState(655);
				match(CURLERIGHT);
				}
				break;
			case 14:
				_localctx = new Double_Function_ARGContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(657);
				match(DOUBLE);
				setState(658);
				match(ID);
				setState(659);
				match(HLEFT);
				setState(660);
				argumentFunctionType();
				setState(661);
				match(HRIGHT);
				setState(662);
				match(CURLELEFT);
				setState(663);
				input();
				setState(664);
				match(CURLERIGHT);
				}
				break;
			case 15:
				_localctx = new Float_Function_ARGContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(666);
				match(FLOAT);
				setState(667);
				match(ID);
				setState(668);
				match(HLEFT);
				setState(669);
				argumentFunctionType();
				setState(670);
				match(HRIGHT);
				setState(671);
				match(CURLELEFT);
				setState(672);
				input();
				setState(673);
				match(CURLERIGHT);
				}
				break;
			case 16:
				_localctx = new Void_Function_Return_ARGContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(675);
				match(VOID);
				setState(676);
				match(ID);
				setState(677);
				match(HLEFT);
				setState(678);
				argumentFunctionType();
				setState(679);
				match(HRIGHT);
				setState(680);
				match(CURLELEFT);
				setState(681);
				input();
				setState(682);
				returnStatement();
				setState(683);
				match(SEMECOLON);
				setState(684);
				match(CURLERIGHT);
				}
				break;
			case 17:
				_localctx = new Int_Function_Return_ARGContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(686);
				match(INT);
				setState(687);
				match(ID);
				setState(688);
				match(HLEFT);
				setState(689);
				argumentFunctionType();
				setState(690);
				match(HRIGHT);
				setState(691);
				match(CURLELEFT);
				setState(692);
				input();
				setState(693);
				returnStatement();
				setState(694);
				match(SEMECOLON);
				setState(695);
				match(CURLERIGHT);
				}
				break;
			case 18:
				_localctx = new String_Function_Return_ARGContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(697);
				match(STRING);
				setState(698);
				match(ID);
				setState(699);
				match(HLEFT);
				setState(700);
				argumentFunctionType();
				setState(701);
				match(HRIGHT);
				setState(702);
				match(CURLELEFT);
				setState(703);
				input();
				setState(704);
				returnStatement();
				setState(705);
				match(SEMECOLON);
				setState(706);
				match(CURLERIGHT);
				}
				break;
			case 19:
				_localctx = new Double_Function_Return_ARGContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(708);
				match(DOUBLE);
				setState(709);
				match(ID);
				setState(710);
				match(HLEFT);
				setState(711);
				argumentFunctionType();
				setState(712);
				match(HRIGHT);
				setState(713);
				match(CURLELEFT);
				setState(714);
				input();
				setState(715);
				returnStatement();
				setState(716);
				match(SEMECOLON);
				setState(717);
				match(CURLERIGHT);
				}
				break;
			case 20:
				_localctx = new Floate_Function_Return_ARGContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(719);
				match(FLOAT);
				setState(720);
				match(ID);
				setState(721);
				match(HLEFT);
				setState(722);
				argumentFunctionType();
				setState(723);
				match(HRIGHT);
				setState(724);
				match(CURLELEFT);
				setState(725);
				input();
				setState(726);
				returnStatement();
				setState(727);
				match(SEMECOLON);
				setState(728);
				match(CURLERIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentFunctionTypeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(projectParser.VAR, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode INT() { return getToken(projectParser.INT, 0); }
		public TerminalNode NUM() { return getToken(projectParser.NUM, 0); }
		public TerminalNode DOUBLE() { return getToken(projectParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(projectParser.FLOAT, 0); }
		public TerminalNode DYNAMIC() { return getToken(projectParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(projectParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public List<ArgumentFunctionTypeContext> argumentFunctionType() {
			return getRuleContexts(ArgumentFunctionTypeContext.class);
		}
		public ArgumentFunctionTypeContext argumentFunctionType(int i) {
			return getRuleContext(ArgumentFunctionTypeContext.class,i);
		}
		public ArgumentFunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentFunctionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterArgumentFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitArgumentFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitArgumentFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentFunctionTypeContext argumentFunctionType() throws RecognitionException {
		ArgumentFunctionTypeContext _localctx = new ArgumentFunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argumentFunctionType);
		try {
			int _alt;
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				match(VAR);
				setState(733);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(INT);
				setState(735);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				match(DOUBLE);
				setState(737);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				match(FLOAT);
				setState(739);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(740);
				match(DYNAMIC);
				setState(741);
				match(NUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(742);
				match(STRING);
				setState(743);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(744);
				match(VAR);
				setState(745);
				match(ID);
				setState(746);
				match(COMMA);
				setState(748); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(747);
						argumentFunctionType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(750); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(752);
				match(INT);
				setState(753);
				match(NUM);
				setState(754);
				match(COMMA);
				setState(756); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(755);
						argumentFunctionType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(758); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(760);
				match(DOUBLE);
				setState(761);
				match(NUM);
				setState(762);
				match(COMMA);
				setState(764); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(763);
						argumentFunctionType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(766); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(768);
				match(FLOAT);
				setState(769);
				match(NUM);
				setState(770);
				match(COMMA);
				setState(772); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(771);
						argumentFunctionType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(774); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(776);
				match(DYNAMIC);
				setState(777);
				match(NUM);
				setState(778);
				match(COMMA);
				setState(780); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(779);
						argumentFunctionType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(782); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(784);
				match(STRING);
				setState(785);
				match(ID);
				setState(786);
				match(COMMA);
				setState(788); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(787);
						argumentFunctionType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(790); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(projectParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public List<TerminalNode> QOUT() { return getTokens(projectParser.QOUT); }
		public TerminalNode QOUT(int i) {
			return getToken(projectParser.QOUT, i);
		}
		public RuleContext rule_() {
			return getRuleContext(RuleContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(RETURN);
				setState(795);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(RETURN);
				setState(797);
				match(INPUT_D_Q_I);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(RETURN);
				setState(799);
				match(QOUT);
				setState(800);
				rule_();
				setState(801);
				match(QOUT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				match(RETURN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	 
		public ClassContext() { }
		public void copyFrom(ClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_ExtendsContext extends ClassContext {
		public ExtendsClassContext extendsClass() {
			return getRuleContext(ExtendsClassContext.class,0);
		}
		public Class_ExtendsContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterClass_Extends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitClass_Extends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitClass_Extends(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_AbstractContext extends ClassContext {
		public AbstractstatmentContext abstractstatment() {
			return getRuleContext(AbstractstatmentContext.class,0);
		}
		public Class_AbstractContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterClass_Abstract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitClass_Abstract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitClass_Abstract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_StatementContext extends ClassContext {
		public ClassstatementContext classstatement() {
			return getRuleContext(ClassstatementContext.class,0);
		}
		public Class_StatementContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterClass_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitClass_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitClass_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_class);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new Class_StatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				classstatement();
				}
				break;
			case 2:
				_localctx = new Class_AbstractContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				abstractstatment();
				}
				break;
			case 3:
				_localctx = new Class_ExtendsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				extendsClass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassstatementContext extends ParserRuleContext {
		public ClassstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classstatement; }
	 
		public ClassstatementContext() { }
		public void copyFrom(ClassstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_StateContext extends ClassstatementContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public List<InputclassContext> inputclass() {
			return getRuleContexts(InputclassContext.class);
		}
		public InputclassContext inputclass(int i) {
			return getRuleContext(InputclassContext.class,i);
		}
		public Class_StateContext(ClassstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterClass_State(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitClass_State(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitClass_State(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassstatementContext classstatement() throws RecognitionException {
		ClassstatementContext _localctx = new ClassstatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classstatement);
		int _la;
		try {
			_localctx = new Class_StateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(CLASS);
			setState(812);
			match(ID);
			setState(813);
			match(CURLELEFT);
			setState(815); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(814);
				inputclass();
				}
				}
				setState(817); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << NUM) | (1L << ID) | (1L << VAR) | (1L << CONST) | (1L << DYNAMIC) | (1L << FINAL) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << FOR) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << TRY) | (1L << DO) | (1L << VOID))) != 0) );
			setState(819);
			match(CURLERIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractstatmentContext extends ParserRuleContext {
		public AbstractstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractstatment; }
	 
		public AbstractstatmentContext() { }
		public void copyFrom(AbstractstatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Abstract_StateContext extends AbstractstatmentContext {
		public TerminalNode ABSTRACT() { return getToken(projectParser.ABSTRACT, 0); }
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Abstract_StateContext(AbstractstatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterAbstract_State(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitAbstract_State(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitAbstract_State(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractstatmentContext abstractstatment() throws RecognitionException {
		AbstractstatmentContext _localctx = new AbstractstatmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_abstractstatment);
		try {
			_localctx = new Abstract_StateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(ABSTRACT);
			setState(822);
			match(CLASS);
			setState(823);
			match(ID);
			setState(824);
			match(CURLELEFT);
			setState(825);
			match(CURLERIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsClassContext extends ParserRuleContext {
		public ExtendsClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsClass; }
	 
		public ExtendsClassContext() { }
		public void copyFrom(ExtendsClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Extends_ClassStatment_WithinputContext extends ExtendsClassContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(projectParser.EXTENDS, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public InputclassContext inputclass() {
			return getRuleContext(InputclassContext.class,0);
		}
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Extends_ClassStatment_WithinputContext(ExtendsClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExtends_ClassStatment_Withinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExtends_ClassStatment_Withinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExtends_ClassStatment_Withinput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Extends_ClassStatment_WithoutinputContext extends ExtendsClassContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(projectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projectParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(projectParser.EXTENDS, 0); }
		public TerminalNode CURLELEFT() { return getToken(projectParser.CURLELEFT, 0); }
		public TerminalNode CURLERIGHT() { return getToken(projectParser.CURLERIGHT, 0); }
		public Extends_ClassStatment_WithoutinputContext(ExtendsClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExtends_ClassStatment_Withoutinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExtends_ClassStatment_Withoutinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExtends_ClassStatment_Withoutinput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Extends_ClassStateLesswithinputContext extends ExtendsClassContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EXTENDS() { return getToken(projectParser.EXTENDS, 0); }
		public TerminalNode STATELESSWIDGET() { return getToken(projectParser.STATELESSWIDGET, 0); }
		public List<TerminalNode> CURLELEFT() { return getTokens(projectParser.CURLELEFT); }
		public TerminalNode CURLELEFT(int i) {
			return getToken(projectParser.CURLELEFT, i);
		}
		public InputclassContext inputclass() {
			return getRuleContext(InputclassContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(projectParser.OVERRIDE, 0); }
		public TerminalNode BUILD_WIDGET() { return getToken(projectParser.BUILD_WIDGET, 0); }
		public TerminalNode RETURN() { return getToken(projectParser.RETURN, 0); }
		public TerminalNode SCAFFOLD() { return getToken(projectParser.SCAFFOLD, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode BODY() { return getToken(projectParser.BODY, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public List<TerminalNode> CURLERIGHT() { return getTokens(projectParser.CURLERIGHT); }
		public TerminalNode CURLERIGHT(int i) {
			return getToken(projectParser.CURLERIGHT, i);
		}
		public Extends_ClassStateLesswithinputContext(ExtendsClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExtends_ClassStateLesswithinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExtends_ClassStateLesswithinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExtends_ClassStateLesswithinput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Extends_ClassStateFullwithinputContext extends ExtendsClassContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EXTENDS() { return getToken(projectParser.EXTENDS, 0); }
		public TerminalNode STATEFULLWIDGET() { return getToken(projectParser.STATEFULLWIDGET, 0); }
		public List<TerminalNode> CURLELEFT() { return getTokens(projectParser.CURLELEFT); }
		public TerminalNode CURLELEFT(int i) {
			return getToken(projectParser.CURLELEFT, i);
		}
		public InputclassContext inputclass() {
			return getRuleContext(InputclassContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(projectParser.OVERRIDE, 0); }
		public TerminalNode BUILD_WIDGET() { return getToken(projectParser.BUILD_WIDGET, 0); }
		public TerminalNode RETURN() { return getToken(projectParser.RETURN, 0); }
		public TerminalNode SCAFFOLD() { return getToken(projectParser.SCAFFOLD, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode BODY() { return getToken(projectParser.BODY, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public List<TerminalNode> CURLERIGHT() { return getTokens(projectParser.CURLERIGHT); }
		public TerminalNode CURLERIGHT(int i) {
			return getToken(projectParser.CURLERIGHT, i);
		}
		public Extends_ClassStateFullwithinputContext(ExtendsClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExtends_ClassStateFullwithinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExtends_ClassStateFullwithinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExtends_ClassStateFullwithinput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Extends_ClassStateFullContext extends ExtendsClassContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EXTENDS() { return getToken(projectParser.EXTENDS, 0); }
		public TerminalNode STATEFULLWIDGET() { return getToken(projectParser.STATEFULLWIDGET, 0); }
		public List<TerminalNode> CURLELEFT() { return getTokens(projectParser.CURLELEFT); }
		public TerminalNode CURLELEFT(int i) {
			return getToken(projectParser.CURLELEFT, i);
		}
		public TerminalNode OVERRIDE() { return getToken(projectParser.OVERRIDE, 0); }
		public TerminalNode BUILD_WIDGET() { return getToken(projectParser.BUILD_WIDGET, 0); }
		public TerminalNode RETURN() { return getToken(projectParser.RETURN, 0); }
		public TerminalNode SCAFFOLD() { return getToken(projectParser.SCAFFOLD, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode BODY() { return getToken(projectParser.BODY, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public List<TerminalNode> CURLERIGHT() { return getTokens(projectParser.CURLERIGHT); }
		public TerminalNode CURLERIGHT(int i) {
			return getToken(projectParser.CURLERIGHT, i);
		}
		public Extends_ClassStateFullContext(ExtendsClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExtends_ClassStateFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExtends_ClassStateFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExtends_ClassStateFull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Extends_ClassStateLessContext extends ExtendsClassContext {
		public TerminalNode CLASS() { return getToken(projectParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode EXTENDS() { return getToken(projectParser.EXTENDS, 0); }
		public TerminalNode STATELESSWIDGET() { return getToken(projectParser.STATELESSWIDGET, 0); }
		public List<TerminalNode> CURLELEFT() { return getTokens(projectParser.CURLELEFT); }
		public TerminalNode CURLELEFT(int i) {
			return getToken(projectParser.CURLELEFT, i);
		}
		public TerminalNode OVERRIDE() { return getToken(projectParser.OVERRIDE, 0); }
		public TerminalNode BUILD_WIDGET() { return getToken(projectParser.BUILD_WIDGET, 0); }
		public TerminalNode RETURN() { return getToken(projectParser.RETURN, 0); }
		public TerminalNode SCAFFOLD() { return getToken(projectParser.SCAFFOLD, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode BODY() { return getToken(projectParser.BODY, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public List<TerminalNode> CURLERIGHT() { return getTokens(projectParser.CURLERIGHT); }
		public TerminalNode CURLERIGHT(int i) {
			return getToken(projectParser.CURLERIGHT, i);
		}
		public Extends_ClassStateLessContext(ExtendsClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExtends_ClassStateLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExtends_ClassStateLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExtends_ClassStateLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsClassContext extendsClass() throws RecognitionException {
		ExtendsClassContext _localctx = new ExtendsClassContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_extendsClass);
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new Extends_ClassStatment_WithinputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(CLASS);
				setState(828);
				match(ID);
				setState(829);
				match(EXTENDS);
				setState(830);
				match(ID);
				setState(831);
				match(CURLELEFT);
				setState(832);
				inputclass();
				setState(833);
				match(CURLERIGHT);
				}
				break;
			case 2:
				_localctx = new Extends_ClassStatment_WithoutinputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(CLASS);
				setState(836);
				match(ID);
				setState(837);
				match(EXTENDS);
				setState(838);
				match(ID);
				setState(839);
				match(CURLELEFT);
				setState(840);
				match(CURLERIGHT);
				}
				break;
			case 3:
				_localctx = new Extends_ClassStateFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				match(CLASS);
				setState(842);
				match(ID);
				setState(843);
				match(EXTENDS);
				setState(844);
				match(STATEFULLWIDGET);
				setState(845);
				match(CURLELEFT);
				setState(846);
				match(OVERRIDE);
				setState(847);
				match(BUILD_WIDGET);
				setState(848);
				match(CURLELEFT);
				setState(849);
				match(RETURN);
				setState(850);
				match(SCAFFOLD);
				setState(851);
				match(HLEFT);
				setState(852);
				match(BODY);
				setState(853);
				match(TOWPOINT);
				setState(854);
				flutterWidget();
				setState(855);
				match(HRIGHT);
				setState(856);
				match(CURLERIGHT);
				setState(857);
				match(CURLERIGHT);
				}
				break;
			case 4:
				_localctx = new Extends_ClassStateLessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				match(CLASS);
				setState(860);
				match(ID);
				setState(861);
				match(EXTENDS);
				setState(862);
				match(STATELESSWIDGET);
				setState(863);
				match(CURLELEFT);
				setState(864);
				match(OVERRIDE);
				setState(865);
				match(BUILD_WIDGET);
				setState(866);
				match(CURLELEFT);
				setState(867);
				match(RETURN);
				setState(868);
				match(SCAFFOLD);
				setState(869);
				match(HLEFT);
				setState(870);
				match(BODY);
				setState(871);
				match(TOWPOINT);
				setState(872);
				flutterWidget();
				setState(873);
				match(HRIGHT);
				setState(874);
				match(CURLERIGHT);
				setState(875);
				match(CURLERIGHT);
				}
				break;
			case 5:
				_localctx = new Extends_ClassStateFullwithinputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(877);
				match(CLASS);
				setState(878);
				match(ID);
				setState(879);
				match(EXTENDS);
				setState(880);
				match(STATEFULLWIDGET);
				setState(881);
				match(CURLELEFT);
				setState(882);
				inputclass();
				setState(883);
				match(OVERRIDE);
				setState(884);
				match(BUILD_WIDGET);
				setState(885);
				match(CURLELEFT);
				setState(886);
				match(RETURN);
				setState(887);
				match(SCAFFOLD);
				setState(888);
				match(HLEFT);
				setState(889);
				match(BODY);
				setState(890);
				match(TOWPOINT);
				setState(891);
				flutterWidget();
				setState(892);
				match(HRIGHT);
				setState(893);
				match(CURLERIGHT);
				setState(894);
				match(CURLERIGHT);
				}
				break;
			case 6:
				_localctx = new Extends_ClassStateLesswithinputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(896);
				match(CLASS);
				setState(897);
				match(ID);
				setState(898);
				match(EXTENDS);
				setState(899);
				match(STATELESSWIDGET);
				setState(900);
				match(CURLELEFT);
				setState(901);
				inputclass();
				setState(902);
				match(OVERRIDE);
				setState(903);
				match(BUILD_WIDGET);
				setState(904);
				match(CURLELEFT);
				setState(905);
				match(RETURN);
				setState(906);
				match(SCAFFOLD);
				setState(907);
				match(HLEFT);
				setState(908);
				match(BODY);
				setState(909);
				match(TOWPOINT);
				setState(910);
				flutterWidget();
				setState(911);
				match(HRIGHT);
				setState(912);
				match(CURLERIGHT);
				setState(913);
				match(CURLERIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerStatementContext extends ParserRuleContext {
		public ContainerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerStatement; }
	 
		public ContainerStatementContext() { }
		public void copyFrom(ContainerStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Container_withRowContext extends ContainerStatementContext {
		public TerminalNode CONTAINER() { return getToken(projectParser.CONTAINER, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILD() { return getToken(projectParser.CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public RowStatementContext rowStatement() {
			return getRuleContext(RowStatementContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Container_withRowContext(ContainerStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterContainer_withRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitContainer_withRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitContainer_withRow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Container_withColContext extends ContainerStatementContext {
		public TerminalNode CONTAINER() { return getToken(projectParser.CONTAINER, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILD() { return getToken(projectParser.CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public ColStatemenstContext colStatemenst() {
			return getRuleContext(ColStatemenstContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Container_withColContext(ContainerStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterContainer_withCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitContainer_withCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitContainer_withCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerStatementContext containerStatement() throws RecognitionException {
		ContainerStatementContext _localctx = new ContainerStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_containerStatement);
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new Container_withRowContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(CONTAINER);
				setState(918);
				match(HLEFT);
				setState(919);
				match(CHILD);
				setState(920);
				match(TOWPOINT);
				setState(921);
				rowStatement();
				setState(922);
				match(HRIGHT);
				setState(923);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new Container_withColContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(CONTAINER);
				setState(926);
				match(HLEFT);
				setState(927);
				match(CHILD);
				setState(928);
				match(TOWPOINT);
				setState(929);
				colStatemenst();
				setState(930);
				match(HRIGHT);
				setState(931);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowStatementContext extends ParserRuleContext {
		public RowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowStatement; }
	 
		public RowStatementContext() { }
		public void copyFrom(RowStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Row_StateContext extends RowStatementContext {
		public TerminalNode ROW() { return getToken(projectParser.ROW, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILDREN() { return getToken(projectParser.CHILDREN, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode ARRAYLEFT() { return getToken(projectParser.ARRAYLEFT, 0); }
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public TerminalNode ARRAYRIGHT() { return getToken(projectParser.ARRAYRIGHT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Row_StateContext(RowStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterRow_State(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitRow_State(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitRow_State(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowStatementContext rowStatement() throws RecognitionException {
		RowStatementContext _localctx = new RowStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rowStatement);
		try {
			_localctx = new Row_StateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(ROW);
			setState(936);
			match(HLEFT);
			setState(937);
			match(CHILDREN);
			setState(938);
			match(TOWPOINT);
			setState(939);
			match(ARRAYLEFT);
			setState(940);
			flutterWidget();
			setState(941);
			match(ARRAYRIGHT);
			setState(942);
			match(HRIGHT);
			setState(943);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColStatemenstContext extends ParserRuleContext {
		public ColStatemenstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colStatemenst; }
	 
		public ColStatemenstContext() { }
		public void copyFrom(ColStatemenstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Colo_stateContext extends ColStatemenstContext {
		public TerminalNode COLUMN() { return getToken(projectParser.COLUMN, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILDREN() { return getToken(projectParser.CHILDREN, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode ARRAYLEFT() { return getToken(projectParser.ARRAYLEFT, 0); }
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public TerminalNode ARRAYRIGHT() { return getToken(projectParser.ARRAYRIGHT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Colo_stateContext(ColStatemenstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterColo_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitColo_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitColo_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColStatemenstContext colStatemenst() throws RecognitionException {
		ColStatemenstContext _localctx = new ColStatemenstContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_colStatemenst);
		try {
			_localctx = new Colo_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(COLUMN);
			setState(946);
			match(HLEFT);
			setState(947);
			match(CHILDREN);
			setState(948);
			match(TOWPOINT);
			setState(949);
			match(ARRAYLEFT);
			setState(950);
			flutterWidget();
			setState(951);
			match(ARRAYRIGHT);
			setState(952);
			match(HRIGHT);
			setState(953);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TexeStatementContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectParser.TEXT, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode INPUT_D_Q_N() { return getToken(projectParser.INPUT_D_Q_N, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public TerminalNode INPUT_D_Q_I() { return getToken(projectParser.INPUT_D_Q_I, 0); }
		public List<TerminalNode> QOUT() { return getTokens(projectParser.QOUT); }
		public TerminalNode QOUT(int i) {
			return getToken(projectParser.QOUT, i);
		}
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public TexeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterTexeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitTexeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitTexeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexeStatementContext texeStatement() throws RecognitionException {
		TexeStatementContext _localctx = new TexeStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_texeStatement);
		int _la;
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(TEXT);
				setState(956);
				match(HLEFT);
				setState(957);
				match(INPUT_D_Q_N);
				setState(958);
				match(HRIGHT);
				setState(959);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(TEXT);
				setState(961);
				match(HLEFT);
				setState(962);
				match(INPUT_D_Q_I);
				setState(963);
				match(HRIGHT);
				setState(964);
				match(COMMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				match(TEXT);
				setState(966);
				match(HLEFT);
				setState(967);
				match(QOUT);
				setState(969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(968);
					rule_();
					}
					}
					setState(971); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM || _la==ID );
				setState(973);
				match(QOUT);
				setState(974);
				match(HRIGHT);
				setState(975);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizedBoxContext extends ParserRuleContext {
		public SizedBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBox; }
	 
		public SizedBoxContext() { }
		public void copyFrom(SizedBoxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Width_SizedBoxContext extends SizedBoxContext {
		public TerminalNode SIZEDBOX() { return getToken(projectParser.SIZEDBOX, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode WIDTH() { return getToken(projectParser.WIDTH, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode NUM_FLOAT() { return getToken(projectParser.NUM_FLOAT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public Width_SizedBoxContext(SizedBoxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterWidth_SizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitWidth_SizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitWidth_SizedBox(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WidthHight_SizedBoxContext extends SizedBoxContext {
		public TerminalNode SIZEDBOX() { return getToken(projectParser.SIZEDBOX, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode WIDTH() { return getToken(projectParser.WIDTH, 0); }
		public TerminalNode HIGHT() { return getToken(projectParser.HIGHT, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode NUM_FLOAT() { return getToken(projectParser.NUM_FLOAT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public WidthHight_SizedBoxContext(SizedBoxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterWidthHight_SizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitWidthHight_SizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitWidthHight_SizedBox(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Hight_SizedBoxContext extends SizedBoxContext {
		public TerminalNode SIZEDBOX() { return getToken(projectParser.SIZEDBOX, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HIGHT() { return getToken(projectParser.HIGHT, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode NUM_FLOAT() { return getToken(projectParser.NUM_FLOAT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public Hight_SizedBoxContext(SizedBoxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterHight_SizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitHight_SizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitHight_SizedBox(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HightWidth_SizedBoxContext extends SizedBoxContext {
		public TerminalNode SIZEDBOX() { return getToken(projectParser.SIZEDBOX, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HIGHT() { return getToken(projectParser.HIGHT, 0); }
		public TerminalNode WIDTH() { return getToken(projectParser.WIDTH, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode NUM_FLOAT() { return getToken(projectParser.NUM_FLOAT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(projectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(projectParser.COMMA, i);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public HightWidth_SizedBoxContext(SizedBoxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterHightWidth_SizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitHightWidth_SizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitHightWidth_SizedBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedBoxContext sizedBox() throws RecognitionException {
		SizedBoxContext _localctx = new SizedBoxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sizedBox);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new Hight_SizedBoxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(SIZEDBOX);
				setState(980);
				match(HLEFT);
				setState(981);
				match(HIGHT);
				setState(982);
				match(TOWPOINT);
				setState(983);
				match(NUM_FLOAT);
				setState(984);
				match(COMMA);
				setState(985);
				match(HRIGHT);
				setState(986);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new Width_SizedBoxContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				match(SIZEDBOX);
				setState(988);
				match(HLEFT);
				setState(989);
				match(WIDTH);
				setState(990);
				match(TOWPOINT);
				setState(991);
				match(NUM_FLOAT);
				setState(992);
				match(COMMA);
				setState(993);
				match(HRIGHT);
				setState(994);
				match(COMMA);
				}
				break;
			case 3:
				_localctx = new WidthHight_SizedBoxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				match(SIZEDBOX);
				setState(996);
				match(HLEFT);
				setState(997);
				match(WIDTH);
				setState(998);
				match(HIGHT);
				setState(999);
				match(TOWPOINT);
				setState(1000);
				match(NUM_FLOAT);
				setState(1001);
				match(COMMA);
				setState(1002);
				match(HRIGHT);
				setState(1003);
				match(COMMA);
				}
				break;
			case 4:
				_localctx = new HightWidth_SizedBoxContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1004);
				match(SIZEDBOX);
				setState(1005);
				match(HLEFT);
				setState(1006);
				match(HIGHT);
				setState(1007);
				match(WIDTH);
				setState(1008);
				match(TOWPOINT);
				setState(1009);
				match(NUM_FLOAT);
				setState(1010);
				match(COMMA);
				setState(1011);
				match(HRIGHT);
				setState(1012);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextButtonContext extends ParserRuleContext {
		public TextButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textButton; }
	 
		public TextButtonContext() { }
		public void copyFrom(TextButtonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextButton_withTexeContext extends TextButtonContext {
		public TerminalNode TEXTBUTTON() { return getToken(projectParser.TEXTBUTTON, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILD() { return getToken(projectParser.CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TexeStatementContext texeStatement() {
			return getRuleContext(TexeStatementContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public TextButton_withTexeContext(TextButtonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterTextButton_withTexe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitTextButton_withTexe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitTextButton_withTexe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextButton_withContainerContext extends TextButtonContext {
		public TerminalNode TEXTBUTTON() { return getToken(projectParser.TEXTBUTTON, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILD() { return getToken(projectParser.CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public ContainerStatementContext containerStatement() {
			return getRuleContext(ContainerStatementContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public TextButton_withContainerContext(TextButtonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterTextButton_withContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitTextButton_withContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitTextButton_withContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextButtonContext textButton() throws RecognitionException {
		TextButtonContext _localctx = new TextButtonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_textButton);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new TextButton_withTexeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(TEXTBUTTON);
				setState(1016);
				match(HLEFT);
				setState(1017);
				match(CHILD);
				setState(1018);
				match(TOWPOINT);
				setState(1019);
				texeStatement();
				setState(1020);
				match(HRIGHT);
				setState(1021);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new TextButton_withContainerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				match(TEXTBUTTON);
				setState(1024);
				match(HLEFT);
				setState(1025);
				match(CHILD);
				setState(1026);
				match(TOWPOINT);
				setState(1027);
				containerStatement();
				setState(1028);
				match(HRIGHT);
				setState(1029);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageStateContext extends ParserRuleContext {
		public ImageStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageState; }
	 
		public ImageStateContext() { }
		public void copyFrom(ImageStateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Image_withAssetContext extends ImageStateContext {
		public TerminalNode IMAGE() { return getToken(projectParser.IMAGE, 0); }
		public TerminalNode DOT() { return getToken(projectParser.DOT, 0); }
		public TerminalNode ASSET() { return getToken(projectParser.ASSET, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Image_withAssetContext(ImageStateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterImage_withAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitImage_withAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitImage_withAsset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Image_withAssetImageContext extends ImageStateContext {
		public TerminalNode IMAGE() { return getToken(projectParser.IMAGE, 0); }
		public List<TerminalNode> HLEFT() { return getTokens(projectParser.HLEFT); }
		public TerminalNode HLEFT(int i) {
			return getToken(projectParser.HLEFT, i);
		}
		public TerminalNode IMAGE_CHILD() { return getToken(projectParser.IMAGE_CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public TerminalNode ASSETSIMAGE() { return getToken(projectParser.ASSETSIMAGE, 0); }
		public TerminalNode IMAGE_INPUT_ASSET() { return getToken(projectParser.IMAGE_INPUT_ASSET, 0); }
		public List<TerminalNode> HRIGHT() { return getTokens(projectParser.HRIGHT); }
		public TerminalNode HRIGHT(int i) {
			return getToken(projectParser.HRIGHT, i);
		}
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Image_withAssetImageContext(ImageStateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterImage_withAssetImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitImage_withAssetImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitImage_withAssetImage(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Image_withNetWoekContext extends ImageStateContext {
		public TerminalNode IMAGE() { return getToken(projectParser.IMAGE, 0); }
		public TerminalNode DOT() { return getToken(projectParser.DOT, 0); }
		public TerminalNode NETWORK() { return getToken(projectParser.NETWORK, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Image_withNetWoekContext(ImageStateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterImage_withNetWoek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitImage_withNetWoek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitImage_withNetWoek(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Image_withFileContext extends ImageStateContext {
		public TerminalNode IMAGE() { return getToken(projectParser.IMAGE, 0); }
		public TerminalNode DOT() { return getToken(projectParser.DOT, 0); }
		public TerminalNode FILE() { return getToken(projectParser.FILE, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Image_withFileContext(ImageStateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterImage_withFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitImage_withFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitImage_withFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageStateContext imageState() throws RecognitionException {
		ImageStateContext _localctx = new ImageStateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_imageState);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new Image_withAssetImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(IMAGE);
				setState(1034);
				match(HLEFT);
				setState(1035);
				match(IMAGE_CHILD);
				setState(1036);
				match(TOWPOINT);
				setState(1037);
				match(ASSETSIMAGE);
				setState(1038);
				match(HLEFT);
				setState(1039);
				match(IMAGE_INPUT_ASSET);
				setState(1040);
				match(HRIGHT);
				setState(1041);
				match(HRIGHT);
				setState(1042);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new Image_withAssetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				match(IMAGE);
				setState(1044);
				match(DOT);
				setState(1045);
				match(ASSET);
				setState(1046);
				match(HLEFT);
				setState(1047);
				match(HRIGHT);
				setState(1048);
				match(COMMA);
				}
				break;
			case 3:
				_localctx = new Image_withNetWoekContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
				match(IMAGE);
				setState(1050);
				match(DOT);
				setState(1051);
				match(NETWORK);
				setState(1052);
				match(HLEFT);
				setState(1053);
				match(HRIGHT);
				setState(1054);
				match(COMMA);
				}
				break;
			case 4:
				_localctx = new Image_withFileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1055);
				match(IMAGE);
				setState(1056);
				match(DOT);
				setState(1057);
				match(FILE);
				setState(1058);
				match(HLEFT);
				setState(1059);
				match(HRIGHT);
				setState(1060);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpandedStatmentContext extends ParserRuleContext {
		public ExpandedStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expandedStatment; }
	 
		public ExpandedStatmentContext() { }
		public void copyFrom(ExpandedStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expanded_withRowContext extends ExpandedStatmentContext {
		public TerminalNode EXPANDED() { return getToken(projectParser.EXPANDED, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILD() { return getToken(projectParser.CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public RowStatementContext rowStatement() {
			return getRuleContext(RowStatementContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Expanded_withRowContext(ExpandedStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExpanded_withRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExpanded_withRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExpanded_withRow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expanded_withColContext extends ExpandedStatmentContext {
		public TerminalNode EXPANDED() { return getToken(projectParser.EXPANDED, 0); }
		public TerminalNode HLEFT() { return getToken(projectParser.HLEFT, 0); }
		public TerminalNode CHILD() { return getToken(projectParser.CHILD, 0); }
		public TerminalNode TOWPOINT() { return getToken(projectParser.TOWPOINT, 0); }
		public ColStatemenstContext colStatemenst() {
			return getRuleContext(ColStatemenstContext.class,0);
		}
		public TerminalNode HRIGHT() { return getToken(projectParser.HRIGHT, 0); }
		public TerminalNode COMMA() { return getToken(projectParser.COMMA, 0); }
		public Expanded_withColContext(ExpandedStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterExpanded_withCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitExpanded_withCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitExpanded_withCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedStatmentContext expandedStatment() throws RecognitionException {
		ExpandedStatmentContext _localctx = new ExpandedStatmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expandedStatment);
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new Expanded_withColContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(EXPANDED);
				setState(1064);
				match(HLEFT);
				setState(1065);
				match(CHILD);
				setState(1066);
				match(TOWPOINT);
				setState(1067);
				colStatemenst();
				setState(1068);
				match(HRIGHT);
				setState(1069);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new Expanded_withRowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				match(EXPANDED);
				setState(1072);
				match(HLEFT);
				setState(1073);
				match(CHILD);
				setState(1074);
				match(TOWPOINT);
				setState(1075);
				rowStatement();
				setState(1076);
				match(HRIGHT);
				setState(1077);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlutterWidgetContext extends ParserRuleContext {
		public List<ContainerStatementContext> containerStatement() {
			return getRuleContexts(ContainerStatementContext.class);
		}
		public ContainerStatementContext containerStatement(int i) {
			return getRuleContext(ContainerStatementContext.class,i);
		}
		public List<RowStatementContext> rowStatement() {
			return getRuleContexts(RowStatementContext.class);
		}
		public RowStatementContext rowStatement(int i) {
			return getRuleContext(RowStatementContext.class,i);
		}
		public List<ColStatemenstContext> colStatemenst() {
			return getRuleContexts(ColStatemenstContext.class);
		}
		public ColStatemenstContext colStatemenst(int i) {
			return getRuleContext(ColStatemenstContext.class,i);
		}
		public List<TexeStatementContext> texeStatement() {
			return getRuleContexts(TexeStatementContext.class);
		}
		public TexeStatementContext texeStatement(int i) {
			return getRuleContext(TexeStatementContext.class,i);
		}
		public List<SizedBoxContext> sizedBox() {
			return getRuleContexts(SizedBoxContext.class);
		}
		public SizedBoxContext sizedBox(int i) {
			return getRuleContext(SizedBoxContext.class,i);
		}
		public List<TextButtonContext> textButton() {
			return getRuleContexts(TextButtonContext.class);
		}
		public TextButtonContext textButton(int i) {
			return getRuleContext(TextButtonContext.class,i);
		}
		public List<ImageStateContext> imageState() {
			return getRuleContexts(ImageStateContext.class);
		}
		public ImageStateContext imageState(int i) {
			return getRuleContext(ImageStateContext.class,i);
		}
		public List<ExpandedStatmentContext> expandedStatment() {
			return getRuleContexts(ExpandedStatmentContext.class);
		}
		public ExpandedStatmentContext expandedStatment(int i) {
			return getRuleContext(ExpandedStatmentContext.class,i);
		}
		public FlutterWidgetContext flutterWidget() {
			return getRuleContext(FlutterWidgetContext.class,0);
		}
		public FlutterWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flutterWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterFlutterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitFlutterWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitFlutterWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlutterWidgetContext flutterWidget() throws RecognitionException {
		FlutterWidgetContext _localctx = new FlutterWidgetContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_flutterWidget);
		try {
			int _alt;
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				containerStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				rowStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1083);
				colStatemenst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1084);
				texeStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1085);
				sizedBox();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1086);
				textButton();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1087);
				imageState();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1088);
				expandedStatment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1090); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1089);
						containerStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1092); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1094);
				flutterWidget();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1097); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1096);
						rowStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1099); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1101);
				flutterWidget();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1104); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1103);
						colStatemenst();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1106); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1108);
				flutterWidget();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1110);
						texeStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1115);
				flutterWidget();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1117);
						sizedBox();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1122);
				flutterWidget();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1125); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1124);
						textButton();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1127); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1129);
				flutterWidget();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1132); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1131);
						imageState();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1134); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1136);
				flutterWidget();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1139); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1138);
						expandedStatment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1141); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1143);
				flutterWidget();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public List<InitialContext> initial() {
			return getRuleContexts(InitialContext.class);
		}
		public InitialContext initial(int i) {
			return getRuleContext(InitialContext.class,i);
		}
		public List<IfstatementContext> ifstatement() {
			return getRuleContexts(IfstatementContext.class);
		}
		public IfstatementContext ifstatement(int i) {
			return getRuleContext(IfstatementContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<DoWhilestatementContext> doWhilestatement() {
			return getRuleContexts(DoWhilestatementContext.class);
		}
		public DoWhilestatementContext doWhilestatement(int i) {
			return getRuleContext(DoWhilestatementContext.class,i);
		}
		public List<WhilestatemenContext> whilestatemen() {
			return getRuleContexts(WhilestatemenContext.class);
		}
		public WhilestatemenContext whilestatemen(int i) {
			return getRuleContext(WhilestatemenContext.class,i);
		}
		public List<PrintstatementContext> printstatement() {
			return getRuleContexts(PrintstatementContext.class);
		}
		public PrintstatementContext printstatement(int i) {
			return getRuleContext(PrintstatementContext.class,i);
		}
		public List<ArrayTypeContext> arrayType() {
			return getRuleContexts(ArrayTypeContext.class);
		}
		public ArrayTypeContext arrayType(int i) {
			return getRuleContext(ArrayTypeContext.class,i);
		}
		public List<SwitchstatementContext> switchstatement() {
			return getRuleContexts(SwitchstatementContext.class);
		}
		public SwitchstatementContext switchstatement(int i) {
			return getRuleContext(SwitchstatementContext.class,i);
		}
		public List<TryCatchstatementContext> tryCatchstatement() {
			return getRuleContexts(TryCatchstatementContext.class);
		}
		public TryCatchstatementContext tryCatchstatement(int i) {
			return getRuleContext(TryCatchstatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_input);
		try {
			int _alt;
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				initial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1149);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1150);
				doWhilestatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1151);
				whilestatemen();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1152);
				printstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1153);
				arrayType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1154);
				switchstatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1155);
				tryCatchstatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1156);
				expr(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1158); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1157);
						initial();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1160); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1162);
				input();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1165); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1164);
						ifstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1167); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1169);
				input();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1172); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1171);
						loop();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1174); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1176);
				input();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1178);
						doWhilestatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1181); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1183);
				input();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1186); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1185);
						whilestatemen();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1190);
				input();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1193); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1192);
						printstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1195); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1197);
				input();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1200); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1199);
						arrayType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1202); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1204);
				input();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1207); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1206);
						switchstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1209); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1211);
				input();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1214); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1213);
						tryCatchstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1216); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1218);
				input();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1220);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1225);
				input();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputclassContext extends ParserRuleContext {
		public List<InitialContext> initial() {
			return getRuleContexts(InitialContext.class);
		}
		public InitialContext initial(int i) {
			return getRuleContext(InitialContext.class,i);
		}
		public List<IfstatementContext> ifstatement() {
			return getRuleContexts(IfstatementContext.class);
		}
		public IfstatementContext ifstatement(int i) {
			return getRuleContext(IfstatementContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<DoWhilestatementContext> doWhilestatement() {
			return getRuleContexts(DoWhilestatementContext.class);
		}
		public DoWhilestatementContext doWhilestatement(int i) {
			return getRuleContext(DoWhilestatementContext.class,i);
		}
		public List<WhilestatemenContext> whilestatemen() {
			return getRuleContexts(WhilestatemenContext.class);
		}
		public WhilestatemenContext whilestatemen(int i) {
			return getRuleContext(WhilestatemenContext.class,i);
		}
		public List<PrintstatementContext> printstatement() {
			return getRuleContexts(PrintstatementContext.class);
		}
		public PrintstatementContext printstatement(int i) {
			return getRuleContext(PrintstatementContext.class,i);
		}
		public List<ArrayTypeContext> arrayType() {
			return getRuleContexts(ArrayTypeContext.class);
		}
		public ArrayTypeContext arrayType(int i) {
			return getRuleContext(ArrayTypeContext.class,i);
		}
		public List<SwitchstatementContext> switchstatement() {
			return getRuleContexts(SwitchstatementContext.class);
		}
		public SwitchstatementContext switchstatement(int i) {
			return getRuleContext(SwitchstatementContext.class,i);
		}
		public List<TryCatchstatementContext> tryCatchstatement() {
			return getRuleContexts(TryCatchstatementContext.class);
		}
		public TryCatchstatementContext tryCatchstatement(int i) {
			return getRuleContext(TryCatchstatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public InputclassContext inputclass() {
			return getRuleContext(InputclassContext.class,0);
		}
		public InputclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).enterInputclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectParserListener ) ((projectParserListener)listener).exitInputclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projectParserVisitor ) return ((projectParserVisitor<? extends T>)visitor).visitInputclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputclassContext inputclass() throws RecognitionException {
		InputclassContext _localctx = new InputclassContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_inputclass);
		try {
			int _alt;
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				initial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				doWhilestatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1233);
				whilestatemen();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1234);
				printstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1235);
				arrayType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1236);
				switchstatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1237);
				tryCatchstatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1238);
				expr(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1239);
				functionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1241); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1240);
						initial();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1243); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1245);
				inputclass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1247);
						ifstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1252);
				inputclass();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1255); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1254);
						loop();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1257); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1259);
				inputclass();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1262); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1261);
						doWhilestatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1264); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1266);
				inputclass();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1269); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1268);
						whilestatemen();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1271); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1273);
				inputclass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1276); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1275);
						printstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1278); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1280);
				inputclass();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1283); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1282);
						arrayType();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1285); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1287);
				inputclass();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1290); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1289);
						switchstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1292); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1294);
				inputclass();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1297); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1296);
						tryCatchstatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1299); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1301);
				inputclass();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1304); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1303);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1306); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1308);
				inputclass();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1311); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1310);
						functionStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1313); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1315);
				inputclass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return conditions_sempred((ConditionsContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditions_sempred(ConditionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001O\u0528\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0004\u0000N\b\u0000"+
		"\u000b\u0000\f\u0000O\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002Y\b\u0002\u000b\u0002"+
		"\f\u0002Z\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002`\b\u0002\u000b"+
		"\u0002\f\u0002a\u0001\u0002\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"t\b\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006|\b\u0006\n\u0006\f\u0006\u007f\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0084\b\u0006\n\u0006\f\u0006\u0087\t\u0006"+
		"\u0003\u0006\u0089\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ed\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0137\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0147"+
		"\b\t\u000b\t\f\t\u0148\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u014f\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0004\n\u0154\b\n\u000b\n\f\n\u0155\u0001\n"+
		"\u0004\n\u0159\b\n\u000b\n\f\n\u015a\u0001\n\u0004\n\u015e\b\n\u000b\n"+
		"\f\n\u015f\u0001\n\u0004\n\u0163\b\n\u000b\n\f\n\u0164\u0003\n\u0167\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u017f\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0197\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0004\r\u019f\b\r\u000b\r\f\r\u01a0\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u01ac\b\r\u000b\r\f\r\u01ad\u0001\r\u0001\r\u0001\r\u0003\r\u01b3\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u01ba\b\u000e\u000b\u000e\f\u000e\u01bb\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u01c7\b\u000e\u000b\u000e\f\u000e\u01c8\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01cf\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u01d5\b\u000f\u000b\u000f"+
		"\f\u000f\u01d6\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u01e0\b\u0010\u000b\u0010\f\u0010"+
		"\u01e1\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01f4"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u01fc\b\u0011\n\u0011\f\u0011\u01ff\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u020a\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0218\b\u0013"+
		"\n\u0013\f\u0013\u021b\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u02db\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0004\u0015\u02ed\b\u0015\u000b\u0015\f\u0015\u02ee\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u02f5\b\u0015\u000b\u0015"+
		"\f\u0015\u02f6\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u02fd\b\u0015\u000b\u0015\f\u0015\u02fe\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u0305\b\u0015\u000b\u0015\f\u0015\u0306"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u030d\b\u0015"+
		"\u000b\u0015\f\u0015\u030e\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u0315\b\u0015\u000b\u0015\f\u0015\u0316\u0003\u0015\u0319"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0325"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u032a\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u0330\b\u0018"+
		"\u000b\u0018\f\u0018\u0331\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0394\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u03a6\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0004\u001e\u03ca\b\u001e\u000b\u001e\f\u001e"+
		"\u03cb\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03d2"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u03f6"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0408\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0426\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0438\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0004#\u0443"+
		"\b#\u000b#\f#\u0444\u0001#\u0001#\u0001#\u0004#\u044a\b#\u000b#\f#\u044b"+
		"\u0001#\u0001#\u0001#\u0004#\u0451\b#\u000b#\f#\u0452\u0001#\u0001#\u0001"+
		"#\u0004#\u0458\b#\u000b#\f#\u0459\u0001#\u0001#\u0001#\u0004#\u045f\b"+
		"#\u000b#\f#\u0460\u0001#\u0001#\u0001#\u0004#\u0466\b#\u000b#\f#\u0467"+
		"\u0001#\u0001#\u0001#\u0004#\u046d\b#\u000b#\f#\u046e\u0001#\u0001#\u0001"+
		"#\u0004#\u0474\b#\u000b#\f#\u0475\u0001#\u0001#\u0003#\u047a\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0004$\u0487\b$\u000b$\f$\u0488\u0001$\u0001$\u0001$\u0004$\u048e\b"+
		"$\u000b$\f$\u048f\u0001$\u0001$\u0001$\u0004$\u0495\b$\u000b$\f$\u0496"+
		"\u0001$\u0001$\u0001$\u0004$\u049c\b$\u000b$\f$\u049d\u0001$\u0001$\u0001"+
		"$\u0004$\u04a3\b$\u000b$\f$\u04a4\u0001$\u0001$\u0001$\u0004$\u04aa\b"+
		"$\u000b$\f$\u04ab\u0001$\u0001$\u0001$\u0004$\u04b1\b$\u000b$\f$\u04b2"+
		"\u0001$\u0001$\u0001$\u0004$\u04b8\b$\u000b$\f$\u04b9\u0001$\u0001$\u0001"+
		"$\u0004$\u04bf\b$\u000b$\f$\u04c0\u0001$\u0001$\u0001$\u0004$\u04c6\b"+
		"$\u000b$\f$\u04c7\u0001$\u0001$\u0003$\u04cc\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0004%\u04da"+
		"\b%\u000b%\f%\u04db\u0001%\u0001%\u0001%\u0004%\u04e1\b%\u000b%\f%\u04e2"+
		"\u0001%\u0001%\u0001%\u0004%\u04e8\b%\u000b%\f%\u04e9\u0001%\u0001%\u0001"+
		"%\u0004%\u04ef\b%\u000b%\f%\u04f0\u0001%\u0001%\u0001%\u0004%\u04f6\b"+
		"%\u000b%\f%\u04f7\u0001%\u0001%\u0001%\u0004%\u04fd\b%\u000b%\f%\u04fe"+
		"\u0001%\u0001%\u0001%\u0004%\u0504\b%\u000b%\f%\u0505\u0001%\u0001%\u0001"+
		"%\u0004%\u050b\b%\u000b%\f%\u050c\u0001%\u0001%\u0001%\u0004%\u0512\b"+
		"%\u000b%\f%\u0513\u0001%\u0001%\u0001%\u0004%\u0519\b%\u000b%\f%\u051a"+
		"\u0001%\u0001%\u0001%\u0004%\u0520\b%\u000b%\f%\u0521\u0001%\u0001%\u0003"+
		"%\u0526\b%\u0001%\u0000\u0002\"&&\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJ\u0000\u0000\u05ce\u0000M\u0001\u0000\u0000\u0000\u0002S\u0001\u0000"+
		"\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000"+
		"\bi\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000"+
		"\u0000\u0000\u000e\u00ec\u0001\u0000\u0000\u0000\u0010\u0136\u0001\u0000"+
		"\u0000\u0000\u0012\u014e\u0001\u0000\u0000\u0000\u0014\u0166\u0001\u0000"+
		"\u0000\u0000\u0016\u017e\u0001\u0000\u0000\u0000\u0018\u0196\u0001\u0000"+
		"\u0000\u0000\u001a\u01b2\u0001\u0000\u0000\u0000\u001c\u01ce\u0001\u0000"+
		"\u0000\u0000\u001e\u01d0\u0001\u0000\u0000\u0000 \u01dc\u0001\u0000\u0000"+
		"\u0000\"\u01f3\u0001\u0000\u0000\u0000$\u0200\u0001\u0000\u0000\u0000"+
		"&\u0209\u0001\u0000\u0000\u0000(\u02da\u0001\u0000\u0000\u0000*\u0318"+
		"\u0001\u0000\u0000\u0000,\u0324\u0001\u0000\u0000\u0000.\u0329\u0001\u0000"+
		"\u0000\u00000\u032b\u0001\u0000\u0000\u00002\u0335\u0001\u0000\u0000\u0000"+
		"4\u0393\u0001\u0000\u0000\u00006\u03a5\u0001\u0000\u0000\u00008\u03a7"+
		"\u0001\u0000\u0000\u0000:\u03b1\u0001\u0000\u0000\u0000<\u03d1\u0001\u0000"+
		"\u0000\u0000>\u03f5\u0001\u0000\u0000\u0000@\u0407\u0001\u0000\u0000\u0000"+
		"B\u0425\u0001\u0000\u0000\u0000D\u0437\u0001\u0000\u0000\u0000F\u0479"+
		"\u0001\u0000\u0000\u0000H\u04cb\u0001\u0000\u0000\u0000J\u0525\u0001\u0000"+
		"\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0005\u0000\u0000\u0001R\u0001\u0001\u0000"+
		"\u0000\u0000ST\u0003\u0004\u0002\u0000T\u0003\u0001\u0000\u0000\u0000"+
		"Uf\u0003.\u0017\u0000Vf\u0003(\u0014\u0000WY\u0003.\u0017\u0000XW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0003\u0004\u0002"+
		"\u0000]f\u0001\u0000\u0000\u0000^`\u0003(\u0014\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0003\u0004\u0002\u0000df\u0001"+
		"\u0000\u0000\u0000eU\u0001\u0000\u0000\u0000eV\u0001\u0000\u0000\u0000"+
		"eX\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000f\u0005\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0001\u0000\u0000h\u0007\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0002\u0000\u0000j\t\u0001\u0000\u0000\u0000kl\u0005\u0003\u0000"+
		"\u0000lm\u0005\u0004\u0000\u0000mn\u0003\f\u0006\u0000no\u0005\u0005\u0000"+
		"\u0000o\u000b\u0001\u0000\u0000\u0000pu\u0005\u0006\u0000\u0000qr\u0005"+
		"\u0007\u0000\u0000rt\u0005\u0006\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u0089\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x}\u0005"+
		"\b\u0000\u0000yz\u0005\u0007\u0000\u0000z|\u0005\b\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0089\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0085\u0005\u0001\u0000\u0000\u0081\u0082"+
		"\u0005\u0007\u0000\u0000\u0082\u0084\u0005\u0001\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088p\u0001"+
		"\u0000\u0000\u0000\u0088x\u0001\u0000\u0000\u0000\u0088\u0080\u0001\u0000"+
		"\u0000\u0000\u0089\r\u0001\u0000\u0000\u0000\u008a\u008b\u0005\t\u0000"+
		"\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000"+
		"\u008d\u008e\u0005\u0006\u0000\u0000\u008e\u00ed\u0005\u000b\u0000\u0000"+
		"\u008f\u0090\u0005\t\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091"+
		"\u0092\u0005\n\u0000\u0000\u0092\u0093\u0005\f\u0000\u0000\u0093\u00ed"+
		"\u0005\u000b\u0000\u0000\u0094\u0095\u0005\t\u0000\u0000\u0095\u0096\u0005"+
		"\b\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000\u0097\u0098\u0005\r\u0000"+
		"\u0000\u0098\u00ed\u0005\u000b\u0000\u0000\u0099\u009a\u0005\u000e\u0000"+
		"\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0005\n\u0000\u0000"+
		"\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u00ed\u0005\u000b\u0000\u0000"+
		"\u009e\u009f\u0005\u000e\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0"+
		"\u00a1\u0005\n\u0000\u0000\u00a1\u00a2\u0005\f\u0000\u0000\u00a2\u00ed"+
		"\u0005\u000b\u0000\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000\u00a4\u00a5"+
		"\u0005\b\u0000\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7\u0005"+
		"\r\u0000\u0000\u00a7\u00ed\u0005\u000b\u0000\u0000\u00a8\u00a9\u0005\u000f"+
		"\u0000\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa\u00ab\u0005\n\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00ed\u0005\u000b\u0000"+
		"\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u00af\u0005\b\u0000\u0000"+
		"\u00af\u00b0\u0005\n\u0000\u0000\u00b0\u00b1\u0005\f\u0000\u0000\u00b1"+
		"\u00ed\u0005\u000b\u0000\u0000\u00b2\u00b3\u0005\u000f\u0000\u0000\u00b3"+
		"\u00b4\u0005\b\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6"+
		"\u0005\r\u0000\u0000\u00b6\u00ed\u0005\u000b\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0010\u0000\u0000\u00b8\u00b9\u0005\b\u0000\u0000\u00b9\u00ba\u0005\n"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00ed\u0005\u000b"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd\u00be\u0005\b\u0000"+
		"\u0000\u00be\u00bf\u0005\n\u0000\u0000\u00bf\u00c0\u0005\f\u0000\u0000"+
		"\u00c0\u00ed\u0005\u000b\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000"+
		"\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000\u00c4"+
		"\u00c5\u0005\r\u0000\u0000\u00c5\u00ed\u0005\u000b\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0011\u0000\u0000\u00c7\u00c8\u0005\b\u0000\u0000\u00c8\u00c9\u0005"+
		"\n\u0000\u0000\u00c9\u00ca\u0005\f\u0000\u0000\u00ca\u00ed\u0005\u000b"+
		"\u0000\u0000\u00cb\u00cc\u0005\u0011\u0000\u0000\u00cc\u00cd\u0005\b\u0000"+
		"\u0000\u00cd\u00ce\u0005\n\u0000\u0000\u00ce\u00cf\u0005\r\u0000\u0000"+
		"\u00cf\u00ed\u0005\u000b\u0000\u0000\u00d0\u00d1\u0005\u0011\u0000\u0000"+
		"\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0012\u0000\u0000\u00d4\u00d5\u0003\u0014\n\u0000\u00d5\u00d6"+
		"\u0005\u0012\u0000\u0000\u00d6\u00d7\u0005\u000b\u0000\u0000\u00d7\u00ed"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0013\u0000\u0000\u00d9\u00da"+
		"\u0005\b\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0005"+
		"\u0006\u0000\u0000\u00dc\u00ed\u0005\u000b\u0000\u0000\u00dd\u00de\u0005"+
		"\u0014\u0000\u0000\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e0\u0005\n"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0001\u0000\u0000\u00e1\u00ed\u0005\u000b"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0015\u0000\u0000\u00e3\u00e4\u0005\b\u0000"+
		"\u0000\u00e4\u00e5\u0005\n\u0000\u0000\u00e5\u00e6\u0005\u0002\u0000\u0000"+
		"\u00e6\u00ed\u0005\u000b\u0000\u0000\u00e7\u00e8\u0005\u0016\u0000\u0000"+
		"\u00e8\u00e9\u0005\b\u0000\u0000\u00e9\u00ea\u0005\n\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0017\u0000\u0000\u00eb\u00ed\u0005\u000b\u0000\u0000\u00ec"+
		"\u008a\u0001\u0000\u0000\u0000\u00ec\u008f\u0001\u0000\u0000\u0000\u00ec"+
		"\u0094\u0001\u0000\u0000\u0000\u00ec\u0099\u0001\u0000\u0000\u0000\u00ec"+
		"\u009e\u0001\u0000\u0000\u0000\u00ec\u00a3\u0001\u0000\u0000\u0000\u00ec"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ec\u00ad\u0001\u0000\u0000\u0000\u00ec"+
		"\u00b2\u0001\u0000\u0000\u0000\u00ec\u00b7\u0001\u0000\u0000\u0000\u00ec"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ec\u00c1\u0001\u0000\u0000\u0000\u00ec"+
		"\u00c6\u0001\u0000\u0000\u0000\u00ec\u00cb\u0001\u0000\u0000\u0000\u00ec"+
		"\u00d0\u0001\u0000\u0000\u0000\u00ec\u00d8\u0001\u0000\u0000\u0000\u00ec"+
		"\u00dd\u0001\u0000\u0000\u0000\u00ec\u00e2\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ed\u000f\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0018\u0000\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0"+
		"\u00f1\u0005\t\u0000\u0000\u00f1\u00f2\u0005\b\u0000\u0000\u00f2\u00f3"+
		"\u0005\n\u0000\u0000\u00f3\u00f4\u0005\u0006\u0000\u0000\u00f4\u00f5\u0005"+
		"\u000b\u0000\u0000\u00f5\u00f6\u0005\b\u0000\u0000\u00f6\u00f7\u0005\u0019"+
		"\u0000\u0000\u00f7\u00f8\u0005\b\u0000\u0000\u00f8\u00f9\u0005\u000b\u0000"+
		"\u0000\u00f9\u00fa\u0005\b\u0000\u0000\u00fa\u00fb\u0005\u001a\u0000\u0000"+
		"\u00fb\u00fc\u0005\u0005\u0000\u0000\u00fc\u00fd\u0005\u001b\u0000\u0000"+
		"\u00fd\u00fe\u0003H$\u0000\u00fe\u00ff\u0005\u001c\u0000\u0000\u00ff\u0137"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0018\u0000\u0000\u0101\u0102"+
		"\u0005\u0004\u0000\u0000\u0102\u0103\u0005\u0013\u0000\u0000\u0103\u0104"+
		"\u0005\b\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105\u0106\u0005"+
		"\u0006\u0000\u0000\u0106\u0107\u0005\u000b\u0000\u0000\u0107\u0108\u0005"+
		"\b\u0000\u0000\u0108\u0109\u0005\u0019\u0000\u0000\u0109\u010a\u0005\b"+
		"\u0000\u0000\u010a\u010b\u0005\u000b\u0000\u0000\u010b\u010c\u0005\b\u0000"+
		"\u0000\u010c\u010d\u0005\u001a\u0000\u0000\u010d\u010e\u0005\u0005\u0000"+
		"\u0000\u010e\u010f\u0005\u001b\u0000\u0000\u010f\u0110\u0003H$\u0000\u0110"+
		"\u0111\u0005\u001c\u0000\u0000\u0111\u0137\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\u0018\u0000\u0000\u0113\u0114\u0005\u0004\u0000\u0000\u0114"+
		"\u0115\u0005\t\u0000\u0000\u0115\u0116\u0005\b\u0000\u0000\u0116\u0117"+
		"\u0005\n\u0000\u0000\u0117\u0118\u0005\u0006\u0000\u0000\u0118\u0119\u0005"+
		"\u000b\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000\u011a\u011b\u0005\u0019"+
		"\u0000\u0000\u011b\u011c\u0005\u0006\u0000\u0000\u011c\u011d\u0005\u000b"+
		"\u0000\u0000\u011d\u011e\u0005\b\u0000\u0000\u011e\u011f\u0005\u001a\u0000"+
		"\u0000\u011f\u0120\u0005\u0005\u0000\u0000\u0120\u0121\u0005\u001b\u0000"+
		"\u0000\u0121\u0122\u0003H$\u0000\u0122\u0123\u0005\u001c\u0000\u0000\u0123"+
		"\u0137\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0018\u0000\u0000\u0125"+
		"\u0126\u0005\u0004\u0000\u0000\u0126\u0127\u0005\u0013\u0000\u0000\u0127"+
		"\u0128\u0005\b\u0000\u0000\u0128\u0129\u0005\n\u0000\u0000\u0129\u012a"+
		"\u0005\u0006\u0000\u0000\u012a\u012b\u0005\u000b\u0000\u0000\u012b\u012c"+
		"\u0005\b\u0000\u0000\u012c\u012d\u0005\u0019\u0000\u0000\u012d\u012e\u0005"+
		"\u0006\u0000\u0000\u012e\u012f\u0005\u000b\u0000\u0000\u012f\u0130\u0005"+
		"\b\u0000\u0000\u0130\u0131\u0005\u001a\u0000\u0000\u0131\u0132\u0005\u0005"+
		"\u0000\u0000\u0132\u0133\u0005\u001b\u0000\u0000\u0133\u0134\u0003H$\u0000"+
		"\u0134\u0135\u0005\u001c\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u00ee\u0001\u0000\u0000\u0000\u0136\u0100\u0001\u0000\u0000\u0000"+
		"\u0136\u0112\u0001\u0000\u0000\u0000\u0136\u0124\u0001\u0000\u0000\u0000"+
		"\u0137\u0011\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u001d\u0000\u0000"+
		"\u0139\u013a\u0005\u0004\u0000\u0000\u013a\u013b\u0005\r\u0000\u0000\u013b"+
		"\u013c\u0005\u0005\u0000\u0000\u013c\u014f\u0005\u000b\u0000\u0000\u013d"+
		"\u013e\u0005\u001d\u0000\u0000\u013e\u013f\u0005\u0004\u0000\u0000\u013f"+
		"\u0140\u0005\f\u0000\u0000\u0140\u0141\u0005\u0005\u0000\u0000\u0141\u014f"+
		"\u0005\u000b\u0000\u0000\u0142\u0143\u0005\u001d\u0000\u0000\u0143\u0144"+
		"\u0005\u0004\u0000\u0000\u0144\u0146\u0005\u0012\u0000\u0000\u0145\u0147"+
		"\u0003\u0014\n\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"\u0012\u0000\u0000\u014b\u014c\u0005\u0005\u0000\u0000\u014c\u014d\u0005"+
		"\u000b\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0138\u0001"+
		"\u0000\u0000\u0000\u014e\u013d\u0001\u0000\u0000\u0000\u014e\u0142\u0001"+
		"\u0000\u0000\u0000\u014f\u0013\u0001\u0000\u0000\u0000\u0150\u0167\u0005"+
		"\b\u0000\u0000\u0151\u0167\u0005\u0006\u0000\u0000\u0152\u0154\u0005\b"+
		"\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0159\u0003\u0014"+
		"\n\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b\u0167\u0001\u0000\u0000\u0000\u015c\u015e\u0005\u0006\u0000"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0163\u0003\u0014\n\u0000"+
		"\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0150\u0001\u0000\u0000\u0000"+
		"\u0166\u0151\u0001\u0000\u0000\u0000\u0166\u0153\u0001\u0000\u0000\u0000"+
		"\u0166\u015d\u0001\u0000\u0000\u0000\u0167\u0015\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0005\u001e\u0000\u0000\u0169\u016a\u0005\u0004\u0000\u0000"+
		"\u016a\u016b\u0003\"\u0011\u0000\u016b\u016c\u0005\u0005\u0000\u0000\u016c"+
		"\u016d\u0005\u001b\u0000\u0000\u016d\u016e\u0003H$\u0000\u016e\u016f\u0005"+
		"\u001c\u0000\u0000\u016f\u017f\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"\u001e\u0000\u0000\u0171\u0172\u0005\u0004\u0000\u0000\u0172\u0173\u0003"+
		"\"\u0011\u0000\u0173\u0174\u0005\u0005\u0000\u0000\u0174\u0175\u0005\u001f"+
		"\u0000\u0000\u0175\u0176\u0005\u000b\u0000\u0000\u0176\u017f\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0005\u001e\u0000\u0000\u0178\u0179\u0005\u0004"+
		"\u0000\u0000\u0179\u017a\u0003\"\u0011\u0000\u017a\u017b\u0005\u0005\u0000"+
		"\u0000\u017b\u017c\u0005 \u0000\u0000\u017c\u017d\u0005\u000b\u0000\u0000"+
		"\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u0168\u0001\u0000\u0000\u0000"+
		"\u017e\u0170\u0001\u0000\u0000\u0000\u017e\u0177\u0001\u0000\u0000\u0000"+
		"\u017f\u0017\u0001\u0000\u0000\u0000\u0180\u0181\u0005!\u0000\u0000\u0181"+
		"\u0182\u0005\u0004\u0000\u0000\u0182\u0183\u0003\"\u0011\u0000\u0183\u0184"+
		"\u0005\u0005\u0000\u0000\u0184\u0185\u0005\u001b\u0000\u0000\u0185\u0186"+
		"\u0003H$\u0000\u0186\u0187\u0005\u001c\u0000\u0000\u0187\u0197\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005!\u0000\u0000\u0189\u018a\u0005\u0004\u0000"+
		"\u0000\u018a\u018b\u0003\"\u0011\u0000\u018b\u018c\u0005\u0005\u0000\u0000"+
		"\u018c\u018d\u0005\u001f\u0000\u0000\u018d\u018e\u0005\u000b\u0000\u0000"+
		"\u018e\u0197\u0001\u0000\u0000\u0000\u018f\u0190\u0005!\u0000\u0000\u0190"+
		"\u0191\u0005\u0004\u0000\u0000\u0191\u0192\u0003\"\u0011\u0000\u0192\u0193"+
		"\u0005\u0005\u0000\u0000\u0193\u0194\u0005 \u0000\u0000\u0194\u0195\u0005"+
		"\u000b\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0180\u0001"+
		"\u0000\u0000\u0000\u0196\u0188\u0001\u0000\u0000\u0000\u0196\u018f\u0001"+
		"\u0000\u0000\u0000\u0197\u0019\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"\"\u0000\u0000\u0199\u019a\u0005\u0004\u0000\u0000\u019a\u019b\u0005\b"+
		"\u0000\u0000\u019b\u019c\u0005\u0005\u0000\u0000\u019c\u019e\u0005\u001b"+
		"\u0000\u0000\u019d\u019f\u0003\u001c\u000e\u0000\u019e\u019d\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0003\u001e\u000f\u0000\u01a3\u01a4\u0005\u001c"+
		"\u0000\u0000\u01a4\u01b3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\"\u0000"+
		"\u0000\u01a6\u01a7\u0005\u0004\u0000\u0000\u01a7\u01a8\u0005\u0006\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0005\u0000\u0000\u01a9\u01ab\u0005\u001b\u0000"+
		"\u0000\u01aa\u01ac\u0003\u001c\u000e\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0003\u001e\u000f\u0000\u01b0\u01b1\u0005\u001c\u0000"+
		"\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u0198\u0001\u0000\u0000"+
		"\u0000\u01b2\u01a5\u0001\u0000\u0000\u0000\u01b3\u001b\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0005#\u0000\u0000\u01b5\u01b6\u0005\r\u0000\u0000"+
		"\u01b6\u01b7\u0005$\u0000\u0000\u01b7\u01b9\u0005\u001b\u0000\u0000\u01b8"+
		"\u01ba\u0003H$\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"\u001c\u0000\u0000\u01be\u01bf\u0005\u001f\u0000\u0000\u01bf\u01c0\u0005"+
		"\u000b\u0000\u0000\u01c0\u01cf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"#\u0000\u0000\u01c2\u01c3\u0005\u0006\u0000\u0000\u01c3\u01c4\u0005$\u0000"+
		"\u0000\u01c4\u01c6\u0005\u001b\u0000\u0000\u01c5\u01c7\u0003H$\u0000\u01c6"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u001c\u0000\u0000\u01cb"+
		"\u01cc\u0005\u001f\u0000\u0000\u01cc\u01cd\u0005\u000b\u0000\u0000\u01cd"+
		"\u01cf\u0001\u0000\u0000\u0000\u01ce\u01b4\u0001\u0000\u0000\u0000\u01ce"+
		"\u01c1\u0001\u0000\u0000\u0000\u01cf\u001d\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0005%\u0000\u0000\u01d1\u01d2\u0005$\u0000\u0000\u01d2\u01d4\u0005"+
		"\u001b\u0000\u0000\u01d3\u01d5\u0003H$\u0000\u01d4\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0005\u001c\u0000\u0000\u01d9\u01da\u0005\u001f\u0000"+
		"\u0000\u01da\u01db\u0005\u000b\u0000\u0000\u01db\u001f\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0005&\u0000\u0000\u01dd\u01df\u0005\u001b\u0000\u0000"+
		"\u01de\u01e0\u0003H$\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0005\u001c\u0000\u0000\u01e4\u01e5\u0005\'\u0000\u0000\u01e5\u01e6\u0005"+
		"\u0004\u0000\u0000\u01e6\u01e7\u0005\b\u0000\u0000\u01e7\u01e8\u0005\u0005"+
		"\u0000\u0000\u01e8\u01e9\u0005(\u0000\u0000\u01e9\u01ea\u0003H$\u0000"+
		"\u01ea\u01eb\u0005\u001c\u0000\u0000\u01eb!\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0006\u0011\uffff\uffff\u0000\u01ed\u01ee\u0005\b\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0019\u0000\u0000\u01ef\u01f4\u0005\u0006\u0000\u0000\u01f0"+
		"\u01f1\u0005\b\u0000\u0000\u01f1\u01f2\u0005\u0019\u0000\u0000\u01f2\u01f4"+
		"\u0005\b\u0000\u0000\u01f3\u01ec\u0001\u0000\u0000\u0000\u01f3\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f4\u01fd\u0001\u0000\u0000\u0000\u01f5\u01f6\n\u0004"+
		"\u0000\u0000\u01f6\u01f7\u0005)\u0000\u0000\u01f7\u01fc\u0003\"\u0011"+
		"\u0005\u01f8\u01f9\n\u0003\u0000\u0000\u01f9\u01fa\u0005*\u0000\u0000"+
		"\u01fa\u01fc\u0003\"\u0011\u0004\u01fb\u01f5\u0001\u0000\u0000\u0000\u01fb"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe"+
		"#\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0005+\u0000\u0000\u0201\u0202\u0005\u001b\u0000\u0000\u0202\u0203\u0003"+
		"H$\u0000\u0203\u0204\u0005\u001c\u0000\u0000\u0204\u0205\u0003\u0018\f"+
		"\u0000\u0205%\u0001\u0000\u0000\u0000\u0206\u0207\u0006\u0013\uffff\uffff"+
		"\u0000\u0207\u020a\u0005\b\u0000\u0000\u0208\u020a\u0005\u0006\u0000\u0000"+
		"\u0209\u0206\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000"+
		"\u020a\u0219\u0001\u0000\u0000\u0000\u020b\u020c\n\u0006\u0000\u0000\u020c"+
		"\u020d\u0005,\u0000\u0000\u020d\u0218\u0003&\u0013\u0007\u020e\u020f\n"+
		"\u0005\u0000\u0000\u020f\u0210\u0005-\u0000\u0000\u0210\u0218\u0003&\u0013"+
		"\u0006\u0211\u0212\n\u0004\u0000\u0000\u0212\u0213\u0005.\u0000\u0000"+
		"\u0213\u0218\u0003&\u0013\u0005\u0214\u0215\n\u0003\u0000\u0000\u0215"+
		"\u0216\u0005/\u0000\u0000\u0216\u0218\u0003&\u0013\u0004\u0217\u020b\u0001"+
		"\u0000\u0000\u0000\u0217\u020e\u0001\u0000\u0000\u0000\u0217\u0211\u0001"+
		"\u0000\u0000\u0000\u0217\u0214\u0001\u0000\u0000\u0000\u0218\u021b\u0001"+
		"\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\'\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u00050\u0000\u0000\u021d\u021e\u0005\b\u0000"+
		"\u0000\u021e\u021f\u0005\u0004\u0000\u0000\u021f\u0220\u0005\u0005\u0000"+
		"\u0000\u0220\u0221\u0005\u001b\u0000\u0000\u0221\u0222\u0003H$\u0000\u0222"+
		"\u0223\u0005\u001c\u0000\u0000\u0223\u02db\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0005\u0011\u0000\u0000\u0225\u0226\u0005\b\u0000\u0000\u0226\u0227"+
		"\u0005\u0004\u0000\u0000\u0227\u0228\u0005\u0005\u0000\u0000\u0228\u0229"+
		"\u0005\u001b\u0000\u0000\u0229\u022a\u0003H$\u0000\u022a\u022b\u0005\u001c"+
		"\u0000\u0000\u022b\u02db\u0001\u0000\u0000\u0000\u022c\u022d\u0005\u0013"+
		"\u0000\u0000\u022d\u022e\u0005\b\u0000\u0000\u022e\u022f\u0005\u0004\u0000"+
		"\u0000\u022f\u0230\u0005\u0005\u0000\u0000\u0230\u0231\u0005\u001b\u0000"+
		"\u0000\u0231\u0232\u0003H$\u0000\u0232\u0233\u0005\u001c\u0000\u0000\u0233"+
		"\u02db\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u0015\u0000\u0000\u0235"+
		"\u0236\u0005\b\u0000\u0000\u0236\u0237\u0005\u0004\u0000\u0000\u0237\u0238"+
		"\u0005\u0005\u0000\u0000\u0238\u0239\u0005\u001b\u0000\u0000\u0239\u023a"+
		"\u0003H$\u0000\u023a\u023b\u0005\u001c\u0000\u0000\u023b\u02db\u0001\u0000"+
		"\u0000\u0000\u023c\u023d\u0005\u0014\u0000\u0000\u023d\u023e\u0005\b\u0000"+
		"\u0000\u023e\u023f\u0005\u0004\u0000\u0000\u023f\u0240\u0005\u0005\u0000"+
		"\u0000\u0240\u0241\u0005\u001b\u0000\u0000\u0241\u0242\u0003H$\u0000\u0242"+
		"\u0243\u0005\u001c\u0000\u0000\u0243\u02db\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u00050\u0000\u0000\u0245\u0246\u0005\b\u0000\u0000\u0246\u0247"+
		"\u0005\u0004\u0000\u0000\u0247\u0248\u0005\u0005\u0000\u0000\u0248\u0249"+
		"\u0005\u001b\u0000\u0000\u0249\u024a\u0003H$\u0000\u024a\u024b\u0003,"+
		"\u0016\u0000\u024b\u024c\u0005\u000b\u0000\u0000\u024c\u024d\u0005\u001c"+
		"\u0000\u0000\u024d\u02db\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u0013"+
		"\u0000\u0000\u024f\u0250\u0005\b\u0000\u0000\u0250\u0251\u0005\u0004\u0000"+
		"\u0000\u0251\u0252\u0005\u0005\u0000\u0000\u0252\u0253\u0005\u001b\u0000"+
		"\u0000\u0253\u0254\u0003H$\u0000\u0254\u0255\u0003,\u0016\u0000\u0255"+
		"\u0256\u0005\u000b\u0000\u0000\u0256\u0257\u0005\u001c\u0000\u0000\u0257"+
		"\u02db\u0001\u0000\u0000\u0000\u0258\u0259\u0005\u0011\u0000\u0000\u0259"+
		"\u025a\u0005\b\u0000\u0000\u025a\u025b\u0005\u0004\u0000\u0000\u025b\u025c"+
		"\u0005\u0005\u0000\u0000\u025c\u025d\u0005\u001b\u0000\u0000\u025d\u025e"+
		"\u0003H$\u0000\u025e\u025f\u0003,\u0016\u0000\u025f\u0260\u0005\u000b"+
		"\u0000\u0000\u0260\u0261\u0005\u001c\u0000\u0000\u0261\u02db\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0005\u0015\u0000\u0000\u0263\u0264\u0005\b\u0000"+
		"\u0000\u0264\u0265\u0005\u0004\u0000\u0000\u0265\u0266\u0005\u0005\u0000"+
		"\u0000\u0266\u0267\u0005\u001b\u0000\u0000\u0267\u0268\u0003H$\u0000\u0268"+
		"\u0269\u0003,\u0016\u0000\u0269\u026a\u0005\u000b\u0000\u0000\u026a\u026b"+
		"\u0005\u001c\u0000\u0000\u026b\u02db\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005\u0014\u0000\u0000\u026d\u026e\u0005\b\u0000\u0000\u026e\u026f\u0005"+
		"\u0004\u0000\u0000\u026f\u0270\u0005\u0005\u0000\u0000\u0270\u0271\u0005"+
		"\u001b\u0000\u0000\u0271\u0272\u0003H$\u0000\u0272\u0273\u0003,\u0016"+
		"\u0000\u0273\u0274\u0005\u000b\u0000\u0000\u0274\u0275\u0005\u001c\u0000"+
		"\u0000\u0275\u02db\u0001\u0000\u0000\u0000\u0276\u0277\u00050\u0000\u0000"+
		"\u0277\u0278\u0005\b\u0000\u0000\u0278\u0279\u0005\u0004\u0000\u0000\u0279"+
		"\u027a\u0003*\u0015\u0000\u027a\u027b\u0005\u0005\u0000\u0000\u027b\u027c"+
		"\u0005\u001b\u0000\u0000\u027c\u027d\u0003H$\u0000\u027d\u027e\u0005\u001c"+
		"\u0000\u0000\u027e\u02db\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0011"+
		"\u0000\u0000\u0280\u0281\u0005\b\u0000\u0000\u0281\u0282\u0005\u0004\u0000"+
		"\u0000\u0282\u0283\u0003*\u0015\u0000\u0283\u0284\u0005\u0005\u0000\u0000"+
		"\u0284\u0285\u0005\u001b\u0000\u0000\u0285\u0286\u0003H$\u0000\u0286\u0287"+
		"\u0005\u001c\u0000\u0000\u0287\u02db\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0005\u0013\u0000\u0000\u0289\u028a\u0005\b\u0000\u0000\u028a\u028b\u0005"+
		"\u0004\u0000\u0000\u028b\u028c\u0003*\u0015\u0000\u028c\u028d\u0005\u0005"+
		"\u0000\u0000\u028d\u028e\u0005\u001b\u0000\u0000\u028e\u028f\u0003H$\u0000"+
		"\u028f\u0290\u0005\u001c\u0000\u0000\u0290\u02db\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0005\u0015\u0000\u0000\u0292\u0293\u0005\b\u0000\u0000\u0293"+
		"\u0294\u0005\u0004\u0000\u0000\u0294\u0295\u0003*\u0015\u0000\u0295\u0296"+
		"\u0005\u0005\u0000\u0000\u0296\u0297\u0005\u001b\u0000\u0000\u0297\u0298"+
		"\u0003H$\u0000\u0298\u0299\u0005\u001c\u0000\u0000\u0299\u02db\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0005\u0014\u0000\u0000\u029b\u029c\u0005\b\u0000"+
		"\u0000\u029c\u029d\u0005\u0004\u0000\u0000\u029d\u029e\u0003*\u0015\u0000"+
		"\u029e\u029f\u0005\u0005\u0000\u0000\u029f\u02a0\u0005\u001b\u0000\u0000"+
		"\u02a0\u02a1\u0003H$\u0000\u02a1\u02a2\u0005\u001c\u0000\u0000\u02a2\u02db"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a4\u00050\u0000\u0000\u02a4\u02a5\u0005"+
		"\b\u0000\u0000\u02a5\u02a6\u0005\u0004\u0000\u0000\u02a6\u02a7\u0003*"+
		"\u0015\u0000\u02a7\u02a8\u0005\u0005\u0000\u0000\u02a8\u02a9\u0005\u001b"+
		"\u0000\u0000\u02a9\u02aa\u0003H$\u0000\u02aa\u02ab\u0003,\u0016\u0000"+
		"\u02ab\u02ac\u0005\u000b\u0000\u0000\u02ac\u02ad\u0005\u001c\u0000\u0000"+
		"\u02ad\u02db\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\u0013\u0000\u0000"+
		"\u02af\u02b0\u0005\b\u0000\u0000\u02b0\u02b1\u0005\u0004\u0000\u0000\u02b1"+
		"\u02b2\u0003*\u0015\u0000\u02b2\u02b3\u0005\u0005\u0000\u0000\u02b3\u02b4"+
		"\u0005\u001b\u0000\u0000\u02b4\u02b5\u0003H$\u0000\u02b5\u02b6\u0003,"+
		"\u0016\u0000\u02b6\u02b7\u0005\u000b\u0000\u0000\u02b7\u02b8\u0005\u001c"+
		"\u0000\u0000\u02b8\u02db\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005\u0011"+
		"\u0000\u0000\u02ba\u02bb\u0005\b\u0000\u0000\u02bb\u02bc\u0005\u0004\u0000"+
		"\u0000\u02bc\u02bd\u0003*\u0015\u0000\u02bd\u02be\u0005\u0005\u0000\u0000"+
		"\u02be\u02bf\u0005\u001b\u0000\u0000\u02bf\u02c0\u0003H$\u0000\u02c0\u02c1"+
		"\u0003,\u0016\u0000\u02c1\u02c2\u0005\u000b\u0000\u0000\u02c2\u02c3\u0005"+
		"\u001c\u0000\u0000\u02c3\u02db\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005"+
		"\u0015\u0000\u0000\u02c5\u02c6\u0005\b\u0000\u0000\u02c6\u02c7\u0005\u0004"+
		"\u0000\u0000\u02c7\u02c8\u0003*\u0015\u0000\u02c8\u02c9\u0005\u0005\u0000"+
		"\u0000\u02c9\u02ca\u0005\u001b\u0000\u0000\u02ca\u02cb\u0003H$\u0000\u02cb"+
		"\u02cc\u0003,\u0016\u0000\u02cc\u02cd\u0005\u000b\u0000\u0000\u02cd\u02ce"+
		"\u0005\u001c\u0000\u0000\u02ce\u02db\u0001\u0000\u0000\u0000\u02cf\u02d0"+
		"\u0005\u0014\u0000\u0000\u02d0\u02d1\u0005\b\u0000\u0000\u02d1\u02d2\u0005"+
		"\u0004\u0000\u0000\u02d2\u02d3\u0003*\u0015\u0000\u02d3\u02d4\u0005\u0005"+
		"\u0000\u0000\u02d4\u02d5\u0005\u001b\u0000\u0000\u02d5\u02d6\u0003H$\u0000"+
		"\u02d6\u02d7\u0003,\u0016\u0000\u02d7\u02d8\u0005\u000b\u0000\u0000\u02d8"+
		"\u02d9\u0005\u001c\u0000\u0000\u02d9\u02db\u0001\u0000\u0000\u0000\u02da"+
		"\u021c\u0001\u0000\u0000\u0000\u02da\u0224\u0001\u0000\u0000\u0000\u02da"+
		"\u022c\u0001\u0000\u0000\u0000\u02da\u0234\u0001\u0000\u0000\u0000\u02da"+
		"\u023c\u0001\u0000\u0000\u0000\u02da\u0244\u0001\u0000\u0000\u0000\u02da"+
		"\u024e\u0001\u0000\u0000\u0000\u02da\u0258\u0001\u0000\u0000\u0000\u02da"+
		"\u0262\u0001\u0000\u0000\u0000\u02da\u026c\u0001\u0000\u0000\u0000\u02da"+
		"\u0276\u0001\u0000\u0000\u0000\u02da\u027f\u0001\u0000\u0000\u0000\u02da"+
		"\u0288\u0001\u0000\u0000\u0000\u02da\u0291\u0001\u0000\u0000\u0000\u02da"+
		"\u029a\u0001\u0000\u0000\u0000\u02da\u02a3\u0001\u0000\u0000\u0000\u02da"+
		"\u02ae\u0001\u0000\u0000\u0000\u02da\u02b9\u0001\u0000\u0000\u0000\u02da"+
		"\u02c4\u0001\u0000\u0000\u0000\u02da\u02cf\u0001\u0000\u0000\u0000\u02db"+
		")\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005\t\u0000\u0000\u02dd\u0319"+
		"\u0005\b\u0000\u0000\u02de\u02df\u0005\u0013\u0000\u0000\u02df\u0319\u0005"+
		"\u0006\u0000\u0000\u02e0\u02e1\u0005\u0015\u0000\u0000\u02e1\u0319\u0005"+
		"\u0006\u0000\u0000\u02e2\u02e3\u0005\u0014\u0000\u0000\u02e3\u0319\u0005"+
		"\u0006\u0000\u0000\u02e4\u02e5\u0005\u000f\u0000\u0000\u02e5\u0319\u0005"+
		"\u0006\u0000\u0000\u02e6\u02e7\u0005\u0011\u0000\u0000\u02e7\u0319\u0005"+
		"\b\u0000\u0000\u02e8\u02e9\u0005\t\u0000\u0000\u02e9\u02ea\u0005\b\u0000"+
		"\u0000\u02ea\u02ec\u0005\u0007\u0000\u0000\u02eb\u02ed\u0003*\u0015\u0000"+
		"\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ef\u0319\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005\u0013\u0000\u0000"+
		"\u02f1\u02f2\u0005\u0006\u0000\u0000\u02f2\u02f4\u0005\u0007\u0000\u0000"+
		"\u02f3\u02f5\u0003*\u0015\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f7\u0319\u0001\u0000\u0000\u0000\u02f8"+
		"\u02f9\u0005\u0015\u0000\u0000\u02f9\u02fa\u0005\u0006\u0000\u0000\u02fa"+
		"\u02fc\u0005\u0007\u0000\u0000\u02fb\u02fd\u0003*\u0015\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02fc"+
		"\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0319"+
		"\u0001\u0000\u0000\u0000\u0300\u0301\u0005\u0014\u0000\u0000\u0301\u0302"+
		"\u0005\u0006\u0000\u0000\u0302\u0304\u0005\u0007\u0000\u0000\u0303\u0305"+
		"\u0003*\u0015\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001"+
		"\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001"+
		"\u0000\u0000\u0000\u0307\u0319\u0001\u0000\u0000\u0000\u0308\u0309\u0005"+
		"\u000f\u0000\u0000\u0309\u030a\u0005\u0006\u0000\u0000\u030a\u030c\u0005"+
		"\u0007\u0000\u0000\u030b\u030d\u0003*\u0015\u0000\u030c\u030b\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000"+
		"\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0319\u0001\u0000"+
		"\u0000\u0000\u0310\u0311\u0005\u0011\u0000\u0000\u0311\u0312\u0005\b\u0000"+
		"\u0000\u0312\u0314\u0005\u0007\u0000\u0000\u0313\u0315\u0003*\u0015\u0000"+
		"\u0314\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u0319\u0001\u0000\u0000\u0000\u0318\u02dc\u0001\u0000\u0000\u0000"+
		"\u0318\u02de\u0001\u0000\u0000\u0000\u0318\u02e0\u0001\u0000\u0000\u0000"+
		"\u0318\u02e2\u0001\u0000\u0000\u0000\u0318\u02e4\u0001\u0000\u0000\u0000"+
		"\u0318\u02e6\u0001\u0000\u0000\u0000\u0318\u02e8\u0001\u0000\u0000\u0000"+
		"\u0318\u02f0\u0001\u0000\u0000\u0000\u0318\u02f8\u0001\u0000\u0000\u0000"+
		"\u0318\u0300\u0001\u0000\u0000\u0000\u0318\u0308\u0001\u0000\u0000\u0000"+
		"\u0318\u0310\u0001\u0000\u0000\u0000\u0319+\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u00051\u0000\u0000\u031b\u0325\u0005\b\u0000\u0000\u031c\u031d"+
		"\u00051\u0000\u0000\u031d\u0325\u0005\r\u0000\u0000\u031e\u031f\u0005"+
		"1\u0000\u0000\u031f\u0320\u0005\u0012\u0000\u0000\u0320\u0321\u0003\u0014"+
		"\n\u0000\u0321\u0322\u0005\u0012\u0000\u0000\u0322\u0325\u0001\u0000\u0000"+
		"\u0000\u0323\u0325\u00051\u0000\u0000\u0324\u031a\u0001\u0000\u0000\u0000"+
		"\u0324\u031c\u0001\u0000\u0000\u0000\u0324\u031e\u0001\u0000\u0000\u0000"+
		"\u0324\u0323\u0001\u0000\u0000\u0000\u0325-\u0001\u0000\u0000\u0000\u0326"+
		"\u032a\u00030\u0018\u0000\u0327\u032a\u00032\u0019\u0000\u0328\u032a\u0003"+
		"4\u001a\u0000\u0329\u0326\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000"+
		"\u0000\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032a/\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u00052\u0000\u0000\u032c\u032d\u0005\b\u0000\u0000"+
		"\u032d\u032f\u0005\u001b\u0000\u0000\u032e\u0330\u0003J%\u0000\u032f\u032e"+
		"\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u032f"+
		"\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u0001\u0000\u0000\u0000\u0333\u0334\u0005\u001c\u0000\u0000\u03341\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u00053\u0000\u0000\u0336\u0337\u00052\u0000"+
		"\u0000\u0337\u0338\u0005\b\u0000\u0000\u0338\u0339\u0005\u001b\u0000\u0000"+
		"\u0339\u033a\u0005\u001c\u0000\u0000\u033a3\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u00052\u0000\u0000\u033c\u033d\u0005\b\u0000\u0000\u033d\u033e"+
		"\u00054\u0000\u0000\u033e\u033f\u0005\b\u0000\u0000\u033f\u0340\u0005"+
		"\u001b\u0000\u0000\u0340\u0341\u0003J%\u0000\u0341\u0342\u0005\u001c\u0000"+
		"\u0000\u0342\u0394\u0001\u0000\u0000\u0000\u0343\u0344\u00052\u0000\u0000"+
		"\u0344\u0345\u0005\b\u0000\u0000\u0345\u0346\u00054\u0000\u0000\u0346"+
		"\u0347\u0005\b\u0000\u0000\u0347\u0348\u0005\u001b\u0000\u0000\u0348\u0394"+
		"\u0005\u001c\u0000\u0000\u0349\u034a\u00052\u0000\u0000\u034a\u034b\u0005"+
		"\b\u0000\u0000\u034b\u034c\u00054\u0000\u0000\u034c\u034d\u00055\u0000"+
		"\u0000\u034d\u034e\u0005\u001b\u0000\u0000\u034e\u034f\u00056\u0000\u0000"+
		"\u034f\u0350\u00057\u0000\u0000\u0350\u0351\u0005\u001b\u0000\u0000\u0351"+
		"\u0352\u00051\u0000\u0000\u0352\u0353\u00058\u0000\u0000\u0353\u0354\u0005"+
		"\u0004\u0000\u0000\u0354\u0355\u00059\u0000\u0000\u0355\u0356\u0005$\u0000"+
		"\u0000\u0356\u0357\u0003F#\u0000\u0357\u0358\u0005\u0005\u0000\u0000\u0358"+
		"\u0359\u0005\u001c\u0000\u0000\u0359\u035a\u0005\u001c\u0000\u0000\u035a"+
		"\u0394\u0001\u0000\u0000\u0000\u035b\u035c\u00052\u0000\u0000\u035c\u035d"+
		"\u0005\b\u0000\u0000\u035d\u035e\u00054\u0000\u0000\u035e\u035f\u0005"+
		":\u0000\u0000\u035f\u0360\u0005\u001b\u0000\u0000\u0360\u0361\u00056\u0000"+
		"\u0000\u0361\u0362\u00057\u0000\u0000\u0362\u0363\u0005\u001b\u0000\u0000"+
		"\u0363\u0364\u00051\u0000\u0000\u0364\u0365\u00058\u0000\u0000\u0365\u0366"+
		"\u0005\u0004\u0000\u0000\u0366\u0367\u00059\u0000\u0000\u0367\u0368\u0005"+
		"$\u0000\u0000\u0368\u0369\u0003F#\u0000\u0369\u036a\u0005\u0005\u0000"+
		"\u0000\u036a\u036b\u0005\u001c\u0000\u0000\u036b\u036c\u0005\u001c\u0000"+
		"\u0000\u036c\u0394\u0001\u0000\u0000\u0000\u036d\u036e\u00052\u0000\u0000"+
		"\u036e\u036f\u0005\b\u0000\u0000\u036f\u0370\u00054\u0000\u0000\u0370"+
		"\u0371\u00055\u0000\u0000\u0371\u0372\u0005\u001b\u0000\u0000\u0372\u0373"+
		"\u0003J%\u0000\u0373\u0374\u00056\u0000\u0000\u0374\u0375\u00057\u0000"+
		"\u0000\u0375\u0376\u0005\u001b\u0000\u0000\u0376\u0377\u00051\u0000\u0000"+
		"\u0377\u0378\u00058\u0000\u0000\u0378\u0379\u0005\u0004\u0000\u0000\u0379"+
		"\u037a\u00059\u0000\u0000\u037a\u037b\u0005$\u0000\u0000\u037b\u037c\u0003"+
		"F#\u0000\u037c\u037d\u0005\u0005\u0000\u0000\u037d\u037e\u0005\u001c\u0000"+
		"\u0000\u037e\u037f\u0005\u001c\u0000\u0000\u037f\u0394\u0001\u0000\u0000"+
		"\u0000\u0380\u0381\u00052\u0000\u0000\u0381\u0382\u0005\b\u0000\u0000"+
		"\u0382\u0383\u00054\u0000\u0000\u0383\u0384\u0005:\u0000\u0000\u0384\u0385"+
		"\u0005\u001b\u0000\u0000\u0385\u0386\u0003J%\u0000\u0386\u0387\u00056"+
		"\u0000\u0000\u0387\u0388\u00057\u0000\u0000\u0388\u0389\u0005\u001b\u0000"+
		"\u0000\u0389\u038a\u00051\u0000\u0000\u038a\u038b\u00058\u0000\u0000\u038b"+
		"\u038c\u0005\u0004\u0000\u0000\u038c\u038d\u00059\u0000\u0000\u038d\u038e"+
		"\u0005$\u0000\u0000\u038e\u038f\u0003F#\u0000\u038f\u0390\u0005\u0005"+
		"\u0000\u0000\u0390\u0391\u0005\u001c\u0000\u0000\u0391\u0392\u0005\u001c"+
		"\u0000\u0000\u0392\u0394\u0001\u0000\u0000\u0000\u0393\u033b\u0001\u0000"+
		"\u0000\u0000\u0393\u0343\u0001\u0000\u0000\u0000\u0393\u0349\u0001\u0000"+
		"\u0000\u0000\u0393\u035b\u0001\u0000\u0000\u0000\u0393\u036d\u0001\u0000"+
		"\u0000\u0000\u0393\u0380\u0001\u0000\u0000\u0000\u03945\u0001\u0000\u0000"+
		"\u0000\u0395\u0396\u0005;\u0000\u0000\u0396\u0397\u0005\u0004\u0000\u0000"+
		"\u0397\u0398\u0005<\u0000\u0000\u0398\u0399\u0005$\u0000\u0000\u0399\u039a"+
		"\u00038\u001c\u0000\u039a\u039b\u0005\u0005\u0000\u0000\u039b\u039c\u0005"+
		"\u0007\u0000\u0000\u039c\u03a6\u0001\u0000\u0000\u0000\u039d\u039e\u0005"+
		";\u0000\u0000\u039e\u039f\u0005\u0004\u0000\u0000\u039f\u03a0\u0005<\u0000"+
		"\u0000\u03a0\u03a1\u0005$\u0000\u0000\u03a1\u03a2\u0003:\u001d\u0000\u03a2"+
		"\u03a3\u0005\u0005\u0000\u0000\u03a3\u03a4\u0005\u0007\u0000\u0000\u03a4"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a5\u0395\u0001\u0000\u0000\u0000\u03a5"+
		"\u039d\u0001\u0000\u0000\u0000\u03a67\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0005=\u0000\u0000\u03a8\u03a9\u0005\u0004\u0000\u0000\u03a9\u03aa\u0005"+
		">\u0000\u0000\u03aa\u03ab\u0005$\u0000\u0000\u03ab\u03ac\u0005?\u0000"+
		"\u0000\u03ac\u03ad\u0003F#\u0000\u03ad\u03ae\u0005@\u0000\u0000\u03ae"+
		"\u03af\u0005\u0005\u0000\u0000\u03af\u03b0\u0005\u0007\u0000\u0000\u03b0"+
		"9\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005A\u0000\u0000\u03b2\u03b3\u0005"+
		"\u0004\u0000\u0000\u03b3\u03b4\u0005>\u0000\u0000\u03b4\u03b5\u0005$\u0000"+
		"\u0000\u03b5\u03b6\u0005?\u0000\u0000\u03b6\u03b7\u0003F#\u0000\u03b7"+
		"\u03b8\u0005@\u0000\u0000\u03b8\u03b9\u0005\u0005\u0000\u0000\u03b9\u03ba"+
		"\u0005\u0007\u0000\u0000\u03ba;\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005"+
		"B\u0000\u0000\u03bc\u03bd\u0005\u0004\u0000\u0000\u03bd\u03be\u0005\f"+
		"\u0000\u0000\u03be\u03bf\u0005\u0005\u0000\u0000\u03bf\u03d2\u0005\u0007"+
		"\u0000\u0000\u03c0\u03c1\u0005B\u0000\u0000\u03c1\u03c2\u0005\u0004\u0000"+
		"\u0000\u03c2\u03c3\u0005\r\u0000\u0000\u03c3\u03c4\u0005\u0005\u0000\u0000"+
		"\u03c4\u03d2\u0005\u0007\u0000\u0000\u03c5\u03c6\u0005B\u0000\u0000\u03c6"+
		"\u03c7\u0005\u0004\u0000\u0000\u03c7\u03c9\u0005\u0012\u0000\u0000\u03c8"+
		"\u03ca\u0003\u0014\n\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce"+
		"\u0005\u0012\u0000\u0000\u03ce\u03cf\u0005\u0005\u0000\u0000\u03cf\u03d0"+
		"\u0005\u0007\u0000\u0000\u03d0\u03d2\u0001\u0000\u0000\u0000\u03d1\u03bb"+
		"\u0001\u0000\u0000\u0000\u03d1\u03c0\u0001\u0000\u0000\u0000\u03d1\u03c5"+
		"\u0001\u0000\u0000\u0000\u03d2=\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005"+
		"C\u0000\u0000\u03d4\u03d5\u0005\u0004\u0000\u0000\u03d5\u03d6\u0005D\u0000"+
		"\u0000\u03d6\u03d7\u0005$\u0000\u0000\u03d7\u03d8\u0005\u0001\u0000\u0000"+
		"\u03d8\u03d9\u0005\u0007\u0000\u0000\u03d9\u03da\u0005\u0005\u0000\u0000"+
		"\u03da\u03f6\u0005\u0007\u0000\u0000\u03db\u03dc\u0005C\u0000\u0000\u03dc"+
		"\u03dd\u0005\u0004\u0000\u0000\u03dd\u03de\u0005E\u0000\u0000\u03de\u03df"+
		"\u0005$\u0000\u0000\u03df\u03e0\u0005\u0001\u0000\u0000\u03e0\u03e1\u0005"+
		"\u0007\u0000\u0000\u03e1\u03e2\u0005\u0005\u0000\u0000\u03e2\u03f6\u0005"+
		"\u0007\u0000\u0000\u03e3\u03e4\u0005C\u0000\u0000\u03e4\u03e5\u0005\u0004"+
		"\u0000\u0000\u03e5\u03e6\u0005E\u0000\u0000\u03e6\u03e7\u0005D\u0000\u0000"+
		"\u03e7\u03e8\u0005$\u0000\u0000\u03e8\u03e9\u0005\u0001\u0000\u0000\u03e9"+
		"\u03ea\u0005\u0007\u0000\u0000\u03ea\u03eb\u0005\u0005\u0000\u0000\u03eb"+
		"\u03f6\u0005\u0007\u0000\u0000\u03ec\u03ed\u0005C\u0000\u0000\u03ed\u03ee"+
		"\u0005\u0004\u0000\u0000\u03ee\u03ef\u0005D\u0000\u0000\u03ef\u03f0\u0005"+
		"E\u0000\u0000\u03f0\u03f1\u0005$\u0000\u0000\u03f1\u03f2\u0005\u0001\u0000"+
		"\u0000\u03f2\u03f3\u0005\u0007\u0000\u0000\u03f3\u03f4\u0005\u0005\u0000"+
		"\u0000\u03f4\u03f6\u0005\u0007\u0000\u0000\u03f5\u03d3\u0001\u0000\u0000"+
		"\u0000\u03f5\u03db\u0001\u0000\u0000\u0000\u03f5\u03e3\u0001\u0000\u0000"+
		"\u0000\u03f5\u03ec\u0001\u0000\u0000\u0000\u03f6?\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f8\u0005F\u0000\u0000\u03f8\u03f9\u0005\u0004\u0000\u0000\u03f9"+
		"\u03fa\u0005<\u0000\u0000\u03fa\u03fb\u0005$\u0000\u0000\u03fb\u03fc\u0003"+
		"<\u001e\u0000\u03fc\u03fd\u0005\u0005\u0000\u0000\u03fd\u03fe\u0005\u0007"+
		"\u0000\u0000\u03fe\u0408\u0001\u0000\u0000\u0000\u03ff\u0400\u0005F\u0000"+
		"\u0000\u0400\u0401\u0005\u0004\u0000\u0000\u0401\u0402\u0005<\u0000\u0000"+
		"\u0402\u0403\u0005$\u0000\u0000\u0403\u0404\u00036\u001b\u0000\u0404\u0405"+
		"\u0005\u0005\u0000\u0000\u0405\u0406\u0005\u0007\u0000\u0000\u0406\u0408"+
		"\u0001\u0000\u0000\u0000\u0407\u03f7\u0001\u0000\u0000\u0000\u0407\u03ff"+
		"\u0001\u0000\u0000\u0000\u0408A\u0001\u0000\u0000\u0000\u0409\u040a\u0005"+
		"G\u0000\u0000\u040a\u040b\u0005\u0004\u0000\u0000\u040b\u040c\u0005H\u0000"+
		"\u0000\u040c\u040d\u0005$\u0000\u0000\u040d\u040e\u0005I\u0000\u0000\u040e"+
		"\u040f\u0005\u0004\u0000\u0000\u040f\u0410\u0005J\u0000\u0000\u0410\u0411"+
		"\u0005\u0005\u0000\u0000\u0411\u0412\u0005\u0005\u0000\u0000\u0412\u0426"+
		"\u0005\u0007\u0000\u0000\u0413\u0414\u0005G\u0000\u0000\u0414\u0415\u0005"+
		"K\u0000\u0000\u0415\u0416\u0005L\u0000\u0000\u0416\u0417\u0005\u0004\u0000"+
		"\u0000\u0417\u0418\u0005\u0005\u0000\u0000\u0418\u0426\u0005\u0007\u0000"+
		"\u0000\u0419\u041a\u0005G\u0000\u0000\u041a\u041b\u0005K\u0000\u0000\u041b"+
		"\u041c\u0005M\u0000\u0000\u041c\u041d\u0005\u0004\u0000\u0000\u041d\u041e"+
		"\u0005\u0005\u0000\u0000\u041e\u0426\u0005\u0007\u0000\u0000\u041f\u0420"+
		"\u0005G\u0000\u0000\u0420\u0421\u0005K\u0000\u0000\u0421\u0422\u0005N"+
		"\u0000\u0000\u0422\u0423\u0005\u0004\u0000\u0000\u0423\u0424\u0005\u0005"+
		"\u0000\u0000\u0424\u0426\u0005\u0007\u0000\u0000\u0425\u0409\u0001\u0000"+
		"\u0000\u0000\u0425\u0413\u0001\u0000\u0000\u0000\u0425\u0419\u0001\u0000"+
		"\u0000\u0000\u0425\u041f\u0001\u0000\u0000\u0000\u0426C\u0001\u0000\u0000"+
		"\u0000\u0427\u0428\u0005O\u0000\u0000\u0428\u0429\u0005\u0004\u0000\u0000"+
		"\u0429\u042a\u0005<\u0000\u0000\u042a\u042b\u0005$\u0000\u0000\u042b\u042c"+
		"\u0003:\u001d\u0000\u042c\u042d\u0005\u0005\u0000\u0000\u042d\u042e\u0005"+
		"\u0007\u0000\u0000\u042e\u0438\u0001\u0000\u0000\u0000\u042f\u0430\u0005"+
		"O\u0000\u0000\u0430\u0431\u0005\u0004\u0000\u0000\u0431\u0432\u0005<\u0000"+
		"\u0000\u0432\u0433\u0005$\u0000\u0000\u0433\u0434\u00038\u001c\u0000\u0434"+
		"\u0435\u0005\u0005\u0000\u0000\u0435\u0436\u0005\u0007\u0000\u0000\u0436"+
		"\u0438\u0001\u0000\u0000\u0000\u0437\u0427\u0001\u0000\u0000\u0000\u0437"+
		"\u042f\u0001\u0000\u0000\u0000\u0438E\u0001\u0000\u0000\u0000\u0439\u047a"+
		"\u00036\u001b\u0000\u043a\u047a\u00038\u001c\u0000\u043b\u047a\u0003:"+
		"\u001d\u0000\u043c\u047a\u0003<\u001e\u0000\u043d\u047a\u0003>\u001f\u0000"+
		"\u043e\u047a\u0003@ \u0000\u043f\u047a\u0003B!\u0000\u0440\u047a\u0003"+
		"D\"\u0000\u0441\u0443\u00036\u001b\u0000\u0442\u0441\u0001\u0000\u0000"+
		"\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0442\u0001\u0000\u0000"+
		"\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000"+
		"\u0000\u0446\u0447\u0003F#\u0000\u0447\u047a\u0001\u0000\u0000\u0000\u0448"+
		"\u044a\u00038\u001c\u0000\u0449\u0448\u0001\u0000\u0000\u0000\u044a\u044b"+
		"\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044b\u044c"+
		"\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e"+
		"\u0003F#\u0000\u044e\u047a\u0001\u0000\u0000\u0000\u044f\u0451\u0003:"+
		"\u001d\u0000\u0450\u044f\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000"+
		"\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000"+
		"\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0455\u0003F#\u0000"+
		"\u0455\u047a\u0001\u0000\u0000\u0000\u0456\u0458\u0003<\u001e\u0000\u0457"+
		"\u0456\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459"+
		"\u0457\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a"+
		"\u045b\u0001\u0000\u0000\u0000\u045b\u045c\u0003F#\u0000\u045c\u047a\u0001"+
		"\u0000\u0000\u0000\u045d\u045f\u0003>\u001f\u0000\u045e\u045d\u0001\u0000"+
		"\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u045e\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0462\u0001\u0000"+
		"\u0000\u0000\u0462\u0463\u0003F#\u0000\u0463\u047a\u0001\u0000\u0000\u0000"+
		"\u0464\u0466\u0003@ \u0000\u0465\u0464\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0001\u0000\u0000\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467\u0468"+
		"\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0003F#\u0000\u046a\u047a\u0001\u0000\u0000\u0000\u046b\u046d\u0003B"+
		"!\u0000\u046c\u046b\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000"+
		"\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000"+
		"\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0471\u0003F#\u0000\u0471"+
		"\u047a\u0001\u0000\u0000\u0000\u0472\u0474\u0003D\"\u0000\u0473\u0472"+
		"\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0473"+
		"\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0477"+
		"\u0001\u0000\u0000\u0000\u0477\u0478\u0003F#\u0000\u0478\u047a\u0001\u0000"+
		"\u0000\u0000\u0479\u0439\u0001\u0000\u0000\u0000\u0479\u043a\u0001\u0000"+
		"\u0000\u0000\u0479\u043b\u0001\u0000\u0000\u0000\u0479\u043c\u0001\u0000"+
		"\u0000\u0000\u0479\u043d\u0001\u0000\u0000\u0000\u0479\u043e\u0001\u0000"+
		"\u0000\u0000\u0479\u043f\u0001\u0000\u0000\u0000\u0479\u0440\u0001\u0000"+
		"\u0000\u0000\u0479\u0442\u0001\u0000\u0000\u0000\u0479\u0449\u0001\u0000"+
		"\u0000\u0000\u0479\u0450\u0001\u0000\u0000\u0000\u0479\u0457\u0001\u0000"+
		"\u0000\u0000\u0479\u045e\u0001\u0000\u0000\u0000\u0479\u0465\u0001\u0000"+
		"\u0000\u0000\u0479\u046c\u0001\u0000\u0000\u0000\u0479\u0473\u0001\u0000"+
		"\u0000\u0000\u047aG\u0001\u0000\u0000\u0000\u047b\u04cc\u0003\u000e\u0007"+
		"\u0000\u047c\u04cc\u0003\u0016\u000b\u0000\u047d\u04cc\u0003\u0010\b\u0000"+
		"\u047e\u04cc\u0003$\u0012\u0000\u047f\u04cc\u0003\u0018\f\u0000\u0480"+
		"\u04cc\u0003\u0012\t\u0000\u0481\u04cc\u0003\n\u0005\u0000\u0482\u04cc"+
		"\u0003\u001a\r\u0000\u0483\u04cc\u0003 \u0010\u0000\u0484\u04cc\u0003"+
		"&\u0013\u0000\u0485\u0487\u0003\u000e\u0007\u0000\u0486\u0485\u0001\u0000"+
		"\u0000\u0000\u0487\u0488\u0001\u0000\u0000\u0000\u0488\u0486\u0001\u0000"+
		"\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048a\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0003H$\u0000\u048b\u04cc\u0001\u0000\u0000\u0000"+
		"\u048c\u048e\u0003\u0016\u000b\u0000\u048d\u048c\u0001\u0000\u0000\u0000"+
		"\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u048d\u0001\u0000\u0000\u0000"+
		"\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000"+
		"\u0491\u0492\u0003H$\u0000\u0492\u04cc\u0001\u0000\u0000\u0000\u0493\u0495"+
		"\u0003\u0010\b\u0000\u0494\u0493\u0001\u0000\u0000\u0000\u0495\u0496\u0001"+
		"\u0000\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0496\u0497\u0001"+
		"\u0000\u0000\u0000\u0497\u0498\u0001\u0000\u0000\u0000\u0498\u0499\u0003"+
		"H$\u0000\u0499\u04cc\u0001\u0000\u0000\u0000\u049a\u049c\u0003$\u0012"+
		"\u0000\u049b\u049a\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000"+
		"\u0000\u049d\u049b\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000"+
		"\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u04a0\u0003H$\u0000\u04a0"+
		"\u04cc\u0001\u0000\u0000\u0000\u04a1\u04a3\u0003\u0018\f\u0000\u04a2\u04a1"+
		"\u0001\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5\u04a6"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a7\u0003H$\u0000\u04a7\u04cc\u0001\u0000"+
		"\u0000\u0000\u04a8\u04aa\u0003\u0012\t\u0000\u04a9\u04a8\u0001\u0000\u0000"+
		"\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ad\u04ae\u0003H$\u0000\u04ae\u04cc\u0001\u0000\u0000\u0000\u04af"+
		"\u04b1\u0003\n\u0005\u0000\u04b0\u04af\u0001\u0000\u0000\u0000\u04b1\u04b2"+
		"\u0001\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000\u04b2\u04b3"+
		"\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b5"+
		"\u0003H$\u0000\u04b5\u04cc\u0001\u0000\u0000\u0000\u04b6\u04b8\u0003\u001a"+
		"\r\u0000\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000"+
		"\u0000\u04b9\u04b7\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000"+
		"\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bc\u0003H$\u0000\u04bc"+
		"\u04cc\u0001\u0000\u0000\u0000\u04bd\u04bf\u0003 \u0010\u0000\u04be\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04be"+
		"\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c2"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c3\u0003H$\u0000\u04c3\u04cc\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c6\u0003&\u0013\u0000\u04c5\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000"+
		"\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000"+
		"\u0000\u04c9\u04ca\u0003H$\u0000\u04ca\u04cc\u0001\u0000\u0000\u0000\u04cb"+
		"\u047b\u0001\u0000\u0000\u0000\u04cb\u047c\u0001\u0000\u0000\u0000\u04cb"+
		"\u047d\u0001\u0000\u0000\u0000\u04cb\u047e\u0001\u0000\u0000\u0000\u04cb"+
		"\u047f\u0001\u0000\u0000\u0000\u04cb\u0480\u0001\u0000\u0000\u0000\u04cb"+
		"\u0481\u0001\u0000\u0000\u0000\u04cb\u0482\u0001\u0000\u0000\u0000\u04cb"+
		"\u0483\u0001\u0000\u0000\u0000\u04cb\u0484\u0001\u0000\u0000\u0000\u04cb"+
		"\u0486\u0001\u0000\u0000\u0000\u04cb\u048d\u0001\u0000\u0000\u0000\u04cb"+
		"\u0494\u0001\u0000\u0000\u0000\u04cb\u049b\u0001\u0000\u0000\u0000\u04cb"+
		"\u04a2\u0001\u0000\u0000\u0000\u04cb\u04a9\u0001\u0000\u0000\u0000\u04cb"+
		"\u04b0\u0001\u0000\u0000\u0000\u04cb\u04b7\u0001\u0000\u0000\u0000\u04cb"+
		"\u04be\u0001\u0000\u0000\u0000\u04cb\u04c5\u0001\u0000\u0000\u0000\u04cc"+
		"I\u0001\u0000\u0000\u0000\u04cd\u0526\u0003\u000e\u0007\u0000\u04ce\u0526"+
		"\u0003\u0016\u000b\u0000\u04cf\u0526\u0003\u0010\b\u0000\u04d0\u0526\u0003"+
		"$\u0012\u0000\u04d1\u0526\u0003\u0018\f\u0000\u04d2\u0526\u0003\u0012"+
		"\t\u0000\u04d3\u0526\u0003\n\u0005\u0000\u04d4\u0526\u0003\u001a\r\u0000"+
		"\u04d5\u0526\u0003 \u0010\u0000\u04d6\u0526\u0003&\u0013\u0000\u04d7\u0526"+
		"\u0003(\u0014\u0000\u04d8\u04da\u0003\u000e\u0007\u0000\u04d9\u04d8\u0001"+
		"\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04d9\u0001"+
		"\u0000\u0000\u0000\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001"+
		"\u0000\u0000\u0000\u04dd\u04de\u0003J%\u0000\u04de\u0526\u0001\u0000\u0000"+
		"\u0000\u04df\u04e1\u0003\u0016\u000b\u0000\u04e0\u04df\u0001\u0000\u0000"+
		"\u0000\u04e1\u04e2\u0001\u0000\u0000\u0000\u04e2\u04e0\u0001\u0000\u0000"+
		"\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000"+
		"\u0000\u04e4\u04e5\u0003J%\u0000\u04e5\u0526\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e8\u0003\u0010\b\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e9"+
		"\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04e9\u04ea"+
		"\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0003J%\u0000\u04ec\u0526\u0001\u0000\u0000\u0000\u04ed\u04ef\u0003$"+
		"\u0012\u0000\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000"+
		"\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f3\u0003J%\u0000"+
		"\u04f3\u0526\u0001\u0000\u0000\u0000\u04f4\u04f6\u0003\u0018\f\u0000\u04f5"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fa\u0003J%\u0000\u04fa\u0526\u0001"+
		"\u0000\u0000\u0000\u04fb\u04fd\u0003\u0012\t\u0000\u04fc\u04fb\u0001\u0000"+
		"\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u04fc\u0001\u0000"+
		"\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0500\u0001\u0000"+
		"\u0000\u0000\u0500\u0501\u0003J%\u0000\u0501\u0526\u0001\u0000\u0000\u0000"+
		"\u0502\u0504\u0003\n\u0005\u0000\u0503\u0502\u0001\u0000\u0000\u0000\u0504"+
		"\u0505\u0001\u0000\u0000\u0000\u0505\u0503\u0001\u0000\u0000\u0000\u0505"+
		"\u0506\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507"+
		"\u0508\u0003J%\u0000\u0508\u0526\u0001\u0000\u0000\u0000\u0509\u050b\u0003"+
		"\u001a\r\u0000\u050a\u0509\u0001\u0000\u0000\u0000\u050b\u050c\u0001\u0000"+
		"\u0000\u0000\u050c\u050a\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000"+
		"\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u050f\u0003J%\u0000"+
		"\u050f\u0526\u0001\u0000\u0000\u0000\u0510\u0512\u0003 \u0010\u0000\u0511"+
		"\u0510\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513"+
		"\u0511\u0001\u0000\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514"+
		"\u0515\u0001\u0000\u0000\u0000\u0515\u0516\u0003J%\u0000\u0516\u0526\u0001"+
		"\u0000\u0000\u0000\u0517\u0519\u0003&\u0013\u0000\u0518\u0517\u0001\u0000"+
		"\u0000\u0000\u0519\u051a\u0001\u0000\u0000\u0000\u051a\u0518\u0001\u0000"+
		"\u0000\u0000\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u051c\u0001\u0000"+
		"\u0000\u0000\u051c\u051d\u0003J%\u0000\u051d\u0526\u0001\u0000\u0000\u0000"+
		"\u051e\u0520\u0003(\u0014\u0000\u051f\u051e\u0001\u0000\u0000\u0000\u0520"+
		"\u0521\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000\u0000\u0000\u0521"+
		"\u0522\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000\u0523"+
		"\u0524\u0003J%\u0000\u0524\u0526\u0001\u0000\u0000\u0000\u0525\u04cd\u0001"+
		"\u0000\u0000\u0000\u0525\u04ce\u0001\u0000\u0000\u0000\u0525\u04cf\u0001"+
		"\u0000\u0000\u0000\u0525\u04d0\u0001\u0000\u0000\u0000\u0525\u04d1\u0001"+
		"\u0000\u0000\u0000\u0525\u04d2\u0001\u0000\u0000\u0000\u0525\u04d3\u0001"+
		"\u0000\u0000\u0000\u0525\u04d4\u0001\u0000\u0000\u0000\u0525\u04d5\u0001"+
		"\u0000\u0000\u0000\u0525\u04d6\u0001\u0000\u0000\u0000\u0525\u04d7\u0001"+
		"\u0000\u0000\u0000\u0525\u04d9\u0001\u0000\u0000\u0000\u0525\u04e0\u0001"+
		"\u0000\u0000\u0000\u0525\u04e7\u0001\u0000\u0000\u0000\u0525\u04ee\u0001"+
		"\u0000\u0000\u0000\u0525\u04f5\u0001\u0000\u0000\u0000\u0525\u04fc\u0001"+
		"\u0000\u0000\u0000\u0525\u0503\u0001\u0000\u0000\u0000\u0525\u050a\u0001"+
		"\u0000\u0000\u0000\u0525\u0511\u0001\u0000\u0000\u0000\u0525\u0518\u0001"+
		"\u0000\u0000\u0000\u0525\u051f\u0001\u0000\u0000\u0000\u0526K\u0001\u0000"+
		"\u0000\u0000TOZaeu}\u0085\u0088\u00ec\u0136\u0148\u014e\u0155\u015a\u015f"+
		"\u0164\u0166\u017e\u0196\u01a0\u01ad\u01b2\u01bb\u01c8\u01ce\u01d6\u01e1"+
		"\u01f3\u01fb\u01fd\u0209\u0217\u0219\u02da\u02ee\u02f6\u02fe\u0306\u030e"+
		"\u0316\u0318\u0324\u0329\u0331\u0393\u03a5\u03cb\u03d1\u03f5\u0407\u0425"+
		"\u0437\u0444\u044b\u0452\u0459\u0460\u0467\u046e\u0475\u0479\u0488\u048f"+
		"\u0496\u049d\u04a4\u04ab\u04b2\u04b9\u04c0\u04c7\u04cb\u04db\u04e2\u04e9"+
		"\u04f0\u04f7\u04fe\u0505\u050c\u0513\u051a\u0521\u0525";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}