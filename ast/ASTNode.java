package furuw.ast;
public abstract class ASTNode{
  public abstract ASTNode child(int i);
  public abstract int numChildren();
  public abstract String location();
}
