package List集合;
/**
 * @see		java集合.Queue集合.Deque接口
 */
import java.util.*;

/*
 * 既然是list集合那么：根据索引来随机访问集合中的元素，实现了Deque接口，可以被当作是双端队列来使用。
 * 		又是一个队列和栈的
 */
public class LinkedList实现类 {
	public static void main(String[] args)
	{
		LinkedList books = new LinkedList();
		//加入到队列的尾部
		books.offer("cuiqin1");
		//加入到栈的顶部
		books.offer("cuiqin2");
		//妈的又是将元素加入到队列的头部(相当于栈的顶部)
		books.offerFirst("cuiqin3");
		//利用索引遍历
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println("遍历：" + books.get(i));
		}
		//访问并不删除栈顶的元素
		System.out.println(books.peekFirst());
		//访问并不能删除队列最后一个元素
		System.out.println(books.peekLast());
		//将元素弹出"栈"
		System.out.println(books.pop());
		
		System.out.println(books);
		//访问删除最后一个元素
		System.out.println(books.pollLast());
		//输出
		System.out.println(books);
		
		//真尼玛牛逼：功能强大
		//原理：与ArrayList 和  ArrayDeque 内部艺术组形式实现保存集合中的元素的方式不用，随机访问集合元素有较好的性能
		//而这个LinkedList 可真不一样，用链表的方式来保存几何中的元素，随机访问元素的性能较差，但是咧，插入、删除元素时性能比较出色
		//关于性能问题：！！P236
	}
}
