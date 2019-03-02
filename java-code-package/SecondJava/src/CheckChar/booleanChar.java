package CheckChar;
/**
 * Description:布尔值与字符串连接运算，布尔值会自动转换成为字符串
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */

public class booleanChar {
	public static void main(String[] args)
	{
		boolean a = true;
		boolean b = false;
		
		String str = true + "";
		
		System.out.println(str+"\n"+a+"\n"+b);
	}
}
