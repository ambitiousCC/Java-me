package 与用户互动;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 	要求：要记住大部分API中包括的类
 */

/*
 * 	Scanner:	一个基于正则表达式的文本扫描器
 * 			hasNextXxx() --仅仅判断是否还有下一段输入：hasNext()
 * 			nextXxx()		获取下一个输入项
 * 	注：Xxx是基本类型Int Long ,etc.
 * 		使用空格、tab、回车键作为输入的分割符
 */
public class Scanner类 {
	/*
	 * 	public: 暴露给JVM可访问呢
	 * 	static:	直接调用主类方法
	 * 	void:	指明没有返回值，无意义，
	 * 	String[] args :	声明了一个args 数组
	 * 
	 * 	运行开始之前就获得固定的参数值：如果在运行中获得的输入：使用Scanner类
 	 */
	public static void main(String[] args) throws Exception //throws Exception表示main方法不处理任何异常
	{
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");//设置分割的方法，没有默认将每输入一行当做一次输入
		//	逐行读取的奥秘：	boolean hasNextLine()判断是否还有下一行？
		//String nextLine()	返回输入园中下一行的字符串
		
//		字符串
//		while(sc.hasNext())
//		{
//			System.out.println("输入的内容是："+sc.next());
//		}
		
//		获取任何基类型的输入
		while(sc.hasNextLong())//不按照规定输入就会退出
		{
			System.out.println("输入了："
					+ sc.nextLong());
		}
		
		//强大的类还可以获取文件的输入
//			Scanner sc2 = new Scanner(new File("Scanner类.java"));
//			System.out.println("内容：");
//			while(sc2.hasNextLine())
//			{
//				System.out.println(sc2.nextLine());
//			}
		
			
	}
}

