package java的日期和时间;

import java.util.*;

//Calendar是一个抽象类,不能使用构造器来创建对象

public class Calendar类 {
	public static void main(String[] args)
	{
		//默认对象
		Calendar calendar = Calendar.getInstance();
		//取出Date对象
		Date date = calendar.getTime();
		//通过Date对象获得对应的Calendar对象
		//因为呢， Calendar/GregorianCalendar没有构造函数可以接受Date对象，所以说必须先获得一个Calender实例，然后调用其setTime()方法
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date);
	}
}
		