package 泛型方法;
/*	增加
 * 		可以通过调用方法的上下文来推断类型参数的目标类型
 * 		可以在方法调用链，将推断的到呃类型参数传递到最后一个方法
 */

class MyUtil<E>
{
	public static <Z> MyUtil<Z> nil() 
	{
		return null;
	}
	public static <Z> MyUtil<Z> cons(Z head, MyUtil<Z> tail)//前后的类型一致，就可以通过前面的来推断后面的
	{
		return null;
	}
	E head()
	{
		return null;
	}
}

public class Java8改进的类型判断 {
	public static void main(String[] args)
	{
		//可以通过方法赋值的目标参数来推断类型参数String
		MyUtil<String> ls = MyUtil.nil();
		//不用这样麻烦的声明
		//MyUtil<String> mu = MyUtil.<String>nil();
		//调用cons()方法所需的参数类型来推断类型参数为Integer
		MyUtil.cons(42, MyUtil.nil());
		//不用这样麻烦的声明
		//MyUtil.cons(42,MyUtil.<Integer>nil());
	}
}
