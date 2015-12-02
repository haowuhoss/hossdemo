package strategy;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		super();
		this.strategy=strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void baoJia(double s){
		System.out.println("你的报价为"+strategy.getPrice(s));
	}
}
