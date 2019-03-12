package 深入构造器;

class Creature{
	public Creature()
	{
		System.out.println("爷爷的话：无参数构造器");
	}
}

class Animal extends Creature{
	public Animal(String name)
	{
		//单参数构造器
		System.out.println("爸爸带一个参数的构造器此时的name："+name);
	}
	public Animal(String name, int age)
	{
		this(name);
		System.out.println("爸爸带两个参数的构造器：他的整数型变量值为："+age);
	}
}
public class 构造器继承的关系 extends Animal {
	public 构造器继承的关系()
	{
		super("崔秦",18);
		System.out.println("儿子无参数的构造器");
	}
	public static void main(String[] args)
	{
		new 构造器继承的关系();
	}
	//默认执行无参数构造器，从上至下
}
