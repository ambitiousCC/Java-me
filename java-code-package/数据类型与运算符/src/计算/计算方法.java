package 计算;
/**
 * Description:基础运算符
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */

public class 计算方法 {
	public static void main(String[] args)
	{
		/** 基本运算符有：
		 * +
		 * -
		 * *
		 * /	-->	
		 * 			根据数据类型得到数据结果：出现一个浮点数都可以更加精确
		 * %	-->	
		 * ++
		 * --
		 */
		//如果求余运算的两个操作数中有一个或者两个都是浮点数，则允许第二个操作数不能是0or0.0，知识求余运算的结果是NaN。
		System.out.println(5%0.0);
		/**
		 * 自加：++
		 * 操作对象为单；操作对象为单个数值型的变量；！放置位置影响运算结果 
		 */
		int a = 5;
		//先运算再自加，而且发现：自加相当于多了一行：a = a + 1;
		int b = a++ + 9;
		//此时a=6;
		//先自加在运算
		int c = ++a + 9;
		System.out.print(b+"\n"+c);
		
	}
}
