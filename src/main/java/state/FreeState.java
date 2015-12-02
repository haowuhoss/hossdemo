package state;

public class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("空闲状态，可以入住，接受预定");
	}

}
