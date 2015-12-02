package bridge;

public interface Brand {
	void sale();
}
class lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("出售联想电脑");
	}
}
class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("出售DELL电脑");	
	}	
}
