package 流;

import java.io.*;

public class 输入输出流拷贝数据 {
	//拷贝的过程就是一个先读后写的过程，中间有存储数据的功能
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\3.jpg");
			FileOutputStream fo = new FileOutputStream("e:\\test\\3-copy.jpg");
			byte[] b = new byte[1024];
			int n;
			while((n=fs.read(b))!=-1) {
				//fo.write(b);//由于定义数组如果太大，超过了文件的大小，就会导致拷贝的文件大于源文件
				fo.write(b,0,n);//读取到实际的
				System.out.println("正在写入");
			}
			fs.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
