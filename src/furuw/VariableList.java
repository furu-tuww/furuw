package furuw;
import java.util.*;

public class VariableList{
	protected HashMap<String,Object> values;
	protected VariableList outer;

	public VariableList(VariableList varl){
		values = new HashMap<String,Object>();
		outer = varl;
	}

	public void setOuter(VariableList varl){ outer = varl; }
	public Object get(String name){
		Object v = values.get(name);
		if(v == null && outer != null){
			return outer.get(name);
		}else{
			return v;
		}
	}

	public void putNew(String name,Object value){ values.put(name,value); }
	public void put(String name,Object value){
		VariableList v = where(name);
		if(v == null){
			v = this;
		}
		v.putNew(name,value);
	}

	public VariableList where(String name){
		if(values.get(name) != null){
			return this;
		}else if(outer == null){
			return null;
		}else{
			return outer.where(name);
		}
	}
}