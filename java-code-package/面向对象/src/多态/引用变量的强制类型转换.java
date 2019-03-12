package 多态;
/**
 * 	@see 流程控制与数组.使用数组||数据类型与运算符.数据转换.强制转换
 * 	@author 崔秦
 * 
 * 	引用变量只能调用她编译时类型的方法
 *	若使用：强制类型转换
 *	(type)variable
 *
 *	注意：
 *		基本类型之间的转换只能在数值类型之间进行!数值类型!：int、float、double;不包括boolean
 *		引用类型的转换只能在具有继承关系的两个类型之间转换；
 *			同时试图把一个父类的实例转换成子类类型，应该是：编译时为父类，运行时为子类
 */ 
public class 引用变量的强制类型转换 {
	public static void main(String[] args)
	{
		double d = 23.4;
		long l = (long)d;
		//String l = (String)d;
		System.out.println(l);
		
		int in = 8;
		//boolean b = (boolean)in;
		//Object与String存在继承关系，可以强制类型转换
		//其中的obj实际类型是String，编译通过
		Object obj = "Hello";
		String objStr = (String)obj;
		System.out.println(objStr);
		//主角~
		//Object objPri = new Interger(5);
		//Object与Interger存在继承关系
		//String str = (String)objPri;
		//补充[Interger](https://www.cnblogs.com/zwxblog/p/7788573.html)
		
		//使程序健壮的方法:由于代码无效，全部注释
		//Object objPri = new Interger(5);
		//if(objPri instanceof String)//先用instanceof进行判断
		//{
		//		String str = (String)objPri;
		//}
	}
/**
 * 		子类-->父类：upcasting:向上转型，总是可以成功，只是表明编译时类型是父类，实际执行它的方法是依然表现出子类对象的行为方式
 * 		子类<--父类：强制类型转换
 */
	 
}
