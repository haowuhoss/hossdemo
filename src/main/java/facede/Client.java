package facede;
/**
 * 外观模式
 * 最简单的设计模式，应用最广泛
 * 主要是封装
 * 举例：jdbc的封装
 */
public class Client {
	public static void main(String[] args) {
		RegisterFacede r = new RegisterFacede();
		r.registerFacede();
	}
}
