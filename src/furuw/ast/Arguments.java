package furuw.ast;
import java.util.ArrayList;

import furuw.FuruwException;
import furuw.VariableList;

public class Arguments extends Postfix{
	public Arguments(ArrayList<ASTNode> c){ super(c); }
	public int size(){ return numChildren(); }

	public Object eval(VariableList callerVarl, Object value){
		if(!(value instanceof Function)){
			throw new FuruwException("bad function", this);
		}

		Function func = (Function)value;
		ParameterList params = func.parameters();
		if(size() != params.size()){
			throw new FuruwException("bad number of arguments", this);
		}

		VariableList newVarl = func.makeVarl();
		int num = 0;
		for(int i = 0; i < numChildren(); i++){
			params.eval(newVarl, i, child(i).eval(callerVarl));
		}
		return func.body().eval(newVarl);
	}
}