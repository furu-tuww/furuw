package furuw.ast;
import furuw.Token;

public class NumberLiteral extends ASTLeaf{
  public NumberLiteral(Token T){ super(t); }
  public int value(){ return token().getNumber(); }
}
