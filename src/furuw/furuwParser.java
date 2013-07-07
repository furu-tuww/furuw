// Output created by jacc on Mon Jul 08 02:47:05 JST 2013


package furuw;
import java.util.*;
import furuw.ast.*;

class furuwParser implements furuwTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private ASTNode[] yysv;
    private ASTNode yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new ASTNode[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 22:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 44;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 24:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 25:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 26:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 27:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 9;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 28:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    switch (yytok) {
                        case ')':
                            yyn = 10;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    switch (yytok) {
                        case '%':
                            yyn = 11;
                            continue;
                        case '*':
                            yyn = 12;
                            continue;
                        case '+':
                            yyn = 13;
                            continue;
                        case '-':
                            yyn = 14;
                            continue;
                        case '/':
                            yyn = 15;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 9;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 9;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 9;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 9;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 2;
                            continue;
                        case NUMBER:
                            yyn = 3;
                            continue;
                        case STRING:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 9;
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case ')':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case ')':
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case ')':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case ')':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 47;
                    continue;

                case 44:
                    return true;
                case 45:
                    yyerror("stack overflow");
                case 46:
                    return false;
                case 47:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        ASTNode[] newyysv = new ASTNode[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys2() {
        switch (yytok) {
            case ENDINPUT:
            case '%':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr2();
        }
        return 47;
    }

    private int yys3() {
        switch (yytok) {
            case ENDINPUT:
            case '%':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr3();
        }
        return 47;
    }

    private int yys4() {
        switch (yytok) {
            case ENDINPUT:
            case '%':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr4();
        }
        return 47;
    }

    private int yys6() {
        switch (yytok) {
            case '%':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr6();
        }
        return 47;
    }

    private int yys10() {
        switch (yytok) {
            case ENDINPUT:
            case '%':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr1();
        }
        return 47;
    }

    private int yys16() {
        switch (yytok) {
            case '%':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr5();
        }
        return 47;
    }

    private int yyr1() { // primary : '(' expr ')'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return yypprimary();
    }

    private int yyr2() { // primary : IDENTIFIER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypprimary();
    }

    private int yyr3() { // primary : NUMBER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypprimary();
    }

    private int yyr4() { // primary : STRING
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypprimary();
    }

    private int yypprimary() {
        switch (yyst[yysp-1]) {
            case 9: return 16;
            case 0: return 1;
            default: return 6;
        }
    }

    private int yyr7() { // expr : factor '+' factor
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return 7;
    }

    private int yyr8() { // expr : factor '-' factor
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return 7;
    }

    private int yyr9() { // expr : factor '*' factor
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return 7;
    }

    private int yyr10() { // expr : factor '/' factor
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return 7;
    }

    private int yyr11() { // expr : factor '%' factor
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return 7;
    }

    private int yyr5() { // factor : '-' primary
        { yyrv = new NegativeExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-1]); }} ); }
        yysv[yysp-=2] = yyrv;
        return yypfactor();
    }

    private int yyr6() { // factor : primary
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 14: return 20;
            case 13: return 19;
            case 12: return 18;
            case 11: return 17;
            case 5: return 8;
            default: return 21;
        }
    }

    protected String[] yyerrmsgs = {
    };


  /* フィールドやメソッドの定義 */

  furuwParser(Lexer l) {
      lexer = l;
  }

  private Lexer lexer;

  private void yyerror(String msg) {
      System.out.println("エラー: " + msg);
      System.exit(1);
  }

  public static void main(String[] args) {
      Lexer lexer = new Lexer(System.in);
      furuwParser parser = new furuwParser(lexer);
      lexer.nextToken();
      parser.parse();    // parse the input
  }

}
