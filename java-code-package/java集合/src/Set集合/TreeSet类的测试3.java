package Set集合;

import java.util.*;

/*
 * 需要把一个对象放入TreeSet中时候需要保证该方法和compareTo()方法宝成一致的结果：通过equals()非那还true
 * 通过compareTo()返回0	
 * 如果两个对象通过compareTo(Object obj)方法比较返回0，而通过equals方法返回false,不能添加成功
 * 
 * 	添加了一个可变对象以后，并且后面的程序修改了该可变对象的实例变量，这将导致它与其他家对象的大小顺序发生改变，但是咧
 * 	TreeSet不会再次调整他们的顺序，甚至可能导致TreeSet中保证的着两个对象通过compareTo()方法比较返回0,
 */

//for example
class T implements Comparable
{
	int count;
	public T(int count)
	{
		this.count = count;	
	}
	public String toString()
	{
		return "T[count:"+ count + "]";
	}
	//重写抽象方法
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == T.class)
		{
			T r = (T)obj;
			return r.count == this.count;
		}
		return false;
	}
	//再次重写
	public int compareTo(Object obj)
	{
		T r = (T)obj;
		return count > r.count ? 1 : count <r.count ? -1 : 0;//多重三目表达式
	}
}

public class TreeSet类的测试3 {
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new T(5));
		ts.add(new T(-3));
		ts.add(new T(9));
		ts.add(new T(-2));
		
		//有序排序的贴心小类TreeSet
		System.out.println(ts);
		
		//get the first item
		T first = (T)ts.first();
		
		first.count = 20;
		
		T last = (T)ts.last();
		last.count = -2;
		
		//打印显示:没有顺序了都
		System.out.println(ts);
		//删除被改变了的元素：报错
		//System.out.println(ts.remove(new R(-2)));//删除失败
		//System.out.println(ts);
		
		//删除没有改变了的元素：报错
		//System.out.println(ts.remove(new R(5)));
		//System.out.println(ts);
	}
}
