package chainofresponsibility;
/**
 * 总经理
 * 
 */
public class GeneralManger extends Leader{

	public GeneralManger(String name) {
		super(name);
	}

	@Override
	public void requestHandler(LeaveRequest request) {
		if(request.getLeaveDays()<30){
			System.out.println("公司职员--"+request.getEmpName()+"由于"+request.getReason()+"请假"+request.getLeaveDays()+"天");
			System.out.println("总经理---"+this.name+"审批通过！");
		}
		else{
			System.out.println("公司职员"+request.getEmpName()+"不想干了！");
		}
	}

}
