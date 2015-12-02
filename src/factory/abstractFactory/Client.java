package factory.abstractFactory;
/**
 * 抽象工厂方法
 *（适用于产品族的生产）
 * 
 */
public class Client {
	public static void main(String[] args) {
		ICarFactory Factory=new FactoryGoodCar();
		IEngine e = Factory.creatEngine();
		IShell s = Factory.creatShell();
		e.star();
		e.run();
		s.antifraying();
		s.model();
	}	
}
