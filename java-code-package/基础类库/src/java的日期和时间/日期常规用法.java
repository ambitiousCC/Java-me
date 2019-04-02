package java的日期和时间;

import java.util.Calendar;

public class 日期常规用法 {
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		
		//System.out.println(c.get(YEAR));
		//System.out.println(c.get(MONTH));
		//System.out.println(c.get(DATE));
		//c.set(2003, 10, 23, 12, 32, 23);//设置年月日
		System.out.println(c.getTime());
		//可以将Calendar 的月前推8个月
		//c.add(YEAR, -1);
		//不知道为什么这里的静态变量不能被访问到
	}
}
