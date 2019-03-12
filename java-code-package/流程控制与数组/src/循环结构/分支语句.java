package 循环结构;
/**
 * @author 		崔秦
 * @function	循环
 * 
 */

public class 分支语句 {
	public static void main(String[] args)
	{
		int a = 23;
		//if-else 分支语句，当后面的代码只有一句的时候不需要用花括号
		if(a > 20)
			System.out.println("a大于20");
		else
			System.out.println("a小于20");
		//通常保留花括号,容易遗忘允许的代码只有一句
		//多种判断 注意循环顺序,else有隐含条件,即先执行范围最小的
		int age = 48;
		if (age > 60)
		{
			System.out.println("old man");
		}
		else if (age > 40)
		{
			System.out.println("mid man");
		}
		else if (age > 20)
		{
			System.out.println("young");
		}
		
		//Swith-case
		char s = 'c';
		//s处只能为byte short char int四种类型、string 要在更高版本
		switch (s)
		{
		case 'a':
			System.out.println("牛逼");
			break;
		case 'b':
			System.out.println("我觉得海星");
			break;
		case 'c':
			System.out.println("辣鸡");
			break;
		default:
			break;
		}
	}
}
