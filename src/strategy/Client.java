package strategy;
/**
 * 策略模式
 * 经典案例：javaSE的GUI编程中的，布局管理
 * 条件分支非常多，用if  else语句也可以解决，不过容易造成代码太多，并且不利于扩展
 * 利用策略模式后，更容易扩展，体现了开闭原则
 */
public class Client {
	public static void main(String[] args) {
		NewCustomerFewStrategy nf = new NewCustomerFewStrategy();
		 Context context = new Context(nf);
		 context.baoJia(1000);
	}
}
