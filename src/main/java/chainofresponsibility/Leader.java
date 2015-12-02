package chainofresponsibility;
/**
 * 抽象类
 * 
 */
public abstract class Leader {
	protected String name;
	public Leader nextLeader;
	public Leader(String name) {
		super();
		this.name=name;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	public abstract void requestHandler(LeaveRequest request);
}
