package 内部类;

/**
 * @author 崔秦
 *	实现接口来创建匿名内部类是不能显示创建构造器，只有一个隐式的无参数构造器，new不能传入参数
 *	但是通过父类继承呢，不是，哈哈。将拥有和父类相似的构造器，指的是相似的形参列表
 */

abstract class Device
{
	private String name;
	public abstract double getPrice();
	public Device() {}
	public Device(String name)//从父类中调用继承构造器
	{
		this.name = name;
	}
	//setter getter
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}

//接口：
interface A
{
	void test();
}

public class 匿名内部类的构造器 {
	public void test(Device d)
	{
		System.out.println("购买了一个"+d.getName()+"，花掉了"+d.getPrice());
	}
	public static void main(String[] args)
	{
		匿名内部类的构造器 ai = new 匿名内部类的构造器();
		//调用有参数的构造器创建Device匿名实现类的对象
		ai.test(new Device("电子示波器") {
			public double getPrice()
			{
				return 65.8;
			}
		});
		//无参数的构造器创建Device匿名实现类的对象
		//匿名函数的原形：
		//类名 对象名 = new 类名(){};
		Device d = new Device()
		{
			//初始化
			{
				System.out.println("匿名内部类的初始化块...");
			}
			//实现抽象方法
			public double getPrice()
			{
				return 56.2;
			}
			//重写父类的实例方法
			public String getName()
			{
				return "键盘";
			}
		};
		ai.test(d);
		
		//匿名内部类、局部内部类允许访问非final的局部变量
		int age = 23;
		//调用接口
		A a = new A()
		{
			public void test()
			{
				//有序局部变量被匿名内部类访问了，智能提示age相当于被final修饰：effectively final：必须按照有final修饰来用
				//一次赋值以后不能赋值
				//age =3;
				System.out.println(age);
			}
		};
		a.test();
		
	}
}
