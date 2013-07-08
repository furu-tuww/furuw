package furuw.ast;
import furuw.Token;
import furuw.VariableList;

public class NumberLiteral extends ASTLeaf{
  public NumberLiteral(Token t){ super(t); }
  public int value(){ return token().getNumber(); }
  public Object eval(VariableList varl) {
	return value();
  }
}
