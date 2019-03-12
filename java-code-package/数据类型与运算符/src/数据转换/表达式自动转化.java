package 数据转换;
/**
 * Description:表达式的自动转换
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */

public class 表达式自动转化 {
	public static void main(String[] args)
	{
		//表达式中低于int自动提高
		//数据类型自动提升到与表达式中最高等级操作数同样的类型
		//short a = 3;表达式上升到int
		//a = a - 2;而a是short 被赋值 了 int 类型报错
		
		byte b = 29;
		char c = 'a';
		int i = 234;
		double d = .23;
		//以上表达式中最高为double因而使用double
		double result = b*c+d*i;
		System.out.println(result);
		
		//最高为整数值int
		int  a = 23;
		int resulter = a/7;
		//不能命名关键词变量
		System.out.println(resulter);
		
		//理解！
		//字符串运算自动成为字符串运算。表达式运算自动转换类型如下
		System.out.println("Hello\t"+'a'+7);
		System.out.println('a'+7+"\tHello");
		//表达式从左向右计算
	}
}
