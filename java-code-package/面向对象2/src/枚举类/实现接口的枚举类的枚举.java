package 枚举类;

//
public enum 实现接口的枚举类的枚举 implements 实现接口的枚举类的接口 {
	//实现接口和其中方法嘎

	//此处的枚举值必需用相应的构造器来创建
//	MALE("男"),FAMALE("女");//相当于new一个对象
//	private final String name;
//	//枚举的构造器只能用private 来修饰
//	private 实现接口的枚举类的枚举(String name)
//	{
//		this.name = name;
//	}
//	public String getName()
//	{
//		return this.name;
//	}
//	
//	//实现接口必须实现的方法
//	public void info()
//	{
//		System.out.println("用于定义性别的枚举类");
//	}
	
	//枚举类来实现接口里的方法，每个枚举值在调用该方法时都是相同的（方法体相同）
	//不同枚举值的不同的行为方式
	
	//MALE and FAMALE 实际是匿名子类的实例，而不是抽象枚举类的实例
	MALE("男")
	{
		//类体部分：相当于创建了匿名子类：抽象枚举类不是用final修饰因而可以派生子类，使用abstract修饰
		public void info()
		{
			System.out.println("枚举值代表男性");
		}
	},
	FAMALE("女")
	{
		public void info()
		{
			System.out.println("枚举值代表女性");
		}
	};
	private final String name;
	//枚举的构造器只能用private 来修饰
	private 实现接口的枚举类的枚举(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
}
