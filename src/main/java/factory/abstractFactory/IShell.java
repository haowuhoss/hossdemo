package factory.abstractFactory;
/**
 * 轮胎
 * 
 */
public interface IShell {
	void model();//轮胎的型号
	void antifraying();//抗磨损
}
class GoodShell implements IShell{

	@Override
	public void model() {
		System.out.println("型号好");
		
	}

	@Override
	public void antifraying() {
		System.out.println("耐磨损");
		
	}
	
}
class BadShell implements IShell{

	@Override
	public void model() {
		System.out.println("型号坏");
		
	}

	@Override
	public void antifraying() {
		System.out.println("不耐磨损");
		
	}

		
}
