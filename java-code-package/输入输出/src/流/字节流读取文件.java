package 流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 字节流读取文件 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\io\\test.txt");
//			int n = fs.read();
//			while(n!=-1) {
//				System.out.print((char)n);
//				n = fs.read();
//			}
			//简写
			int n;
			while((n=fs.read())!=-1) {
				System.out.print((char)n);
			}
			
			FileInputStream fs2 = new FileInputStream("e:\\test\\io\\test2.txt");
			byte[] bt = new byte[100];
			//传入字节数组
			//方法read(byte[] b,int begin_index,int length)
			fs2.read(bt);
			System.out.println(new String(bt));
			fs.close();
			fs2.close();
		} catch (FileNotFoundException e) {//小异常放在大异常前面
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}