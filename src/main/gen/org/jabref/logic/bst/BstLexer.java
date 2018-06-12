// $ANTLR 3.5.2 /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g 2018-06-12 09:29:05
// Generated by ANTLR
package org.jabref.logic.bst;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class BstLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int COMMANDS=4;
	public static final int ENTRY=5;
	public static final int EXECUTE=6;
	public static final int FUNCTION=7;
	public static final int IDENTIFIER=8;
	public static final int IDLIST=9;
	public static final int INTEGER=10;
	public static final int INTEGERS=11;
	public static final int ITERATE=12;
	public static final int LETTER=13;
	public static final int LINE_COMMENT=14;
	public static final int MACRO=15;
	public static final int NUMERAL=16;
	public static final int QUOTED=17;
	public static final int READ=18;
	public static final int REVERSE=19;
	public static final int SORT=20;
	public static final int STACK=21;
	public static final int STRING=22;
	public static final int STRINGS=23;
	public static final int WS=24;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public BstLexer() {} 
	public BstLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public BstLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g"; }

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:5:7: ( '*' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:6:7: ( '+' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:7:7: ( '-' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:8:7: ( ':=' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:8:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:9:7: ( '<' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:9:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:10:7: ( '=' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:10:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:11:7: ( '>' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:11:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:12:7: ( '{' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:12:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:13:7: ( '}' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:13:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "STRINGS"
	public final void mSTRINGS() throws RecognitionException {
		try {
			int _type = STRINGS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:61:9: ( 'STRINGS' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:61:11: 'STRINGS'
			{
			match("STRINGS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGS"

	// $ANTLR start "INTEGERS"
	public final void mINTEGERS() throws RecognitionException {
		try {
			int _type = INTEGERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:62:10: ( 'INTEGERS' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:62:12: 'INTEGERS'
			{
			match("INTEGERS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGERS"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:63:10: ( 'FUNCTION' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:63:12: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "EXECUTE"
	public final void mEXECUTE() throws RecognitionException {
		try {
			int _type = EXECUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:64:9: ( 'EXECUTE' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:64:11: 'EXECUTE'
			{
			match("EXECUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXECUTE"

	// $ANTLR start "SORT"
	public final void mSORT() throws RecognitionException {
		try {
			int _type = SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:65:6: ( 'SORT' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:65:8: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SORT"

	// $ANTLR start "ITERATE"
	public final void mITERATE() throws RecognitionException {
		try {
			int _type = ITERATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:66:9: ( 'ITERATE' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:66:11: 'ITERATE'
			{
			match("ITERATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ITERATE"

	// $ANTLR start "REVERSE"
	public final void mREVERSE() throws RecognitionException {
		try {
			int _type = REVERSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:67:9: ( 'REVERSE' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:67:11: 'REVERSE'
			{
			match("REVERSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REVERSE"

	// $ANTLR start "ENTRY"
	public final void mENTRY() throws RecognitionException {
		try {
			int _type = ENTRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:68:7: ( 'ENTRY' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:68:9: 'ENTRY'
			{
			match("ENTRY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:69:6: ( 'READ' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:69:8: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "MACRO"
	public final void mMACRO() throws RecognitionException {
		try {
			int _type = MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:70:7: ( 'MACRO' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:70:9: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MACRO"

	// $ANTLR start "QUOTED"
	public final void mQUOTED() throws RecognitionException {
		try {
			int _type = QUOTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:73:2: ( '\\'' IDENTIFIER )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:73:4: '\\'' IDENTIFIER
			{
			match('\''); 
			mIDENTIFIER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTED"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:76:2: ( LETTER ( LETTER | NUMERAL )* )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:76:4: LETTER ( LETTER | NUMERAL )*
			{
			mLETTER(); 

			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:76:11: ( LETTER | NUMERAL )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='$'||LA1_0=='.'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
					{
					if ( input.LA(1)=='$'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:79:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '.' | '$' ) )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
			{
			if ( input.LA(1)=='$'||input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:82:2: ( '\"' (~ ( '\"' ) )* '\"' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:82:4: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:82:8: (~ ( '\"' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:85:2: ( '#' ( '+' | '-' )? ( NUMERAL )+ )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:85:4: '#' ( '+' | '-' )? ( NUMERAL )+
			{
			match('#'); 
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:85:8: ( '+' | '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='+'||LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:85:19: ( NUMERAL )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "NUMERAL"
	public final void mNUMERAL() throws RecognitionException {
		try {
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:88:2: ( ( '0' .. '9' ) )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:91:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:91:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:91:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			_channel=99;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:94:5: ( '%' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:94:7: '%' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('%'); 
			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:94:11: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:94:25: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:94:25: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=99;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | STRINGS | INTEGERS | FUNCTION | EXECUTE | SORT | ITERATE | REVERSE | ENTRY | READ | MACRO | QUOTED | IDENTIFIER | STRING | INTEGER | WS | LINE_COMMENT )
		int alt8=25;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:10: T__25
				{
				mT__25(); 

				}
				break;
			case 2 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:16: T__26
				{
				mT__26(); 

				}
				break;
			case 3 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:22: T__27
				{
				mT__27(); 

				}
				break;
			case 4 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:28: T__28
				{
				mT__28(); 

				}
				break;
			case 5 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:34: T__29
				{
				mT__29(); 

				}
				break;
			case 6 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:40: T__30
				{
				mT__30(); 

				}
				break;
			case 7 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:46: T__31
				{
				mT__31(); 

				}
				break;
			case 8 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:52: T__32
				{
				mT__32(); 

				}
				break;
			case 9 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:58: T__33
				{
				mT__33(); 

				}
				break;
			case 10 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:64: STRINGS
				{
				mSTRINGS(); 

				}
				break;
			case 11 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:72: INTEGERS
				{
				mINTEGERS(); 

				}
				break;
			case 12 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:81: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 13 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:90: EXECUTE
				{
				mEXECUTE(); 

				}
				break;
			case 14 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:98: SORT
				{
				mSORT(); 

				}
				break;
			case 15 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:103: ITERATE
				{
				mITERATE(); 

				}
				break;
			case 16 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:111: REVERSE
				{
				mREVERSE(); 

				}
				break;
			case 17 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:119: ENTRY
				{
				mENTRY(); 

				}
				break;
			case 18 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:125: READ
				{
				mREAD(); 

				}
				break;
			case 19 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:130: MACRO
				{
				mMACRO(); 

				}
				break;
			case 20 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:136: QUOTED
				{
				mQUOTED(); 

				}
				break;
			case 21 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:143: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 22 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:154: STRING
				{
				mSTRING(); 

				}
				break;
			case 23 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:161: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 24 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:169: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// /home/ufscar/Desktop/Borto/jabref2/src/main/antlr3/org/jabref/bst/Bst.g:1:172: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\12\uffff\6\21\6\uffff\24\21\1\64\6\21\1\73\2\21\1\uffff\4\21\1\102\1"+
		"\21\1\uffff\1\104\5\21\1\uffff\1\21\1\uffff\1\113\1\21\1\115\1\21\1\117"+
		"\1\120\1\uffff\1\121\1\uffff\1\122\4\uffff";
	static final String DFA8_eofS =
		"\123\uffff";
	static final String DFA8_minS =
		"\1\11\11\uffff\1\117\1\116\1\125\1\116\1\105\1\101\6\uffff\2\122\1\124"+
		"\1\105\1\116\1\105\1\124\1\101\1\103\1\111\1\124\1\105\1\122\2\103\1\122"+
		"\1\105\1\104\1\122\1\116\1\44\1\107\1\101\1\124\1\125\1\131\1\122\1\44"+
		"\1\117\1\107\1\uffff\1\105\1\124\1\111\1\124\1\44\1\123\1\uffff\1\44\1"+
		"\123\1\122\1\105\1\117\1\105\1\uffff\1\105\1\uffff\1\44\1\123\1\44\1\116"+
		"\2\44\1\uffff\1\44\1\uffff\1\44\4\uffff";
	static final String DFA8_maxS =
		"\1\175\11\uffff\2\124\1\125\1\130\1\105\1\101\6\uffff\2\122\1\124\1\105"+
		"\1\116\1\105\1\124\1\126\1\103\1\111\1\124\1\105\1\122\2\103\1\122\1\105"+
		"\1\104\1\122\1\116\1\172\1\107\1\101\1\124\1\125\1\131\1\122\1\172\1\117"+
		"\1\107\1\uffff\1\105\1\124\1\111\1\124\1\172\1\123\1\uffff\1\172\1\123"+
		"\1\122\1\105\1\117\1\105\1\uffff\1\105\1\uffff\1\172\1\123\1\172\1\116"+
		"\2\172\1\uffff\1\172\1\uffff\1\172\4\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\6\uffff\1\24\1\25\1\26"+
		"\1\27\1\30\1\31\36\uffff\1\16\6\uffff\1\22\6\uffff\1\21\1\uffff\1\23\6"+
		"\uffff\1\12\1\uffff\1\17\1\uffff\1\15\1\20\1\13\1\14";
	static final String DFA8_specialS =
		"\123\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\24\2\uffff\1\24\22\uffff\1\24\1\uffff\1\22\1\23\1\21\1\25\1\uffff"+
			"\1\20\2\uffff\1\1\1\2\1\uffff\1\3\1\21\13\uffff\1\4\1\uffff\1\5\1\6\1"+
			"\7\2\uffff\4\21\1\15\1\14\2\21\1\13\3\21\1\17\4\21\1\16\1\12\7\21\6\uffff"+
			"\32\21\1\10\1\uffff\1\11",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\27\4\uffff\1\26",
			"\1\30\5\uffff\1\31",
			"\1\32",
			"\1\34\11\uffff\1\33",
			"\1\35",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\47\24\uffff\1\46",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\74",
			"\1\75",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\103",
			"",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"\1\112",
			"",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\114",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\116",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"",
			"\1\21\11\uffff\1\21\1\uffff\12\21\7\uffff\32\21\6\uffff\32\21",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | STRINGS | INTEGERS | FUNCTION | EXECUTE | SORT | ITERATE | REVERSE | ENTRY | READ | MACRO | QUOTED | IDENTIFIER | STRING | INTEGER | WS | LINE_COMMENT );";
		}
	}

}
