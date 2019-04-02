package 内部类;

public class 匿名内部类的等价代码 implements 内部类.Product {
	public double getPrice()
	{
		return 531.8;
	}
	public String getName()
	{
		return "爸爸的钱包";
	}
	public static void main(String[] args)
	{
		匿名内部类的等价代码 p = new 匿名内部类的等价代码();
		System.out.println("买"+p.getName()+"花了"+p.getPrice()+"元");
	}
}
