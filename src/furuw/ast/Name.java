package furuw.ast;

import furuw.FuruwException;
import furuw.Token;
import furuw.VariableList;

public class Name extends ASTLeaf{
  public Name(Token t){ super(t); }
  public String name(){ return token().getText(); }
  public Object eval(VariableList varl) {
	Object v = varl.get(name());
	if(v == null){
		throw new FuruwException("undefined name: " + name(), this);
	}
	else{
		return v;
	}
  }
}
