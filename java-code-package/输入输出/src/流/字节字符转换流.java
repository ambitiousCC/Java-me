package 流;

import java.io.*;

public class 字节字符转换流 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\io\\test.txt");
			InputStreamReader isr = new InputStreamReader(fs,"GBK");//编码一定要一致
			FileOutputStream fo = new FileOutputStream("e:\\test\\io\\test3.txt",true);//后面可以一直写
			OutputStreamWriter osw = new OutputStreamWriter(fo,"GBK");//编码一定要一致
			
			char[] c = new char[10];
			int n;
			//第一种
//			while((n=isr.read())!=-1) {
//				System.out.print((char)n);
//			}
			//第二种
//			while((n=isr.read(c))!=-1) {
//				//String s = new String(c);//会发现如果未超过长度务必会导致多余的转成不需要的字符串
//				String s = new String(c,0,n);
//				System.out.print(s);
//			}
			
			while((n=isr.read(c))!=-1) {
				osw.write(c,0,n);
				osw.flush();//有close也可以不写
			}
			fs.close();
			fo.close();
			isr.close();
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e)  {
			e.printStackTrace();
		}
		
	}
}
