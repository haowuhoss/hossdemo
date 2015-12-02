package observer;
//具体的目标类
public class ConcreateSubject extends Subject{
	protected int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAllObserver();
	}
	
}
