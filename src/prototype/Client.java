package prototype;

import java.util.Date;

/**
 * 原型模式
 * 浅克隆
 * 
 * (改变了生日时间，第一只羊和第二只羊的生日都变了，证明它们的指向指的是同一个)
 * 
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep1=new Sheep();
		sheep1.setName("多利");
		Date d=new Date();
		d.setTime(1111345L);
		sheep1.setBrithday(d);
		
		System.out.println("我有一只羊，它的名字叫："+sheep1.getName()+";它的生日："+sheep1.getBrithday());
		
		
		Sheep sheep2=(Sheep) sheep1.clone();
		
		d.setTime(355784L);

		sheep2.setName("少利");

		System.out.println("我有一只羊，它的名字叫："+sheep2.getName()+";它的生日："+sheep2.getBrithday());
		System.out.println("我有一只羊，它的名字叫："+sheep1.getName()+";它的生日："+sheep1.getBrithday());
	}
}
