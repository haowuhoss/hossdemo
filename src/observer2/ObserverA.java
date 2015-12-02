package observer2;

import java.util.Observable;
import java.util.Observer;

import observer.ConcreateSubject;

public class ObserverA implements Observer{
	public int mystate;
	@Override
	public void update(Observable o, Object arg) {
		mystate=((observer2.ConcreateSubject)o).getState();
	}
	public int getMystate() {
		return mystate;
	}
	public void setMystate(int mystate) {
		this.mystate = mystate;
	}

}
