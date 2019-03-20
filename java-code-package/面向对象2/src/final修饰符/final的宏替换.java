package final修饰符;
/**
 * @see			面向对象2.处理对象.常量池
 * @author 崔秦
 *
 */

/**
 * 直接量的满足条件
 *  使用final修饰
 * 	在定义final变量时指定了初始值
 *  初始值可以在编译时就被确定
 *  
 *  宏变量：编译器会把程序中所有用到宏变量的地方直接替换成为该变量的值
 *  对于final来说，只有声明即final才能达到宏变量的效果
 */
public class final的宏替换 {
	public static void main(String[] args)
	{
		//普通局部变量
		final int a = 4;
		System.out.println(a);
		System.out.println(4);//等价
		
		//如果被赋的表达式只是基本的算数表达式或者字符串连接运算，没有访问普通变量，调用方法，同样宏变量处理
		final int b = 35+12;
		final double c = 1.2/3;
		final String d = "崔秦"+"baba";
		final String book = "cuiqin" + 10.4;
		//调用方法不行的
		final String book2 = "cuiqin" + String.valueOf(10.4);
		//判断
		System.out.println(book == "cuiqin10.4");//true
		System.out.println(book2 == "cuiqin10.4");//false,不能在编译的时候确定
		
		//java会把曾经使用过的字符串放入常量池中保存
		//因而第二次使用相同的字符串时，java会让两个家伙指向同一个字符串，==会返回true
		String A = "cuiqinbaba";
		String B = "cuiqin" + "baba";
		System.out.println(A ==B);//true
		String C = "cuiqin";
		String D = "baba";
		System.out.println((C+D)==A);//引用了普通变量,false
		//宏替换使其可以在编译就确定值
		final String C1 = "cuiqin";
		final String D1 = "baba";
		String E = C1 + D1;
		System.out.println(E==A);//true
	}
}
