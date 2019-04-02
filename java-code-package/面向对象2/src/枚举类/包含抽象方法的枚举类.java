package 枚举类;

public enum 包含抽象方法的枚举类 {
	//实现加减乘除
	PLUS
	{
		public double eval(double x, double y)
		{
			return x + y;
		}
	},
	MINUS
	{
		public double eval(double x, double y)
		{
			return x - y;
		}
	},
	TIMES
	{
		public double eval(double x, double y)
		{
			return x * y;
		}
	},
	DIVIDE
	{
		public double eval(double x, double y)
		{
			return x / y;
		}
	};
	//最后才为了这个枚举定义抽象方法
	//枚举是由不同的枚举值来提供的不同的实现
	public abstract double eval(double x, double y);
	public static void main(String[] args)
	{
		System.out.println(包含抽象方法的枚举类.PLUS.eval(2, 3));
		System.out.println(包含抽象方法的枚举类.MINUS.eval(2, 3));
		System.out.println(包含抽象方法的枚举类.TIMES.eval(2, 3));
		System.out.println(包含抽象方法的枚举类.DIVIDE.eval(2, 3));
	}
}
