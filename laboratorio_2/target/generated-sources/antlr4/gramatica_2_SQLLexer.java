// Generated from gramatica_2_SQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatica_2_SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, UPDATE=3, ALL=4, DISTINCT=5, FROM=6, WHERE=7, NOT=8, 
		OR=9, AND=10, SET=11, ASC=12, DESC=13, ID=14, ORDER_BY=15, PUNTO_COMA=16, 
		ASTERISCO=17, COMA=18, IGUAL=19, COMILLA=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"SELECT", "DELETE", "UPDATE", "ALL", "DISTINCT", "FROM", "WHERE", "NOT", 
		"OR", "AND", "SET", "ASC", "DESC", "ID", "ORDER_BY", "PUNTO_COMA", "ASTERISCO", 
		"COMA", "IGUAL", "COMILLA", "WS"
	};


	public gramatica_2_SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica_2_SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17u\n"+
		"\17\f\17\16\17x\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u008e\n\26\r\26"+
		"\16\26\u008f\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\5\2"+
		"C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\u0094\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\64\3\2\2\2\7;\3\2\2\2\tB\3\2"+
		"\2\2\13F\3\2\2\2\rO\3\2\2\2\17T\3\2\2\2\21Z\3\2\2\2\23^\3\2\2\2\25a\3"+
		"\2\2\2\27e\3\2\2\2\31i\3\2\2\2\33m\3\2\2\2\35r\3\2\2\2\37y\3\2\2\2!\u0082"+
		"\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2"+
		"+\u008d\3\2\2\2-.\7U\2\2./\7G\2\2/\60\7N\2\2\60\61\7G\2\2\61\62\7E\2\2"+
		"\62\63\7V\2\2\63\4\3\2\2\2\64\65\7F\2\2\65\66\7G\2\2\66\67\7N\2\2\678"+
		"\7G\2\289\7V\2\29:\7G\2\2:\6\3\2\2\2;<\7W\2\2<=\7R\2\2=>\7F\2\2>?\7C\2"+
		"\2?@\7V\2\2@A\7G\2\2A\b\3\2\2\2BC\7C\2\2CD\7N\2\2DE\7N\2\2E\n\3\2\2\2"+
		"FG\7F\2\2GH\7K\2\2HI\7U\2\2IJ\7V\2\2JK\7K\2\2KL\7P\2\2LM\7E\2\2MN\7V\2"+
		"\2N\f\3\2\2\2OP\7H\2\2PQ\7T\2\2QR\7Q\2\2RS\7O\2\2S\16\3\2\2\2TU\7Y\2\2"+
		"UV\7J\2\2VW\7G\2\2WX\7T\2\2XY\7G\2\2Y\20\3\2\2\2Z[\7P\2\2[\\\7Q\2\2\\"+
		"]\7V\2\2]\22\3\2\2\2^_\7Q\2\2_`\7T\2\2`\24\3\2\2\2ab\7C\2\2bc\7P\2\2c"+
		"d\7F\2\2d\26\3\2\2\2ef\7U\2\2fg\7G\2\2gh\7V\2\2h\30\3\2\2\2ij\7C\2\2j"+
		"k\7U\2\2kl\7E\2\2l\32\3\2\2\2mn\7F\2\2no\7G\2\2op\7U\2\2pq\7E\2\2q\34"+
		"\3\2\2\2rv\t\2\2\2su\t\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w"+
		"\36\3\2\2\2xv\3\2\2\2yz\7Q\2\2z{\7T\2\2{|\7F\2\2|}\7G\2\2}~\7T\2\2~\177"+
		"\7\"\2\2\177\u0080\7D\2\2\u0080\u0081\7[\2\2\u0081 \3\2\2\2\u0082\u0083"+
		"\7=\2\2\u0083\"\3\2\2\2\u0084\u0085\7,\2\2\u0085$\3\2\2\2\u0086\u0087"+
		"\7.\2\2\u0087&\3\2\2\2\u0088\u0089\7?\2\2\u0089(\3\2\2\2\u008a\u008b\7"+
		")\2\2\u008b*\3\2\2\2\u008c\u008e\t\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\26\2\2\u0092,\3\2\2\2\5\2v\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}