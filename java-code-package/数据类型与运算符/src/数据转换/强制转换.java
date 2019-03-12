package 数据转换;
/**
 * Description:强制转换
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */
public class 强制转换 {
	public static void main(String[] args)
	{
		//说明转换方向：char -->
		//						int --> long --> float --> double
		//	  byte --> short -->
		//强制转换可能造成数据丢失
		int iValue = 233;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		
		double dValue = 3.43;
		
		int tol = (int)dValue;
		
		System.out.println(tol);
		
		//制造随机字符，循环连接
		String result = "";
		for(int i = 0; i<6;i++)
		{
			int intVal = (int)(Math.random() * 26 + 97);
			result = result + (char)intVal;
		}
		System.out.println(result);
		
		//错误：小数自动默认为double因而不能直接转化
		//float a = 2.3;
		float a = (float)2.354565415;
		System.out.println(a);
	}
}
