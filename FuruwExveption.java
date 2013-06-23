package furuw;
import furuw.ast.ASTNode;

public class FuruwException extends RuntimeException {
  public StoneException(String m){ 
    super(m); 
  }
  public FuruwEception(string m,ASTNode n){
    super(m + " " + n.location());
  }
}
