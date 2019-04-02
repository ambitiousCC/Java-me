package Set集合;

import java.util.*;

class R
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode()
	{
		return this.count;
	}
}

public class rewriteHashCode {
	public static void main(String[] args)
	{
		System.out.println("向HashSet中添加可变对象的时候，可能导致该对象与集合中的其他对象相等，导致HashSet无法准确访问该对象");
		//尽可能的避免修改几何元素中参与计算的hashCode(),equals()实例变量，否则会导师HashSet无法正确操作这些集合元素
		HashSet<R> hs = new HashSet<R>();
		hs.add(new R(5));
		hs.add(new R(4));
		hs.add(new R(-9));
		hs.add(new R(-2));
		//print 
		System.out.println(hs);
		//first item
		Iterator<R> it = hs.iterator();
		R first = (R)it.next();
		first.count = 4;//由于改写了用于判断的equals()方法和hashCode()方法，已经不可能准确访问位置了
		//赋值出现重复元素
		System.out.println(hs);
		//delete the 4
		hs.remove(new R(4));
		
		System.out.println(hs);
		System.out.println("hs是否包含4？对象" + hs.contains(new R(4)));
		System.out.println("hs是否包含count为-2的R对象？" + hs.contains(new R(-2)));
	}
}
