package 包装类增强;
/**
 * @see		数据类型与运算符.数据转换.不同数据类型的强制转换
 * @date	2019/3/12
 * @author 	崔秦
 */
public class 基本数据类型的包装类 {
/**
 * 	注释引用的文件已经介绍了八种基本数据类型的包装方法
 * 	byte/short/long/float/double/boolean的包装类名称仅首字母大写
 * 	特殊：	int	--	Interger
 * 			char--	Character
 */

/**
 * 	自动拆箱：直接把包装类对象直接赋给一个对应的基本类型变量
 * 	自动装箱：把一个基本类型直接赋给对应的包装类变量，或赋给Object变量
 * 	!自动拆装箱的类型必须一一对应
 */
	public static void main(String[] args)
	{
		Integer inObj = 5;
		Object boolObj = true;
		int it = inObj;
		if(boolObj instanceof Boolean)
		{
			boolean b = (Boolean)boolObj;//object -- boolean
			System.out.println(b);
		}
/**
 * 	基本数据类型与字符串类型的转换
 * 	除了Character以外的所有包装类都提供了静态方法：paraseXxx()
 */
	//字符串转换成基本数据类型
	String intStr = "123";//自付出
	int it1 = Integer.parseInt(intStr);
	int it2 = new Integer(intStr);//利用了构造器 Xxx()
	System.out.println(it2);
	
	String floatStr = "4.56";
	float ft1 = Float.parseFloat(floatStr);
	float ft2 = new Float(floatStr);//可以把基本类型的变量近似当做对象使用	也可以吧包装类的实例当成基本变量的变量使用
	System.out.println(ft2);
/**
 * 	字符串类型的值转换成为基本类型：valueOf()
 */
	//基本数据类型转换成为字符串,或者是与""进行连接运算
	String ftStr = String.valueOf(2.23f);
	String SeStr = String.valueOf(3.114);
	String thStr = String.valueOf(true);
	System.out.println(ftStr+" "+SeStr+" "+thStr);
	
	String inStr = 3 + "";
	System.out.println(inStr);
	}
}
