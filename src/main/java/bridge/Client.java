package bridge;
/**
 * 桥接模式
 * 解决多层继承结构扩展性困难问题
 * （有效防止类个数膨胀）
 * 2015/7/14
 */
public class Client {
	public static void main(String[] args) {
		 Desktop d = new Desktop(new lenovo());//运用了装饰器模式
		 d.sale();
	}
}
