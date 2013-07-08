package furuw.ast;

import java.util.ArrayList;

import furuw.VariableList;

public abstract class ASTNode{
  public abstract ASTNode child(int i);
  public abstract int numChildren();
  public abstract ArrayList<ASTNode> getChildren();
  public abstract String location();
  public abstract Object eval(VariableList varl);
}
