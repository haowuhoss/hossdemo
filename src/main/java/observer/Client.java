package observer;
/**
 * 观察者模式
 * 类似于广播，一个客户端有所修改，其他客户端都能接受并修改
 * 
 */
public class Client {
	public static void main(String[] args) {
		ConcreateSubject cs=new ConcreateSubject();
		
		//客户端
		ObserverA obs1=new ObserverA();
		ObserverA obs2=new ObserverA();
		ObserverA obs3=new ObserverA();
		
		cs.registerObserver(obs1);
		cs.registerObserver(obs2);
		cs.registerObserver(obs3);
		
		//服务器端改变
		cs.setState(10000);
		
		System.out.println(obs1.getMystate());
		System.out.println(obs2.getMystate());
		System.out.println(obs3.getMystate());
		
	}
}
