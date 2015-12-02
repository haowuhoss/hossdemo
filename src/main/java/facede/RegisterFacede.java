package facede;
/**
 * 外观模式
 *迪米特法则（最少知识原则）
 * 主要就是封装
 * 例如：注册公司要和工商局、质检局、税务局、银行打交道。外观模式相当于提供了一个注册公司中介，客户只需要和中介打交道
 */

public class RegisterFacede {
	public void registerFacede() {
		Gongshangju gsj=new BeijingGongshangju();
		gsj.checkName();
		Beijingzhijianju zjj = new Beijingzhijianju();
		zjj.zuzhijigoudaimazheng();
		Gongshangyinhang gsyh = new Gongshangyinhang();
		gsyh.kaihu();
		BeijingShuiwuju swj = new BeijingShuiwuju();
		swj.shuiwuzheng();
	}
		
		
}
