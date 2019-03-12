package 深入构造器;

public class 重载 {
	//构造器名与类名必须一致，重载既是重名，但是形参列表必须不一致
	public String name;
	public int count;
	//无参数构造器
	public 重载() {}
	//再一次提供构造器
	public 重载(String name , int count)
	{
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		//无参数创建对象
		重载 p1 = new 重载();
		//有参数
		重载 p2 = new 重载("崔秦",18);
		System.out.println(p1.name+" "+p1.count);
		System.out.println(p2.name+" "+p2.count);
	}
	
}
