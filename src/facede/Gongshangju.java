package facede;

public interface Gongshangju {
	void checkName();
}
class BeijingGongshangju implements Gongshangju{
	@Override
	public void checkName() {
		System.out.println("检查名字是否冲突");
	}
}