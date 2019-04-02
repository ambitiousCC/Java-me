package Set集合;

import java.util.*;
/**
 * 
 * @author 崔秦
 *
 *
 *	是SortedSet的实现类，可以确保集合元素处于排序的状态，额外的方法介绍如下
 *		Comparator comparator(); 放回所使用的comparator
 *		Object first/last();			return the first/last item
 *		Object lower(Object e)			返回指定元素之前的预算
 *		Object higher(Object e)			返回指定元素之后的元素
 *		SortedSet subSet(Object formElement, Object toElement)返回此Set的子集合
 *			注意:包括前面不包括后面
 *		SortedSet headSet(Object toElement):返回此Set子集，有小于toElement的元素组成
 *		SortedSet tailSet(Object fromElement)			大于或等于
 *
 *
 *	综上所述：由于是有序的，增加了访问第一个最后一个后一个前一个片段的方法
 *			默认自然排序，还有定制排序
 */

public class TreeSet类 {
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		//添加四个整型对象
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		
		//输出：发现很贴心！！！已经是按照从小到大的顺序排序
		System.out.println(nums);
		
		//first
		System.out.println(nums.first());
		//last
		System.out.println(nums.last());
		//返回小于4的子集
		System.out.println(nums.headSet(4));
		//大于5
		System.out.println(nums.tailSet(5));
		//不等式：-3<x<4
		System.out.println(nums.subSet(-3, 4));
	}
		
}
