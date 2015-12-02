package chainofresponsibility;
/**
 * 经理
 * 
 */
public class Manger extends Leader{

	public Manger(String name) {
		super(name);
	}

	@Override
	public void requestHandler(LeaveRequest request) {
		if(request.getLeaveDays()<10){
			System.out.println("公司职员--"+request.getEmpName()+"由于"+request.getReason()+"请假"+request.getLeaveDays()+"天");
			System.out.println("经理---"+this.name+"审批通过！");
		}
		else{
			if(this.nextLeader!=null){
			this.nextLeader.requestHandler(request);
			}
		}
	}

}
