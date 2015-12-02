package factory.abstractFactory;

public class FactoryBadCar implements ICarFactory{

	@Override
	public IEngine creatEngine() {
		// TODO Auto-generated method stub
		return new BadEngineImpl();
	}

	@Override
	public IShell creatShell() {
		// TODO Auto-generated method stub
		return new BadShell();
	}

}
