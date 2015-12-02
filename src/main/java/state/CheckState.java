package state;

public class CheckState implements State{

	@Override
	public void handle() {
		System.out.println("有人入住");
		
	}

}
