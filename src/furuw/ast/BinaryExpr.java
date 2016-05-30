package furuw.ast;
import java.util.ArrayList;

import furuw.FuruwException;
import furuw.VariableList;

public class BinaryExpr extends ASTList{
  public BinaryExpr(ArrayList<ASTNode> list){ super(list);}
  public Object eval(VariableList varl) {
	  Object op = ((Name)child(1)).name();

	  if(op.equals("=")){
		ASTNode left = (ASTNode)child(0);
		if(left instanceof Name){
			Object c = child(2).eval(varl);
			varl.put(((Name)left).name(), c);
			return c;
		}else{
			throw new FuruwException("代入できない" + left.getClass().getCanonicalName(), this);
		}
	  }

	  Object leftObject = child(0).eval(varl);
	  Object rightObject = child(2).eval(varl);
	  if(leftObject instanceof Integer && rightObject instanceof Integer){
		  int left = ((Integer)leftObject).intValue();
		  int right = ((Integer)rightObject).intValue();

		  if(op.equals("=="))
			  return left == right ? 1:0;
		  if(op.equals("!="))
			  return left != right ? 1:0;
		  if(op.equals(">="))
			  return left >= right ? 1:0;
		  if(op.equals("<="))
			  return left <= right ? 1:0;
		  if(op.equals(">"))
			  return left > right ? 1:0;
		  if(op.equals("<"))
			  return left < right ? 1:0;
		  if(op.equals("+"))
			  return left + right;
		  if(op.equals("-"))
			  return left - right;
		  if(op.equals("*"))
			  return left * right;
		  if(op.equals("/"))
			  return left / right;
		  if(op.equals("%"))
			  return left % right;

		  throw new FuruwException("不正な演算子",this);
	  }

	  if(op.equals("+"))
		  return String.valueOf(leftObject) + String.valueOf(rightObject);
	  if(op.equals("==")){
		  if(leftObject == null)
			  return rightObject == null ? 1:0;
		  return leftObject.equals(rightObject) ? 1:0;
	  }

	  throw new FuruwException("型が不正です", this);
  }
}
