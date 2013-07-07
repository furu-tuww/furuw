package furuw.ast;
import java.util.ArrayList;

public class ASTList extends ASTNode{
  protected ArrayList<ASTNode> children;
  public ASTList(ArrayList<ASTNode> list){ children = list; }
  public ASTNode child(int i){ return children.get(i); }
  public int numChildren() { return children.size(); }
  public String location() {
    for(int i = 0; i < children.size(); i++){
      if(children.get(i) != null) return children.get(i).location();
    }
    return null;
  }
}
