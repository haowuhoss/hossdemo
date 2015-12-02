package flyweight;

import java.util.HashMap;

public class ChessFlyWeightFactory {
	private static HashMap<String,ChessFlyWeight> map=new HashMap<String,ChessFlyWeight>();
	public static ChessFlyWeight getchess(String color){
		if(map.get(color)!=null){
			return map.get(color);
		}
		else{
			ChessFlyWeight cfw=new Concreatchess(color);
			map.put(color, cfw);
			return cfw;
		}
	}
}
