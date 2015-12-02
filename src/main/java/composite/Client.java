package composite;
/**
 * 组合模式 
 * 专业解决树形模式
 * 利用天然的递归，统一的处理整体对象和部分对象
 * 举例：操作系统的资源管理器，xml文件解析
 * 2015/7/215
 */
public class Client {
	public static void main(String[] args) {
		//AbstractFile f1,f2;这个类型也可用
		ImgeFile f1 = new ImgeFile("证件照.jpg");
		TextFile f2 = new TextFile("1111.txt");
		Folder f3=new Folder("我的收藏");//今天复习了组合模式，注意这个地方，类型是Folder，不能是AbstractFile。2015/7/30
		f3.add(f2);
		f3.add(f1);
		f3.killVirus();
	}
}
