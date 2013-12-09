package furuw.ast;
import java.util.ArrayList;

import furuw.VariableList;

public abstract class Postfix extends ASTList{
	public Postfix(ArrayList<ASTNode> c){ super(c); }
	public abstract Object eval(VariableList varl,Object value);
}