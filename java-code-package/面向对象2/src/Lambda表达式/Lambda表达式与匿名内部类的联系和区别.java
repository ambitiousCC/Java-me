package Lambda表达式;
/**
 * 	补充：函数式接口
 * 		XxxFunction
 * 		XxxConsumer
 * 		XxxPredicate
 * 		XxxSupplier
 * 		Comparator
 * 		XxxOperator
 */

/**
 *	相同点：
 *		都可以直接访问"effectively final"的局部变量，以及外部的成员变量
 *		创建的对象与匿名内部类生成的对象一样都可以直接调用从接口中继承的默认方法
 */

/**
 * 	区别：
 * 		匿名内部类可以为任意接口创建实例，只要匿名内部类实现所有抽象方法；可以为抽象类甚至是普通类创建实例；
 * 			而：lambda表达式只能为函数式接口创建实例
 * 		匿名内部类实现的抽象方法的方法体允许调用接口中定义的默认方法：但是后者不循序调用接口中定义的默认方法
 *
 */
@FunctionalInterface
interface Displayable
{
	//定义一个抽象方法和默认方法
	void display();
	default int add(int a, int b)
	{
		return a + b;
	}
}
public class Lambda表达式与匿名内部类的联系和区别 {
	private int age = 12;
	private static String name = "崔秦";
	public void test()
	{
		String book = "沟通的艺术";
		Displayable dis = () -> {
			//与匿名内部类相似：lambda表达式访问了局部变量，那么该局部变量相当于有一个隐式的final修饰
			System.out.println("book局部变量："+book);
			//外部类的实例变量和类变量
			System.out.println("外部类的age实例变量为："+age);
			System.out.println("外部类的name类变量："+name);
			//System.out.println(add(2,5));//表达式不能调用默认方法
		};
		dis.display();
		//调用的是dis对象从接口中继承的add()方法
		System.out.println(dis.add(3,5));
	}
	public static void main(String[] args)
	{
		Lambda表达式与匿名内部类的联系和区别 lambda = new Lambda表达式与匿名内部类的联系和区别 ();
		lambda.test();
	}
}
