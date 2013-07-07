package furuw.ast;
import furuw.Token;

public class StringLiteral extends ASTLeaf{
  public StringLiteral(Token t){ super(t); }
  public String string(){ return token().getText(); }
}
