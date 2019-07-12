package 流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 输出流写入文件 {
	//写入的数据并不一定理想，一般用来写入二进制数据
	public static void main(String[] args) {
		FileInputStream fs;//一般在try外面声明对象
		FileOutputStream fo;
		try {
			fs = new FileInputStream("e:\\test\\io\\test.txt");
			fo = new FileOutputStream("e:\\test\\io\\test.txt",true);
			fo.write('a');//输入字符
			fo.write(100);//并不一定能输入理想数字，而是根据这个ASII码写入字符
			System.out.println(fs.read());
			System.out.println((char)(fs.read()));
			fs.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
