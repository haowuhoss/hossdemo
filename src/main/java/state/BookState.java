package state;

public class BookState implements State{

	@Override
	public void handle() {
		System.out.println("预定状态，已经被预定了");
		
	}

}
