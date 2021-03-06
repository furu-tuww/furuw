package furuw.ast;
import java.util.ArrayList;

import furuw.VariableList;

public class DefStmt extends ASTList{
	public DefStmt(ArrayList<ASTNode> c){ super(c); }

	public String name(){ return ((ASTLeaf)child(0)).token().getText(); }
	public ParameterList parameters(){ return (ParameterList)child(1); }
	public BlockStmt body(){ return (BlockStmt)child(2); }

	public String toString(){
		return "(def " + name() + " " + parameters() + " " + body() + ")";
	}

	public Object eval(VariableList varl) {
		varl.putNew(name(), new Function(parameters(), body(), varl));
		return name();
	}
}