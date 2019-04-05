package List集合;
/**
 * @see		java集合.集合概念.Iterator遍历集合元素
 */

import java.util.*;

/*
 * 	List额外提供了一个listIterator()方法，方法返回一个ListIterator对象，这个这个ListIterator接口继承了Iterator接口，提供了专门操作List的方法
 * 		boolean hasPrevious():		返回迭代器关联的集合是否还有上一个元素
 * 		Object previous():			返回该迭代器的上一个元素
 * 		void add(Object o):			在指定的位置上面插入一个元素
 * 
 * 	显而易见与Iterator不同的是，这个ListIterator还能迭代上一个元素，高大上的玩意儿，而且！还可以增加元素
 */

public class List新增方法ListIterator {
	public static void main(String[] args)
	{
		String[] books = {
				"cuiqin1",
				"cuiqin2"
		};
		List bookList = new ArrayList();
		for(int i = 0; i < books.length; i++)
		{
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while(lit.hasNext())//需要先正向迭代，先使用next()方法进行迭代
		{
			System.out.println(lit.next());
			lit.add("------------------------");
		}
		System.out.println("反向迭代===========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}
}
