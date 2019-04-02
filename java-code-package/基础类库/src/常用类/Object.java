package 常用类;

/*
 * 	boolean	equals(Object obj)		指定对象与该对象是否相等	一致时true
 * 	protected void finalize()		没有引用变量引用到该对象是，垃圾回收期调用此方法来清理对象的资源
 * 	Class<?>getClass()				返回该对象的运行时类
 * 	int hashCode()					默认情况小是根据对象的地址来计算hash值，然而其他许多方法都改写了	
 * 	String toString()				返回该对象的字符串表示
 */

/*
 * 	自定义类实现：	Clonebale			实现该接口的对象可以实现"自我克隆"
 * 	自定义类实现自己的clone()方法
 * 	是吸纳clone()方法通过super.clone()
 * 
 * 	Objedct 类的 .clone方法只是浅克隆，只是克隆了该对象的所有成员变量值，不会对引用类型的成员变量值所引用的对象进行克隆
 * 		深克隆：递归克隆，保证所有的引用类型成员变量值所引用对象都被克隆
 */
class Address
{
	String detail;
	public Address(String detail)
	{
		this.detail = detail;
	}
}

class User implements Cloneable
{
	
	int age;
	
	Address address;
	public User(int age)
	{
		this.age = age;
		address = new Address("崔秦");
	}
	//通过调用super.clone()来实现clone()方法
	public User clone()	
		throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}

public class Object {
	//自我克隆
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		//创造一个对象
		User u1 = new User(23);
		//获得u1副本
		User u2 = u1.clone();
		//判断 u1 和 u2 是否相同
		System.out.println(u1 == u2);
		//
		System.out.println(u1.address == u2.address);
	}
}
