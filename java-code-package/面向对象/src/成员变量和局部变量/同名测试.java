package 成员变量和局部变量;
/**
 * 
 * @author 崔秦
 *
 * Attention:	尽量避免出现重名的现象
 */
public class 同名测试 {
	private String name = "悟空";
	private static double price = 23.4;
	public static void main(String[] args)
	{
		//局部变量优先，类变量、成员变量需要特定的方法引用
		int price = 43;
		
		System.out.println("不同的变量"+price+"\n"+同名测试.price);
		//运行方法
		new 同名测试().info();
	}
	public void info()
	{
		String name = "孙红雷";
		System.out.println("不同的名字"+name+"\n"+this.name);
	}
	
}
