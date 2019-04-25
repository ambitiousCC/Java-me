 	 	package 操作集合的工具类Collections;

import java.util.*;

/**
 * 	提供了多个synchronizedXxx() method,方法能够将制定的集合包装成为线程同步的集合
 * 		从而可以解决多线程并发访问集合时的线程安全问题
 *	多个类方法来包装一下
 */
public class 同步控制 {
	public static void main(String[] args)
	{
		//创建了4个线程安全的集合对象
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
		//牛逼！直接获取线程安全的方法
		
	}
}
