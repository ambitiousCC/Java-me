package 内部类_使用内部类;

//需要：内部类不能用static修饰
//非静态
/*
 * 	省略访问控制符：在同包下的类访问
 * 	protected 同包的其太累和外部类的子类访问
 * 	public任意地方访问：语法：OuterClass.InnerClass varName有包增加包名
 */
/*
 * 	非静态内部类只能寄生外部类对象：外部类以外调用语法：
 * 	OuterInstance.new InnerConstructor()
 * 	外部类实例		  new一个	构造器
 */
//静态
/*	外部类相关，不用创建外部类对象，语法：
 * 	new OuterClass.InnerConstructor()
 * 	
 */
class out 
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
	//定义静态内部类
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("静态内部类的构造器");
		}
	}
}
public class 外部类以外使用内部类 {
	public static void main(String[] args)
	{
		out.In in = new out().new In("baba");//需要先调用外部类后再次new一个内部类
    /*	等价：
     * 	out.In in;//定义内部类变量
     * 	out out = new out();
     *  in = out.new In("baba"); 
     */
	//SubClass p = new SubClass();?如何调用呢
		//静态内部类
		out.StaticIn a = new out.StaticIn();//把静态内部类当做类型
	}
	//还可以在外部类以外的地方创建其子类
}

/*
 *	非静态的内部类的子类不一定是内部类，可以是一个外部类，但是非静态内部类的子类实例一样需要保留一个引用，该引用指向其父类所在外部类的对象
 *	：如果有一个内部类子类的对象存在，一定存在与之对应的外部类对象
 */
class SubClass extends out.In
{
	public SubClass(out out)
	{
		out.super("hello");
	}
}

//静态的子类
class StaticSubClass extends out.StaticIn {}

//所以：因为简单所以优先使用静态内部类
