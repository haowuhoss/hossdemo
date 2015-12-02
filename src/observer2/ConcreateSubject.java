package observer2;

import java.util.Observable;
//目标对象（服务器端）
public class ConcreateSubject extends Observable{
	public int state;
	void setSubject(int s){
		state=s;//状态发生改变
		setChanged();
		notifyObservers(state);//更新状态
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	
}
