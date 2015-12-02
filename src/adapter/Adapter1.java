package adapter;
/**
 * 适配器本身
 * 相当于具有PS/2和USB的接口
 * (对象适配器方法)
 * 
 */
public class Adapter1 implements Target {
	Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
		
	}
	public Adapter1(Adaptee adaptee){////这个类相当于键盘连上了适配器的PS/2接口
		super();
		this.adaptee=adaptee;
	}

}
