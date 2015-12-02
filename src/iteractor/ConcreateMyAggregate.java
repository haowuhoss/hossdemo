package iteractor;

import java.util.ArrayList;
import java.util.List;

public class ConcreateMyAggregate {
	List<Object> list=new ArrayList<Object>();
	public void addObject(Object obj){
		list.add(obj);
	}
	public void removeObject(Object obj){
		list.remove(obj);
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	//获得迭代器
	public MyIteractor CreatIterator(){
		return new ConcreateIterator();
	}
	
	
	//迭代器
	private class ConcreateIterator implements MyIteractor{
		private int curson;
		@Override
		public void first() {
			curson=0;
			
		}

		@Override
		public void next() {
			if(curson<list.size()){
			curson=curson+1;
			}
			
		}

		@Override
		public boolean haseNext() {
			if(curson<list.size()){
				return true;
			}else{
				return false;
			}
		}

		@Override
		public boolean isFirst() {
			return curson==0?true:false;
		}

		@Override
		public boolean isLast() {
			return curson==(list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentobj() {
			return list.get(curson);
		}
		
	}
	
}
