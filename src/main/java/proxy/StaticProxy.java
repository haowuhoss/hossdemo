package proxy;

public class StaticProxy implements Star{
	/***
	 * 关键代码 
	 */
	public Star star;
	public StaticProxy(Star star) {
		super();
		this.star=star;
	}

	@Override
	public void talk() {
		System.out.println("代理人谈话");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void charge() {
		System.out.println("代理人收钱");
		
	}

}
