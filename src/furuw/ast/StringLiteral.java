package furuw.ast;
import furuw.Token;
import furuw.VariableList;

public class StringLiteral extends ASTLeaf{
  public StringLiteral(Token t){ super(t); }
  public String string(){ return token().getText(); }
  public Object eval(VariableList varl) {
	return string();
  }
}
