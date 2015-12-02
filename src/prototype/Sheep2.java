package prototype;

import java.util.Date;

/**
 * 原型模式
 * 深克隆
 * 2015/6/30
 */
public class Sheep2 implements Cloneable{
	private String name;
	private Date brithday;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();
		Sheep2 s=(Sheep2) obj;
		s.brithday=(Date) this.brithday.clone();
		return obj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	
}
