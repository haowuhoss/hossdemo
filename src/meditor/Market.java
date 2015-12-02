package meditor;
/**
 * 
 * 市场部
 */
public class Market implements Department{
	private Mediator m;
	public Market(Mediator m) {
		super();
		this.m=m;
		m.request("market",this);
	}

	@Override
	public void inWork() {
		System.out.println("市场部门：内部工作，跑项目！");
	}

	@Override
	public void outWork() {
		System.out.println("市场部门：外部工作，提供项目，要资金！");
		m.commend("finaical");
		
	}

}
