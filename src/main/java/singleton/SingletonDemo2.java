package singleton;
/**
 * 单例模式
 * 懒汉式
 * 2015/6/30
 */
public class SingletonDemo2 {
	private static SingletonDemo2 singletonDemo2;
	public SingletonDemo2() {
		// TODO Auto-generated constructor stub
	}
	public static synchronized SingletonDemo2 getsingletonDemo2(){
		if(singletonDemo2==null){
			singletonDemo2=new SingletonDemo2();
		}
		return singletonDemo2;
	}
}
