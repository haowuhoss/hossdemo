package decorator;
/**
 * 装饰器模式
 * 举例：文本流的IO流写法
 * 灵活增加新功能
 */
public class Client {
	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		System.out.println("增加新功能，天上飞");
		FlyCar flyCar=new FlyCar(car);
		flyCar.move();
		System.out.println("增加新功能，水里游，天上飞");
		WaterCar waterCar=new WaterCar(new FlyCar(car));
		waterCar.move();
	}
}
