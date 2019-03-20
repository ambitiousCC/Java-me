package 内部类;

//静态内部类，别名：类内部类
/**
 * 	静态内部类属于外部类本身、
 * 	static不能修饰外部类
 * 	静态内部类不能访问外部类的实例成员，只能访问外部类的静态成员，
 */
public class 静态内部类 {
	private int propl = 3;
	private static int prop2 = 6;
	static class StaticInnerClass
	{
		private static int age=5;
		public void accessOuterProp()
		{
			//实例方法也不能访问非静态成员
			//System.out.println(propl);
			System.out.println(prop2);
		}
	}
	public static void main(String[] args)
	{
		StaticInnerClass p = new StaticInnerClass();
		p.accessOuterProp();
		//上面代码简化
		System.out.println(StaticInnerClass.age);//可以利用内部类类名访问静态内部类的静态成员变量
		System.out.println(new StaticInnerClass().age);//也可以创建一个对象/实例
	}
	//静态内部类不是寄生在外部类的实例，而是类本身.支持有外部类的类引用，没有持有外部类对象的引用。
	//接口也是可以定义内部类，只能用public static
}
