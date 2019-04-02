package 系统相关;

import java.io.IOException;
/*
 * 	与System类相似的是:提供了gc()方法和renFinalization()方法：	分别通知系统来进行垃圾回收、清理系统资源
 * 		还提供了	load(String filename) loadLibrary(String libname)加载文件和动态链接库
 */
import java.lang.*;

public class Runtime类 {
	public static void main(String[] args) throws Exception
	{
		//可以获取Java程序关联的运行对象
		Runtime rt = Runtime.getRuntime();
		System.out.println("处理数量：" + rt.availableProcessors());
		System.out.println("空闲内存：" + rt.freeMemory());
		System.out.println("总内存数：" + rt.totalMemory());
		System.out.println("可用最大内存数：" + rt.maxMemory());
		
		
		//不知道为啥，没有Runtime对象：你特么创建了一个一毛一样的名字的对象！！sb
		
		//可以直接单独启动一个进程来运行操作系统的命令
		
		Runtime rt2 = Runtime.getRuntime();
		rt2.exec("notepad.exe");
	}
}