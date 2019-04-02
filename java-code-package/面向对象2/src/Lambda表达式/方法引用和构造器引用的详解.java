package Lambda表达式;

import javax.swing.JFrame;

@FunctionalInterface
interface Converter
{
	Integer convert(String from);//是将form转换成为integer类型
}

interface MyTest
{
	String test(String a, int b, int c);
}

interface YourTest
{
	JFrame win(String title);
}

public class 方法引用和构造器引用的详解 {
	public static void main(String[] args)
	{
	//引用类方法
		Converter converter1 = from -> Integer.valueOf(from);//成功转换from类型
		Integer val = converter1.convert("23");
		System.out.println(val);
		//上面的表达式只有一条语句的时候，可以替换如下：
		//方法引用代替Lambda表达式，引用类方法
		//函数式接口中被实现的方法的全部参数传给类方法作为参数
		Converter converter11 = Integer::valueOf;//
		//调用Integer类的valueOf()类方法来实现Converter函数是就口唯一的抽象方法，调用Converter接口中的唯一的抽象方法是，调用参数将会
		//传给Integer类的valueOf方法
		Integer val2 = converter1.convert("232");
		System.out.println(val2);
	//引用特定对象的实例方法
		//将字符串转换成为索引：调用"fikit.org"这个特定对象的实例方法indexOf
		Converter converter2 = from -> "fikit.org".indexOf(from);
		Integer value = converter2.convert("it");//包装成为整数值类型
		System.out.println(value);
		//等效替换
		Converter converter22 = "fikit.org"::indexOf;
	//引用某类的实例方法
		//创建一个MyTest的对象
		MyTest mt = (a,b,c) ->a.substring(b,c);//切割字符串方法：第二个到第九个字符
		String str = mt.test("Java I love you!", 2, 9);
		System.out.println(str);
		//等效替代:接口中被实现方法的第一个参数作为调用者
		//后面的参数全部传给该方法作为参数
		MyTest mt2 = String::substring;
		String str2 = mt.test("Java I love you!", 3, 9);
		System.out.println(str2);
	//引用构造器
		YourTest yt = (String a) -> new JFrame(a);
		JFrame jf = yt.win("我的窗口");
		System.out.println(jf);
		//等效替代
		YourTest yt2 = JFrame::new;
		JFrame jf2 = yt2.win("java i love you");
		System.out.println(jf2);
	}
	
	
}
