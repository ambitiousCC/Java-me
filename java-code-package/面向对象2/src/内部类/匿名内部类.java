package 内部类;
/**
 * 	@see	面向对象.抽象方法||面向对象2.抽象方法和抽象类
 * 	匿名内部类：只需要使用一次，command
 * 	执行过程：创建时立即创建一个该类的实例，类定义立即消失，匿名内部类不能重复使用
 * 
 * 	语法：
 * 	new 实现接口() | 父类构造器(实参列表)
 * 	{
 * 		//匿名内部类的类体部分
 * 	}
 * 
 * 	可见，必须继承一个父类，或者实现一个接口，但是最多一个
 * 	
 * 	制定规则：
 * 	不能是抽象类：创建内部类是，会立即创建匿名内部类的对象，而抽象类是不能实例化的哈
 * 	连类名都没有，不能定义构造器，到那时初始化块是不需要类名的哈
 * 	
 */

interface Product
{
	public double getPrice();
	public String getName();
}

public class 匿名内部类 {
	public void test(Product p)
	{
		System.out.print("购买了一个"+p.getName()+",花掉了"+p.getPrice());
	}
	public static void main(String[] args)
	{
		匿名内部类 ta = new 匿名内部类();
		//按要求调用参数
		//参数传入匿名类实现的实例
		ta.test(new Product() {//即使是匿名内部类，也要实现接口中的所有抽象方法哦
			public double getPrice()
			{
				return 56.4;
			}
			public String getName()
			{
				return "great one";
			}
		});
		//相当于简化了下面的代码：非静态内部类
		class AnonymousProduct implements Product
		{
			public double getPrice()
			{
				return 56.4;
			}
			public String getName()
			{
				return "great one";
			}
		}
		System.out.println("\n");
		ta.test(new AnonymousProduct());
	}
}