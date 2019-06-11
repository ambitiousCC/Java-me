package 异常处理机制;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * try
 * {
 * 	//业务代码
 * }
 * catch (SubException e)
 * {
 * 	//
 * }
 * ...
 * finally
 * {
 * 	//资源回收
 * 	...
 * }
 */
public class 使用finally回收资源 {
	//程序在try中打开了物力资源(数据库连接、网络连接、磁盘文件等等)，这些物理连接都需要回收
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("a.txt");			
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			//return ;//即便是return 可见仍然是先执行
			//System.exit(1);	//退出虚拟机以后表示直接退出虚拟机了，所以没有得到执行,除了这种方法，finally总会执行
		}
		finally
		{
			//关闭磁盘文件
			if(fis != null)
			{
				try
				{
					fis.close();
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
			System.out.print("执行回收操作");
			
		//不要在finally块中使用return 或者 throw 结束，这样会使try中的return 和 throw 失去作用，还会出现一些很奇怪的现象
		}
	}
}
