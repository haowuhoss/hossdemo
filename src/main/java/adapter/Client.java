package adapter;
/**
 * 适配器模式
 * 客户端类
 * 相当于例子中的只有USB接口的笔记本
 * 举例：字符流转为字节流
 */
public class Client {
	public void test1(Target t){//相当于适配器的USB接口插到笔记本电脑上
		t.handleReq();
	}

	
	public static void main(String[] args) {
		Client c=new Client();
		/*(类适配器方法)
		Target t=new Adapter();
		c.test1(t);
		*/
		//下面的为对象适配器方法
		Adaptee adaptee=new Adaptee();
		Target target=new Adapter1(adaptee);
		
		c.test1(target);
	}

}