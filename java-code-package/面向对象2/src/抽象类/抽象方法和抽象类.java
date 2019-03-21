package 抽象类;
/**
 * @see
 * @author 崔秦
 *
 */

/**	定义？
 * 	父类完成一个功能子类有不同的方法，a()
 * 	父类调用子类的a方法，需要强制转换成为子类类型才可以调用a方法
 * 	为了包含a方法，而无需方法实现，使用抽象方法
 */

/**
 * 	抽象类和抽象方法：
 * 		都必须使用abstract来修饰
 * 		抽象方法不能有方法体
 * 		包含抽象方法的类只能被定义为抽象类，抽象类中可以不需要包含抽象方法
 * 		抽象类不能被实例化，不能new一个对象出来
 * 		抽象类：成员变量、方法、构造器(主要是为了让子类调用)、初始化块、内部类(接口和枚举)
 * 		只能被定义为抽象类：
 * 			直接定义了一个抽象方法
 * 			继承了抽象父类，但是没有完全实现父类包含的抽象方法
 * 			实现了一个借口，没有完全实现接口包含的抽象方法
 * 	总结：抽象类可以包含抽象方法，不能创建实例
 */

//抽象方法：public abstract void test();空方法体：public void test(){}

public abstract class 抽象方法和抽象类 {
	{
		System.out.println("原始类的普通初始化块");
		
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	
	//被子类调用的构造器
	public 抽象方法和抽象类 () {}
	public 抽象方法和抽象类 (String color)
	{
		System.out.println("执行Shape的构造器");
		this.color = color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
}
