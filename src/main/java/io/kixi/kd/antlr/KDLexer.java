// Generated from /Users/danielleuck/projects/Ki/JVM/Ki.KD-JVM/src/main/kotlin/io/kixi/kd/KDLexer.g4 by ANTLR 4.8
package io.kixi.kd.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, TRUE=2, FALSE=3, URL=4, FloatLiteral=5, DoubleLiteral=6, DecimalLiteral=7, 
		IntegerLiteral=8, HexLiteral=9, BinLiteral=10, LongLiteral=11, Version=12, 
		SimpleString=13, RawString=14, BlockString=15, BlockRawString=16, BlockRawAltString=17, 
		CharLiteral=18, CompoundDuration=19, DayDuration=20, HourDuration=21, 
		MinuteDuration=22, SecondDuration=23, MillisecondDuration=24, NanosecondDuration=25, 
		Date=26, Time=27, TimeZone=28, IntegerQuantityLiteral=29, DecimalQuantityLiteral=30, 
		InclusiveRangeOp=31, ExclusiveRangeOp=32, ExclusiveLeftOp=33, ExclusiveRightOp=34, 
		DOT=35, COLON=36, SEMICOLON=37, EQUALS=38, OPEN=39, CLOSE=40, LPAREN=41, 
		RPAREN=42, LSQUARE=43, RSQUARE=44, COMMA=45, SLASH=46, DASH=47, AT=48, 
		PLUS=49, UNDERSCORE=50, Blob=51, ID=52, BlockComment=53, LineComment=54, 
		WS=55, NL=56;
	public static final int
		WHITESPACE=2, COMMENTS=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WHITESPACE", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NULL", "TRUE", "FALSE", "URL", "DecDigit", "DecDigitNoZero", "DecDigitOrSeparator", 
			"DecDigits", "DoubleExponent", "NonZeroNumberPart", "NumberPart", "ASCIIAlpha", 
			"FloatLiteral", "DoubleLiteral", "DecimalLiteral", "IntegerLiteral", 
			"HexDigit", "HexDigitOrSeparator", "HexLiteral", "BinDigit", "BinDigitOrSeparator", 
			"BinLiteral", "LongLiteral", "Number", "Version", "VersionQualifierAndNum", 
			"SimpleString", "RawString", "BlockString", "BlockRawString", "BlockRawAltString", 
			"UniCharacterLiteral", "EscapedIdentifier", "Esc", "Unicode", "SafeCodePoint", 
			"CharSafeCodePoint", "CharLiteral", "DAYS", "HOURS", "MINUTES", "SECONDS", 
			"MILLIS", "NANOS", "CompoundDuration", "DayDuration", "HourDuration", 
			"MinuteDuration", "SecondDuration", "MillisecondDuration", "NanosecondDuration", 
			"Date", "Time", "TimeZone", "IntegerQuantityLiteral", "DecimalQuantityLiteral", 
			"InclusiveRangeOp", "ExclusiveRangeOp", "ExclusiveLeftOp", "ExclusiveRightOp", 
			"DOT", "COLON", "SEMICOLON", "EQUALS", "OPEN", "CLOSE", "LPAREN", "RPAREN", 
			"LSQUARE", "RSQUARE", "COMMA", "SLASH", "DASH", "AT", "PLUS", "UNDERSCORE", 
			"Blob", "BLOB_DATA", "IDStart", "IDChar", "VersionQualifier", "ID", "BlockComment", 
			"LineComment", "WS", "NL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'..'", "'<..<'", "'<..'", 
			"'..<'", "'.'", "':'", "';'", "'='", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "','", "'/'", "'-'", "'@'", "'+'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL", "TRUE", "FALSE", "URL", "FloatLiteral", "DoubleLiteral", 
			"DecimalLiteral", "IntegerLiteral", "HexLiteral", "BinLiteral", "LongLiteral", 
			"Version", "SimpleString", "RawString", "BlockString", "BlockRawString", 
			"BlockRawAltString", "CharLiteral", "CompoundDuration", "DayDuration", 
			"HourDuration", "MinuteDuration", "SecondDuration", "MillisecondDuration", 
			"NanosecondDuration", "Date", "Time", "TimeZone", "IntegerQuantityLiteral", 
			"DecimalQuantityLiteral", "InclusiveRangeOp", "ExclusiveRangeOp", "ExclusiveLeftOp", 
			"ExclusiveRightOp", "DOT", "COLON", "SEMICOLON", "EQUALS", "OPEN", "CLOSE", 
			"LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "COMMA", "SLASH", "DASH", "AT", 
			"PLUS", "UNDERSCORE", "Blob", "ID", "BlockComment", "LineComment", "WS", 
			"NL"
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


	public KDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KDLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u036b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b7\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u00bf\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c9"+
		"\n\4\3\5\3\5\7\5\u00cd\n\5\f\5\16\5\u00d0\13\5\3\5\3\5\3\5\6\5\u00d5\n"+
		"\5\r\5\16\5\u00d6\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u00df\n\b\3\t\3\t\7\t\u00e3"+
		"\n\t\f\t\16\t\u00e6\13\t\3\t\3\t\3\t\5\t\u00eb\n\t\3\n\3\n\5\n\u00ef\n"+
		"\n\3\n\3\n\3\13\3\13\7\13\u00f5\n\13\f\13\16\13\u00f8\13\13\3\13\3\13"+
		"\3\13\5\13\u00fd\n\13\3\f\3\f\7\f\u0101\n\f\f\f\16\f\u0104\13\f\3\f\3"+
		"\f\3\f\5\f\u0109\n\f\3\r\3\r\3\16\5\16\u010e\n\16\3\16\5\16\u0111\n\16"+
		"\3\16\3\16\3\16\5\16\u0116\n\16\3\16\3\16\3\16\5\16\u011b\n\16\3\16\3"+
		"\16\5\16\u011f\n\16\3\16\3\16\5\16\u0123\n\16\3\17\5\17\u0126\n\17\3\17"+
		"\5\17\u0129\n\17\3\17\3\17\3\17\5\17\u012e\n\17\3\17\5\17\u0131\n\17\3"+
		"\17\5\17\u0134\n\17\3\17\3\17\3\17\5\17\u0139\n\17\3\17\5\17\u013c\n\17"+
		"\3\17\3\17\3\17\5\17\u0141\n\17\3\20\5\20\u0144\n\20\3\20\5\20\u0147\n"+
		"\20\3\20\3\20\3\20\5\20\u014c\n\20\3\20\3\20\3\20\3\20\5\20\u0152\n\20"+
		"\3\20\5\20\u0155\n\20\3\20\3\20\5\20\u0159\n\20\3\20\3\20\3\20\3\20\5"+
		"\20\u015f\n\20\5\20\u0161\n\20\3\21\5\21\u0164\n\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\5\23\u016c\n\23\3\24\5\24\u016f\n\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0175\n\24\f\24\16\24\u0178\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u017f"+
		"\n\24\3\25\3\25\3\26\3\26\5\26\u0185\n\26\3\27\5\27\u0188\n\27\3\27\3"+
		"\27\3\27\3\27\7\27\u018e\n\27\f\27\16\27\u0191\13\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u0198\n\27\3\30\3\30\3\30\5\30\u019d\n\30\3\30\3\30\3\31"+
		"\3\31\5\31\u01a3\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01b6\n\32\5\32\u01b8\n\32\3"+
		"\33\3\33\5\33\u01bc\n\33\3\33\5\33\u01bf\n\33\3\34\3\34\3\34\7\34\u01c4"+
		"\n\34\f\34\16\34\u01c7\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u01cf"+
		"\n\35\f\35\16\35\u01d2\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01e3\n\36\f\36\16\36\u01e6\13"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u01fa\n\37\f\37\16\37\u01fd\13\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \7 \u0205\n \f \16 \u0208\13 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\5#\u0218\n#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3\'\5\'\u0227\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u0232\n(\3)\3)"+
		"\3*\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\5.\u0243\n.\3.\3.\3.\5.\u0248"+
		"\n.\3.\3.\5.\u024c\n.\3.\3.\3.\5.\u0251\n.\3.\3.\3.\3.\3.\5.\u0258\n."+
		"\5.\u025a\n.\3.\5.\u025d\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\5\65\u0272\n\65\3\65\3\65"+
		"\3\65\3\65\5\65\u0278\n\65\3\65\3\65\3\65\5\65\u027d\n\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0288\n\66\5\66\u028a\n\66\5\66"+
		"\u028c\n\66\3\67\3\67\3\67\5\67\u0291\n\67\3\67\3\67\3\67\3\67\5\67\u0297"+
		"\n\67\3\67\3\67\3\67\5\67\u029c\n\67\3\67\3\67\3\67\3\67\5\67\u02a2\n"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02ab\n\67\3\67\3\67\3\67"+
		"\3\67\6\67\u02b1\n\67\r\67\16\67\u02b2\5\67\u02b5\n\67\5\67\u02b7\n\67"+
		"\38\58\u02ba\n8\38\38\38\38\58\u02c0\n8\39\59\u02c3\n9\39\39\39\39\39"+
		"\39\59\u02cb\n9\39\59\u02ce\n9\39\39\39\59\u02d3\n9\39\39\39\59\u02d8"+
		"\n9\39\59\u02db\n9\39\39\39\39\39\59\u02e2\n9\59\u02e4\n9\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3O\3O\7O\u0320\nO\fO\16O\u0323\13O\3O\3O\7O\u0327\n"+
		"O\fO\16O\u032a\13O\6O\u032c\nO\rO\16O\u032d\3O\3O\3P\3P\3Q\3Q\3R\6R\u0337"+
		"\nR\rR\16R\u0338\3S\3S\7S\u033d\nS\fS\16S\u0340\13S\3T\3T\3T\3T\3T\7T"+
		"\u0347\nT\fT\16T\u034a\13T\3T\3T\3T\3T\3T\3U\3U\3U\5U\u0354\nU\3U\7U\u0357"+
		"\nU\fU\16U\u035a\13U\3U\3U\3V\3V\3V\6V\u0361\nV\rV\16V\u0362\3V\3V\3W"+
		"\6W\u0368\nW\rW\16W\u0369\3\u0348\2X\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\7\35\b\37\t!\n#\2%\2\'\13)\2+\2-\f/\r\61\2\63"+
		"\16\65\2\67\179\20;\21=\22?\23A\2C\2E\2G\2I\2K\2M\24O\2Q\2S\2U\2W\2Y\2"+
		"[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081"+
		"(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095"+
		"\62\u0097\63\u0099\64\u009b\65\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\66"+
		"\u00a7\67\u00a98\u00ab9\u00ad:\3\2\35\4\2C\\c|\7\2--/\60\62;C\\c|\n\2"+
		"##%=??A]__aac|\u0080\u0080\4\2GGgg\4\2--//\4\2HHhh\4\2FFff\5\2\62;CHc"+
		"h\4\2ZZzz\3\2\62\63\4\2DDdd\6\2\f\f\17\17$$^^\5\2\f\f\17\17$$\4\2\13\f"+
		"\17\17\3\2$$\5\2\13\f\17\17^^\3\2bb\t\2$$))^^ddppttvv\5\2\2!$$^^\5\2\2"+
		"!))^^\6\2FFHHffhh\7\2FFHHNNffhh\5\2\13\f\17\17\"\"\7\2--\61;??C\\c|\4"+
		"\2\f\f\17\17\5\2\13\13\17\17\"\"\4\2\f\f==\5\u02e3\2&\2&\2C\2\\\2a\2a"+
		"\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc\2\u00bc\2\u00c2\2\u00d8"+
		"\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3\2\u02e2\2\u02e6\2\u02ee"+
		"\2\u02ee\2\u02f0\2\u02f0\2\u0347\2\u0347\2\u0372\2\u0376\2\u0378\2\u0379"+
		"\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c\2\u038e"+
		"\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u048c\2\u0531"+
		"\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u05b2\2\u05bf\2\u05c1"+
		"\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9\2\u05d2\2\u05ec"+
		"\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u0659\2\u065b\2\u0661\2\u0670"+
		"\2\u06d5\2\u06d7\2\u06de\2\u06e3\2\u06ea\2\u06ef\2\u06f1\2\u06fc\2\u06fe"+
		"\2\u0701\2\u0701\2\u0712\2\u0741\2\u074f\2\u07b3\2\u07cc\2\u07ec\2\u07f6"+
		"\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0819\2\u081c\2\u082e\2\u0842\2\u085a"+
		"\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u08d6\2\u08e1\2\u08e5"+
		"\2\u08eb\2\u08f2\2\u093d\2\u093f\2\u094e\2\u0950\2\u0952\2\u0957\2\u0965"+
		"\2\u0973\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac"+
		"\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09c6\2\u09c9\2\u09ca"+
		"\2\u09cd\2\u09ce\2\u09d0\2\u09d0\2\u09d9\2\u09d9\2\u09de\2\u09df\2\u09e1"+
		"\2\u09e5\2\u09f2\2\u09f3\2\u09fe\2\u09fe\2\u0a03\2\u0a05\2\u0a07\2\u0a0c"+
		"\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37"+
		"\2\u0a38\2\u0a3a\2\u0a3b\2\u0a40\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4e"+
		"\2\u0a53\2\u0a53\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a72\2\u0a77\2\u0a83"+
		"\2\u0a85\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2"+
		"\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0ac7\2\u0ac9\2\u0acb\2\u0acd"+
		"\2\u0ace\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae5\2\u0afb\2\u0afe\2\u0b03\2\u0b05"+
		"\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34"+
		"\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b46\2\u0b49\2\u0b4a\2\u0b4d\2\u0b4e"+
		"\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65\2\u0b73\2\u0b73\2\u0b84"+
		"\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c"+
		"\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0"+
		"\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bce\2\u0bd2\2\u0bd2"+
		"\2\u0bd9\2\u0bd9\2\u0c02\2\u0c05\2\u0c07\2\u0c0e\2\u0c10\2\u0c12\2\u0c14"+
		"\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48\2\u0c4a\2\u0c4c\2\u0c4e"+
		"\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65\2\u0c82\2\u0c85\2\u0c87"+
		"\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb"+
		"\2\u0cbf\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc\2\u0cce\2\u0cd7\2\u0cd8\2\u0ce0"+
		"\2\u0ce0\2\u0ce2\2\u0ce5\2\u0cf3\2\u0cf4\2\u0d02\2\u0d05\2\u0d07\2\u0d0e"+
		"\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d46\2\u0d48\2\u0d4a\2\u0d4c"+
		"\2\u0d4e\2\u0d50\2\u0d50\2\u0d56\2\u0d59\2\u0d61\2\u0d65\2\u0d7c\2\u0d81"+
		"\2\u0d84\2\u0d85\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf"+
		"\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dd1\2\u0dd6\2\u0dd8\2\u0dd8\2\u0dda\2\u0de1"+
		"\2\u0df4\2\u0df5\2\u0e03\2\u0e3c\2\u0e42\2\u0e48\2\u0e4f\2\u0e4f\2\u0e83"+
		"\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f\2\u0e8f"+
		"\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7\2\u0ea9"+
		"\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf\2\u0ec2\2\u0ec6"+
		"\2\u0ec8\2\u0ec8\2\u0ecf\2\u0ecf\2\u0ede\2\u0ee1\2\u0f02\2\u0f02\2\u0f42"+
		"\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f83\2\u0f8a\2\u0f99\2\u0f9b\2\u0fbe"+
		"\2\u1002\2\u1038\2\u103a\2\u103a\2\u103d\2\u1041\2\u1052\2\u1064\2\u1067"+
		"\2\u106a\2\u1070\2\u1088\2\u1090\2\u1090\2\u109e\2\u109f\2\u10a2\2\u10c7"+
		"\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a\2\u124c"+
		"\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262\2\u128a"+
		"\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0\2\u12c2"+
		"\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314\2\u1317"+
		"\2\u131a\2\u135c\2\u1361\2\u1361\2\u1382\2\u1391\2\u13a2\2\u13f7\2\u13fa"+
		"\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c\2\u16a2\2\u16ec"+
		"\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1715\2\u1722\2\u1735\2\u1742"+
		"\2\u1755\2\u1762\2\u176e\2\u1770\2\u1772\2\u1774\2\u1775\2\u1782\2\u17b5"+
		"\2\u17b8\2\u17ca\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u1822\2\u1879\2\u1882"+
		"\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922\2\u192d\2\u1932\2\u193a"+
		"\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2\2\u19cb\2\u1a02"+
		"\2\u1a1d\2\u1a22\2\u1a60\2\u1a63\2\u1a76\2\u1aa9\2\u1aa9\2\u1b02\2\u1b35"+
		"\2\u1b37\2\u1b45\2\u1b47\2\u1b4d\2\u1b82\2\u1bab\2\u1bae\2\u1bb1\2\u1bbc"+
		"\2\u1be7\2\u1be9\2\u1bf3\2\u1c02\2\u1c37\2\u1c4f\2\u1c51\2\u1c5c\2\u1c7f"+
		"\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5\2\u1cf7\2\u1cf8\2\u1d02"+
		"\2\u1dc1\2\u1de9\2\u1df6\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47"+
		"\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f"+
		"\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0\2\u1fc0"+
		"\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fe2"+
		"\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073\2\u2073\2\u2081\2\u2081"+
		"\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c\2\u2115\2\u2117"+
		"\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a"+
		"\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141\2\u2147\2\u214b\2\u2150"+
		"\2\u2150\2\u2162\2\u218a\2\u231c\2\u231d\2\u23eb\2\u23ee\2\u23f2\2\u23f2"+
		"\2\u23f5\2\u23f5\2\u24b8\2\u24eb\2\u25ff\2\u2600\2\u2616\2\u2617\2\u264a"+
		"\2\u2655\2\u2681\2\u2681\2\u2695\2\u2695\2\u26a3\2\u26a3\2\u26ac\2\u26ad"+
		"\2\u26bf\2\u26c0\2\u26c6\2\u26c7\2\u26d0\2\u26d0\2\u26d6\2\u26d6\2\u26ec"+
		"\2\u26ec\2\u26f4\2\u26f5\2\u26f7\2\u26f7\2\u26fc\2\u26fc\2\u26ff\2\u26ff"+
		"\2\u2707\2\u2707\2\u270c\2\u270d\2\u272a\2\u272a\2\u274e\2\u274e\2\u2750"+
		"\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759\2\u2797\2\u2799\2\u27b2\2\u27b2"+
		"\2\u27c1\2\u27c1\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52\2\u2b57\2\u2b57\2\u2c02"+
		"\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5"+
		"\2\u2d02\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71"+
		"\2\u2d71\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8"+
		"\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda"+
		"\2\u2de0\2\u2de2\2\u2e01\2\u2e31\2\u2e31\2\u3007\2\u3009\2\u3023\2\u302b"+
		"\2\u3033\2\u3037\2\u303a\2\u303e\2\u3043\2\u3098\2\u309f\2\u30a1\2\u30a3"+
		"\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190\2\u31a2\2\u31bc"+
		"\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002\2\ua48e\2\ua4d2"+
		"\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621\2\ua62c\2\ua62d\2\ua642\2\ua670"+
		"\2\ua676\2\ua67d\2\ua681\2\ua6f1\2\ua719\2\ua721\2\ua724\2\ua78a\2\ua78d"+
		"\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803\2\ua805\2\ua807\2\ua809\2\ua80c"+
		"\2\ua80e\2\ua829\2\ua842\2\ua875\2\ua882\2\ua8c5\2\ua8c7\2\ua8c7\2\ua8f4"+
		"\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua92c\2\ua932\2\ua954"+
		"\2\ua962\2\ua97e\2\ua982\2\ua9b4\2\ua9b6\2\ua9c1\2\ua9d1\2\ua9d1\2\ua9e2"+
		"\2\ua9e6\2\ua9e8\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa38\2\uaa42\2\uaa4f"+
		"\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaac0\2\uaac2\2\uaac2\2\uaac4"+
		"\2\uaac4\2\uaadd\2\uaadf\2\uaae2\2\uaaf1\2\uaaf4\2\uaaf7\2\uab03\2\uab08"+
		"\2\uab0b\2\uab10\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32"+
		"\2\uab5c\2\uab5e\2\uab67\2\uab72\2\uabec\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8"+
		"\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15"+
		"\2\ufb19\2\ufb1f\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40"+
		"\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52"+
		"\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe"+
		"\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc"+
		"\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3"+
		"A\3O\3R\3_\3\u0082\3\u00fc\3\u0142\3\u0176\3\u0282\3\u029e\3\u02a2\3\u02d2"+
		"\3\u0302\3\u0321\3\u032f\3\u034c\3\u0352\3\u037c\3\u0382\3\u039f\3\u03a2"+
		"\3\u03c5\3\u03ca\3\u03d1\3\u03d3\3\u03d7\3\u0402\3\u049f\3\u04b2\3\u04d5"+
		"\3\u04da\3\u04fd\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742"+
		"\3\u0757\3\u0762\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837"+
		"\3\u0839\3\u083a\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882"+
		"\3\u08a0\3\u08e2\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b"+
		"\3\u0982\3\u09b9\3\u09c0\3\u09c1\3\u0a02\3\u0a05\3\u0a07\3\u0a08\3\u0a0e"+
		"\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e"+
		"\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62"+
		"\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4"+
		"\3\u1002\3\u1047\3\u1084\3\u10ba\3\u10d2\3\u10ea\3\u1102\3\u1134\3\u1152"+
		"\3\u1174\3\u1178\3\u1178\3\u1182\3\u11c1\3\u11c3\3\u11c6\3\u11dc\3\u11dc"+
		"\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u1236\3\u1239\3\u1239\3\u1240"+
		"\3\u1240\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f"+
		"\3\u12a1\3\u12aa\3\u12b2\3\u12ea\3\u1302\3\u1305\3\u1307\3\u130e\3\u1311"+
		"\3\u1312\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b"+
		"\3\u133f\3\u1346\3\u1349\3\u134a\3\u134d\3\u134e\3\u1352\3\u1352\3\u1359"+
		"\3\u1359\3\u135f\3\u1365\3\u1402\3\u1443\3\u1445\3\u1447\3\u1449\3\u144c"+
		"\3\u1482\3\u14c3\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b7\3\u15ba"+
		"\3\u15c0\3\u15da\3\u15df\3\u1602\3\u1640\3\u1642\3\u1642\3\u1646\3\u1646"+
		"\3\u1682\3\u16b7\3\u1702\3\u171b\3\u171f\3\u172c\3\u18a2\3\u18e1\3\u1901"+
		"\3\u1901\3\u1a02\3\u1a34\3\u1a37\3\u1a40\3\u1a52\3\u1a85\3\u1a88\3\u1a99"+
		"\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c38\3\u1c3a\3\u1c40\3\u1c42"+
		"\3\u1c42\3\u1c74\3\u1c91\3\u1c94\3\u1ca9\3\u1cab\3\u1cb8\3\u1d02\3\u1d08"+
		"\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41"+
		"\3\u1d43\3\u1d45\3\u1d45\3\u1d48\3\u1d49\3\u2002\3\u239b\3\u2402\3\u2470"+
		"\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a\3\u6a42"+
		"\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b38\3\u6b42\3\u6b45\3\u6b65\3\u6b79"+
		"\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f80\3\u6f95\3\u6fa1\3\u6fe2"+
		"\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd"+
		"\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ubca0"+
		"\3\ubca0\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4"+
		"\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf"+
		"\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e"+
		"\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c"+
		"\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc"+
		"\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772"+
		"\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue002\3\ue008"+
		"\3\ue00a\3\ue01a\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue802"+
		"\3\ue8c6\3\ue902\3\ue945\3\ue949\3\ue949\3\uee02\3\uee05\3\uee07\3\uee21"+
		"\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36"+
		"\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49"+
		"\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56"+
		"\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f"+
		"\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e"+
		"\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b"+
		"\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\uf006"+
		"\3\uf006\3\uf0d1\3\uf0d1\3\uf132\3\uf14b\3\uf152\3\uf16b\3\uf172\3\uf18b"+
		"\3\uf190\3\uf190\3\uf193\3\uf19c\3\uf1e8\3\uf201\3\uf203\3\uf203\3\uf21c"+
		"\3\uf21c\3\uf231\3\uf231\3\uf234\3\uf238\3\uf23a\3\uf23c\3\uf252\3\uf253"+
		"\3\uf302\3\uf322\3\uf32f\3\uf337\3\uf339\3\uf37e\3\uf380\3\uf395\3\uf3a2"+
		"\3\uf3cc\3\uf3d1\3\uf3d5\3\uf3e2\3\uf3f2\3\uf3f6\3\uf3f6\3\uf3fa\3\uf440"+
		"\3\uf442\3\uf442\3\uf444\3\uf4fe\3\uf501\3\uf53f\3\uf54d\3\uf550\3\uf552"+
		"\3\uf569\3\uf57c\3\uf57c\3\uf597\3\uf598\3\uf5a6\3\uf5a6\3\uf5fd\3\uf651"+
		"\3\uf682\3\uf6c7\3\uf6ce\3\uf6ce\3\uf6d2\3\uf6d4\3\uf6ed\3\uf6ee\3\uf6f6"+
		"\3\uf6fa\3\uf912\3\uf93c\3\uf93e\3\uf940\3\uf942\3\uf947\3\uf949\3\uf94e"+
		"\3\uf952\3\uf96d\3\uf982\3\uf999\3\uf9c2\3\uf9c2\3\uf9d2\3\uf9e8\3\2\4"+
		"\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4\ucea3\4\uceb2\4\uebe2"+
		"\4\uf802\4\ufa1f\4\u0347\2%\2&\2,\2,\2\62\2;\2C\2\\\2a\2a\2c\2|\2\u00ab"+
		"\2\u00ac\2\u00b0\2\u00b0\2\u00b7\2\u00b7\2\u00bc\2\u00bc\2\u00c2\2\u00d8"+
		"\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3\2\u02e2\2\u02e6\2\u02ee"+
		"\2\u02ee\2\u02f0\2\u02f0\2\u0347\2\u0347\2\u0372\2\u0376\2\u0378\2\u0379"+
		"\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c\2\u038e"+
		"\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u048c\2\u0531"+
		"\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u05b2\2\u05bf\2\u05c1"+
		"\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9\2\u05d2\2\u05ec"+
		"\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u0659\2\u065b\2\u066b\2\u0670"+
		"\2\u06d5\2\u06d7\2\u06de\2\u06e3\2\u06ea\2\u06ef\2\u06fe\2\u0701\2\u0701"+
		"\2\u0712\2\u0741\2\u074f\2\u07b3\2\u07c2\2\u07ec\2\u07f6\2\u07f7\2\u07fc"+
		"\2\u07fc\2\u0802\2\u0819\2\u081c\2\u082e\2\u0842\2\u085a\2\u0862\2\u086c"+
		"\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u08d6\2\u08e1\2\u08e5\2\u08eb\2\u08f2"+
		"\2\u093d\2\u093f\2\u094e\2\u0950\2\u0952\2\u0957\2\u0965\2\u0968\2\u0971"+
		"\2\u0973\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac"+
		"\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09c6\2\u09c9\2\u09ca"+
		"\2\u09cd\2\u09ce\2\u09d0\2\u09d0\2\u09d9\2\u09d9\2\u09de\2\u09df\2\u09e1"+
		"\2\u09e5\2\u09e8\2\u09f3\2\u09fe\2\u09fe\2\u0a03\2\u0a05\2\u0a07\2\u0a0c"+
		"\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37"+
		"\2\u0a38\2\u0a3a\2\u0a3b\2\u0a40\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4e"+
		"\2\u0a53\2\u0a53\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a68\2\u0a77\2\u0a83"+
		"\2\u0a85\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2"+
		"\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0ac7\2\u0ac9\2\u0acb\2\u0acd"+
		"\2\u0ace\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae5\2\u0ae8\2\u0af1\2\u0afb\2\u0afe"+
		"\2\u0b03\2\u0b05\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c"+
		"\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b46\2\u0b49\2\u0b4a"+
		"\2\u0b4d\2\u0b4e\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65\2\u0b68"+
		"\2\u0b71\2\u0b73\2\u0b73\2\u0b84\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92"+
		"\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5"+
		"\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca"+
		"\2\u0bcc\2\u0bce\2\u0bd2\2\u0bd2\2\u0bd9\2\u0bd9\2\u0be8\2\u0bf1\2\u0c02"+
		"\2\u0c05\2\u0c07\2\u0c0e\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b"+
		"\2\u0c3f\2\u0c46\2\u0c48\2\u0c4a\2\u0c4c\2\u0c4e\2\u0c57\2\u0c58\2\u0c5a"+
		"\2\u0c5c\2\u0c62\2\u0c65\2\u0c68\2\u0c71\2\u0c82\2\u0c85\2\u0c87\2\u0c8e"+
		"\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbf"+
		"\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc\2\u0cce\2\u0cd7\2\u0cd8\2\u0ce0\2\u0ce0"+
		"\2\u0ce2\2\u0ce5\2\u0ce8\2\u0cf1\2\u0cf3\2\u0cf4\2\u0d02\2\u0d05\2\u0d07"+
		"\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d46\2\u0d48\2\u0d4a"+
		"\2\u0d4c\2\u0d4e\2\u0d50\2\u0d50\2\u0d56\2\u0d59\2\u0d61\2\u0d65\2\u0d68"+
		"\2\u0d71\2\u0d7c\2\u0d81\2\u0d84\2\u0d85\2\u0d87\2\u0d98\2\u0d9c\2\u0db3"+
		"\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dd1\2\u0dd6\2\u0dd8"+
		"\2\u0dd8\2\u0dda\2\u0de1\2\u0de8\2\u0df1\2\u0df4\2\u0df5\2\u0e03\2\u0e3c"+
		"\2\u0e42\2\u0e48\2\u0e4f\2\u0e4f\2\u0e52\2\u0e5b\2\u0e83\2\u0e84\2\u0e86"+
		"\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99"+
		"\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac"+
		"\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8"+
		"\2\u0ecf\2\u0ecf\2\u0ed2\2\u0edb\2\u0ede\2\u0ee1\2\u0f02\2\u0f02\2\u0f22"+
		"\2\u0f2b\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f83\2\u0f8a\2\u0f99"+
		"\2\u0f9b\2\u0fbe\2\u1002\2\u1038\2\u103a\2\u103a\2\u103d\2\u104b\2\u1052"+
		"\2\u1064\2\u1067\2\u106a\2\u1070\2\u1088\2\u1090\2\u1090\2\u1092\2\u109b"+
		"\2\u109e\2\u109f\2\u10a2\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2"+
		"\2\u10fc\2\u10fe\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a"+
		"\2\u125c\2\u125f\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4"+
		"\2\u12b7\2\u12ba\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8"+
		"\2\u12da\2\u1312\2\u1314\2\u1317\2\u131a\2\u135c\2\u1361\2\u1361\2\u1382"+
		"\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681"+
		"\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710"+
		"\2\u1715\2\u1722\2\u1735\2\u1742\2\u1755\2\u1762\2\u176e\2\u1770\2\u1772"+
		"\2\u1774\2\u1775\2\u1782\2\u17b5\2\u17b8\2\u17ca\2\u17d9\2\u17d9\2\u17de"+
		"\2\u17de\2\u17e2\2\u17eb\2\u180d\2\u180f\2\u1812\2\u181b\2\u1822\2\u1879"+
		"\2\u1882\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922\2\u192d\2\u1932"+
		"\2\u193a\2\u1948\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2\2\u19cb"+
		"\2\u19d2\2\u19db\2\u1a02\2\u1a1d\2\u1a22\2\u1a60\2\u1a63\2\u1a76\2\u1a82"+
		"\2\u1a8b\2\u1a92\2\u1a9b\2\u1aa9\2\u1aa9\2\u1b02\2\u1b35\2\u1b37\2\u1b45"+
		"\2\u1b47\2\u1b4d\2\u1b52\2\u1b5b\2\u1b82\2\u1bab\2\u1bae\2\u1be7\2\u1be9"+
		"\2\u1bf3\2\u1c02\2\u1c37\2\u1c42\2\u1c4b\2\u1c4f\2\u1c7f\2\u1c82\2\u1c8a"+
		"\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5\2\u1cf7\2\u1cf8\2\u1d02\2\u1dc1\2\u1de9"+
		"\2\u1df6\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f"+
		"\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61"+
		"\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6"+
		"\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4"+
		"\2\u1ff6\2\u1ff8\2\u1ffe\2\u200e\2\u200f\2\u203e\2\u203e\2\u204b\2\u204b"+
		"\2\u2073\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109"+
		"\2\u2109\2\u210c\2\u2115\2\u2117\2\u2117\2\u211b\2\u211f\2\u2124\2\u2124"+
		"\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a\2\u212c\2\u212f\2\u2131"+
		"\2\u213b\2\u213e\2\u2141\2\u2147\2\u214b\2\u2150\2\u2150\2\u2162\2\u218a"+
		"\2\u2196\2\u219b\2\u21ab\2\u21ac\2\u231c\2\u231d\2\u232a\2\u232a\2\u23d1"+
		"\2\u23d1\2\u23eb\2\u23f5\2\u23fa\2\u23fc\2\u24b8\2\u24eb\2\u25ac\2\u25ad"+
		"\2\u25b8\2\u25b8\2\u25c2\2\u25c2\2\u25fd\2\u2600\2\u2602\2\u2606\2\u2610"+
		"\2\u2610\2\u2613\2\u2613\2\u2616\2\u2617\2\u261a\2\u261a\2\u261f\2\u261f"+
		"\2\u2622\2\u2622\2\u2624\2\u2625\2\u2628\2\u2628\2\u262c\2\u262c\2\u2630"+
		"\2\u2631\2\u263a\2\u263c\2\u2642\2\u2642\2\u2644\2\u2644\2\u264a\2\u2655"+
		"\2\u2662\2\u2662\2\u2665\2\u2665\2\u2667\2\u2668\2\u266a\2\u266a\2\u267d"+
		"\2\u267d\2\u2681\2\u2681\2\u2694\2\u2699\2\u269b\2\u269b\2\u269d\2\u269e"+
		"\2\u26a2\2\u26a3\2\u26ac\2\u26ad\2\u26b2\2\u26b3\2\u26bf\2\u26c0\2\u26c6"+
		"\2\u26c7\2\u26ca\2\u26ca\2\u26d0\2\u26d1\2\u26d3\2\u26d3\2\u26d5\2\u26d6"+
		"\2\u26eb\2\u26ec\2\u26f2\2\u26f7\2\u26f9\2\u26fc\2\u26ff\2\u26ff\2\u2704"+
		"\2\u2704\2\u2707\2\u2707\2\u270a\2\u270f\2\u2711\2\u2711\2\u2714\2\u2714"+
		"\2\u2716\2\u2716\2\u2718\2\u2718\2\u271f\2\u271f\2\u2723\2\u2723\2\u272a"+
		"\2\u272a\2\u2735\2\u2736\2\u2746\2\u2746\2\u2749\2\u2749\2\u274e\2\u274e"+
		"\2\u2750\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759\2\u2765\2\u2766\2\u2797"+
		"\2\u2799\2\u27a3\2\u27a3\2\u27b2\2\u27b2\2\u27c1\2\u27c1\2\u2936\2\u2937"+
		"\2\u2b07\2\u2b09\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52\2\u2b57\2\u2b57\2\u2c02"+
		"\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5"+
		"\2\u2d02\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71"+
		"\2\u2d71\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8"+
		"\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda"+
		"\2\u2de0\2\u2de2\2\u2e01\2\u2e31\2\u2e31\2\u3007\2\u3009\2\u3023\2\u302b"+
		"\2\u3032\2\u3037\2\u303a\2\u303f\2\u3043\2\u3098\2\u309f\2\u30a1\2\u30a3"+
		"\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190\2\u31a2\2\u31bc"+
		"\2\u31f2\2\u3201\2\u3299\2\u3299\2\u329b\2\u329b\2\u3402\2\u4db7\2\u4e02"+
		"\2\u9fec\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua62d"+
		"\2\ua642\2\ua670\2\ua676\2\ua67d\2\ua681\2\ua6f1\2\ua719\2\ua721\2\ua724"+
		"\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803\2\ua805\2\ua807"+
		"\2\ua809\2\ua80c\2\ua80e\2\ua829\2\ua842\2\ua875\2\ua882\2\ua8c5\2\ua8c7"+
		"\2\ua8c7\2\ua8d2\2\ua8db\2\ua8f4\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff"+
		"\2\ua902\2\ua92c\2\ua932\2\ua954\2\ua962\2\ua97e\2\ua982\2\ua9b4\2\ua9b6"+
		"\2\ua9c1\2\ua9d1\2\ua9db\2\ua9e2\2\ua9e6\2\ua9e8\2\uaa00\2\uaa02\2\uaa38"+
		"\2\uaa42\2\uaa4f\2\uaa52\2\uaa5b\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80"+
		"\2\uaac0\2\uaac2\2\uaac2\2\uaac4\2\uaac4\2\uaadd\2\uaadf\2\uaae2\2\uaaf1"+
		"\2\uaaf4\2\uaaf7\2\uab03\2\uab08\2\uab0b\2\uab10\2\uab13\2\uab18\2\uab22"+
		"\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e\2\uab67\2\uab72\2\uabec"+
		"\2\uabf2\2\uabfb\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd\2\uf902"+
		"\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\ufb1f\2\ufb2a"+
		"\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40\2\ufb42\2\ufb43\2\ufb45"+
		"\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52\2\ufd91\2\ufd94\2\ufdc9"+
		"\2\ufdf2\2\ufdfd\2\ufe02\2\ufe11\2\ufe72\2\ufe76\2\ufe78\2\ufefe\2\uff12"+
		"\2\uff1b\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9"+
		"\2\uffcc\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3"+
		"<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc\3\u0142\3\u0176\3\u0282\3\u029e\3"+
		"\u02a2\3\u02d2\3\u0302\3\u0321\3\u032f\3\u034c\3\u0352\3\u037c\3\u0382"+
		"\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1\3\u03d3\3\u03d7\3\u0402\3\u049f"+
		"\3\u04a2\3\u04ab\3\u04b2\3\u04d5\3\u04da\3\u04fd\3\u0502\3\u0529\3\u0532"+
		"\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762\3\u0769\3\u0802\3\u0807"+
		"\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a\3\u083e\3\u083e\3\u0841"+
		"\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2\3\u08f4\3\u08f6\3\u08f7"+
		"\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9\3\u09c0\3\u09c1\3\u0a02"+
		"\3\u0a05\3\u0a07\3\u0a08\3\u0a0e\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35"+
		"\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02"+
		"\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a"+
		"\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u1002\3\u1047\3\u1068\3\u1071\3\u1084"+
		"\3\u10ba\3\u10d2\3\u10ea\3\u10f2\3\u10fb\3\u1102\3\u1134\3\u1138\3\u1141"+
		"\3\u1152\3\u1174\3\u1178\3\u1178\3\u1182\3\u11c1\3\u11c3\3\u11c6\3\u11d2"+
		"\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u1236\3\u1239\3\u1239"+
		"\3\u1240\3\u1240\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291"+
		"\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12ea\3\u12f2\3\u12fb\3\u1302\3\u1305"+
		"\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334"+
		"\3\u1335\3\u1337\3\u133b\3\u133f\3\u1346\3\u1349\3\u134a\3\u134d\3\u134e"+
		"\3\u1352\3\u1352\3\u1359\3\u1359\3\u135f\3\u1365\3\u1402\3\u1443\3\u1445"+
		"\3\u1447\3\u1449\3\u144c\3\u1452\3\u145b\3\u1482\3\u14c3\3\u14c6\3\u14c7"+
		"\3\u14c9\3\u14c9\3\u14d2\3\u14db\3\u1582\3\u15b7\3\u15ba\3\u15c0\3\u15da"+
		"\3\u15df\3\u1602\3\u1640\3\u1642\3\u1642\3\u1646\3\u1646\3\u1652\3\u165b"+
		"\3\u1682\3\u16b7\3\u16c2\3\u16cb\3\u1702\3\u171b\3\u171f\3\u172c\3\u1732"+
		"\3\u173b\3\u18a2\3\u18eb\3\u1901\3\u1901\3\u1a02\3\u1a34\3\u1a37\3\u1a40"+
		"\3\u1a52\3\u1a85\3\u1a88\3\u1a99\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c"+
		"\3\u1c38\3\u1c3a\3\u1c40\3\u1c42\3\u1c42\3\u1c52\3\u1c5b\3\u1c74\3\u1c91"+
		"\3\u1c94\3\u1ca9\3\u1cab\3\u1cb8\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d"+
		"\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d43\3\u1d45\3\u1d45"+
		"\3\u1d48\3\u1d49\3\u1d52\3\u1d5b\3\u2002\3\u239b\3\u2402\3\u2470\3\u2482"+
		"\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a\3\u6a42\3\u6a60"+
		"\3\u6a62\3\u6a6b\3\u6ad2\3\u6aef\3\u6b02\3\u6b38\3\u6b42\3\u6b45\3\u6b52"+
		"\3\u6b5b\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f80"+
		"\3\u6f95\3\u6fa1\3\u6fe2\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002"+
		"\3\ub120\3\ub172\3\ub2fd\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a"+
		"\3\ubc92\3\ubc9b\3\ubca0\3\ubca0\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0"+
		"\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb"+
		"\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f"+
		"\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546"+
		"\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4"+
		"\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750"+
		"\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6"+
		"\3\ud7cd\3\ud7d0\3\ud801\3\ue002\3\ue008\3\ue00a\3\ue01a\3\ue01d\3\ue023"+
		"\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue802\3\ue8c6\3\ue902\3\ue945\3\ue949"+
		"\3\ue949\3\ue952\3\ue95b\3\uee02\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24"+
		"\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b"+
		"\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b"+
		"\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59"+
		"\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61"+
		"\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76"+
		"\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d"+
		"\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\uf006\3\uf006\3\uf0d1"+
		"\3\uf0d1\3\uf132\3\uf14b\3\uf152\3\uf16b\3\uf172\3\uf18b\3\uf190\3\uf190"+
		"\3\uf193\3\uf19c\3\uf1e8\3\uf201\3\uf203\3\uf204\3\uf21c\3\uf21c\3\uf231"+
		"\3\uf231\3\uf234\3\uf23c\3\uf252\3\uf253\3\uf302\3\uf323\3\uf326\3\uf395"+
		"\3\uf398\3\uf399\3\uf39b\3\uf39d\3\uf3a0\3\uf3f2\3\uf3f5\3\uf3f7\3\uf3f9"+
		"\3\uf4ff\3\uf501\3\uf53f\3\uf54b\3\uf550\3\uf552\3\uf569\3\uf571\3\uf572"+
		"\3\uf575\3\uf57c\3\uf589\3\uf589\3\uf58c\3\uf58f\3\uf592\3\uf592\3\uf597"+
		"\3\uf598\3\uf5a6\3\uf5a7\3\uf5aa\3\uf5aa\3\uf5b3\3\uf5b4\3\uf5be\3\uf5be"+
		"\3\uf5c4\3\uf5c6\3\uf5d3\3\uf5d5\3\uf5de\3\uf5e0\3\uf5e3\3\uf5e3\3\uf5e5"+
		"\3\uf5e5\3\uf5ea\3\uf5ea\3\uf5f1\3\uf5f1\3\uf5f5\3\uf5f5\3\uf5fc\3\uf651"+
		"\3\uf682\3\uf6c7\3\uf6cd\3\uf6d4\3\uf6e2\3\uf6e7\3\uf6eb\3\uf6eb\3\uf6ed"+
		"\3\uf6ee\3\uf6f2\3\uf6f2\3\uf6f5\3\uf6fa\3\uf912\3\uf93c\3\uf93e\3\uf940"+
		"\3\uf942\3\uf947\3\uf949\3\uf94e\3\uf952\3\uf96d\3\uf982\3\uf999\3\uf9c2"+
		"\3\uf9c2\3\uf9d2\3\uf9e8\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4"+
		"\ub822\4\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u0102\20\u01f1\20\u0296"+
		"\2C\2\\\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc\2\u00bc\2\u00c2"+
		"\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3\2\u02e2\2\u02e6"+
		"\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0347\2\u0347\2\u0372\2\u0376\2\u0378"+
		"\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c"+
		"\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u048c"+
		"\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u05b2\2\u05bf"+
		"\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9\2\u05d2"+
		"\2\u05ec\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u0659\2\u065b\2\u0661"+
		"\2\u0670\2\u06d5\2\u06d7\2\u06de\2\u06e3\2\u06ea\2\u06ef\2\u06f1\2\u06fc"+
		"\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0741\2\u074f\2\u07b3\2\u07cc\2\u07ec"+
		"\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0819\2\u081c\2\u082e\2\u0842"+
		"\2\u085a\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u08d6\2\u08e1"+
		"\2\u08e5\2\u08eb\2\u08f2\2\u093d\2\u093f\2\u094e\2\u0950\2\u0952\2\u0957"+
		"\2\u0965\2\u0973\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa"+
		"\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09c6\2\u09c9"+
		"\2\u09ca\2\u09cd\2\u09ce\2\u09d0\2\u09d0\2\u09d9\2\u09d9\2\u09de\2\u09df"+
		"\2\u09e1\2\u09e5\2\u09f2\2\u09f3\2\u09fe\2\u09fe\2\u0a03\2\u0a05\2\u0a07"+
		"\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34\2\u0a35"+
		"\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a40\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d"+
		"\2\u0a4e\2\u0a53\2\u0a53\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a72\2\u0a77"+
		"\2\u0a83\2\u0a85\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac"+
		"\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0ac7\2\u0ac9\2\u0acb"+
		"\2\u0acd\2\u0ace\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae5\2\u0afb\2\u0afe\2\u0b03"+
		"\2\u0b05\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32"+
		"\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b46\2\u0b49\2\u0b4a\2\u0b4d"+
		"\2\u0b4e\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65\2\u0b73\2\u0b73"+
		"\2\u0b84\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b"+
		"\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac"+
		"\2\u0bb0\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bce\2\u0bd2"+
		"\2\u0bd2\2\u0bd9\2\u0bd9\2\u0c02\2\u0c05\2\u0c07\2\u0c0e\2\u0c10\2\u0c12"+
		"\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48\2\u0c4a\2\u0c4c"+
		"\2\u0c4e\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65\2\u0c82\2\u0c85"+
		"\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7"+
		"\2\u0cbb\2\u0cbf\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc\2\u0cce\2\u0cd7\2\u0cd8"+
		"\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce5\2\u0cf3\2\u0cf4\2\u0d02\2\u0d05\2\u0d07"+
		"\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d46\2\u0d48\2\u0d4a"+
		"\2\u0d4c\2\u0d4e\2\u0d50\2\u0d50\2\u0d56\2\u0d59\2\u0d61\2\u0d65\2\u0d7c"+
		"\2\u0d81\2\u0d84\2\u0d85\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd"+
		"\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dd1\2\u0dd6\2\u0dd8\2\u0dd8\2\u0dda"+
		"\2\u0de1\2\u0df4\2\u0df5\2\u0e03\2\u0e3c\2\u0e42\2\u0e48\2\u0e4f\2\u0e4f"+
		"\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f"+
		"\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7"+
		"\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf\2\u0ec2"+
		"\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ecf\2\u0ecf\2\u0ede\2\u0ee1\2\u0f02\2\u0f02"+
		"\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f83\2\u0f8a\2\u0f99\2\u0f9b"+
		"\2\u0fbe\2\u1002\2\u1038\2\u103a\2\u103a\2\u103d\2\u1041\2\u1052\2\u1064"+
		"\2\u1067\2\u106a\2\u1070\2\u1088\2\u1090\2\u1090\2\u109e\2\u109f\2\u10a2"+
		"\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a"+
		"\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262"+
		"\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0"+
		"\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314"+
		"\2\u1317\2\u131a\2\u135c\2\u1361\2\u1361\2\u1382\2\u1391\2\u13a2\2\u13f7"+
		"\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c\2\u16a2"+
		"\2\u16ec\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1715\2\u1722\2\u1735"+
		"\2\u1742\2\u1755\2\u1762\2\u176e\2\u1770\2\u1772\2\u1774\2\u1775\2\u1782"+
		"\2\u17b5\2\u17b8\2\u17ca\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u1822\2\u1879"+
		"\2\u1882\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922\2\u192d\2\u1932"+
		"\2\u193a\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2\2\u19cb"+
		"\2\u1a02\2\u1a1d\2\u1a22\2\u1a60\2\u1a63\2\u1a76\2\u1aa9\2\u1aa9\2\u1b02"+
		"\2\u1b35\2\u1b37\2\u1b45\2\u1b47\2\u1b4d\2\u1b82\2\u1bab\2\u1bae\2\u1bb1"+
		"\2\u1bbc\2\u1be7\2\u1be9\2\u1bf3\2\u1c02\2\u1c37\2\u1c4f\2\u1c51\2\u1c5c"+
		"\2\u1c7f\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5\2\u1cf7\2\u1cf8"+
		"\2\u1d02\2\u1dc1\2\u1de9\2\u1df6\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22"+
		"\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d"+
		"\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0"+
		"\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd"+
		"\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073\2\u2073\2\u2081"+
		"\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c\2\u2115"+
		"\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a"+
		"\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141\2\u2147\2\u214b"+
		"\2\u2150\2\u2150\2\u2162\2\u218a\2\u24b8\2\u24eb\2\u2c02\2\u2c30\2\u2c32"+
		"\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5\2\u2d02\2\u2d27"+
		"\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d71\2\u2d82"+
		"\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba\2\u2dc0"+
		"\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0\2\u2de2"+
		"\2\u2e01\2\u2e31\2\u2e31\2\u3007\2\u3009\2\u3023\2\u302b\2\u3033\2\u3037"+
		"\2\u303a\2\u303e\2\u3043\2\u3098\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30fe"+
		"\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190\2\u31a2\2\u31bc\2\u31f2\2\u3201"+
		"\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502"+
		"\2\ua60e\2\ua612\2\ua621\2\ua62c\2\ua62d\2\ua642\2\ua670\2\ua676\2\ua67d"+
		"\2\ua681\2\ua6f1\2\ua719\2\ua721\2\ua724\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2"+
		"\2\ua7b9\2\ua7f9\2\ua803\2\ua805\2\ua807\2\ua809\2\ua80c\2\ua80e\2\ua829"+
		"\2\ua842\2\ua875\2\ua882\2\ua8c5\2\ua8c7\2\ua8c7\2\ua8f4\2\ua8f9\2\ua8fd"+
		"\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua92c\2\ua932\2\ua954\2\ua962\2\ua97e"+
		"\2\ua982\2\ua9b4\2\ua9b6\2\ua9c1\2\ua9d1\2\ua9d1\2\ua9e2\2\ua9e6\2\ua9e8"+
		"\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa38\2\uaa42\2\uaa4f\2\uaa62\2\uaa78"+
		"\2\uaa7c\2\uaa7c\2\uaa80\2\uaac0\2\uaac2\2\uaac2\2\uaac4\2\uaac4\2\uaadd"+
		"\2\uaadf\2\uaae2\2\uaaf1\2\uaaf4\2\uaaf7\2\uab03\2\uab08\2\uab0b\2\uab10"+
		"\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e"+
		"\2\uab67\2\uab72\2\uabec\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd"+
		"\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\ufb1f"+
		"\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40\2\ufb42\2\ufb43"+
		"\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52\2\ufd91\2\ufd94"+
		"\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe\2\uff23\2\uff3c"+
		"\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1\2\uffd4"+
		"\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082"+
		"\3\u00fc\3\u0142\3\u0176\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321"+
		"\3\u032f\3\u034c\3\u0352\3\u037c\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca"+
		"\3\u03d1\3\u03d3\3\u03d7\3\u0402\3\u049f\3\u04b2\3\u04d5\3\u04da\3\u04fd"+
		"\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762"+
		"\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a"+
		"\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2"+
		"\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9"+
		"\3\u09c0\3\u09c1\3\u0a02\3\u0a05\3\u0a07\3\u0a08\3\u0a0e\3\u0a15\3\u0a17"+
		"\3\u0a19\3\u0a1b\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9"+
		"\3\u0acb\3\u0ae6\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82"+
		"\3\u0b93\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u1002\3\u1047"+
		"\3\u1084\3\u10ba\3\u10d2\3\u10ea\3\u1102\3\u1134\3\u1152\3\u1174\3\u1178"+
		"\3\u1178\3\u1182\3\u11c1\3\u11c3\3\u11c6\3\u11dc\3\u11dc\3\u11de\3\u11de"+
		"\3\u1202\3\u1213\3\u1215\3\u1236\3\u1239\3\u1239\3\u1240\3\u1240\3\u1282"+
		"\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa"+
		"\3\u12b2\3\u12ea\3\u1302\3\u1305\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315"+
		"\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133f\3\u1346"+
		"\3\u1349\3\u134a\3\u134d\3\u134e\3\u1352\3\u1352\3\u1359\3\u1359\3\u135f"+
		"\3\u1365\3\u1402\3\u1443\3\u1445\3\u1447\3\u1449\3\u144c\3\u1482\3\u14c3"+
		"\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b7\3\u15ba\3\u15c0\3\u15da"+
		"\3\u15df\3\u1602\3\u1640\3\u1642\3\u1642\3\u1646\3\u1646\3\u1682\3\u16b7"+
		"\3\u1702\3\u171b\3\u171f\3\u172c\3\u18a2\3\u18e1\3\u1901\3\u1901\3\u1a02"+
		"\3\u1a34\3\u1a37\3\u1a40\3\u1a52\3\u1a85\3\u1a88\3\u1a99\3\u1ac2\3\u1afa"+
		"\3\u1c02\3\u1c0a\3\u1c0c\3\u1c38\3\u1c3a\3\u1c40\3\u1c42\3\u1c42\3\u1c74"+
		"\3\u1c91\3\u1c94\3\u1ca9\3\u1cab\3\u1cb8\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b"+
		"\3\u1d0d\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d43\3\u1d45"+
		"\3\u1d45\3\u1d48\3\u1d49\3\u2002\3\u239b\3\u2402\3\u2470\3\u2482\3\u2545"+
		"\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a\3\u6a42\3\u6a60\3\u6ad2"+
		"\3\u6aef\3\u6b02\3\u6b38\3\u6b42\3\u6b45\3\u6b65\3\u6b79\3\u6b7f\3\u6b91"+
		"\3\u6f02\3\u6f46\3\u6f52\3\u6f80\3\u6f95\3\u6fa1\3\u6fe2\3\u6fe3\3\u7002"+
		"\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd\3\ubc02\3\ubc6c"+
		"\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ubca0\3\ubca0\3\ud402"+
		"\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8"+
		"\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7"+
		"\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b"+
		"\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554"+
		"\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716"+
		"\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c"+
		"\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue002\3\ue008\3\ue00a\3\ue01a"+
		"\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue802\3\ue8c6\3\ue902"+
		"\3\ue945\3\ue949\3\ue949\3\uee02\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24"+
		"\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b"+
		"\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b"+
		"\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59"+
		"\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61"+
		"\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76"+
		"\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d"+
		"\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\uf132\3\uf14b\3\uf152"+
		"\3\uf16b\3\uf172\3\uf18b\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4"+
		"\ub822\4\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u03c0\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2M\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\3\u00b6\3\2\2\2\5\u00be\3\2\2\2\7\u00c8\3\2\2\2\t\u00ca\3\2\2"+
		"\2\13\u00d8\3\2\2\2\r\u00da\3\2\2\2\17\u00de\3\2\2\2\21\u00ea\3\2\2\2"+
		"\23\u00ec\3\2\2\2\25\u00fc\3\2\2\2\27\u0108\3\2\2\2\31\u010a\3\2\2\2\33"+
		"\u0122\3\2\2\2\35\u0140\3\2\2\2\37\u0160\3\2\2\2!\u0163\3\2\2\2#\u0167"+
		"\3\2\2\2%\u016b\3\2\2\2\'\u016e\3\2\2\2)\u0180\3\2\2\2+\u0184\3\2\2\2"+
		"-\u0187\3\2\2\2/\u019c\3\2\2\2\61\u01a2\3\2\2\2\63\u01b7\3\2\2\2\65\u01b9"+
		"\3\2\2\2\67\u01c0\3\2\2\29\u01ca\3\2\2\2;\u01d5\3\2\2\2=\u01eb\3\2\2\2"+
		"?\u0202\3\2\2\2A\u020b\3\2\2\2C\u0212\3\2\2\2E\u0217\3\2\2\2G\u0219\3"+
		"\2\2\2I\u021f\3\2\2\2K\u0221\3\2\2\2M\u0223\3\2\2\2O\u0231\3\2\2\2Q\u0233"+
		"\3\2\2\2S\u0235\3\2\2\2U\u0239\3\2\2\2W\u023b\3\2\2\2Y\u023e\3\2\2\2["+
		"\u0242\3\2\2\2]\u025e\3\2\2\2_\u0261\3\2\2\2a\u0264\3\2\2\2c\u0267\3\2"+
		"\2\2e\u026a\3\2\2\2g\u026d\3\2\2\2i\u0271\3\2\2\2k\u027e\3\2\2\2m\u02b6"+
		"\3\2\2\2o\u02b9\3\2\2\2q\u02e3\3\2\2\2s\u02e5\3\2\2\2u\u02e8\3\2\2\2w"+
		"\u02ed\3\2\2\2y\u02f1\3\2\2\2{\u02f5\3\2\2\2}\u02f7\3\2\2\2\177\u02f9"+
		"\3\2\2\2\u0081\u02fb\3\2\2\2\u0083\u02fd\3\2\2\2\u0085\u02ff\3\2\2\2\u0087"+
		"\u0301\3\2\2\2\u0089\u0303\3\2\2\2\u008b\u0305\3\2\2\2\u008d\u0307\3\2"+
		"\2\2\u008f\u0309\3\2\2\2\u0091\u030b\3\2\2\2\u0093\u030d\3\2\2\2\u0095"+
		"\u030f\3\2\2\2\u0097\u0311\3\2\2\2\u0099\u0313\3\2\2\2\u009b\u0315\3\2"+
		"\2\2\u009d\u031d\3\2\2\2\u009f\u0331\3\2\2\2\u00a1\u0333\3\2\2\2\u00a3"+
		"\u0336\3\2\2\2\u00a5\u033a\3\2\2\2\u00a7\u0341\3\2\2\2\u00a9\u0353\3\2"+
		"\2\2\u00ab\u0360\3\2\2\2\u00ad\u0367\3\2\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b7\7n\2\2\u00b3\u00b4\7p\2\2"+
		"\u00b4\u00b5\7k\2\2\u00b5\u00b7\7n\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b3"+
		"\3\2\2\2\u00b7\4\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7w\2\2\u00bb\u00bf\7g\2\2\u00bc\u00bd\7q\2\2\u00bd\u00bf\7p\2\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\6\3\2\2\2\u00c0\u00c1\7h\2\2"+
		"\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c9"+
		"\7g\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c9\7h\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\b\3\2\2\2\u00ca\u00ce\t\2\2\2"+
		"\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7<\2\2\u00d2\u00d4\7\61\2\2\u00d3\u00d5\t\4\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\n\3\2\2\2\u00d8\u00d9\4\62;\2\u00d9\f\3\2\2\2\u00da\u00db\4\63;\2\u00db"+
		"\16\3\2\2\2\u00dc\u00df\5\13\6\2\u00dd\u00df\7a\2\2\u00de\u00dc\3\2\2"+
		"\2\u00de\u00dd\3\2\2\2\u00df\20\3\2\2\2\u00e0\u00e4\5\13\6\2\u00e1\u00e3"+
		"\5\17\b\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\5\13\6\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\5\13\6\2\u00ea\u00e0\3\2\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\22\3\2\2\2\u00ec\u00ee\t\5\2\2\u00ed\u00ef"+
		"\t\6\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\5\21\t\2\u00f1\24\3\2\2\2\u00f2\u00f6\5\r\7\2\u00f3\u00f5\5\17"+
		"\b\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5\13"+
		"\6\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\5\13\6\2\u00fc\u00f2\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\26\3\2\2\2\u00fe\u0102\5\13\6\2\u00ff\u0101\5\17"+
		"\b\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5\13"+
		"\6\2\u0106\u0109\3\2\2\2\u0107\u0109\5\13\6\2\u0108\u00fe\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\30\3\2\2\2\u010a\u010b\t\2\2\2\u010b\32\3\2\2\2\u010c"+
		"\u010e\7/\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u0111\5\27\f\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\7\60\2\2\u0113\u0115\5\27\f\2\u0114\u0116\5"+
		"\23\n\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\t\7\2\2\u0118\u0123\3\2\2\2\u0119\u011b\7/\2\2\u011a\u0119\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\5\27\f\2\u011d"+
		"\u011f\5\23\n\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u0121\t\7\2\2\u0121\u0123\3\2\2\2\u0122\u010d\3\2\2\2\u0122"+
		"\u011a\3\2\2\2\u0123\34\3\2\2\2\u0124\u0126\7/\2\2\u0125\u0124\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\5\27\f\2\u0128\u0127"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\60\2\2"+
		"\u012b\u012d\5\27\f\2\u012c\u012e\5\23\n\2\u012d\u012c\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131\t\b\2\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0141\3\2\2\2\u0132\u0134\7/\2\2\u0133\u0132\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5\27\f\2\u0136"+
		"\u0138\5\23\n\2\u0137\u0139\t\b\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0139\u0141\3\2\2\2\u013a\u013c\7/\2\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\5\27\f\2\u013e\u013f\t"+
		"\b\2\2\u013f\u0141\3\2\2\2\u0140\u0125\3\2\2\2\u0140\u0133\3\2\2\2\u0140"+
		"\u013b\3\2\2\2\u0141\36\3\2\2\2\u0142\u0144\7/\2\2\u0143\u0142\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0147\5\27\f\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\60\2\2"+
		"\u0149\u014b\5\27\f\2\u014a\u014c\5\23\n\2\u014b\u014a\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u0151\3\2\2\2\u014d\u014e\7d\2\2\u014e\u0152\7f\2\2\u014f"+
		"\u0150\7D\2\2\u0150\u0152\7F\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2"+
		"\2\u0152\u0161\3\2\2\2\u0153\u0155\7/\2\2\u0154\u0153\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\5\27\f\2\u0157\u0159\5\23\n\2"+
		"\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015e\3\2\2\2\u015a\u015b"+
		"\7d\2\2\u015b\u015f\7f\2\2\u015c\u015d\7D\2\2\u015d\u015f\7F\2\2\u015e"+
		"\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0143\3\2"+
		"\2\2\u0160\u0154\3\2\2\2\u0161 \3\2\2\2\u0162\u0164\7/\2\2\u0163\u0162"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\5\27\f\2"+
		"\u0166\"\3\2\2\2\u0167\u0168\t\t\2\2\u0168$\3\2\2\2\u0169\u016c\5#\22"+
		"\2\u016a\u016c\7a\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c&\3"+
		"\2\2\2\u016d\u016f\7/\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u017e\3\2\2\2\u0170\u0171\7\62\2\2\u0171\u0172\t\n\2\2\u0172\u0176\5"+
		"#\22\2\u0173\u0175\5%\23\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017a\5#\22\2\u017a\u017f\3\2\2\2\u017b\u017c\7\62\2\2\u017c"+
		"\u017d\t\n\2\2\u017d\u017f\5#\22\2\u017e\u0170\3\2\2\2\u017e\u017b\3\2"+
		"\2\2\u017f(\3\2\2\2\u0180\u0181\t\13\2\2\u0181*\3\2\2\2\u0182\u0185\5"+
		")\25\2\u0183\u0185\7a\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		",\3\2\2\2\u0186\u0188\7/\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0197\3\2\2\2\u0189\u018a\7\62\2\2\u018a\u018b\t\f\2\2\u018b\u018f\5"+
		")\25\2\u018c\u018e\5+\26\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0193\5)\25\2\u0193\u0198\3\2\2\2\u0194\u0195\7\62\2\2\u0195"+
		"\u0196\t\f\2\2\u0196\u0198\5)\25\2\u0197\u0189\3\2\2\2\u0197\u0194\3\2"+
		"\2\2\u0198.\3\2\2\2\u0199\u019d\5!\21\2\u019a\u019d\5\'\24\2\u019b\u019d"+
		"\5-\27\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\7N\2\2\u019f\60\3\2\2\2\u01a0\u01a3\5!\21\2"+
		"\u01a1\u01a3\5\35\17\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\62"+
		"\3\2\2\2\u01a4\u01a5\5\27\f\2\u01a5\u01a6\7/\2\2\u01a6\u01a7\5\65\33\2"+
		"\u01a7\u01b8\3\2\2\2\u01a8\u01a9\5\27\f\2\u01a9\u01aa\7\60\2\2\u01aa\u01ab"+
		"\5\27\f\2\u01ab\u01ac\7/\2\2\u01ac\u01ad\5\65\33\2\u01ad\u01b8\3\2\2\2"+
		"\u01ae\u01af\5\27\f\2\u01af\u01b0\7\60\2\2\u01b0\u01b1\5\27\f\2\u01b1"+
		"\u01b2\7\60\2\2\u01b2\u01b5\5\27\f\2\u01b3\u01b4\7/\2\2\u01b4\u01b6\5"+
		"\65\33\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01a4\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b8\64\3\2\2"+
		"\2\u01b9\u01be\5\u00a3R\2\u01ba\u01bc\7/\2\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\5\27\f\2\u01be\u01bb\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\66\3\2\2\2\u01c0\u01c5\7$\2\2\u01c1\u01c4"+
		"\5E#\2\u01c2\u01c4\n\r\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7$\2\2\u01c98\3\2\2\2\u01ca\u01cb"+
		"\7B\2\2\u01cb\u01cc\7$\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\n\16\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7$\2\2\u01d4"+
		":\3\2\2\2\u01d5\u01d6\7$\2\2\u01d6\u01d7\7$\2\2\u01d7\u01d8\7$\2\2\u01d8"+
		"\u01e4\3\2\2\2\u01d9\u01e3\t\17\2\2\u01da\u01db\7$\2\2\u01db\u01dc\7$"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e3\n\20\2\2\u01de\u01df\7$\2\2\u01df"+
		"\u01e3\n\20\2\2\u01e0\u01e3\5E#\2\u01e1\u01e3\5I%\2\u01e2\u01d9\3\2\2"+
		"\2\u01e2\u01da\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7$\2\2\u01e8\u01e9\7$\2"+
		"\2\u01e9\u01ea\7$\2\2\u01ea<\3\2\2\2\u01eb\u01ec\7B\2\2\u01ec\u01ed\7"+
		"$\2\2\u01ed\u01ee\7$\2\2\u01ee\u01ef\7$\2\2\u01ef\u01fb\3\2\2\2\u01f0"+
		"\u01fa\t\21\2\2\u01f1\u01f2\7$\2\2\u01f2\u01f3\7$\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01fa\n\20\2\2\u01f5\u01f6\7$\2\2\u01f6\u01fa\n\20\2\2\u01f7"+
		"\u01fa\5E#\2\u01f8\u01fa\5I%\2\u01f9\u01f0\3\2\2\2\u01f9\u01f1\3\2\2\2"+
		"\u01f9\u01f5\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\7$\2\2\u01ff\u0200\7$\2\2\u0200\u0201\7$\2"+
		"\2\u0201>\3\2\2\2\u0202\u0206\7b\2\2\u0203\u0205\n\22\2\2\u0204\u0203"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7b\2\2\u020a@\3\2\2\2\u020b"+
		"\u020c\7^\2\2\u020c\u020d\7w\2\2\u020d\u020e\5#\22\2\u020e\u020f\5#\22"+
		"\2\u020f\u0210\5#\22\2\u0210\u0211\5#\22\2\u0211B\3\2\2\2\u0212\u0213"+
		"\7^\2\2\u0213\u0214\t\23\2\2\u0214D\3\2\2\2\u0215\u0218\5A!\2\u0216\u0218"+
		"\5C\"\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218F\3\2\2\2\u0219\u021a"+
		"\7w\2\2\u021a\u021b\5#\22\2\u021b\u021c\5#\22\2\u021c\u021d\5#\22\2\u021d"+
		"\u021e\5#\22\2\u021eH\3\2\2\2\u021f\u0220\n\24\2\2\u0220J\3\2\2\2\u0221"+
		"\u0222\n\25\2\2\u0222L\3\2\2\2\u0223\u0226\7)\2\2\u0224\u0227\5E#\2\u0225"+
		"\u0227\5K&\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2"+
		"\2\u0228\u0229\7)\2\2\u0229N\3\2\2\2\u022a\u022b\7f\2\2\u022b\u022c\7"+
		"c\2\2\u022c\u0232\7{\2\2\u022d\u022e\7f\2\2\u022e\u022f\7c\2\2\u022f\u0230"+
		"\7{\2\2\u0230\u0232\7u\2\2\u0231\u022a\3\2\2\2\u0231\u022d\3\2\2\2\u0232"+
		"P\3\2\2\2\u0233\u0234\7j\2\2\u0234R\3\2\2\2\u0235\u0236\7o\2\2\u0236\u0237"+
		"\7k\2\2\u0237\u0238\7p\2\2\u0238T\3\2\2\2\u0239\u023a\7u\2\2\u023aV\3"+
		"\2\2\2\u023b\u023c\7o\2\2\u023c\u023d\7u\2\2\u023dX\3\2\2\2\u023e\u023f"+
		"\7p\2\2\u023f\u0240\7u\2\2\u0240Z\3\2\2\2\u0241\u0243\7/\2\2\u0242\u0241"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244\u0245\5]/\2\u0245"+
		"\u0246\7<\2\2\u0246\u0248\3\2\2\2\u0247\u0244\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u024b\5\21\t\2\u024a\u024c\5Q)\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7<"+
		"\2\2\u024e\u0250\5\21\t\2\u024f\u0251\5S*\2\u0250\u024f\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7<\2\2\u0253\u0259\5\21"+
		"\t\2\u0254\u0255\7\60\2\2\u0255\u0257\5\27\f\2\u0256\u0258\5\23\n\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0254\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\5U+\2\u025c\u025b"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\\\3\2\2\2\u025e\u025f\5\61\31\2\u025f"+
		"\u0260\5O(\2\u0260^\3\2\2\2\u0261\u0262\5\61\31\2\u0262\u0263\5Q)\2\u0263"+
		"`\3\2\2\2\u0264\u0265\5\61\31\2\u0265\u0266\5S*\2\u0266b\3\2\2\2\u0267"+
		"\u0268\5\61\31\2\u0268\u0269\5U+\2\u0269d\3\2\2\2\u026a\u026b\5!\21\2"+
		"\u026b\u026c\5W,\2\u026cf\3\2\2\2\u026d\u026e\5!\21\2\u026e\u026f\5Y-"+
		"\2\u026fh\3\2\2\2\u0270\u0272\7/\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3"+
		"\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\5\21\t\2\u0274\u0275\7\61\2\2\u0275"+
		"\u0277\5\13\6\2\u0276\u0278\5\13\6\2\u0277\u0276\3\2\2\2\u0277\u0278\3"+
		"\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7\61\2\2\u027a\u027c\5\13\6\2\u027b"+
		"\u027d\5\13\6\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027dj\3\2\2\2"+
		"\u027e\u027f\5\u0095K\2\u027f\u0280\5\21\t\2\u0280\u0281\7<\2\2\u0281"+
		"\u028b\5\21\t\2\u0282\u0283\7<\2\2\u0283\u0289\5\21\t\2\u0284\u0285\7"+
		"\60\2\2\u0285\u0287\5\27\f\2\u0286\u0288\5\23\n\2\u0287\u0286\3\2\2\2"+
		"\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0284\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u0282\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"l\3\2\2\2\u028d\u028e\7-\2\2\u028e\u0290\5\13\6\2\u028f\u0291\5\13\6\2"+
		"\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0296\3\2\2\2\u0292\u0293"+
		"\7<\2\2\u0293\u0294\5\13\6\2\u0294\u0295\5\13\6\2\u0295\u0297\3\2\2\2"+
		"\u0296\u0292\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u02b7\3\2\2\2\u0298\u02b4"+
		"\7/\2\2\u0299\u029b\5\13\6\2\u029a\u029c\5\13\6\2\u029b\u029a\3\2\2\2"+
		"\u029b\u029c\3\2\2\2\u029c\u02a1\3\2\2\2\u029d\u029e\7<\2\2\u029e\u029f"+
		"\5\13\6\2\u029f\u02a0\5\13\6\2\u02a0\u02a2\3\2\2\2\u02a1\u029d\3\2\2\2"+
		"\u02a1\u02a2\3\2\2\2\u02a2\u02b5\3\2\2\2\u02a3\u02a4\7W\2\2\u02a4\u02a5"+
		"\7V\2\2\u02a5\u02ab\7E\2\2\u02a6\u02a7\7I\2\2\u02a7\u02a8\7O\2\2\u02a8"+
		"\u02ab\7V\2\2\u02a9\u02ab\7\\\2\2\u02aa\u02a3\3\2\2\2\u02aa\u02a6\3\2"+
		"\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02b5\3\2\2\2\u02ac\u02ad\5\31\r\2\u02ad"+
		"\u02ae\5\31\r\2\u02ae\u02b0\7\61\2\2\u02af\u02b1\5\31\r\2\u02b0\u02af"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b5\3\2\2\2\u02b4\u0299\3\2\2\2\u02b4\u02aa\3\2\2\2\u02b4\u02ac\3\2"+
		"\2\2\u02b5\u02b7\3\2\2\2\u02b6\u028d\3\2\2\2\u02b6\u0298\3\2\2\2\u02b7"+
		"n\3\2\2\2\u02b8\u02ba\7/\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\5\27\f\2\u02bc\u02bf\5\u00a5S\2\u02bd\u02be"+
		"\7<\2\2\u02be\u02c0\7N\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"p\3\2\2\2\u02c1\u02c3\7/\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\5\27\f\2\u02c5\u02c6\5\u00a5S\2\u02c6\u02c7"+
		"\7<\2\2\u02c7\u02c8\t\26\2\2\u02c8\u02e4\3\2\2\2\u02c9\u02cb\7/\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\5\27"+
		"\f\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d0\7\60\2\2\u02d0\u02d2\5\27\f\2\u02d1\u02d3\5\23\n\2\u02d2\u02d1"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d7\5\u00a5S"+
		"\2\u02d5\u02d6\7<\2\2\u02d6\u02d8\t\27\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8"+
		"\3\2\2\2\u02d8\u02e4\3\2\2\2\u02d9\u02db\7/\2\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\5\27\f\2\u02dd\u02de\5"+
		"\23\n\2\u02de\u02e1\5\u00a5S\2\u02df\u02e0\7<\2\2\u02e0\u02e2\t\27\2\2"+
		"\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02c2"+
		"\3\2\2\2\u02e3\u02ca\3\2\2\2\u02e3\u02da\3\2\2\2\u02e4r\3\2\2\2\u02e5"+
		"\u02e6\7\60\2\2\u02e6\u02e7\7\60\2\2\u02e7t\3\2\2\2\u02e8\u02e9\7>\2\2"+
		"\u02e9\u02ea\7\60\2\2\u02ea\u02eb\7\60\2\2\u02eb\u02ec\7>\2\2\u02ecv\3"+
		"\2\2\2\u02ed\u02ee\7>\2\2\u02ee\u02ef\7\60\2\2\u02ef\u02f0\7\60\2\2\u02f0"+
		"x\3\2\2\2\u02f1\u02f2\7\60\2\2\u02f2\u02f3\7\60\2\2\u02f3\u02f4\7>\2\2"+
		"\u02f4z\3\2\2\2\u02f5\u02f6\7\60\2\2\u02f6|\3\2\2\2\u02f7\u02f8\7<\2\2"+
		"\u02f8~\3\2\2\2\u02f9\u02fa\7=\2\2\u02fa\u0080\3\2\2\2\u02fb\u02fc\7?"+
		"\2\2\u02fc\u0082\3\2\2\2\u02fd\u02fe\7}\2\2\u02fe\u0084\3\2\2\2\u02ff"+
		"\u0300\7\177\2\2\u0300\u0086\3\2\2\2\u0301\u0302\7*\2\2\u0302\u0088\3"+
		"\2\2\2\u0303\u0304\7+\2\2\u0304\u008a\3\2\2\2\u0305\u0306\7]\2\2\u0306"+
		"\u008c\3\2\2\2\u0307\u0308\7_\2\2\u0308\u008e\3\2\2\2\u0309\u030a\7.\2"+
		"\2\u030a\u0090\3\2\2\2\u030b\u030c\7\61\2\2\u030c\u0092\3\2\2\2\u030d"+
		"\u030e\7/\2\2\u030e\u0094\3\2\2\2\u030f\u0310\7B\2\2\u0310\u0096\3\2\2"+
		"\2\u0311\u0312\7-\2\2\u0312\u0098\3\2\2\2\u0313\u0314\7a\2\2\u0314\u009a"+
		"\3\2\2\2\u0315\u0316\7\60\2\2\u0316\u0317\7d\2\2\u0317\u0318\7n\2\2\u0318"+
		"\u0319\7q\2\2\u0319\u031a\7d\2\2\u031a\u031b\3\2\2\2\u031b\u031c\5\u009d"+
		"O\2\u031c\u009c\3\2\2\2\u031d\u0321\7*\2\2\u031e\u0320\t\30\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u032b\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0328\t\31\2\2\u0325"+
		"\u0327\t\30\2\2\u0326\u0325\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3"+
		"\2\2\2\u0328\u0329\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032b"+
		"\u0324\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7+\2\2\u0330\u009e\3\2\2\2\u0331"+
		"\u0332\t\35\2\2\u0332\u00a0\3\2\2\2\u0333\u0334\t\36\2\2\u0334\u00a2\3"+
		"\2\2\2\u0335\u0337\t\37\2\2\u0336\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u00a4\3\2\2\2\u033a\u033e\5\u009f"+
		"P\2\u033b\u033d\5\u00a1Q\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2\2\u033e"+
		"\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u00a6\3\2\2\2\u0340\u033e\3\2"+
		"\2\2\u0341\u0342\7\61\2\2\u0342\u0343\7,\2\2\u0343\u0348\3\2\2\2\u0344"+
		"\u0347\5\u00a7T\2\u0345\u0347\13\2\2\2\u0346\u0344\3\2\2\2\u0346\u0345"+
		"\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0349\3\2\2\2\u0348\u0346\3\2\2\2\u0349"+
		"\u034b\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034c\7,\2\2\u034c\u034d\7\61"+
		"\2\2\u034d\u034e\3\2\2\2\u034e\u034f\bT\2\2\u034f\u00a8\3\2\2\2\u0350"+
		"\u0354\7%\2\2\u0351\u0352\7\61\2\2\u0352\u0354\7\61\2\2\u0353\u0350\3"+
		"\2\2\2\u0353\u0351\3\2\2\2\u0354\u0358\3\2\2\2\u0355\u0357\n\32\2\2\u0356"+
		"\u0355\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035b\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c\bU\2\2\u035c"+
		"\u00aa\3\2\2\2\u035d\u0361\t\33\2\2\u035e\u035f\7^\2\2\u035f\u0361\7\f"+
		"\2\2\u0360\u035d\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\bV"+
		"\2\2\u0365\u00ac\3\2\2\2\u0366\u0368\t\34\2\2\u0367\u0366\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u00ae\3\2"+
		"\2\2k\2\u00b6\u00be\u00c8\u00ce\u00d6\u00de\u00e4\u00ea\u00ee\u00f6\u00fc"+
		"\u0102\u0108\u010d\u0110\u0115\u011a\u011e\u0122\u0125\u0128\u012d\u0130"+
		"\u0133\u0138\u013b\u0140\u0143\u0146\u014b\u0151\u0154\u0158\u015e\u0160"+
		"\u0163\u016b\u016e\u0176\u017e\u0184\u0187\u018f\u0197\u019c\u01a2\u01b5"+
		"\u01b7\u01bb\u01be\u01c3\u01c5\u01d0\u01e2\u01e4\u01f9\u01fb\u0206\u0217"+
		"\u0226\u0231\u0242\u0247\u024b\u0250\u0257\u0259\u025c\u0271\u0277\u027c"+
		"\u0287\u0289\u028b\u0290\u0296\u029b\u02a1\u02aa\u02b2\u02b4\u02b6\u02b9"+
		"\u02bf\u02c2\u02ca\u02cd\u02d2\u02d7\u02da\u02e1\u02e3\u0321\u0328\u032d"+
		"\u0338\u033e\u0346\u0348\u0353\u0358\u0360\u0362\u0369\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}