package 异常处理机制;

import java.sql.Date;

//try catch 后面的花括号都不可省略
//捕获异常一定要先捕获小异常再捕获大异常
public class 异常类的异常体系 {
	public static void main(String[] args)
	{
		//按照重要性记忆异常
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("输入的两个数相除的结果是" + c);
		}
		catch (IndexOutOfBoundsException ie)
		{
			System.out.println("数组越界，运行程序时输入的参数个数不够");
		}
		catch (NumberFormatException ne)
		{
			System.out.println("数字格式异常，程序只能接受整数型参数");//比如输入的是字母
		}
		catch (ArithmeticException ae)
		{
			System.out.println("算术异常");//比如分母为零
		}
		catch (Exception e)
		{
			System.out.println("未知异常");
		}
		
		//空值调用异常
		Date d = null;
		try
		{
			System.out.println(d.after(new Date(0)));
		}
		catch (NullPointerException ne)
		{
			//当试图调用一个null对象的实例方法或者实例变量时就会引发
			System.out.println("空指针异常");
		}
		catch (Exception e)
		{
			System.out.println("未知异常");
		}
	}
}
