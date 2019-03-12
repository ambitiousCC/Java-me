package 位运算符;

public class signs {
	/**
	 * 一般来说，位运算符只能操作整数类型的变量或者值
	 * & 	and
	 * |	or
	 * ~	inverse
	 * ^	按位异或 同时为0 不同为1
	 *	一下三种与机器数存在很大的关系
	 * <<	左移运算符
	 * >>	右移运算符
	 * >>>	无符号右移运算符
	*/
	public static void main(String[] args)
	{
		/**
		 * 	扩展后的赋值运算符
		 * +=
		 * -=
		 * *=
		 * /=
		 * %=
		 * &=
		 * |=
		 * ^=
		 * <<=
		 * >>=
		 * >>>=
		 */
		byte a = 5;
		//a = a + 1;右边int类型赋值给左边byte,报错
		a += 1;
		System.out.println(a);
		/**
		 * 	比较运算符
		 * 
		 * 
		 */
		//类型不同只要在机器中存储的数据相同就可以返回true，ps:a==97
		System.out.println(96 =='a');
		//用一个类的两个事例的运用，可以比较，主要比较对象
	}
}
