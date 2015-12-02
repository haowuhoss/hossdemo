package prototype;

import java.util.Date;

/**
 * 原型模式
 * 浅克隆
 * 2015/6/30
 */
public class Sheep implements Cloneable{
	private String name;
	private Date brithday;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
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
