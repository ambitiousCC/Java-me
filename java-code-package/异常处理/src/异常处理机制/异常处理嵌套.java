package 异常处理机制;

import java.io.FileInputStream;
import java.io.IOException;
//没有必要使用超过两层的嵌套异常处理
public class 异常处理嵌套 {
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
			finally	//在finish块中也包含了一个完整的异常处理流程，这种在try块，catch块或者finally块中包含完整的异常处理流程的情形被称为
			{//异常处理的嵌套,（异常处理流程的情形被称为异常处理的嵌套）
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
