package furuw.ast;
import furuw.Token;

public class Name extends ASTLeaf{
  public Name(Token T){ super(t); }
  public String name(){ return token().getText(); }
}