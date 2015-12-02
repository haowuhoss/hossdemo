package meditor;
/**
 * 中介者模式
 * 经典案例：MVC框架，C为M和V的中介者
 * 解决场景：公司内部要有一个经理统一管理公司的各个部门，个部门之间不可以直接联系交涉，使得多对多转变为一对多情况
 */
public class Client {
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		Development development = new Development(manager);
		Market market = new Market(manager);
		Finaical finaical = new Finaical(manager);
		
		development.inWork();
		development.outWork();
	}
}
