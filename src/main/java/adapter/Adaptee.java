package adapter;
/**
 * 被适配的类
 * 相当于只有PS/2接口的键盘
 * 
 * 
 */
public class Adaptee {
	public void request(){
		System.out.println("可以打字！");
	}
}
