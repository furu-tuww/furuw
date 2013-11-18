package furuw.ast;
import java.util.ArrayList;

public class Arguments extends Postfix{
	public Arguments(ArrayList<ASTNode> c){ super(c); }
	public int size(){ return numChildren(); }
}