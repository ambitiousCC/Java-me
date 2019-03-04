package this实例;

public class this在构造器 {
	//成员变量
	public int foo;
	public this在构造器 ()
	{
		//构造器！！
		int foo = 0;//局部定义的
		//this:该构造器正在初始化的对象
		//构造器正在初始化的对象foo成员变量设为5
		this.foo = 5;//引用外部定义的
		/**
		 * this总是引用狗仔妻正在初始化的对象
		 * this.foo = 5;将执行初始化的所在对象的foo成员变量设为六。
		 * 大部分时候，构造器中访问其他成员变量和方法时都可以省略this
		 * 但是你看！构造器中有一个同名的局部变量，必须用this
		 */
	}
	public static void main(String[] args)
	{
		System.out.println(new this在构造器().foo);//这里调动的是类中的成员变量
	}
}
