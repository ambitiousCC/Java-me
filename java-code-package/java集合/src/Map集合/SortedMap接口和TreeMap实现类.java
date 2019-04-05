package Map集合;
import java.util.*;

/**
 * @author 崔秦
 * 
 *  TreeMap存储key-value 对时，需要根据key对节点进行排序，TreeMap可以保证所有的key-value对处于
 *  有序的状态
 * 
 * TreeMap 也有两个排序：自然排序 和 定制排序
 * 
 * 判断相等的条件是：两个key通过compareTo()方法返回0，TreeMap认为这两个key是相等的
 * 	重写equals()方法和compareTo()方法时应该保持一致的返回结果：就是equals()返回true那么
 * 	compareTo()方法返回0，不一致TreeMap和Map接口就会冲突！！！
 */

/*
 * Set 和 Map 关系： java 先实现了HashMap and TreeMap 集合
 * 	通过包装一个所有的value都为null的集合实现了Set集合类
 * 	
 * 
 * 	TreeMap 方法 --》 P244
 */

//for basic function

class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:"+ count + "]";
	}
	//根据count 判断是否相等
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	//判断大小--根据count属性值
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}

public class SortedMap接口和TreeMap实现类 {
	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "cuiqin1");
		tm.put(new R(-5), "cuiqin2");
		tm.put(new R(9), "cuiqin3");
		System.out.println(tm);

		//return the first Entry target：注意是按照排完序以后的顺序
		System.out.println(tm.firstEntry());
		//最后一个key
		System.out.println(tm.lastKey());
		//返回比new R(2) 大的最小 key 值
		System.out.println(tm.higherKey(new R(2)));
		//返回TreeMap比new R(2) 小的最大的key-value对, 比较的是value
		System.out.println(tm.lowerEntry(new R(2)));
		//放回TreeMap的子TreeMap
		System.out.println(tm.subMap(new R(-1), new R(4)));		
	}
}
