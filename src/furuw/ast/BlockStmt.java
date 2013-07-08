package furuw.ast;

import java.util.ArrayList;

import furuw.VariableList;

public class BlockStmt extends ASTList{
	public BlockStmt(ArrayList<ASTNode> list) {
		super(list);
	}
	public Object eval(VariableList varl) {
		Object v = 0;
		for(int i = 0; i < numChildren(); i++){
			v = child(i).eval(varl);
		}
		return v;
	}
}