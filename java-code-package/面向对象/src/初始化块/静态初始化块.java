package 初始化块;
//static 修饰：类初始化/静态初始化 块 ||没有：普通：对对象
//而且，静态初始化块是在类初始化阶段就执行，比普通初始化块优先，静态成员属性
//运用一下书中的例子

class Root{
	static {
		System.out.println("Root的静态初始");
	}
	{
		System.out.println("Root的普通");
	}
	public Root()
	{
		System.out.println("Root的构造器");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid的静态初始");
	}
	{
		System.out.println("Mid的普通");
	}
	public Mid()
	{
		System.out.println("Mid的无参数构造器");
	}
	public Mid(String msg)
	{
		//调用同一类的构造器
		this();
		System.out.println("Mid的参数构造器");
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf的静态初始");
	}
	{
		System.out.println("Leaf的普通");
	}
	public Leaf()
	{
		//调用爹爹的构造器
		super("aa");
		System.out.println("Leaf的无参数构造器");
	}
}
public class 静态初始化块 {
	public static void main(String[] args)
	{
		new Leaf();
		new Leaf();
	}
}
//输出结果直接看出执行顺序：
//注意：java加载并初始化某个类，总是保证所有父类全部加载并且初始化