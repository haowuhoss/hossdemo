package factory.abstractFactory;
/**
 * 抽象工厂发动机
 * 
 * 
 * 
 * 
 */
public interface IEngine {
	public void star();
	public void run();
}

class GoodEngineImpl implements IEngine{

	@Override
	public void star() {
		System.out.println("启动快！");
		
	}

	@Override
	public void run() {
		System.out.println("跑的远！");
		
	}
	
}

class BadEngineImpl implements IEngine{

	@Override
	public void star() {
		System.out.println("启动慢！");
		
	}

	@Override
	public void run() {
		System.out.println("跑的近！");
		
	}
	
}