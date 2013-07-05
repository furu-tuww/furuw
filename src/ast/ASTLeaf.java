package furuw.ast;
import furuw.Token;

public class ASTLeaf extends ASTNode{
  protected Token token;
  public ASTLeaf(Token t){ Token = t; }
  public ASTNode child(int i){ throw new IndexOutOfBoundsException(); }
  public int numChildren(){ return 0; }
  public String Location(){ return "at line " + token.getLineNumber(); }
  public Token token(){ return token; }
}
