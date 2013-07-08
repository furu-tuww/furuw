package furuw.ast;
import java.util.ArrayList;

import furuw.Token;
import furuw.VariableList;

public class ASTLeaf extends ASTNode{
  protected Token token;
  public ASTLeaf(Token t){ token = t; }
  public ASTNode child(int i){ throw new IndexOutOfBoundsException(); }
  public int numChildren(){ return 0; }
  public ArrayList<ASTNode> getChildren() { return null; }
  public String location(){ return "at line " + token.getLineNumber(); }
  public Token token(){ return token; }
  public Object eval(VariableList varl) {
	return null;
  }
}
