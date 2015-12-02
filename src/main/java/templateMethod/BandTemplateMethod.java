package templateMethod;

public abstract class BandTemplateMethod {
	public void takeNumber(){
		System.out.println("取号码");
	}
	public abstract void transact();
	public void evaluate(){
		System.out.println("反馈信息");
	}
	public final void process(){
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
