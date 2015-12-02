package meditor;
/**
 * 研发部门
 * 
 */
public class Development implements Department{
	private Mediator m;
	public Development(Mediator m) {
		super();
		this.m=m;
		m.request("development",this);
	}
	@Override
	public void inWork() {
		System.out.println("开发部门：内部工作，开发项目！");
	}

	@Override
	public void outWork() {
		System.out.println("开发部门：外部工作，要钱！");
		m.commend("finaical");//通过自己部门的外部功能，可以调用到同事部门的内部功能
	}

}
