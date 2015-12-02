package state;
/**
 * 状态模式
 * 不同的状态下有不同的行为
 * 经典案例：进程的状态转换
 * 
 */
public class Client {
	public static void main(String[] args) {
		HomeContext hc=new HomeContext();
		
		hc.setState(new FreeState());
	}
}
