package furuw;
import furuw.ast.ASTNode;

public class FuruwException extends RuntimeException {
  public FuruwException(String m){
    super(m);
  }
  public FuruwException(String m,ASTNode n){
    super(m + " " + n.location());
  }
}
