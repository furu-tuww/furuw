/* import 宣言はここに書く */
package furuw;
import java.io.IOException;
import furuw.ast.*;

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

%eofval{
	return token = EOF;
%eofval}

%{
  /* jacc とのインタフェースのためのコード */
  int token;
  ASTNode yylval;

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

  ASTNode getSemantic() {
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
  [0-9]+     { yylval = new NumberLiteral( new NumToken(yyline,Integer.parseInt(yytext())) ); return NUMBER; }
  \"(\\\"|\\\\|\\n|[^\"])*\"  {
  			 yylval = new StringLiteral( new StrToken(yyline,yytext().substring(1,yytext().length()-1)) ); return STRING; }
  "while"	{ yylval = new Name( new IdToken(yyline,yytext()) ); return WHILE; }
  "if" { yylval = new Name( new IdToken(yyline,yytext()) ); return IF; }
  "else" { yylval = new Name( new IdToken(yyline,yytext()) ); return ELSE; }
  "==" { yylval = new Name( new IdToken(yyline,yytext()) ); return EQ; }
  "!=" { yylval = new Name( new IdToken(yyline,yytext()) ); return NE; }
  "<=" { yylval = new Name( new IdToken(yyline,yytext()) ); return GE; }
  ">=" { yylval = new Name( new IdToken(yyline,yytext()) ); return LE; }
  "&&" { yylval = new Name( new IdToken(yyline,yytext()) ); return AND; }
  "||" { yylval = new Name( new IdToken(yyline,yytext()) ); return OR; }
  "def" { yylval = new Name( new IdToken(yyline,yytext()) ); return DEF; }
  {Punct}	 { yylval = new Name( new IdToken(yyline,yytext()) ); return (int)(yytext().charAt(0)); }
  [A_Z_a-z][A_Z_a-z0-9]* { yylval = new Name( new IdToken(yyline,yytext()) ); return IDENTIFIER; }
/* error fallback */
  .                              { throw new Error("不正な文字です <"+ yytext()+">"); }