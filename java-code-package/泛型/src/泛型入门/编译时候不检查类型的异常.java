package 泛型入门;

import java.util.*;

/*
 *	与强制类型转换有关
 *	就是说可以记住集合中的元素的类型，编译检查元素的类型，不能向集合中添加不满足类型的对象
 *
 * 	针对问题：对象进入集合，集合会忘记这个对象的数据类型，再次取出时，编译类型就变成object
 */

public class 编译时候不检查类型的异常 {
	public static void main(String[] args)
	{
		//创建一个只想保存字符串的集合
		List strList = new ArrayList();
		strList.add("cuiqin1");
		strList.add("cuiqin2");
		//放进去整形
		strList.add(5);
		strList.forEach(str -> System.out.println(((String)str).length()));
		//引发异常!
	}
}
