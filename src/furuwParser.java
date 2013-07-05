package src;
// Output created by jacc on Sun Jun 23 04:05:48 JST 2013


class furuwParser implements furuwTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private double[] yysv;
    private double yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new double[yyss];
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
                case 17:
                    switch (yytok) {
                        case ENDINPUT:
                        case '(':
                        case NUMBER:
                        case EOL:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 18:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 34;
                            continue;
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                        case EOL:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 19:
                    switch (yytok) {
                        case '*':
                            yyn = 6;
                            continue;
                        case '+':
                            yyn = 7;
                            continue;
                        case '-':
                            yyn = 8;
                            continue;
                        case '/':
                            yyn = 9;
                            continue;
                        case EOL:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 20:
                    switch (yytok) {
                        case EOL:
                            yyn = 10;
                            continue;
                    }
                    yyn = 37;
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
                case 21:
                    switch (yytok) {
                        case '(':
                        case error:
                        case ENDINPUT:
                        case NUMBER:
                            yyn = 37;
                            continue;
                    }
                    yyn = yyr10();
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
                case 22:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 24:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 25:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 37;
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
                case 26:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 37;
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
                case 27:
                    switch (yytok) {
                        case ENDINPUT:
                        case '(':
                        case NUMBER:
                        case EOL:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 28:
                    switch (yytok) {
                        case '*':
                            yyn = 6;
                            continue;
                        case '+':
                            yyn = 7;
                            continue;
                        case '-':
                            yyn = 8;
                            continue;
                        case '/':
                            yyn = 9;
                            continue;
                        case ')':
                            yyn = 16;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    switch (yytok) {
                        case '(':
                        case error:
                        case ENDINPUT:
                        case NUMBER:
                            yyn = 37;
                            continue;
                    }
                    yyn = yyr7();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case '(':
                        case error:
                        case ENDINPUT:
                        case NUMBER:
                            yyn = 37;
                            continue;
                    }
                    yyn = yyr8();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case '(':
                        case error:
                        case ENDINPUT:
                        case NUMBER:
                            yyn = 37;
                            continue;
                    }
                    yyn = yyr9();
                    continue;

                case 34:
                    return true;
                case 35:
                    yyerror("stack overflow");
                case 36:
                    return false;
                case 37:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        double[] newyysv = new double[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys13() {
        switch (yytok) {
            case '*':
                return 6;
            case '/':
                return 9;
            case '+':
            case ')':
            case '-':
            case EOL:
                return yyr5();
        }
        return 37;
    }

    private int yys14() {
        switch (yytok) {
            case '*':
                return 6;
            case '/':
                return 9;
            case '+':
            case ')':
            case '-':
            case EOL:
                return yyr6();
        }
        return 37;
    }

    private int yyr1() { // input : /* empty */
        return 1;
    }

    private int yyr2() { // input : input line EOL
        {}
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr5() { // expr : expr '+' expr
        { yyrv = yysv[yysp-3] + yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr6() { // expr : expr '-' expr
        { yyrv = yysv[yysp-3] - yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr7() { // expr : expr '*' expr
        { yyrv = yysv[yysp-3] * yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : expr '/' expr
        { yyrv = yysv[yysp-3] / yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr9() { // expr : '(' expr ')'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr10() { // expr : NUMBER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 8: return 14;
            case 7: return 13;
            case 6: return 12;
            case 5: return 11;
            case 1: return 2;
            default: return 15;
        }
    }

    private int yyr3() { // line : /* empty */
        { System.exit(0); }
        yysv[yysp-=0] = yyrv;
        return 3;
    }

    private int yyr4() { // line : expr
        { System.out.printf("%g%n", yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    protected String[] yyerrmsgs = {
    };


  /* ?½Õ¥?½?½?½?½?½É¤?½á¥½?½Ã¥É¤?½?½?½?½ */

  CalcParser(CalcLexer l) {
      lexer = l;  
  }
  
  private CalcLexer lexer;

  private void yyerror(String msg) {
      System.out.println("?½?½?½é¡¼: " + msg);
      System.exit(1);
  }

  public static void main(String[] args) {
      CalcLexer lexer = new CalcLexer(System.in);
      CalcParser calc = new CalcParser(lexer);
      lexer.nextToken();    
      calc.parse();    // parse the input
  }

}
