package templateMethod;
/**
 * 模板方法模式（钩子模式）
 * 实现一个算法时，整体部分很固定，某些部分易变，把易变的部分抽离出来，供子类实现
 * 经典案例：数据库访问的封装
 */
public class Client {
	public static void main(String[] args) {
		BandTemplateMethod bt=new BandTemplateMethod() {//这步使用匿名内部类的方式完成功能
			@Override
			public void transact() {
				System.out.println("取现");
				
			}
		};
		
		bt.process();
	}
}
