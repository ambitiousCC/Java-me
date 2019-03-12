/**
 * @author 崔秦
 */
package 成员变量和局部变量;
/**
 * 						实例(理解：成员)变量：不用static
 * 			成员变量      {
 * 						类(理解：成员)变量：用static
 * 	所有变量      {	
 * 						形参：方法签名中定义的变量
 * 						
 * 			局部变量      {		方法局部变量：在方法内定义
 *						
 *						代码块局部变量：在代码块定义
 *
 *	补充一个：一个类在使用之前要经过类加载、类验证、累准备、类解析、类初始化等几个阶段
 *
 *	访问变量的相关语法：
 *
 *	类类变量
 *	实例.实例变量
 *	实例.类变量		--	这里访问的依然是此实例所在类的类变量
 *
 */

class Person
{
	//实例变量
	public String name;
	//类变量
	public static int eyeNum;
}

public class 概念 {
	public static void main(String[] args)
	{
		//访问类变量
		System.out.println("Person的eyeNum类变量值："+ Person.eyeNum);
		//创建Person对象
		Person p = new Person();
		System.out.println("实例获取的变量："+p.name+"\n"+p.eyeNum);
		p.name = "崔秦";
		p.eyeNum = 2;
		System.out.println("实例获取的变量："+p.name+"\n"+p.eyeNum);
		//创建一个新的复制品
		Person p1 = new Person();
		System.out.print("新对象的变量："+p1.name+"\n"+p1.eyeNum+"\n");
		//实例访问类变量不变：
	/**
	 *	类变量的作用域更大，同一个类的所有实例访问的都是同一个类变量，同一个内存区
	 *	通过实例来访问static成员变量的情形，都可以将它替换成通过类本身来访问static成员变量
	 */
		//局部变量
	/**
	 * 	形参				不需要显示初始化	
	 * 	方法局部变量					}	需要的必须，否则不能访问
	 * 				}	需要显示初始化
	 * 	代码块局部变量 	
	 * 	
	 */
		//代码块局部变量
		int a ;
		//System.out.print(a);//没有初始化会报错
		a = 5;
		System.out.println(a);
	}
		//bucunzai
		//System.out.println(a);
}
