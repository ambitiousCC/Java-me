package Map集合;
import java.util.*;

/*
 * 	最快的是HashMap	其次是实现了线程安全的Hashtable
 * 	最后是TreeMap	采用红黑树来管理key-value对
 * 		好处是key=value总是处于有序状态无需排序操作
 * 		TreeMap被填充了以后就可以使用keySet()取得有key组成的Set，使用toArray()方法生成的key数组
 * 	在生成的数组中使用Arrays 的 binarySearch()方法在已经排序的数组中快速地查询对象
 * 		多实用HashMap 这个是为了快速查询设计的，选一个总是排好序的Map时，可以考虑TreeMap
 * 			LinkedHashMap比HashMap慢一点，需要维护链表来保持Map 中 key-value 的添加顺序
 * 		IdentityHashMap性能没有特别出色之处，只是使用了==而不是equals方法来判断元素相等
 * 			EnumMap的性能最好，但是他只能使用一个枚举类的枚举值作为key
 */
public class 实现类的性能分析 {
	public static void main(String[] args)
	{
		System.out.println("Hello collection of java");
	}
}
