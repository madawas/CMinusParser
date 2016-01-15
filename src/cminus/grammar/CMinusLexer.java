// Generated from /home/madawa/cse/Sem7/compiler/CMinusCompiler/src/cminus/grammar/CMinus.g4 by ANTLR 4.5.1
package cminus.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMinusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, IF=2, INT=3, RETURN=4, VOID=5, WHILE=6, PLUS=7, MINUS=8, TIMES=9, 
		DIVIDE=10, LESS=11, LESS_EQUAL=12, GREATER=13, GREATER_EQUAL=14, EQUAL=15, 
		NOT_EQUAL=16, ASSIGN=17, SEMICOLON=18, COMMA=19, LEFT_PAREN=20, RIGHT_PAREN=21, 
		LEFT_BRACKET=22, RIGHT_BRACKET=23, LEFT_BRACE=24, RIGHT_BRACE=25, NUM=26, 
		ID=27, WHITESPACE=28, NEWLINE=29, BLOCKCOMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ELSE", "IF", "INT", "RETURN", "VOID", "WHILE", "PLUS", "MINUS", "TIMES", 
		"DIVIDE", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", 
		"ASSIGN", "SEMICOLON", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LETTER", "DIGIT", "NUM", 
		"ID", "WHITESPACE", "NEWLINE", "BLOCKCOMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'else'", "'if'", "'int'", "'return'", "'void'", "'while'", "'+'", 
		"'-'", "'*'", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'='", 
		"';'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ELSE", "IF", "INT", "RETURN", "VOID", "WHILE", "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", "EQUAL", 
		"NOT_EQUAL", "ASSIGN", "SEMICOLON", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "NUM", "ID", 
		"WHITESPACE", "NEWLINE", "BLOCKCOMMENT"
	};
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


	public CMinusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00bb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\7\35\u0092\n\35\f\35\16\35\u0095\13\35\3\36\3\36\7\36\u0099\n\36\f"+
		"\36\16\36\u009c\13\36\3\37\6\37\u009f\n\37\r\37\16\37\u00a0\3\37\3\37"+
		"\3 \3 \5 \u00a7\n \3 \5 \u00aa\n \3 \3 \3!\3!\3!\3!\7!\u00b2\n!\f!\16"+
		"!\u00b5\13!\3!\3!\3!\3!\3!\3\u00b3\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\2\67\29\34;\35=\36?\37A \3\2\5\4\2C\\c|\3\2\62;\4"+
		"\2\13\13\"\"\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5H\3\2\2\2\7K\3\2\2\2\tO\3\2\2"+
		"\2\13V\3\2\2\2\r[\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2"+
		"\2\2\27i\3\2\2\2\31k\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37s\3\2\2\2!v\3\2"+
		"\2\2#y\3\2\2\2%{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0083"+
		"\3\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63\u0089\3\2\2\2\65\u008b\3\2"+
		"\2\2\67\u008d\3\2\2\29\u008f\3\2\2\2;\u0096\3\2\2\2=\u009e\3\2\2\2?\u00a9"+
		"\3\2\2\2A\u00ad\3\2\2\2CD\7g\2\2DE\7n\2\2EF\7u\2\2FG\7g\2\2G\4\3\2\2\2"+
		"HI\7k\2\2IJ\7h\2\2J\6\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\b\3\2\2\2OP"+
		"\7t\2\2PQ\7g\2\2QR\7v\2\2RS\7w\2\2ST\7t\2\2TU\7p\2\2U\n\3\2\2\2VW\7x\2"+
		"\2WX\7q\2\2XY\7k\2\2YZ\7f\2\2Z\f\3\2\2\2[\\\7y\2\2\\]\7j\2\2]^\7k\2\2"+
		"^_\7n\2\2_`\7g\2\2`\16\3\2\2\2ab\7-\2\2b\20\3\2\2\2cd\7/\2\2d\22\3\2\2"+
		"\2ef\7,\2\2f\24\3\2\2\2gh\7\61\2\2h\26\3\2\2\2ij\7>\2\2j\30\3\2\2\2kl"+
		"\7>\2\2lm\7?\2\2m\32\3\2\2\2no\7@\2\2o\34\3\2\2\2pq\7@\2\2qr\7?\2\2r\36"+
		"\3\2\2\2st\7?\2\2tu\7?\2\2u \3\2\2\2vw\7#\2\2wx\7?\2\2x\"\3\2\2\2yz\7"+
		"?\2\2z$\3\2\2\2{|\7=\2\2|&\3\2\2\2}~\7.\2\2~(\3\2\2\2\177\u0080\7*\2\2"+
		"\u0080*\3\2\2\2\u0081\u0082\7+\2\2\u0082,\3\2\2\2\u0083\u0084\7]\2\2\u0084"+
		".\3\2\2\2\u0085\u0086\7_\2\2\u0086\60\3\2\2\2\u0087\u0088\7}\2\2\u0088"+
		"\62\3\2\2\2\u0089\u008a\7\177\2\2\u008a\64\3\2\2\2\u008b\u008c\t\2\2\2"+
		"\u008c\66\3\2\2\2\u008d\u008e\t\3\2\2\u008e8\3\2\2\2\u008f\u0093\5\67"+
		"\34\2\u0090\u0092\5\67\34\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094:\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\u0096\u009a\5\65\33\2\u0097\u0099\5\65\33\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b<\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009d\u009f\t\4\2\2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\b\37\2\2\u00a3>\3\2\2\2\u00a4\u00a6\7\17\2\2\u00a5\u00a7\7\f\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa"+
		"\7\f\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b \2\2\u00ac@\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7,\2\2\u00af"+
		"\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\b!\2\2\u00baB\3\2\2\2\t\2\u0093\u009a\u00a0\u00a6\u00a9"+
		"\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}