package 异常处理机制;
import java.util.*;

/*	捕获多种类型的异常，多种异常时需要注意：
 * 		捕获多种异常时，多种异常类型之间用竖线隔开，
 * 		捕获多种类型的异常时，异常变量有隐式的final修饰，因此程序不能对异常变量重新赋值
 */
public class 多异常捕获 {
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("您输入的两个数相除的结果是: " + c);
		}//可以同时捕捉多个
		catch(IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie)
		{
			System.out.println("程序发生了数组越界，数字格式异常，算数异常之一");
			//ie = new ArithmeticException("test");//异常变量用final修饰
		}
		catch(Exception e)
		{
			System.out.println("未知异常");
			e = new RuntimeException("test");//异常变量没有用final修饰
		}
	}
}
