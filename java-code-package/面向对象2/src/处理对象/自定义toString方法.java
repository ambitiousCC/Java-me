package 处理对象;

class Apple
{
	//toString是为了更好地描述对象而存在的
	private String color;
	private double weight;
	public Apple(){}
	
	//有参数的构造器
	
	public Apple(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	//重写toString！方法！，简单的描述的
	//	public String toString()
	//	{
	//		return "一个苹果，颜色是：" + color + "，重量是：" + weight;
	//	}
	//标准格式：类名[field1 = 1,field2 = 2,...]
	public String toString()
	{
		return "Apple[color="+color+",weight="+weight+"]"; 
	}
}

public class 自定义toString方法 {
	public static void main(String[] args)
	{
		Apple a = new Apple("red",488);
		System.out.println(a);
	}
}

