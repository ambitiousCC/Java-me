package List集合;
/**
 * @see		java集合.集合概念.概述
 * @author 崔秦
 *
 */

/*
 *	List : 元素有序、可重复的集合，集合中的每个元素都有对应的顺序索引 ，就和数组的差不多的撒
 *
 *		void add(int index, Object element) 将元素插入到list集合中的index处
 *		boolean addAll(int index, Collection c):将集合c所包含的所有元素都插入到List集合的index处
 *		Object get(int index) 返回集合index索引处的元素
 *		int indexOf(Object o) 返回对象o在List集合中第一次中出现的位置索引
 *		int lastIndexOf(Object o) 返回对象o在list集合中最后一此出现的位置索引
 * 		Object remove(int index, Object element) 将index索引处的元素替换成为element对象，返回被替换的旧元素
 * 		List subList(int fromIndex, int toIndex) 返回从索引fromIndex(包含)到索引toIndex(不包含)
 * 	处所有集合元素组成的子集合
 * 		与set集合的区别:可以根据索引来插入、替换、删除集合元素的方法,list接口中添加勒新的默认方法
 * 			void replaceAll(UnaryOperator operator) 根据operator指定的计算规则重新设置List集合的所有元素
 * 			void sort(Comparator c) 根据Comparator 参数对List集合的元素排序
 */

import java.util.*;
public class List接口 {
	public static void main(String[] args)
	{
		List books = new ArrayList();
		//添加元素
		books.add(new String("cuiqin1"));
		books.add(new String("cuiqin2"));
		books.add(new String("cuiqin3"));
		System.out.println(books);
		//第二个位置插入
		books.add(1, new String("cuiqin1.5"));
		//for循环来遍历元素
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println(books.get(i));
		}
		//delete the third item
		books.remove(2);
		System.out.println(books);
		//判断指定元素在List集合中的位置,输出的是索引值
		System.out.println(books.indexOf(new String("cuiqin1")));
		//替换
		books.set(1, new String("cuiqinahha"));
		System.out.println(books);
		//截取功能： 将第二个元素包括，到第三个元素不包括的截取成为子集合
		System.out.println(books.subList(1, 2));
		//总结：卧槽这特么太好用了吧
	}
}
