package List集合;

import java.util.*;
/*
 * 	first of all： ArrayList and Vectior class completely hold the function of list
 * 		封装了一个动态的、允许再次分配的Object 数组；使用initialCapacity参数来设置数组的长度，超出：initialCapacity参数
 * 		自动增加
 * 		添加大量元素：ensureCapacity(int minCapacity)一次性增加initialCapacity,减少分配次数，提高性能
 * 			开始不指定initialCapacity 初始值为10 
 * 	 新的方法
 * 		void ensureCapacity(int minCapacity) 将ArrayList or Vector 的 Object[] 数组长度增加大于或等于minCapacity
 *		void trimTosize():		调整数组的长度为当前元素的个数，可以减少内存占用
 *
 * 	 古老的Vector 更加安全 ArrayList 在 Collections 工具类下可以变得安全，性能更高
 * 		Vector 提供的Stack 子类 可以模拟后进先出的“栈”的数据结构
 * 			Object peek() 返回栈的第一个元素，不会讲元素pop出栈
 * 			Object pop()  返回栈的第一个元素，并且将该元素pop出栈
 * 			void push(Object item) 将一个元素push 入栈， 最后一个进栈的元素相当于总是位于栈顶
 * 		妈的，我特么打了半天的字结果告诉我说这个古老的类少用就行？？？？使用栈类的数据模型最好使用后面介绍到的ArrayDeque
 */

public class ArrayList和Vector和固定长度的List {
	public static void main(String[] args)
	{
		//关于固定长度的list
		List fixedList = Arrays.asList("cuiqin1","cuiqin2");
		System.out.println(fixedList.getClass());
		
		//遍历集合元素
		fixedList.forEach(System.out::println);
		
		//error
		fixedList.add("cuiqin3");
		fixedList.add("cuiqin4");
	}
}