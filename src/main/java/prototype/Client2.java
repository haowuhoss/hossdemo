package prototype;

import java.util.Date;

/**
 * 深克隆
 *
 * (先复制的sheep2，然后改变sheep1时间的时候，sheep2的时间未改变)
 * 
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep2 sheep1=new Sheep2();
		sheep1.setName("多利");
		Date d=new Date();
		d.setTime(1111345L);
		sheep1.setBrithday(d);
		
		System.out.println("我有一只羊，它的名字叫："+sheep1.getName()+";它的生日："+sheep1.getBrithday());
		
		
		Sheep2 sheep2=(Sheep2) sheep1.clone();
		sheep2.setName("少利");
		System.out.println("我有一只羊，它的名字叫："+sheep2.getName()+";它的生日："+sheep2.getBrithday());
		
		d.setTime(355784L);
		
		System.out.println("我有一只羊，它的名字叫："+sheep1.getName()+";它的生日："+sheep1.getBrithday());
		System.out.println("我有一只羊，它的名字叫："+sheep2.getName()+";它的生日："+sheep2.getBrithday());
	}
}
