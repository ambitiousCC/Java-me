package 深入构造器;

//一个源文件下面可以有多个普通类，不能被public 等修饰？
//直接在构造器中引用父亲的构造器
class base {
	public double size;
	public String name;
	public base(double size,String name)
	{
		this.size = size;
		this.name = name;
	}
}
public class 调用父类构造器 extends base {
	public String color;
	public 调用父类构造器(double size ,String name, String color)
	{
	/**	
	 * 父类所有构造器的名称都一致因而是根据形参列表判断所需要调用的构造器类别
	 * 利用super语句调用父类构造器，此语句必须在第一行
	 * 
	 * 子类构造器调用父类构造器：
	 * 	super
	 * 	this显性调用本类中重载的构造器，系统根据this调用里传入实参列表调用本类中的另一个构造器，此时执行时会调用父类构造器
	 * 	没有super、this，系统将会在执行子类构造器之前，隐式调用弗雷无参数的构造器
	 */
		super(size,name);
		this.color = color;
	}
	public static void main(String[] args)
	{
		调用父类构造器 p = new 调用父类构造器(5.6,"对象","red");
		//可以成功得到改变后的值
		System.out.println(p.color+" "+p.name+" "+p.size);
	}
}
