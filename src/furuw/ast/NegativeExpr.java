package furuw.ast;

import java.util.ArrayList;

import furuw.VariableList;

public class NegativeExpr extends ASTList{
	public NegativeExpr(ArrayList<ASTNode> list) {
		super(list);
	}
	public Object eval(VariableList varl) {
		Object v = child(0).eval(varl);
		return new Integer(-((Integer)v));
	}
}