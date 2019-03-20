package 处理对象;

public class 常量池 {
/**
 * 		"a"与new String("a")
 * 		"a" 字符串直接量，JVM（java虚拟机）使用常量池管理
 * 		new String("a")呢，JVM先使用常量池管理直接量，再调用String类的构造器创建一个新的String对象，对象被保存在堆内存中
 * 			----产生了两个字符串对象
 * 
 * 		常量池：专门用于管理在编译时被确定并且被保存在已经编译的.class文件中的一些数据。包含了关于类、方法、接口中的常量，包括字符串常量
 */
	public static void main(String[] args)
	{
		//介绍JVM管理字符串直接量
		//直接引用常量池中的"abc"
		String s1 = "abc";
		String s2 = "a";
		String s3 = "c";
		//字符串在编译的时候就确定下来，也是直接引用常量池中的"abc"
		String s4 = "ab" + "c";
		String s5 = "a" + "b" +"c";
		//不能在编译的时候确定下来的是调用变量值
		String s6 = s1 + s2 + s3;
		//new 一个新的对象
		//引用堆内存中新创建的对象
		String s7 = new String("abc");
		
		System.out.println((s1 == s4)+"\n"+(s1 == s5)+"\n"+(s1 == s6)+"\n"+(s1 == s7));
		
	/**
	 * 	直接引用的常量池的值的变量比较输出为true，因为它们实际上是引用的同一个字符串对象，编译时就可以确定
	 * 	new String()对象是在运行时创造出来的，运行时被保存在内存区，不会放入常量池中
	 */
	}
	
	
}
