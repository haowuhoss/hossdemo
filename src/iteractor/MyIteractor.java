package iteractor;
/**
 * 定义的迭代器接口
 * 
 * 
 */
public interface MyIteractor {
	void first();//将游标指向第一个元素
	void next();//将游标指向下一个元素
	boolean haseNext();//判断是否有下一个元素
	boolean isFirst();
	boolean isLast();
	Object getCurrentobj();//获取游标当前指向的元素
}
