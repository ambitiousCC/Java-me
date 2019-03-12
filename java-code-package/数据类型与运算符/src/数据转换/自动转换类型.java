package 数据转换;
/**
 * Description:自动转换
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */


public class 自动转换类型 {

	public static void main(String[] args)
	{
		int a = 6;
		//int==》float
		float f = a;
		System.out.println(a+"\n"+f);
		
		//byte ==\==》char
		byte b = 9;
		//char c = b;
		//byte ==》 double
		double c = b;
		
		System.out.print(c);
		
		//字符串：基本类型的值和字符串进行连接运算的时候，基本类型的值会自动转字符串
		
		System.out.println("\n"+4+3);
	}

}
