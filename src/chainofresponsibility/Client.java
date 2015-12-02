package chainofresponsibility;
/**
 * 责任链模式
 * 将能够处理同一类请求的对象连成一条链，有能力处理的对象处理，没有能力传给下一个对象
 * 生活中的场景：审批流程
 * 经典案例：异常的抛出与捕获
 */
public class Client {
	public static void main(String[] args) {
		Deractor a = new Deractor("李银平");
		Manger b = new Manger("双爷");
		GeneralManger c = new GeneralManger("邓总监");
		//组织责任连对象之间的关系
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		
		//开始请假流程
		LeaveRequest request=new LeaveRequest("利利", 12, "回家打麻将");
		a.requestHandler(request);
	}
}
