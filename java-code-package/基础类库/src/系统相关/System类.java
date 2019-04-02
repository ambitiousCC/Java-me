package 系统相关;

/**
 * 	@see	如何改变系统的标准输入和输出的方法
 */

import java.io.*;
import java.util.*;

public class System类 {
	public static void main(String[] args) throws Exception
	{
		
		//环境变量
		Map<String, String> env = System.getenv();
		for (String name: env.keySet())
		{
			System.out.println(name + "-->" + env.get(name));
		}
		//获取指定环境变量的值
		System.out.println(System.getenv("Java_HOME"));
		//系统属性
		Properties props = System.getProperties();
		//输出文件
		props.store(new FileOutputStream("props.txt"), "System Properties");//将生成的文本输出成为.txt文件：
		//输出特定的系统属性
		System.out.println(System.getProperty("os.name"));
		
//		Object a = "崔秦";		Object不包含store方法！！
//		((Properties) a).store(new FileOutputStream("崔秦.txt"),"这是注释介绍");
	}
}
