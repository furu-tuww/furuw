package furuw.ast;
import java.util.ArrayList;

import furuw.VariableList;

public class ParameterList extends ASTList{
	public ParameterList(ArrayList<ASTNode> c){ super(c); }
	public String name(int i){ return ((ASTLeaf)child(i)).token().getText(); }
	public int size(){ return numChildren(); }

	public void eval(VariableList varl, int index, Object value) {
		varl.putNew(name(index), value);
	}
}