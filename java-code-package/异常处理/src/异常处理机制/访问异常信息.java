package 异常处理机制;

import java.io.FileInputStream;
import java.io.IOException;

public class 访问异常信息 {
	//哇，如果有一些程序从catch块中访问异常信息，那么可以通过访问catch后面的异常形参来获得，，进入catch块的异常，异常对象会被赋给catch块后面的异常参数，程序即可通过改参数来获得异常的相关信息
	//常用方法：
	//	getMessage()						返回异常的详细描述字符串
	//	printStackTrace()					将该异常的跟踪栈信息输出到标准错误输出
	//	printStackTrace(PrintStream s)						   指定输出流
	//	getStackTrace()						返回该异常的跟踪栈信息
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("a.txt");
		}
		catch (IOException ioe)
		{
			System.out.print(ioe.getMessage());//会有异常描述信息
			ioe.printStackTrace();
		}
	}
}
