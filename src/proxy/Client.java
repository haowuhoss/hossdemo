package proxy;
/**
 * 静态代理模式
 * 
 * 
 */
public class Client {
	public static void main(String[] args) {
		Star realStar=new RealStar();
		Star proxy=new StaticProxy(realStar);//今天复习了代理模式，注意代理要有构造方法为了传值 2015/7/30
		proxy.talk();
		proxy.sing();
		proxy.charge();
	}
}
