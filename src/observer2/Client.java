package observer2;
/**
 * 观察者模式，使用java已经定义好的Observer接口与Observerable类
 */
public class Client {
	public static void main(String[] args) {
		ConcreateSubject cs=new ConcreateSubject();
		ObserverA ob1=new ObserverA();
		ObserverA ob2=new ObserverA();
		ObserverA ob3=new ObserverA();
		
		cs.addObserver(ob1);
		cs.addObserver(ob3);
		cs.addObserver(ob2);
		
		
		cs.setSubject(10000);
		
		
		System.out.println(ob1.getMystate());
		System.out.println(ob2.getMystate());
		System.out.println(ob3.getMystate());
	}
}
