package 内部类;

public class 内部类的private成员 {
	private int outprop = 5;
	class Inner
	{
		private int inprop = 7;
		public void accessOuterProp()
		{
			//非静态内部类可以直接访问外部类的private修饰的成员变量
			System.out.println("外部类："+ outprop);
		}
	}
	public void accessInnerProp()
	{
		//外部类不能直接访问内部类的实例变量
		//System.out.println("内部类："+inprop);
		//需要显示创建对象
		System.out.println("内部类："+new Inner().inprop);
		Inner p = new Inner();
		p.accessOuterProp();
	}
	public static void main(String[] args)
	{
		//只是创建外部类对象
		内部类的private成员 out = new 内部类的private成员();
		out.accessInnerProp();
		
		//外部类存在时，其中不一定存在内部类，而内部类存在时，一定存在被他寄生的外部类。因而调用外部类里面的内部类可能就不存在
		//不允许静态成员访问非静态成员
		//new In();
	}
	private class In {
		//不能在非静态内部类中定义静态
	  	//static {
	  	//	System.out.println("--");
	  	//}
	  	//private static void test() {}
	  	//private static int inProp;
	 
	} 
}
