package 深入构造器;

public class 重载重复 {

	//包含关系的构造器，调用
	public String name;
	public String color;
	public double weight;
	public 重载重复() {}
	public 重载重复(String name , String color)
	{
		this.name = name;
		this.color = color;
	}
	public 重载重复(String name , String color , double weight)
	{
		//通过this，调用另一个重载的构造器的初始化代码
	/**
	 * 	注意事项：使用this调用另一个重载的构造器只能在构造器中使用，必须作为构造器执行体的第一条语句
	 *  不要想着复制利用，违背了软件工程思想
	 */
		this(name,color);
		//引用此构造器
		this.weight = weight;	
	}
	public static void main(String[] args)
	{
		重载重复 p = new 重载重复("崔秦","yellor",120);
		System.out.print(p.name+" "+p.color+" "+p.weight);
	}
}
