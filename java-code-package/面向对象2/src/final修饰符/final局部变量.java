package final修饰符;

public class final局部变量 {
	public void test(final int a)
	{
		//final修饰的形参不能被赋值
		//a = 5;
		System.out.print(a);
	}
	public static void main(String[] args)
	{
		//定义时可以赋值，如果没有，有且仅有一次机会赋值
		final int a;
		a = 6;
		final String str = "cuiqin";
		//str = "xiaocui";
		final局部变量 p = new final局部变量();
		//系统根据传入的参数来完成初始化
		p.test(34);
	}
}
