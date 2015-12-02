package dynamicProxy;

public class RealStar implements Star{

	@Override
	public void talk() {
		System.out.println("明星本人谈话");
		
	}

	@Override
	public void sing() {
		System.out.println("明星本人唱歌");
		
	}

	@Override
	public void charge() {
		System.out.println("明星本人收钱");
		
	}

}
