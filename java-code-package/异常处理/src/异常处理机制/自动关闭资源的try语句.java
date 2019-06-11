package 异常处理机制;
import java.io.*;

public class 自动关闭资源的try语句 {
	public static void main(String[] args) throws IOException 
	{
		try (		
			//声明初始化两个可以关闭的资源，try语句会自动关闭这两个资源,声明初始化所以这个语句会自动关闭他们，因此上面程序是安全的
			BufferedReader br = new BufferedReader(new FileReader("自动关闭资源的try语句.java"));
			PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
			)
		{
			//使用
			System.out.println(br.readLine());
			ps.println("崔秦");
		}
		//自动关闭资源的try语句后面可以带多个catch块和一个finally块
	}
}
