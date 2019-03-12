package 方法详解;

public class 参数传递 {

	public static void swap(int a ,int b)
	{
		//测试交换值
		int tmp = a ;
		a = b;
		b = tmp;
		System.out.println("方法中的值"+a+"\b"+b);
	}
	public static void main(String[] args)
	{
		//值传递：实际参数的复制品
		int a = 6;
		int b = 9;
		//调用方法：验证了复制品：程序改变的只是swap方法中的值
		swap(a,b);
		System.out.print("方法外部的值"+a+"\n"+b);
	}
}
