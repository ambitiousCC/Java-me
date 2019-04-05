package Map集合;

import java.util.*;
/*
 * 与 Hashtable实现类的区别
 * 	Hashtable 线程安全的Map实现，但是HashMap是线程不安全的实现，后者的性能更高，多个线程访问同一个Map对象是，使用Hashtable实现类更好
 * 	Hashtable 不允许使用null作为key和value，但是咧HashMap可以使用null作为Key或者Value
 */

/*
 * 	判断机制：
 * 		Hashtable 判断value：与另一个对象通过equals()方法比较返回true即可，程序中的ht对象中包含了一个B对象，
 * 		要重写equals(Object obj) 和 hashCode()方法是，应该保证两个方法的判断标准一致--就是equals()相同，那么key 的 hashCode()返回值也应该相同
 */
class A
{
	int count;
	public A(int count)
	{
		this.count = count;
	}
	//修改判断相等的方法：根据count值
	public boolean equals(Object obj)
	{
		if(obj == this)
			return true;
		if(obj != null && obj.getClass() == A.class)
		{
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
	//根据count来计算hashCode值
	public int hashCode()
	{
		return this.count;
	}
}
class B
{
	//对于b类，极端的方法
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashMap实现类 {
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		//可以放一个key值是null的
		hm.put(null, null);
		hm.put(null, null);
		
		//那么value为null的咧
		hm.put("a", null);
		
		//输出Map对象
		System.out.println(hm);
		System.out.println("===========================");
		//尼玛，又是一个不推荐使用的类
		
		
		//判断机制
		Hashtable ht = new Hashtable();
		ht.put(new A(60000), "cuiqin1");
		ht.put(new A(87563), "cuiqin2");
		ht.put(new A(1232), new B());
		System.out.println(ht);
		//只要两个对象通过equals()方法比较返回true，Hashtable就认为它们是相等的value
		//Hashtable中有一个B对象，它与任何对象通过equals()方法比较都相等，所以
		System.out.println(ht.containsKey(new A(87563)));
		//delete the last key-value
		ht.remove(new A(1232));
		System.out.println(ht);
	}
}
