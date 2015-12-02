package flyweight;
/**
 * 享元模式
 * 具有很多相同或相似的对象，通过享元模式，节省内存（围棋棋子）
 * 共享的方式高效的支持大量细粒度对象的重用
 * 2015/6/17
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1=ChessFlyWeightFactory.getchess("黑色");
		ChessFlyWeight chess2=ChessFlyWeightFactory.getchess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);
		chess1.display(new Coordinate(10,10));
		chess2.display(new Coordinate(20,20));
		
	}
}
