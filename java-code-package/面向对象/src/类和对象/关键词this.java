package 类和对象;

public class 关键词this {
	/**
	 * this:总是指向调用该方法的对象
	 * 1. 在构造器中：引用该构造器正在初始化的对象
	 * 2. 在方法中：引用调用该方法的对象
	 * 最大的作用：让类中的一个方法访问该类中的另一个方法或实例变量
	 */
	
	/**
	 * static 修饰的方法可以直接使用类来调用该方法
	 * 该方法中this无法指向合适的对象 
	 * static就不能使用this引用，因而static修饰的方法不能访问不使用static修饰的普通成员
	 * 回到定义类中的问题：Java语法中规定静态成员不能直接访问非静态成员
	 */
	
	//主调：主语调用者：调用成员变量，方法的对象
	//主调必不可少,即使省略,依然存在
	//调用static修饰的成员省略了前面的主调，默认使用该类作为主调
	//没有							默认使用this
	
	public void info()
	{
		//没有static,是this调用
		//实例的方法，不是属于类的方法
		System.out.println("崔秦");
	}
	//static修饰的方法属于类，不属于对象，调用其修饰的方法的对象总是类本身
	//！不要使用对象去调用static修饰的成员变量、方法，应该使用类去调用static修饰的成员变量、方法！
	//！虽然Java允许可以，但是尽量避免！
	public static void main(String[] args)
	{
		//调用main()方法是该类本身，而不是该类的实例
		//info();	
	//error:Cannot make a static reference to the non-static method info() from the type 关键词this
		//需要重新调用原对象的方法
		关键词this d = new 关键词this();
		d.info();
		//或者： new 类名().方法名();
		System.out.print("请看小狗类的调用实例");
	}
}
