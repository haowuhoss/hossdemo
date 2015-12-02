package bridge;

public class Computer {
	protected Brand brand;
	public Computer(Brand b) {
		this.brand=b;
	}
	public void sale(){
		brand.sale();
	}
}
class Desktop extends Computer{

	public Desktop(Brand b) {
		super(b);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("台式电脑");
	}
}
class laptop extends Computer{

	public laptop(Brand b) {
		super(b);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("笔记本电脑");
	}
	
}
