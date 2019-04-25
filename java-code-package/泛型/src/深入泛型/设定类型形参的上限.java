package 深入泛型;

/*
 * 	java允许在使用通配符形参时设定上限，而且可以在定义类型形参时就设定上限，用于表示床柜诶改类型形参的实际类型要么是该上限类型，要么是该上限类型的子类
 */

public class 设定类型形参的上限 <T extends Number>//定义泛型类，类型形参上限Number类，使用这个中文名字超级长的类时为T形参传入的实际类型参数只能是
//Number or Number class's sub class 
{
	T col;
	public static void main(String[] args)
	{
		设定类型形参的上限 <Integer> ai = new 设定类型形参的上限 <>();
		设定类型形参的上限 <Double> ad = new 设定类型形参的上限 <>();
		//编译错误：Try to send the String type to the T
		//but String is not the sub of Number
		//设定类型形参的上限 <String> as = new 设定类型形参的上限 <>();//error
	}
}

//演示一种极端：需要为类型形参设定多个上限(至多有一个父类上限，可以有多个接口上限),该类型形参必须是其父类的子类
/**
 * 	public class xx<T extends Number & java.io.Serializable>
 * {...}
 *  //表示了：T类型必须是其父类的子类，实现了多个上限接口，为类型形参指定多个上限时，所有的接口上限必须是位于类上限之后，指定的类上限必须位于第一位
 */ 
