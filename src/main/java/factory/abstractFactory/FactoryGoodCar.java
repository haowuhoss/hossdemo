package factory.abstractFactory;
//好车工厂类
public class FactoryGoodCar implements ICarFactory {

	@Override
	public IEngine creatEngine() {
		// TODO Auto-generated method stub
		return new GoodEngineImpl();
	}

	@Override
	public IShell creatShell() {
		// TODO Auto-generated method stub
		return new GoodShell();
	}

	
	
	
}
