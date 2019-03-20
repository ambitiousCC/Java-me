package 类成员;
/**
 * @see		面向对象.成员变量和局部变量.概念||
 * @author 崔秦
 *
 */
/**
 * 	某些系统自由创建某类的对象没啥意义，引入单例类：
 * 	一个类始终只能创建一个实例
 * 	避免自由：使用private修饰构造器，然而隐藏起来就用public修饰类，作为访问点
 *	调用方法需要用static，因为调用的只能是类
 *
 *	需要缓存已经创建的对象，否则不知道是否只是创建了一个对象：需要一个成员变量保存对象
 *	成员变量需要被上面的方法访问，需要用static来修饰
 */

class Singleton {
	//类变量来缓存曾经创建的实例
	private static Singleton instance;
	//隐藏构造器：
	private Singleton() {}
	//使用静态方法来返回instance实例，并且保证只被调用一次
	public static Singleton getInstance()//自定义方法
	{
		//判断是否已经建立过单例类
		if(instance == null)
		{
			//允许创建并且保存一个对象
			instance = new Singleton();
		}
		return instance;
	}
}
public class 单例类 {
	public static void main(String[] args)
	{
		//不能用构造器来创建对象了
		//Singleton p1 = new Singleton();
		//只能通过类方法
		Singleton p1 = Singleton.getInstance();
		Singleton p2 = Singleton.getInstance();
		System.out.println(p1==p2);//true 指向了同一个地址，既是同一个对象
	}
}
