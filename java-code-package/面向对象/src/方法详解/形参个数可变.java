package 方法详解;

/**
 * 
 * @author 	崔秦
 * function 	
 */
public class 形参个数可变 {
	//定义方法，最后形参类型后加...
	public static void testa(int a, String... books)
	{
		//books被当做数组处理
		for(String tmp:books)
		{
			System.out.println(tmp);
		}
	}
	//个数可变形参：public static void testa(int a, String... books);
	//相同的命名：数组形参：public static void test(int a, String[] books);
	//注意：数组形式形参可以出于形参列表的任意位置，但是个数可变的形参只能处于形参列表的最后，
	//一个方法中最多只能有一个个数可变的形参：既可以传入多个参数，也可以传入一个数组
	public static void testb(int b, String[] papers)
	{
		for(String tmp:papers)
		{
			System.out.println(tmp);
		}
	}
	public static void main(String[] args)
	{
		testa(54,"cu","ch","lo");
		//调用出错，待解决
		//testb(2,"emmmm");
		//解决方式:按照定义数组的方式传入，明显比不定个数的方式复杂
		testb(2,new String[] {"cu","ch","lo"});
	}
}
