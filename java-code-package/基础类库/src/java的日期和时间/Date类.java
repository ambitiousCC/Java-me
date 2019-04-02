package java的日期和时间;

/*
 * 	古董级别的Date类
 */
import java.util.*;

public class Date类 {
	//大部分都被不推荐使用了。只介绍一下还能够使用的
/*
 * 	Date()	生成一个代表当前日期时间的Date对象		实际上就是调用了System.currentTimeMillis()获得了日期的long型参数
 * 	Date(long date)	指定的long型整数来生成一个Date对象，参数表示 创建的Date对象和GMT1970.01.01 00.00.00 的时间差，毫秒单位
 * 	
 * 	Date为数不多的方法：
 * 		boolean after(Date when)		测试该日期是否在指定日期之后
 * 		boolean before(Date when)						之前
 * 		long getTime()					返回时间对应的long整数	从GMT 到 该对象之间的时间差，毫秒
 * 		void setTime(long time)			设置该对象的时间
 */
	public static void main(String[] args)
	{
		Date d1 = new Date();
		//获取当前时间之后的100ms时间
		Date d2 = new Date(System.currentTimeMillis() + 100);
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.before(d2));
	}
}
