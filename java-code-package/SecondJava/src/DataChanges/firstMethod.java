package DataChanges;
/**
 * Description:接受包装方法
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */

public class firstMethod {
	public static void main(String[] args)
	{
		//字符串转化为int整数类型
		String a = "23";
		//包装类型
		//Integer（整数） 方法
		//boolean --> Boolean.parseBoolean
		//byte --> Byte.parseByte
		//short --> Short.parseShort
		//long --> Long.parseLong
		//float --> Float.parseFloat
		//double --> Double.parseDouble
		double iValue = Double.parseDouble(a);
		
		System.out.print(iValue);
	}

}
