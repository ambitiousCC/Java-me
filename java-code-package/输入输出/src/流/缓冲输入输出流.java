package 流;

import java.io.*;

public class 缓冲输入输出流 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\w.zip");
			FileOutputStream fo = new FileOutputStream("e:\\test\\w-copy.zip");
			BufferedInputStream bs = new BufferedInputStream(fs);//作为参数传入
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			long begainTime = System.currentTimeMillis();
			
//			bo.write('a');//因为缓冲区需要达到一定的内存会自动激活写的操作
//			bo.write(49);
//			bo.flush();//强制清空缓冲
//			System.out.println((char)fs.read());
//			System.out.println(fs.read());
			
			//利用缓冲区拷贝：速度更快
			int n;
			byte[] b = new byte[1024];
			while((n=fs.read(b))!=-1) {
				fo.write(b,0,n);
				System.out.println("正在写入");
			}
			System.out.println("完毕！");
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime-begainTime);
			fs.close();
			fo.close();
			bs.close();//1319
			bo.close();//2066
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
