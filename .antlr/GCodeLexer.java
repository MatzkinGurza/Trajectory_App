// Generated from c:/Documents/Poli/PI7/Trajectory_App/GCode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GCODE=1, M30=2, DIR=3, DELTA=4, P=5, N=6, T=7, VAR=8, FUNC=9, FLOAT=10, 
		INT=11, ID=12, MINUS=13, ASSIGN=14, LBRACE=15, RBRACE=16, LPAREN=17, RPAREN=18, 
		COMMA=19, LINE_END=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GCODE", "M30", "DIR", "DELTA", "P", "N", "T", "VAR", "FUNC", "FLOAT", 
			"INT", "ID", "MINUS", "ASSIGN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"COMMA", "LINE_END", "WS"
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


	public GCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tU\b\t\u000b\t\f\tV\u0001\t\u0001"+
		"\t\u0004\t[\b\t\u000b\t\f\t\\\u0001\n\u0004\n`\b\n\u000b\n\f\na\u0001"+
		"\u000b\u0001\u000b\u0005\u000bf\b\u000b\n\u000b\f\u000bi\t\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0003\u0013z\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0004\u0014\u007f\b\u0014\u000b\u0014\f\u0014\u0080\u0001\u0014\u0001"+
		"\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0003\u0000\t\n\r\r  \u008d\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0001:\u0001\u0000\u0000\u0000\u0003"+
		"<\u0001\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007B\u0001"+
		"\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000"+
		"\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011"+
		"N\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015_\u0001"+
		"\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000"+
		"\u0000\u001bl\u0001\u0000\u0000\u0000\u001dn\u0001\u0000\u0000\u0000\u001f"+
		"p\u0001\u0000\u0000\u0000!r\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000"+
		"\u0000%v\u0001\u0000\u0000\u0000\'y\u0001\u0000\u0000\u0000)~\u0001\u0000"+
		"\u0000\u0000+,\u0005G\u0000\u0000,-\u00050\u0000\u0000-;\u00050\u0000"+
		"\u0000./\u0005G\u0000\u0000/0\u00050\u0000\u00000;\u00051\u0000\u0000"+
		"12\u0005G\u0000\u000023\u00050\u0000\u00003;\u00052\u0000\u000045\u0005"+
		"G\u0000\u000056\u00050\u0000\u00006;\u00053\u0000\u000078\u0005G\u0000"+
		"\u000089\u00050\u0000\u00009;\u00054\u0000\u0000:+\u0001\u0000\u0000\u0000"+
		":.\u0001\u0000\u0000\u0000:1\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000"+
		"\u0000:7\u0001\u0000\u0000\u0000;\u0002\u0001\u0000\u0000\u0000<=\u0005"+
		"M\u0000\u0000=>\u00053\u0000\u0000>?\u00050\u0000\u0000?\u0004\u0001\u0000"+
		"\u0000\u0000@A\u0002XY\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0002IJ"+
		"\u0000C\b\u0001\u0000\u0000\u0000DE\u0005P\u0000\u0000E\n\u0001\u0000"+
		"\u0000\u0000FG\u0005N\u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005T"+
		"\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005V\u0000\u0000KL\u0005"+
		"A\u0000\u0000LM\u0005R\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NO\u0005"+
		"F\u0000\u0000OP\u0005U\u0000\u0000PQ\u0005N\u0000\u0000QR\u0005C\u0000"+
		"\u0000R\u0012\u0001\u0000\u0000\u0000SU\u0007\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0005.\u0000\u0000"+
		"Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0014\u0001"+
		"\u0000\u0000\u0000^`\u0007\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b\u0016\u0001\u0000\u0000\u0000cg\u0007\u0001\u0000\u0000df\u0007"+
		"\u0002\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0018\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005-\u0000\u0000k\u001a\u0001"+
		"\u0000\u0000\u0000lm\u0005=\u0000\u0000m\u001c\u0001\u0000\u0000\u0000"+
		"no\u0005{\u0000\u0000o\u001e\u0001\u0000\u0000\u0000pq\u0005}\u0000\u0000"+
		"q \u0001\u0000\u0000\u0000rs\u0005(\u0000\u0000s\"\u0001\u0000\u0000\u0000"+
		"tu\u0005)\u0000\u0000u$\u0001\u0000\u0000\u0000vw\u0005,\u0000\u0000w"+
		"&\u0001\u0000\u0000\u0000xz\u0005\r\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\n\u0000\u0000"+
		"|(\u0001\u0000\u0000\u0000}\u007f\u0007\u0003\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0006\u0014\u0000\u0000\u0083*\u0001\u0000\u0000\u0000"+
		"\b\u0000:V\\agy\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}