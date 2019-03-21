package 内部类;
/*
 * 	在方法中定义的内部类是一个局部内部类，仅仅在该方法里有效。不能使用访问控制符和static修饰符修饰
 * 
 * 	所有的局部成员都不能使用static修饰，作用域是所在方法，其他的程序丹玉永远也不可能访问另一个方法中的局部成员，所有的局部成员都不能使用访问控制符修饰
 * 
 * 	作用域太小导致实际上使用的不多
 */
public class 局部内部类 {
	public static void main(String[] args)
	{
		class InnerBase
		{
			int a;
		}
		//定义内部类的子类
		class InnerSub extends InnerBase
		{
			int b;
		}
		//创建局部内部类的对象
		InnerSub is = new InnerSub();
		is.a = 4;
		is.b = 7;
		System.out.println("内部类中和内部类的子类的两个成员变量的和："+(is.a+is.b));
	}
}
