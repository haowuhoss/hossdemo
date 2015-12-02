package meditor;
/**
 * 财务部门
 * 
 */
public class Finaical implements Department{
	private Mediator m;
	public Finaical(Mediator m) {
		super();
		this.m=m;
		m.request("finaical",this);
	}
	@Override
	public void inWork() {
		System.out.println("财务部门：内部工作，数钱！");
	}

	@Override
	public void outWork() {
		System.out.println("财务部门：外部工作，开工资，提供资金支持！");
	}

}
