
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Oct 05 18:36:48 CEST 2019
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Oct 05 18:36:48 CEST 2019
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\010\000\002\006" +
    "\002\000\002\006\004\000\002\006\004\000\002\006\004" +
    "\000\002\013\003\000\002\013\003\000\002\015\004\000" +
    "\002\016\005\000\002\016\005\000\002\017\003\000\002" +
    "\025\003\000\002\025\003\000\002\025\004\000\002\020" +
    "\005\000\002\020\003\000\002\021\003\000\002\021\003" +
    "\000\002\022\003\000\002\022\003\000\002\007\005\000" +
    "\002\007\003\000\002\024\005\000\002\024\003\000\002" +
    "\023\005\000\002\023\003\000\002\026\003\000\002\026" +
    "\003\000\002\026\003\000\002\026\003\000\002\026\003" +
    "\000\002\026\003\000\002\027\003\000\002\027\003\000" +
    "\002\041\005\000\002\041\003\000\002\030\005\000\002" +
    "\030\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\004\004\004\001\002\000\004\007\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\010\010\001\002\000\004\011\011\001\002\000" +
    "\012\012\uffff\013\021\014\013\043\016\001\002\000\004" +
    "\012\076\001\002\000\004\043\ufffa\001\002\000\012\012" +
    "\uffff\013\021\014\013\043\016\001\002\000\014\012\uffff" +
    "\013\021\014\013\023\072\043\016\001\002\000\004\023" +
    "\024\001\002\000\012\012\uffff\013\021\014\013\043\016" +
    "\001\002\000\004\043\022\001\002\000\004\043\ufffb\001" +
    "\002\000\014\012\ufff9\013\ufff9\014\ufff9\023\ufff9\043\ufff9" +
    "\001\002\000\004\012\ufffd\001\002\000\012\007\031\025" +
    "\037\043\033\045\034\001\002\000\016\012\uffdb\013\uffdb" +
    "\014\uffdb\037\uffdb\040\uffdb\043\uffdb\001\002\000\044\010" +
    "\uffeb\012\uffeb\013\uffeb\014\uffeb\024\uffeb\025\uffeb\026\055" +
    "\027\054\031\uffeb\032\uffeb\033\uffeb\034\uffeb\035\uffeb\036" +
    "\uffeb\037\uffeb\040\uffeb\043\uffeb\001\002\000\012\012\ufff7" +
    "\013\ufff7\014\ufff7\043\ufff7\001\002\000\046\010\uffe7\012" +
    "\uffe7\013\uffe7\014\uffe7\024\uffe7\025\uffe7\026\uffe7\027\uffe7" +
    "\030\uffe7\031\uffe7\032\uffe7\033\uffe7\034\uffe7\035\uffe7\036" +
    "\uffe7\037\uffe7\040\uffe7\043\uffe7\001\002\000\012\007\031" +
    "\025\037\043\033\045\034\001\002\000\046\010\ufff1\012" +
    "\ufff1\013\ufff1\014\ufff1\024\ufff1\025\ufff1\026\ufff1\027\ufff1" +
    "\030\ufff1\031\ufff1\032\ufff1\033\ufff1\034\ufff1\035\ufff1\036" +
    "\ufff1\037\ufff1\040\ufff1\043\ufff1\001\002\000\046\010\ufff4" +
    "\012\ufff4\013\ufff4\014\ufff4\024\ufff4\025\ufff4\026\ufff4\027" +
    "\ufff4\030\ufff4\031\ufff4\032\ufff4\033\ufff4\034\ufff4\035\ufff4" +
    "\036\ufff4\037\ufff4\040\ufff4\043\ufff4\001\002\000\046\010" +
    "\ufff5\012\ufff5\013\ufff5\014\ufff5\024\ufff5\025\ufff5\026\ufff5" +
    "\027\ufff5\030\ufff5\031\ufff5\032\ufff5\033\ufff5\034\ufff5\035" +
    "\ufff5\036\ufff5\037\ufff5\040\ufff5\043\ufff5\001\002\000\046" +
    "\010\uffe9\012\uffe9\013\uffe9\014\uffe9\024\uffe9\025\uffe9\026" +
    "\uffe9\027\uffe9\030\060\031\uffe9\032\uffe9\033\uffe9\034\uffe9" +
    "\035\uffe9\036\uffe9\037\uffe9\040\uffe9\043\uffe9\001\002\000" +
    "\016\012\ufff6\013\ufff6\014\ufff6\037\066\040\064\043\ufff6" +
    "\001\002\000\004\045\063\001\002\000\036\012\uffdd\013" +
    "\uffdd\014\uffdd\024\047\025\052\031\044\032\041\033\050" +
    "\034\043\035\051\036\042\037\uffdd\040\uffdd\043\uffdd\001" +
    "\002\000\012\007\uffe3\025\uffe3\043\uffe3\045\uffe3\001\002" +
    "\000\012\007\uffe1\025\uffe1\043\uffe1\045\uffe1\001\002\000" +
    "\012\007\uffe5\025\uffe5\043\uffe5\045\uffe5\001\002\000\012" +
    "\007\uffe4\025\uffe4\043\uffe4\045\uffe4\001\002\000\012\007" +
    "\031\025\037\043\033\045\034\001\002\000\012\007\031" +
    "\025\037\043\033\045\034\001\002\000\012\007\ufff0\025" +
    "\ufff0\043\ufff0\045\ufff0\001\002\000\012\007\uffe6\025\uffe6" +
    "\043\uffe6\045\uffe6\001\002\000\012\007\uffe2\025\uffe2\043" +
    "\uffe2\045\uffe2\001\002\000\012\007\uffef\025\uffef\043\uffef" +
    "\045\uffef\001\002\000\044\010\uffec\012\uffec\013\uffec\014" +
    "\uffec\024\uffec\025\uffec\026\055\027\054\031\uffec\032\uffec" +
    "\033\uffec\034\uffec\035\uffec\036\uffec\037\uffec\040\uffec\043" +
    "\uffec\001\002\000\012\007\uffed\025\uffed\043\uffed\045\uffed" +
    "\001\002\000\012\007\uffee\025\uffee\043\uffee\045\uffee\001" +
    "\002\000\012\007\031\025\037\043\033\045\034\001\002" +
    "\000\046\010\uffea\012\uffea\013\uffea\014\uffea\024\uffea\025" +
    "\uffea\026\uffea\027\uffea\030\060\031\uffea\032\uffea\033\uffea" +
    "\034\uffea\035\uffea\036\uffea\037\uffea\040\uffea\043\uffea\001" +
    "\002\000\012\007\031\025\037\043\033\045\034\001\002" +
    "\000\046\010\uffe8\012\uffe8\013\uffe8\014\uffe8\024\uffe8\025" +
    "\uffe8\026\uffe8\027\uffe8\030\uffe8\031\uffe8\032\uffe8\033\uffe8" +
    "\034\uffe8\035\uffe8\036\uffe8\037\uffe8\040\uffe8\043\uffe8\001" +
    "\002\000\022\012\uffde\013\uffde\014\uffde\024\047\025\052" +
    "\037\uffde\040\uffde\043\uffde\001\002\000\046\010\ufff3\012" +
    "\ufff3\013\ufff3\014\ufff3\024\ufff3\025\ufff3\026\ufff3\027\ufff3" +
    "\030\ufff3\031\ufff3\032\ufff3\033\ufff3\034\ufff3\035\ufff3\036" +
    "\ufff3\037\ufff3\040\ufff3\043\ufff3\001\002\000\012\007\uffdf" +
    "\025\uffdf\043\uffdf\045\uffdf\001\002\000\012\007\031\025" +
    "\037\043\033\045\034\001\002\000\012\007\uffe0\025\uffe0" +
    "\043\uffe0\045\uffe0\001\002\000\016\012\uffdc\013\uffdc\014" +
    "\uffdc\037\uffdc\040\uffdc\043\uffdc\001\002\000\010\010\071" +
    "\024\047\025\052\001\002\000\046\010\ufff2\012\ufff2\013" +
    "\ufff2\014\ufff2\024\ufff2\025\ufff2\026\ufff2\027\ufff2\030\ufff2" +
    "\031\ufff2\032\ufff2\033\ufff2\034\ufff2\035\ufff2\036\ufff2\037" +
    "\ufff2\040\ufff2\043\ufff2\001\002\000\012\007\031\025\037" +
    "\043\033\045\034\001\002\000\004\012\ufffe\001\002\000" +
    "\012\012\ufff8\013\ufff8\014\ufff8\043\ufff8\001\002\000\004" +
    "\012\ufffc\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\006\011\013\017\015\014\016\016\042" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\006\074\013\017\015\014\016\016\042\013\001\001\000" +
    "\014\006\072\013\017\015\014\016\016\042\013\001\001" +
    "\000\002\001\001\000\014\006\022\013\017\015\014\016" +
    "\016\042\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\022\007\037\017" +
    "\026\020\027\023\034\024\025\025\031\030\035\041\024" +
    "\001\001\000\002\001\001\000\004\022\055\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\007\067\020\027" +
    "\023\034\024\025\025\031\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\027\064\001\001\000\002\001\001\000\006\021\045\026" +
    "\044\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\007\061\020\027\023" +
    "\034\024\025\025\031\001\001\000\012\020\027\023\034" +
    "\024\052\025\031\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\022\055" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\020" +
    "\027\023\056\025\031\001\001\000\002\001\001\000\006" +
    "\020\060\025\031\001\001\000\002\001\001\000\004\021" +
    "\045\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\007\037\020\027\023\034\024\025\025\031\041\066\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\021\045" +
    "\001\001\000\002\001\001\000\022\007\037\017\073\020" +
    "\027\023\034\024\025\025\031\030\035\041\024\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // OP_LOGICA ::= OP2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LOGICA",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // OP_LOGICA ::= OP_LOGICA OPERADOR_LOGICO OP2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LOGICA",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // OP2 ::= OP_ARITMETICA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP2",31, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // OP2 ::= OP_ARITMETICA OPERADOR_RELACIONAL OP_ARITMETICA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP2",31, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // OPERADOR_LOGICO ::= O_logico 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_LOGICO",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OPERADOR_LOGICO ::= Y_logico 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_LOGICO",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // OPERADOR_RELACIONAL ::= Diferencia 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // OPERADOR_RELACIONAL ::= Igual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // OPERADOR_RELACIONAL ::= Menor_igual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // OPERADOR_RELACIONAL ::= Menor 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // OPERADOR_RELACIONAL ::= Mayor_igual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // OPERADOR_RELACIONAL ::= Mayor 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // OP_MOD ::= FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_MOD",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // OP_MOD ::= OP_MOD Modulo FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_MOD",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TERM ::= OP_MOD 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TERM",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TERM ::= TERM OPERADOR_MULT OP_MOD 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TERM",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // OP_ARITMETICA ::= TERM 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // OP_ARITMETICA ::= OP_ARITMETICA OPERADOR_SUMA TERM 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OPERADOR_MULT ::= Division 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_MULT",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OPERADOR_MULT ::= Multiplicacion 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_MULT",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OPERADOR_SUMA ::= Resta 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_SUMA",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OPERADOR_SUMA ::= Suma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_SUMA",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // FACTOR ::= ELEMENTO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // FACTOR ::= Parentesis_a OP_ARITMETICA Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ELEMENTO ::= Resta Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELEMENTO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ELEMENTO ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELEMENTO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ELEMENTO ::= Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELEMENTO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OPERACION ::= OP_LOGICA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // AS_VARIABLE ::= Identificador Asignacion OPERACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AS_VARIABLE",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // AS_VARIABLE ::= DE_VARIABLE Asignacion OPERACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AS_VARIABLE",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DE_VARIABLE ::= TI_VARIABLE Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DE_VARIABLE",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TI_VARIABLE ::= Logico 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TI_VARIABLE",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TI_VARIABLE ::= Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TI_VARIABLE",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SEGMENTO ::= FUNCION SEGMENTO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SEGMENTO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SEGMENTO ::= AS_VARIABLE SEGMENTO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SEGMENTO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SEGMENTO ::= DE_VARIABLE SEGMENTO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SEGMENTO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SEGMENTO ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SEGMENTO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Programa Parentesis_a Parentesis_c Llave_a SEGMENTO Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

