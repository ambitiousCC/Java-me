package 创建文件和文件夹;

import java.io.File;
import java.io.IOException;

public class 实例 {
	public static void main(String[] args) {
		//创建对象
		//第一种
		//File file1 = new File("e:\\test","基本操作.txt");
		//第二种
		//File file = new File("e:\\test.txt");
		//File file1 = new File(file,"基本操作");
		//第三种
		File file1 = new File("e:\\test\\基本操作.txt");//文件
		
		File file2 = new File("e:\\test\\io");//文件夹
		
		//判断对象:需要存在文件才能判断
		System.out.println(file1.isFile());
		System.out.println(file2.isDirectory());
		
		//创建目录
		//和创建文件一样，可以拆分字符串
		File file3 = new File("e:\\test\\io\\dic");
		if(!file3.exists()) {
			file3.mkdir();
			System.out.println("创建成功");
		} else {
			System.out.println("文件已存在");
		}
		//多级目录
		File file4 = new File("e:\\test\\io\\dic1\\dic1.1");
		if(!file4.exists()) {
			file4.mkdirs();
			System.out.println("创建成功");
		} else {
			System.out.println("文件已存在");
		}
		
		//创建文件，其实不区分文件和目录，需要判断
		File file5 = new File("e:\\test\\io\\test");
		if(!file5.exists()) {
			try {
				//创建无扩展名文件
				file5.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}