package furuw.ast;

import java.util.ArrayList;

import furuw.VariableList;

public class PrimaryExpr extends ASTList{
	public PrimaryExpr(ArrayList<ASTNode> c){ super(c); };
	public ASTNode operand(){
		return child(0);
	}

	public Object eval(VariableList varl){
		return evalSub(varl,numChildren() - 1);
	}
	public Object evalSub(VariableList varl,int nest){
		if(nest <= 0){
			return operand().eval(varl);
		}else{
			Object target = evalSub(varl,nest - 1);
			return ((Postfix)child(nest)).eval(varl, target);
		}
	}
}
