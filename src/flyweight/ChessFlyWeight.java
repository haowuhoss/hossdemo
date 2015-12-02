package flyweight;

public interface ChessFlyWeight {
	String setColor(String color);
	String getColor();
	void display(Coordinate c);
}
class Concreatchess implements ChessFlyWeight{
	private String color;
	public Concreatchess(String color) {
		super();
		this.color=color;
	}
	
	@Override
	public String setColor(String color) {
		return this.color=color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色"+color);
		System.out.println("棋子坐标---"+c.getX()+"----"+c.getY());
	}
	
}

