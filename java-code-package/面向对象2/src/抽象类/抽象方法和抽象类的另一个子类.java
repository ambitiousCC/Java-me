package 抽象类;
/**
 * @see	         面对对象.多态.多态性质
 * @author 崔秦
 *
 */

public class 抽象方法和抽象类的另一个子类 extends 抽象方法和抽象类 {
	
	//其实吧，这是一个三角形类
	private double radius;
	public 抽象方法和抽象类的另一个子类 (String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	//重写父类的抽象方法
	public double calPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	//重写返回的形状方法
	public String getType()
	{
		return getColor() + "圆形";
	}
	public static void main(String[] args)
	{
		//利用了多态：调用了从父类继承的方法
		抽象方法和抽象类 s1 = new 抽象方法和抽象类的子类("black", 3, 4 ,5);
		抽象方法和抽象类 s2 = new 抽象方法和抽象类的另一个子类("yellow",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
/**
 *	使用abstract修饰类时，表示这个类只能被继承	表明方法必须由子类提供实现(重写)
 *	final恰好相反，因而不能同时使用两个修饰符
 *	注意：static与abstract不是互斥的，虽然不能同时修饰某个方法，但是可以同时修饰内部类
 *	注意：抽象类必须被子类重写才有意义，否则方法没有方法体，抽象类不能定义为private，他俩真正不能同时修饰方法
 */
}
