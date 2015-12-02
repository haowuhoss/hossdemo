package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> list=new ArrayList<Observer>();
	public void registerObserver(Observer obs){
		list.add(obs);
	}
	public void removeObserver(Observer obs){
		list.remove(obs);
	}
	public void notifyAllObserver(){
		for(Observer obs:list){
			obs.update(this);
		}
	}
}
