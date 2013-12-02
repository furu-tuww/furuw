package furuw;
import furuw.ast.*;


public class Function{
	protected ParameterList parameters;
	protected BlockStmt body;
	protected VariableList varl;
	public Function(ParameterList p, BlockStmt b, VariableList v){
		parameters = p;
		body = b;
		varl = v;
	}

	public ParameterList parameters(){ return parameters; }
	public BlockStmt body(){ return body; }
	public VariableList makeVarl(){ return new VariableList(varl); }
	@Override public String toString(){ return "<fun:" + hashCode() + ">"; }
}