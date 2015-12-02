package singleton;
/**
 * 单例模式
 * 饿汉式
 * 2015/6/30
 * Mr Li
 */
public class SingletonDemo1 {
	private static SingletonDemo1 singletondemo1=new SingletonDemo1();
	public SingletonDemo1() {
		// TODO Auto-generated constructor stub
	}
	public static SingletonDemo1 getsingletondemo1(){
		return singletondemo1;
	}
}
