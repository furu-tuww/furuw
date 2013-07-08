package furuw.ast;

import java.util.ArrayList;

import furuw.Token;
import furuw.VariableList;

public class WhileStmt extends ASTList{
	public WhileStmt(ArrayList<ASTNode> list) {
		super(list);
	}
	public Object eval(VariableList varl) {
		Object v = 0;
		for(;;){
			Object c = child(0).eval(varl);
			if(c instanceof Integer && ((Integer)c).intValue() == 0){
				return v;
			}else {
				v = child(1).eval(varl);
			}
		}
	}
}