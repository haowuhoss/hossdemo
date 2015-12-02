package observer;

public class ObserverA implements Observer{
	//具体的客户端
	private int mystate;
	@Override
	public void update(Subject subject) {
		mystate=((ConcreateSubject)subject).getState();
	}
	public int getMystate() {
		return mystate;
	}
	public void setMystate(int mystate) {
		this.mystate = mystate;
	}
}
