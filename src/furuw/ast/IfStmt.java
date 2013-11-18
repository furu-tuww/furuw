package furuw.ast;

import java.util.ArrayList;

import furuw.VariableList;

public class IfStmt extends ASTList{
	public IfStmt(ArrayList<ASTNode> list) {
		super(list);
	}

	public Object eval(VariableList varl) {
		Object c = child(0).eval(varl);
		if(c instanceof Integer && ((Integer)c).intValue() != 0){
			return child(1).eval(varl);
		}else if(numChildren() > 2){
			return child(2).eval(varl);
		}else{
			return 0;
		}
	}
}