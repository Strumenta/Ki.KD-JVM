parser grammar KDParser;

options { tokenVocab = KDLexer; }

/**
 * KD Parser
 *
 * @author Daniel Leuck
 */
tagList: NL* (tag NL*)*;
tag:
    ( ( (annotationList NL*)? nsName valueList? ) | (valueList) ) attributeList? (';' | NL | ('{' tagList '}'))?;

value:
    // Strings
    stringLiteral | CharLiteral | ID
    // Numbers
    | IntegerLiteral | HexLiteral | BinLiteral | LongLiteral
    | FloatLiteral | DoubleLiteral | DecimalLiteral
    | TRUE | FALSE
    | NULL
    // Data Structures
    | list | map
    // Date, DateTime and Duration
    | dateTime
    | duration
    | quantity
    // etc
    | URL
    | range
    | Version
    // Encodings
    | Blob
    ;

// String
stringLiteral:
    SimpleString |
    RawString |
    BlockString |
    BlockRawString |
    BlockRawAltString;

// Duration
duration: CompoundDuration | DayDuration | HourDuration | MinuteDuration | SecondDuration | MillisecondDuration
          | NanosecondDuration;

// Quantity
quantity: IntegerQuantityLiteral | DecimalQuantityLiteral;

// Range --- ---

rangeOp: InclusiveRangeOp | ExclusiveRangeOp | ExclusiveLeftOp | ExclusiveRightOp;

intRange: ('_' rangeOp IntegerLiteral) | (IntegerLiteral rangeOp '_') | (IntegerLiteral rangeOp IntegerLiteral);
longRange: ('_' rangeOp LongLiteral) | (LongLiteral rangeOp '_') | (LongLiteral rangeOp LongLiteral);
floatRange: ('_' rangeOp FloatLiteral) | (FloatLiteral rangeOp '_') | (FloatLiteral rangeOp FloatLiteral);
doubleRange: ('_' rangeOp DoubleLiteral) | (DoubleLiteral rangeOp '_') | (DoubleLiteral rangeOp DoubleLiteral);
decimalRange: ('_' rangeOp DecimalLiteral) | (DecimalLiteral rangeOp '_') | (DecimalLiteral rangeOp DecimalLiteral);
durationRange: ('_' rangeOp duration) | (duration rangeOp '_') | (duration rangeOp duration);
dateTimeRange: ('_' rangeOp dateTime) | (dateTime rangeOp '_') | (dateTime rangeOp dateTime);
versionRange: ('_' rangeOp Version) | (Version rangeOp '_') | (Version rangeOp Version);
charRange: ('_' rangeOp CharLiteral) | (CharLiteral rangeOp '_') | (CharLiteral rangeOp CharLiteral);
stringRange: ('_' rangeOp stringLiteral) | (stringLiteral rangeOp '_') | (stringLiteral rangeOp stringLiteral);

range: intRange | longRange | floatRange | doubleRange | decimalRange | durationRange | dateTimeRange | versionRange
       | charRange | stringRange;

// Tag Parts --- ---

valueList: value+;

attribute: nsName '=' value;

attributeList: attribute+;

// Tag name or attribute key, optionally prefixed by a namespace
nsName: (ID ':')? ID;

// DATA STRUCTURES --- ---

list: ('[' NL* value (COMMA? value)* NL* ']') | ('[' ']');

pair: NL* value '=' NL* value NL*;

map: ('[' NL* pair (COMMA? pair)* NL* ']') | ('[' '=' ']');

// ANNOTATIONS
annotation: '@' nsName ('(' valueList? attributeList? ')')?;
annotationList: annotation (NL* annotation)*;

// ETC

dateTime: Date (Time TimeZone?)?;