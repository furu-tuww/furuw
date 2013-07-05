/* import 宣言はここに書く */
package furuw;
import java.io.IOException;

%%

// 生成するクラスの名前
%class Lexer
// 生成するクラスが実装するインタフェース
%implements furuwTokens
// 生成するメソッドの戻り値型
%int
%unicode
%line
%column

%{
  /* jacc とのインタフェースのためのコード */
  int token;
  Token yylval;

  int nextToken() {
    try {
      return token = yylex();
    } catch (IOException e) {
      return token = ENDINPUT;
    }
  }

  int getToken() {
    return token; 
  }

  double getSemantic() {
    return yylval;
  }

  protected static class NumToken extends Token {
      private int value;

      protected NumToken(int line, int v) {
          super(line);
          value = v;
      }
      public String getText() { return Integer.toString(value); }
      public int getNumber() { return value; }
  }

  protected static class IdToken extends Token {
      private String text; 
      protected IdToken(int line, String id) {
          super(line);
          text = id;
      }
      public String getText() { return text; }
  }

  protected static class StrToken extends Token {
      private String literal;
      StrToken(int line, String str) {
          super(line);
          literal = str;
      }
      public String getText() { return literal; }
  }
%}

Punct = [!\"#\$\%&\'\(\)\*\+,\-\.\/:;\<=\>\?@\[ \]\^_`\{\|\}~]

%%
  [ \t\f]+   { /* 無視する */ }
  \r|\n|\r\n { return EOL; }
  [0-9]+     { yylval = new NumToken(yyline(),Integer.parseInt(yytext())); return NUMBER; }
  [A_Z_a-z][A_Z_a-z0-9]* | == | <= | >= | && | \|\| | {Punct}   { 
  			 yylval = new IdToken(yyline(),yytext()); return (int)(yytext().charAt(0)); }
  \"(\\\"|\\\\|\\n|[^\"])*\"  { 
  			 yylval = new StrToken(yyline(),yytext.substr(1,yytext.length()-1)); return STRING; }
/* error fallback */
  .                              { throw new Error("不正な文字です <"+ yytext()+">"); }  