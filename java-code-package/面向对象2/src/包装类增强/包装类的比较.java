package 包装类增强;

public class 包装类的比较 {

	public static void main(String[] args)
	{
		//包装类型的变量是引用数据类型，但是包装类的实例可以与数值类型的值进行比较，比较是直接取出包装类实例所包装的数值来比较的
		Integer a = new Integer(5);
		System.out.println("两种类型的比较：" + (a > 1));
		
		//两个包装类的比较：由于是引用类型，只有两个包装类引用指向同一个！对象！才会返回true
		System.out.println(new Integer(2) == new Integer(2));
		
		//高级特殊情况
		Integer b = 2;
		Integer c = 2;
		System.out.println(b==c);//true
		Integer d = 128;
		Integer e = 128;
		System.out.println(d==e);//faulse
	/**
	 * 	与JAVA类的构造有关：定义了一个256长度的数组：只能从-127~127之间的数可以存进叫做cache数组中去
	 * 	如果超过了这个界限，系统会自动创建一个行的Integer实例
	 * 	注意：这个和JAVA的缓存设计有关，可以提高程序的运行性能哦~
	 */
		//Java为所有的包装类都提供了一个静态的比较方法compare(x,x)
		System.out.println(Boolean.compare(true, false));//1
		System.out.println(Boolean.compare(true, true));//0
		System.out.println(Boolean.compare(false, true));//-1
		
	/**
	 *	 补充一下Java还为Character包装类增加了大量的工具方法来对一个字符进行判断，参考API
	 *	java增加了很多包装类的功能 -- 128
	 *	主要是无符号运算
	 */
		byte b1 = -3;
		System.out.println("byte类型的-3对应的无符号整数"+Byte.toUnsignedInt(b1));
		
		//无符号整数最大的特点就是最高位不是符号位，如果当做无符号数来处理，比如b1 -3 -- 10000011最高位变成数值位
	}
	
}
