package decorator;
/**
 * 装饰器模式
 * 2015/7/13
 * 
 * 
 */
public interface ICar {
	void move();
}

class Car implements ICar{

	@Override
	public void move() {
		System.out.println("陆地上跑");
	}
}
//Decorator装饰角色
class SuperCar implements ICar{
	ICar car;
public SuperCar(ICar car) {
	super();
	this.car=car;
}
	@Override
	public void move() {
		car.move();
	}
}
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}	
}
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void swim(){
		System.out.println("水里游");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}
class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void aotomove(){
		System.out.println("自动跑");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		aotomove();
	}
}

