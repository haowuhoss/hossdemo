package adapter;
/**
 * 适配器本身
 * 相当于具有PS/2和USB的接口
 * (类适配器方法)
 * 
 */
public class Adapter extends Adaptee implements Target {//这个继承相当于键盘连上了适配器的PS/2接口

	@Override
	public void handleReq() {
		
		super.request();
	}
	
}
