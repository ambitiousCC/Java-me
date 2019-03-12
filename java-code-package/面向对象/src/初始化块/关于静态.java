package 初始化块;

public class 关于静态 {
	//静态初始化块和声明静态成员变量所设定的初始值都是该类的初始化代码：执行顺序与排列顺序相同
/**
 * 	原理：	JVM第一次使用类，在类的准备阶段为该类的所有静态成员变量分布内存；初始化阶段则负责初始化这些静态成员变量
 * 		初始化静态成员变量就是执行类初始化代码或者声明类成员变量是所指定的初始值，执行顺序与排列顺序一致
 */
	static int a = 5;
	static {
		a = 8;
	}
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}
