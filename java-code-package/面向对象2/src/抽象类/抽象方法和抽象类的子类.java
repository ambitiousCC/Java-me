package 抽象类;

public class 抽象方法和抽象类的子类 extends 抽象方法和抽象类 {
	//其实吧，这是一个三角形类
	private double a;
	private double b;
	private double c;
	public 抽象方法和抽象类的子类 (String color, double a, double b, double c)
	{
		super(color);
		this.setSides(a,b,c);
	}
	public void setSides (double a, double b, double c)
	{
		if(a >= b + c || b >= a + c || c >= a + b)
		{
			System.out.println("三角形两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//重写父类的抽象方法
	public double calPerimeter()
	{
		return a + b + c;
	}
	//重写返回的形状方法
	public String getType()
	{
		return "三角形";
	}
}
