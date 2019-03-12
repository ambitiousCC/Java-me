package 方法详解;

class DataWrap
{
	int a ;
	int b ;
}

public class 参数传递中的易混淆 {
	//传入形参的方式是值传递
	public static void swap(DataWrap dw) 
	{
		//依旧是实现值交换
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap方法里："+dw.a+"\n"+dw.b);
		
		//证明swap()和main()中的dw是不同的值：
		//swap失去了DataWrap的引用：而在main方法中输出的仍然不变
		dw = null;
		
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		//实际引用的是复制了的一个新的,而这个新的也是直接指向DataWrap
		swap(dw);
		//参数传入方法改变了DataWrap中的值
		//因而重新调用的是已经改变了的值，从而形成“错觉”
		System.out.println("交换结束以后："+dw.a+"\n"+dw.b);
		//总而言之，只是指向了同一个对象
	}
}
