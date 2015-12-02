package iteractor;
/**
 * 迭代模式
 * 模拟JDK内置的List、Set迭代器
 * 解决遍历问题
 * 2015/7/20
 */
public class Client {
	public static void main(String[] args) {
		ConcreateMyAggregate cma=new ConcreateMyAggregate();
		cma.addObject("aaa");
		cma.addObject("bbb");
		cma.addObject("ccc");
		
		
	   MyIteractor myi = cma.CreatIterator();
	   while(myi.haseNext()){
		   System.out.println(myi.getCurrentobj());
		   myi.next();
	   }
	}
}
