package facede;

public interface Shuiwuju {
	void shuiwuzheng();
}
class BeijingShuiwuju implements Shuiwuju{

	@Override
	public void shuiwuzheng() {
		System.out.println("办理税务登记证");
		
	}
	
}
