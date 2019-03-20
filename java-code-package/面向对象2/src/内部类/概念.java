package 内部类;
/**
 * 	@see	面向对象.隐藏和封装.访问控制符
 * 	嵌套关系：内部包含类的==外部类/宿主类
 * 	封装!内部类隐藏在外部类中不允许同包其他类访问
 * 	组合吧：人类，需要组合器官类，器官类只有在人类内才有效，脱离没啥用，因而可以定义成为内部类
 * 	内部类可以自由访问外部类的资料,包括本身隐藏的变量(private)：而外部类不能访问细节，内部类已经可以被当做是外部类的成员，成员之间可以相互访问
 *	匿名内部类适用于仅需要使用一次的类
 */
/**
 * 	内部类--任意 private protected static 外部类不能使用(多的)
 * 	非静态内部类不能拥有静态成员、
 * 
 * 	public class OuterClass
 * {
 * 	//定义内部类：包括了类的内部的任何位置
 * }
 * 
 * 	只有成员内部类才是一种类成员，还有的是局部内部类和和匿名内部类
 * 	静态内部类和非静态内部类
 */
/**
 * 	外部类只有两个作用域：同于个包内和任何位置，只需要两种访问权行啊：包访问和公开访问 权限 省略访问控制符和public访问控制符
 * 	一个外部类不使用任何访问控制符修饰，那么只能被同一个包中的其类访问
 *	内部类的四个作用域：同类，同包，父子类和任意位置：可以是哟四种访问控制符
 */
public class 概念 {
	private double weight;
	//外部类的构造器
	public 概念(){}
	public 概念(double weight)
	{
		this.weight = weight;
	}
	//定义非静态内部类：与使用平常类没多大区别
	private class 概念的内部类
	{
	/**
	 * 	当非静态内部类方法访问某个变量：方法内部的局部变量 --》 方法的内部类 --》 方法所在内部类 --》 内部类所在外部类
	 */
		//实例变量
		private double length;
		private String color;
		private int a = 23;//外部类要访问，需要创建对象不能直接访问
		
		public 概念的内部类() {}
		public 概念的内部类(double length, String color)
		{
			this.length = length;
			this.color = color;
		}
		public void setLn(double length)
		{
			this.length = length;
		}
		public double getLn()
		{
			return this.length;
		}
		public void setColor(String color)
		{
			this.color = color;
		}
		public String getColor()
		{
			return this.color;
		}
		//实例方法
		public void info()
		{
			System.out.println("当前的颜色："+color+",高"+length);
			//可以直接访问外部的隐藏的成员变量
			System.out.println("这家伙的主子的重量："+weight);
		}
	}
	
	//外部类中
	public void test()
	{
		概念的内部类 p = new 概念的内部类(1.12,"red");
		p.info();
	}
	public static void main(String[] args)
	{
		概念 s = new 概念(321.5);
		s.test();
	}
}
