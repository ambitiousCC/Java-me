package 泛型方法;

import java.util.*;

//负责将一个Object 数组的所有元素添加到一个Collection集合
public class 定义泛型方法 {
	static void fromArrayToCollection(Object[] a, Collection<Object> c)//方法有限，比如String不是Object的子类
	{
		for(Object o : a)
		{
			c.add(o);
		}
	}
	public static void main(String[] args)
	{
		String[] strArr = {"a", "b"};
		List<String> strList = new ArrayList<>();
		//fromArrayToCollection(strArr, strList);//编译即出错，对象不能相互贯通
	}
/*
 * 	开始正式介绍定义泛式方法：
 * 		声明方法时定义了一个或者多个类型形参
 * 	修饰符 <T , S> 返回值类型 方法名(形参列表)
 *  {
 *  	//方法体...
 *  }
 */
}
