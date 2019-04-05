package Queue集合;
/**
 * @see		java集合.Set集合.TreeSet类的定制排序 || java集合.Set集合.TreeSet类的自然排序
 */
import java.util.*;

/*
 * 	卧槽这个集合真特么牛逼，是按照队列中的元素的大小排序以后的顺序，取出队列里面最小的元素
 * 		也可以设置排序方式：自然排序和定制排序
 */

//for example
public class PriorityQueue实现类 {
	public static void main(String[] args)
	{
		PriorityQueue pq = new PriorityQueue();
		//依次加入元素
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//输出！！观察输出的顺序
		System.out.println(pq);
		//访问 the first item
		System.out.println(pq.poll());
	}
}
