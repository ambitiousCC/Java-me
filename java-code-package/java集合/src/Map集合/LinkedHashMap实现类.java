package Map集合;

/*
 * 	使用的是双向链表来维护key-value对的次序,链表负责维护Map的迭代顺序，顺序与key-value对的插入顺序一致
 * 	LinkedHashMap可以避免对HashMap、Hashtablemide1key-value对进行排序
 * 
 * 	LinkedHashMap需要维护元素的插入顺序，性能略低于HashMap的性能；
 * 		用链表来维护内部顺序，所以在迭代访问Map里面的全部元素时有较好的性能
 */
import java.util.*;
public class LinkedHashMap实现类 {
	public static void main(String[] args)
	{
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("cuiqin1", 100);
		scores.put("cuiqin2", 200);
		scores.put("cuiqin3", 300);
		
		//forEach() 方法遍历scores里面的所有key-value对
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}
