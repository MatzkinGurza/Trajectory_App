// Generated from c:/Documents/Poli/PI7/Trajectory_App/GCode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GCODE=1, M30=2, DIR=3, DELTA=4, P=5, N=6, T=7, VAR=8, FUNC=9, FLOAT=10, 
		INT=11, ID=12, MINUS=13, ASSIGN=14, LBRACE=15, RBRACE=16, LPAREN=17, RPAREN=18, 
		COMMA=19, LINE_END=20, WS=21;
	public static final int
		RULE_program = 0, RULE_programEnd = 1, RULE_declaration = 2, RULE_statement = 3, 
		RULE_detail = 4, RULE_lineNumber = 5, RULE_codFunc = 6, RULE_coord = 7, 
		RULE_delta_center = 8, RULE_stop_ms = 9, RULE_variable = 10, RULE_function = 11, 
		RULE_parameterList = 12, RULE_parameter = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programEnd", "declaration", "statement", "detail", "lineNumber", 
			"codFunc", "coord", "delta_center", "stop_ms", "variable", "function", 
			"parameterList", "parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'M30'", null, null, "'P'", "'N'", "'T'", "'VAR'", "'FUNC'", 
			null, null, null, "'-'", "'='", "'{'", "'}'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GCODE", "M30", "DIR", "DELTA", "P", "N", "T", "VAR", "FUNC", "FLOAT", 
			"INT", "ID", "MINUS", "ASSIGN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"COMMA", "LINE_END", "WS"
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
	public String getGrammarFileName() { return "GCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramEndContext programEnd() {
			return getRuleContext(ProgramEndContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 832L) != 0)) {
				{
				{
				setState(28);
				declaration();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			programEnd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramEndContext extends ParserRuleContext {
		public TerminalNode M30() { return getToken(GCodeParser.M30, 0); }
		public ProgramEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programEnd; }
	}

	public final ProgramEndContext programEnd() throws RecognitionException {
		ProgramEndContext _localctx = new ProgramEndContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(M30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				variable();
				}
				break;
			case N:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				statement();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public CodFuncContext codFunc() {
			return getRuleContext(CodFuncContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(GCodeParser.LINE_END, 0); }
		public List<DetailContext> detail() {
			return getRuleContexts(DetailContext.class);
		}
		public DetailContext detail(int i) {
			return getRuleContext(DetailContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			lineNumber();
			setState(44);
			codFunc();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(45);
				detail();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(LINE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DetailContext extends ParserRuleContext {
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public Delta_centerContext delta_center() {
			return getRuleContext(Delta_centerContext.class,0);
		}
		public Stop_msContext stop_ms() {
			return getRuleContext(Stop_msContext.class,0);
		}
		public DetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detail; }
	}

	public final DetailContext detail() throws RecognitionException {
		DetailContext _localctx = new DetailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_detail);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				coord();
				}
				break;
			case DELTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				delta_center();
				}
				break;
			case P:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				stop_ms();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineNumberContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(GCodeParser.N, 0); }
		public TerminalNode INT() { return getToken(GCodeParser.INT, 0); }
		public LineNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumber; }
	}

	public final LineNumberContext lineNumber() throws RecognitionException {
		LineNumberContext _localctx = new LineNumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(N);
			setState(59);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodFuncContext extends ParserRuleContext {
		public TerminalNode GCODE() { return getToken(GCodeParser.GCODE, 0); }
		public CodFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codFunc; }
	}

	public final CodFuncContext codFunc() throws RecognitionException {
		CodFuncContext _localctx = new CodFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(GCODE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoordContext extends ParserRuleContext {
		public TerminalNode DIR() { return getToken(GCodeParser.DIR, 0); }
		public TerminalNode FLOAT() { return getToken(GCodeParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GCodeParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GCodeParser.MINUS, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DIR);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(64);
				match(MINUS);
				}
			}

			setState(67);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Delta_centerContext extends ParserRuleContext {
		public TerminalNode DELTA() { return getToken(GCodeParser.DELTA, 0); }
		public TerminalNode FLOAT() { return getToken(GCodeParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GCodeParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GCodeParser.MINUS, 0); }
		public Delta_centerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta_center; }
	}

	public final Delta_centerContext delta_center() throws RecognitionException {
		Delta_centerContext _localctx = new Delta_centerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delta_center);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(DELTA);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(70);
				match(MINUS);
				}
			}

			setState(73);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stop_msContext extends ParserRuleContext {
		public TerminalNode P() { return getToken(GCodeParser.P, 0); }
		public TerminalNode INT() { return getToken(GCodeParser.INT, 0); }
		public Stop_msContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop_ms; }
	}

	public final Stop_msContext stop_ms() throws RecognitionException {
		Stop_msContext _localctx = new Stop_msContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stop_ms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(P);
			setState(76);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GCodeParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GCodeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GCodeParser.ASSIGN, 0); }
		public TerminalNode LINE_END() { return getToken(GCodeParser.LINE_END, 0); }
		public TerminalNode FLOAT() { return getToken(GCodeParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GCodeParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GCodeParser.MINUS, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(VAR);
			setState(79);
			match(ID);
			setState(80);
			match(ASSIGN);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(81);
				match(MINUS);
				}
			}

			setState(84);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			match(LINE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GCodeParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(GCodeParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GCodeParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GCodeParser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FUNC);
			setState(88);
			match(ID);
			setState(89);
			match(LPAREN);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(90);
				parameterList();
				}
			}

			setState(93);
			match(RPAREN);
			setState(94);
			match(LBRACE);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 832L) != 0)) {
				{
				{
				setState(95);
				declaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GCodeParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			parameter();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				parameter();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GCodeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GCodeParser.ASSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(GCodeParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GCodeParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GCodeParser.MINUS, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(112);
				match(ASSIGN);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(113);
					match(MINUS);
					}
				}

				setState(116);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

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

	public static final String _serializedATN =
		"\u0004\u0001\u0015x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00049\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007B\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\bH\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nS\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\\\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000ba\b\u000b\n\u000b\f\u000bd\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\fk\b\f\n"+
		"\f\f\fn\t\f\u0001\r\u0001\r\u0001\r\u0003\rs\b\r\u0001\r\u0003\rv\b\r"+
		"\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u0000\u0001\u0001\u0000\n\u000bw\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004)\u0001\u0000"+
		"\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000"+
		"\n:\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000\u0000\u000e?\u0001\u0000"+
		"\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012K\u0001\u0000\u0000\u0000"+
		"\u0014N\u0001\u0000\u0000\u0000\u0016W\u0001\u0000\u0000\u0000\u0018g"+
		"\u0001\u0000\u0000\u0000\u001ao\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003"+
		"\u0002\u0001\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0005\u0002\u0000"+
		"\u0000%\u0003\u0001\u0000\u0000\u0000&*\u0003\u0014\n\u0000\'*\u0003\u0006"+
		"\u0003\u0000(*\u0003\u0016\u000b\u0000)&\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000"+
		"\u0000+,\u0003\n\u0005\u0000,0\u0003\f\u0006\u0000-/\u0003\b\u0004\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000034\u0005\u0014\u0000\u00004\u0007\u0001\u0000\u0000\u0000"+
		"59\u0003\u000e\u0007\u000069\u0003\u0010\b\u000079\u0003\u0012\t\u0000"+
		"85\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000"+
		"\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u0006\u0000\u0000;<\u0005\u000b"+
		"\u0000\u0000<\u000b\u0001\u0000\u0000\u0000=>\u0005\u0001\u0000\u0000"+
		">\r\u0001\u0000\u0000\u0000?A\u0005\u0003\u0000\u0000@B\u0005\r\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0007\u0000\u0000\u0000D\u000f\u0001\u0000\u0000\u0000"+
		"EG\u0005\u0004\u0000\u0000FH\u0005\r\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0007\u0000\u0000"+
		"\u0000J\u0011\u0001\u0000\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0005"+
		"\u000b\u0000\u0000M\u0013\u0001\u0000\u0000\u0000NO\u0005\b\u0000\u0000"+
		"OP\u0005\f\u0000\u0000PR\u0005\u000e\u0000\u0000QS\u0005\r\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0007\u0000\u0000\u0000UV\u0005\u0014\u0000\u0000V\u0015\u0001"+
		"\u0000\u0000\u0000WX\u0005\t\u0000\u0000XY\u0005\f\u0000\u0000Y[\u0005"+
		"\u0011\u0000\u0000Z\\\u0003\u0018\f\u0000[Z\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0012\u0000"+
		"\u0000^b\u0005\u000f\u0000\u0000_a\u0003\u0004\u0002\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"ef\u0005\u0010\u0000\u0000f\u0017\u0001\u0000\u0000\u0000gl\u0003\u001a"+
		"\r\u0000hi\u0005\u0013\u0000\u0000ik\u0003\u001a\r\u0000jh\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000m\u0019\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000ou\u0005\f\u0000\u0000pr\u0005\u000e\u0000\u0000qs\u0005\r\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0007\u0000\u0000\u0000up\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000v\u001b\u0001\u0000\u0000\u0000\f\u001f)08AGR[blru";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}