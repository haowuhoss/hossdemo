package facede;

public interface Zhijianju {
	void zuzhijigoudaimazheng();
}
class Beijingzhijianju implements Zhijianju{

	@Override
	public void zuzhijigoudaimazheng() {
		System.out.println("办理组专职机构代码证");
	}
	
}