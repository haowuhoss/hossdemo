package meditor;

import java.util.HashMap;

/**
 * 经理
 * 真正的中介者实体
 */
public class Manager implements Mediator{
	HashMap<String,Department> map=new HashMap<String,Department>();
	@Override
	public void request(String dname,Department d) {
		map.put(dname,d);
	}

	@Override
	public void commend(String dname) {
		map.get(dname).inWork();
	}

}
