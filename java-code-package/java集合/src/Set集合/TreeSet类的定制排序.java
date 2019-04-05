package Set集合;

import java.util.*;
/*
 * 	与自然排序的区别：自然排序总是升序排列
 */

//for example
class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "M[age:" + age + "]";
	}
}
public class TreeSet类的定制排序 {
	public static void main(String[] args)
	{
		//使用lambda表达式
		TreeSet ts = new TreeSet((o1, o2) ->
		{
			M m1 = (M)o1;
			M m2 = (M)o2;
			//根据M对象的age属性来决定大小 ,age值越大，M对象反而越小
			return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
	}
	/*	实现定制排序的时候，不能像TreeSet 中添加类型不同的对象，否则会引发异常
	 * 	TreeSet帕努单两个集合元素相等的标准：通过Comparator 比较两个元素返回 0 此时不会把元素添加到集合中
	 */
}
