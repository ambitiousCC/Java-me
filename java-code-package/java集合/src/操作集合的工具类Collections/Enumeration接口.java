package 操作集合的工具类Collections;

import java.util.*;

/**
 * 	这个接口很是古老，简单介绍一下古老的方法
 * 		only two methods
 * 			boolean hasMoreElement() 迭代器还有剩下的,返回true
 * 			Object nextElement()	 返回迭代器的下一个元素
 *
 *	为了照顾那些古老的程序，没有删除方法
 */

//防止问到这个java历史产物，简单介绍一下方法的使用
public class Enumeration接口 {
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("cuiqin1");
		v.add("cuiqin2");
		Hashtable scores = new Hashtable();
		scores.put("A", 1);
		scores.put("B", 2);
		Enumeration em = v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		Enumeration keyEnum = scores.keys();
		while(keyEnum.hasMoreElements())
		{
			Object key = keyEnum.nextElement();
			System.out.println(key + "--->" + scores.get(key));
		}
	}
}
