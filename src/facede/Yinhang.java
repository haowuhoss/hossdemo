package facede;

public interface Yinhang {
	void kaihu();
}
class Gongshangyinhang implements Yinhang{

	@Override
	public void kaihu() {
		System.out.println("为公司开户账号");
	}
	
}
