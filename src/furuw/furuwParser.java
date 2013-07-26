// Output created by jacc on Fri Jul 26 12:22:35 JST 2013


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
                case 64:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    yyn = yys1();
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case ';':
                        case EOL:
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case EOL:
                            yyn = 29;
                            continue;
                        case ';':
                            yyn = 30;
                            continue;
                    }
                    yyn = 131;
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
                case 71:
                    yyn = yys7();
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
                case 72:
                    yyn = yys8();
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
                case 73:
                    yyn = yys9();
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
                case 74:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
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
                case 75:
                    yyn = yys11();
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
                case 76:
                    yyn = yys12();
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
                case 77:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
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
                case 78:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
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
                case 79:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                    }
                    yyn = 131;
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
                case 80:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 9;
                            continue;
                        case NUMBER:
                            yyn = 11;
                            continue;
                        case STRING:
                            yyn = 12;
                            continue;
                        case '(':
                            yyn = 14;
                            continue;
                        case '-':
                            yyn = 15;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case ELSE:
                            yyn = 51;
                            continue;
                        case ';':
                        case EOL:
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case ';':
                        case EOL:
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    switch (yytok) {
                        case '{':
                            yyn = 48;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    switch (yytok) {
                        case '}':
                            yyn = 57;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    switch (yytok) {
                        case EOL:
                            yyn = 58;
                            continue;
                        case ';':
                            yyn = 59;
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    switch (yytok) {
                        case ';':
                        case EOL:
                            yyn = yyr34();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    switch (yytok) {
                        case ';':
                        case EOL:
                        case ELSE:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    switch (yytok) {
                        case '}':
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case '}':
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    switch (yytok) {
                        case '}':
                            yyn = yyr29();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case '}':
                            yyn = yyr28();
                            continue;
                    }
                    yyn = 131;
                    continue;

                case 128:
                    return true;
                case 129:
                    yyerror("stack overflow");
                case 130:
                    return false;
                case 131:
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

    private int yys0() {
        switch (yytok) {
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case ';':
            case EOF:
            case '-':
            case NUMBER:
            case '(':
            case ENDINPUT:
            case IF:
            case EOL:
                return yyr1();
        }
        return 131;
    }

    private int yys1() {
        switch (yytok) {
            case ENDINPUT:
                return 128;
            case EOF:
                return 7;
            case EOL:
                return 8;
            case IDENTIFIER:
                return 9;
            case IF:
                return 10;
            case NUMBER:
                return 11;
            case STRING:
                return 12;
            case WHILE:
                return 13;
            case '(':
                return 14;
            case '-':
                return 15;
            case ';':
                return 16;
        }
        return 131;
    }

    private int yys2() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '=':
                return 27;
            case '>':
                return 28;
            case ';':
            case EOL:
                return yyr32();
        }
        return 131;
    }

    private int yys3() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr13();
        }
        return 131;
    }

    private int yys4() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr12();
        }
        return 131;
    }

    private int yys7() {
        switch (yytok) {
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case ';':
            case EOF:
            case '-':
            case NUMBER:
            case '(':
            case ENDINPUT:
            case IF:
            case EOL:
                return yyr6();
        }
        return 131;
    }

    private int yys8() {
        switch (yytok) {
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case ';':
            case EOF:
            case '-':
            case NUMBER:
            case '(':
            case ENDINPUT:
            case IF:
            case EOL:
                return yyr5();
        }
        return 131;
    }

    private int yys9() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr8();
        }
        return 131;
    }

    private int yys11() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr9();
        }
        return 131;
    }

    private int yys12() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr10();
        }
        return 131;
    }

    private int yys16() {
        switch (yytok) {
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case ';':
            case EOF:
            case '-':
            case NUMBER:
            case '(':
            case ENDINPUT:
            case IF:
            case EOL:
                return yyr4();
        }
        return 131;
    }

    private int yys29() {
        switch (yytok) {
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case ';':
            case EOF:
            case '-':
            case NUMBER:
            case '(':
            case ENDINPUT:
            case IF:
            case EOL:
                return yyr3();
        }
        return 131;
    }

    private int yys30() {
        switch (yytok) {
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case ';':
            case EOF:
            case '-':
            case NUMBER:
            case '(':
            case ENDINPUT:
            case IF:
            case EOL:
                return yyr2();
        }
        return 131;
    }

    private int yys31() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '=':
                return 27;
            case '>':
                return 28;
            case '{':
                return 48;
        }
        return 131;
    }

    private int yys32() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '=':
                return 27;
            case '>':
                return 28;
            case '{':
                return 48;
        }
        return 131;
    }

    private int yys33() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '=':
                return 27;
            case '>':
                return 28;
            case ')':
                return 50;
        }
        return 131;
    }

    private int yys34() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr11();
        }
        return 131;
    }

    private int yys35() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '>':
                return 28;
            case '{':
            case '=':
            case ';':
            case ')':
            case EOL:
                return yyr15();
        }
        return 131;
    }

    private int yys36() {
        switch (yytok) {
            case GE:
                return 18;
            case LE:
                return 19;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '>':
                return 28;
            case '{':
            case '=':
            case ';':
            case NE:
            case EQ:
            case ')':
            case EOL:
                return yyr17();
        }
        return 131;
    }

    private int yys37() {
        switch (yytok) {
            case GE:
                return 18;
            case LE:
                return 19;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '>':
                return 28;
            case '{':
            case '=':
            case ';':
            case NE:
            case EQ:
            case ')':
            case EOL:
                return yyr18();
        }
        return 131;
    }

    private int yys38() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '>':
                return 28;
            case '{':
            case '=':
            case ';':
            case ')':
            case EOL:
                return yyr16();
        }
        return 131;
    }

    private int yys39() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr25();
        }
        return 131;
    }

    private int yys40() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr23();
        }
        return 131;
    }

    private int yys41() {
        switch (yytok) {
            case '%':
                return 21;
            case '*':
                return 22;
            case '/':
                return 25;
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '-':
            case '>':
            case '+':
            case NE:
            case EQ:
            case ')':
            case LE:
            case EOL:
                return yyr21();
        }
        return 131;
    }

    private int yys42() {
        switch (yytok) {
            case '%':
                return 21;
            case '*':
                return 22;
            case '/':
                return 25;
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '-':
            case '>':
            case '+':
            case NE:
            case EQ:
            case ')':
            case LE:
            case EOL:
                return yyr22();
        }
        return 131;
    }

    private int yys43() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr24();
        }
        return 131;
    }

    private int yys44() {
        switch (yytok) {
            case GE:
                return 18;
            case LE:
                return 19;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '>':
                return 28;
            case '{':
            case '=':
            case ';':
            case NE:
            case EQ:
            case ')':
            case EOL:
                return yyr20();
        }
        return 131;
    }

    private int yys45() {
        switch (yytok) {
            case EQ:
                return 17;
            case GE:
                return 18;
            case LE:
                return 19;
            case NE:
                return 20;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '=':
                return 27;
            case '>':
                return 28;
            case '{':
            case ';':
            case ')':
            case EOL:
                return yyr14();
        }
        return 131;
    }

    private int yys46() {
        switch (yytok) {
            case GE:
                return 18;
            case LE:
                return 19;
            case '%':
                return 21;
            case '*':
                return 22;
            case '+':
                return 23;
            case '-':
                return 24;
            case '/':
                return 25;
            case '<':
                return 26;
            case '>':
                return 28;
            case '{':
            case '=':
            case ';':
            case NE:
            case EQ:
            case ')':
            case EOL:
                return yyr19();
        }
        return 131;
    }

    private int yys48() {
        switch (yytok) {
            case IDENTIFIER:
                return 9;
            case IF:
                return 10;
            case NUMBER:
                return 11;
            case STRING:
                return 12;
            case WHILE:
                return 13;
            case '(':
                return 14;
            case '-':
                return 15;
            case EOL:
                return 54;
            case ';':
                return 55;
            case '}':
                return yyr27();
        }
        return 131;
    }

    private int yys50() {
        switch (yytok) {
            case '{':
            case '=':
            case '<':
            case ';':
            case GE:
            case '/':
            case '-':
            case '+':
            case '*':
            case '>':
            case NE:
            case EQ:
            case ')':
            case LE:
            case '%':
            case EOL:
                return yyr7();
        }
        return 131;
    }

    private int yys54() {
        switch (yytok) {
            case IDENTIFIER:
                return 9;
            case IF:
                return 10;
            case NUMBER:
                return 11;
            case STRING:
                return 12;
            case WHILE:
                return 13;
            case '(':
                return 14;
            case '-':
                return 15;
            case EOL:
                return 54;
            case ';':
                return 55;
            case '}':
                return yyr27();
        }
        return 131;
    }

    private int yys55() {
        switch (yytok) {
            case IDENTIFIER:
                return 9;
            case IF:
                return 10;
            case NUMBER:
                return 11;
            case STRING:
                return 12;
            case WHILE:
                return 13;
            case '(':
                return 14;
            case '-':
                return 15;
            case EOL:
                return 54;
            case ';':
                return 55;
            case '}':
                return yyr27();
        }
        return 131;
    }

    private int yys58() {
        switch (yytok) {
            case IDENTIFIER:
                return 9;
            case IF:
                return 10;
            case NUMBER:
                return 11;
            case STRING:
                return 12;
            case WHILE:
                return 13;
            case '(':
                return 14;
            case '-':
                return 15;
            case EOL:
                return 54;
            case ';':
                return 55;
            case '}':
                return yyr27();
        }
        return 131;
    }

    private int yys59() {
        switch (yytok) {
            case IDENTIFIER:
                return 9;
            case IF:
                return 10;
            case NUMBER:
                return 11;
            case STRING:
                return 12;
            case WHILE:
                return 13;
            case '(':
                return 14;
            case '-':
                return 15;
            case EOL:
                return 54;
            case ';':
                return 55;
            case '}':
                return yyr27();
        }
        return 131;
    }

    private int yyr1() { // program : /* empty */
        return 1;
    }

    private int yyr2() { // program : program statement ';'
        { System.out.println("=> " + yysv[yysp-2].eval(varl)); }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr3() { // program : program statement EOL
        { System.out.println("=> " + yysv[yysp-2].eval(varl)); }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr4() { // program : program ';'
        yysp -= 2;
        return 1;
    }

    private int yyr5() { // program : program EOL
        yysp -= 2;
        return 1;
    }

    private int yyr6() { // program : program EOF
        { System.exit(0); }
        yysv[yysp-=2] = yyrv;
        return 1;
    }

    private int yyr27() { // block_stmt : /* empty */
        { yyrv = new BlockStmt(new ArrayList<ASTNode>(0)); }
        yysv[yysp-=0] = yyrv;
        return yypblock_stmt();
    }

    private int yyr28() { // block_stmt : statement ';' block_stmt
        { yyrv = new BlockStmt(new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); addAll(yysv[yysp-1].getChildren()); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypblock_stmt();
    }

    private int yyr29() { // block_stmt : statement EOL block_stmt
        { yyrv = new BlockStmt(new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); addAll(yysv[yysp-1].getChildren()); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypblock_stmt();
    }

    private int yyr30() { // block_stmt : ';' block_stmt
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=2] = yyrv;
        return yypblock_stmt();
    }

    private int yyr31() { // block_stmt : EOL block_stmt
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=2] = yyrv;
        return yypblock_stmt();
    }

    private int yypblock_stmt() {
        switch (yyst[yysp-1]) {
            case 58: return 62;
            case 55: return 61;
            case 54: return 60;
            case 48: return 52;
            default: return 63;
        }
    }

    private int yyr13() { // expr : factor
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : expr '=' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : expr EQ expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : expr NE expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : expr GE expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : expr LE expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : expr '>' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : expr '<' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : expr '+' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : expr '-' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : expr '*' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : expr '/' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr25() { // expr : expr '%' expr
        { yyrv = new BinaryExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-3]); add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 28: return 46;
            case 27: return 45;
            case 26: return 44;
            case 25: return 43;
            case 24: return 42;
            case 23: return 41;
            case 22: return 40;
            case 21: return 39;
            case 20: return 38;
            case 19: return 37;
            case 18: return 36;
            case 17: return 35;
            case 14: return 33;
            case 13: return 32;
            case 10: return 31;
            default: return 2;
        }
    }

    private int yyr11() { // factor : '-' primary
        { yyrv = new NegativeExpr( new ArrayList<ASTNode>(){{ add(yysv[yysp-1]); }} ); }
        yysv[yysp-=2] = yyrv;
        return 3;
    }

    private int yyr12() { // factor : primary
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr7() { // primary : '(' expr ')'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return yypprimary();
    }

    private int yyr8() { // primary : IDENTIFIER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypprimary();
    }

    private int yyr9() { // primary : NUMBER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypprimary();
    }

    private int yyr10() { // primary : STRING
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypprimary();
    }

    private int yypprimary() {
        switch (yyst[yysp-1]) {
            case 15: return 34;
            default: return 4;
        }
    }

    private int yyr26() { // block : '{' block_stmt '}'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 32: return 49;
            case 31: return 47;
            default: return 56;
        }
    }

    private int yyr32() { // simple : expr
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 5;
    }

    private int yyr33() { // statement : IF expr block
        { yyrv = new IfStmt( new ArrayList<ASTNode>(){{ add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypstatement();
    }

    private int yyr34() { // statement : IF expr block ELSE block
        { yyrv = new IfStmt( new ArrayList<ASTNode>(){{ add(yysv[yysp-4]); add(yysv[yysp-3]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=5] = yyrv;
        return yypstatement();
    }

    private int yyr35() { // statement : WHILE expr block
        { yyrv = new WhileStmt( new ArrayList<ASTNode>(){{ add(yysv[yysp-2]); add(yysv[yysp-1]); }} ); }
        yysv[yysp-=3] = yyrv;
        return yypstatement();
    }

    private int yyr36() { // statement : simple
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 1: return 6;
            default: return 53;
        }
    }

    protected String[] yyerrmsgs = {
    };


  /* フィールドやメソ�?��の定義 */

  furuwParser(Lexer l) {
      lexer = l;
      varl = new VariableList();
  }

  private VariableList varl;
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
