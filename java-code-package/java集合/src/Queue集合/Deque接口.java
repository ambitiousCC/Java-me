package Queue集合;
import java.util.*;

/*
 * 	此接口是是Queue接口的子类：双端队列
 * 	方法
 * 		void addFirst(Object e) 指定元素插入该双端队列的开头
 * 		void addLast(Object e)					结尾
 * 		Iterator descendingIterator() 返回双端队列的迭代器
 * ...P223 
 * 
 * 	Deque 不仅是可以当做是双端队列使用，而且可以被当成是栈使用，里面包含了pop push方法
 * 
 * 	穿件Deque 可以指定一个numElement参数，用于指定Object[] 数组的长度，不指定默认为16
 * 
 * 	ArrayList and ArrayDeque 两个集合类的实现机制基本相似
 * 		都惨用了一个动态的、可重新分配的Object[] 数组来存储集合元素，超出存储空间时候会自动再次生成一个新的Object[] 数组
 */

public class Deque接口 {
	public static void main(String[] args)
	{
		//当做是栈使用
		ArrayDeque stack = new ArrayDeque();
		stack.push("cuiqin1");
		stack.push("cuiqin2");
		stack.push("cuiqin3");
		//输出
		System.out.println(stack);//后进先出
		
		//firts item
		System.out.println(stack.peek());
		//不删除
		System.out.println(stack);
		//出栈并删除
		System.out.println(stack.pop());
		//
		System.out.println(stack);
		
		//当做是队列使用
		ArrayDeque queue = new ArrayDeque();
		queue.offer("cuiqin1");
		queue.offer("cuiqin2");
		queue.offer("cuiqin3");
		//按顺序加入
		System.out.println(queue);
		//不删除，第一个
		System.out.println(queue.peek());
		//test
		System.out.println(queue);
		//删除，第一个
		System.out.println(queue.poll());
		//test
		System.out.println(queue);
	}
}
