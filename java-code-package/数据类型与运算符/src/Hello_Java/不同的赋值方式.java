package Hello_Java;
/**
 * Description:检查不同的赋值方式
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */
public class 不同的赋值方式 {
	public static void main(String[] args)
	{
		char aChar = 'a';
		System.out.println(aChar);
		
		char ch = '\u9999';
		System.out.println(ch);
		
		String b = "地";
		char a = '地';
		int aValue = a;
		
		System.out.println(aValue);
		System.out.print(b);
	}
}
