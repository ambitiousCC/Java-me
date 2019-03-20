package final修饰符;
/**
 * @see	流程控制与数组.数组.深入了解数组
 * @author 崔秦
 */

/**
 * *区别：final修饰基本类型变量不能被改变，引用类型变量只是保证了这个引用类型变量所引用的地址不会改变，一直是引用的是同一个对象，对象完全可以发生改变
 * 
 */
import java.util.Arrays;;
class Person
{
	private int age;
	public Person() {}
	public Person(int age)
	{
		this.age = age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}

public class final修饰两种变量的区别 {
	public static void main(String[] args)
	{
		//final修饰数组变量,注意，iArr是一个引用变量
		final int[] iArr = {6,8,5,6};
		System.out.println(Arrays.toString(iArr));
		//排序
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//赋值
		iArr[2]=3;
		System.out.println(Arrays.toString(iArr));
		//而直接对数组赋值
		//iArr = null;//非法
		//final修饰引用变量
		final Person p = new Person(18);
		//改变实例变量，合法
		p.setAge(19);
		System.out.println(p.getAge());
		//对引用对象赋值,非法
		//p = null;
	}
	//kao!!final真好用呀
}
