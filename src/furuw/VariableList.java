package furuw;
import java.util.*;

public class VariableList{
	protected HashMap<String,Object> values;
	public VariableList(){ values = new HashMap<String,Object>(); }
	public void put(String name,Object value){ values.put(name,value); }
	public Object get(String name){ return values.get(name); }
}