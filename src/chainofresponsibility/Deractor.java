package chainofresponsibility;
/**
 * 主任
 * 
 */
public class Deractor extends Leader{

	public Deractor(String name) {
		super(name);
	}

	@Override
	public void requestHandler(LeaveRequest request) {
		if(request.getLeaveDays()<3){
			System.out.println("公司职员--"+request.getEmpName()+"由于"+request.getReason()+"请假"+request.getLeaveDays()+"天");
			System.out.println("主任---"+this.name+"审批通过！");
		}
		else{
			if(this.nextLeader!=null){
			this.nextLeader.requestHandler(request);
			}
		}
	}

}
