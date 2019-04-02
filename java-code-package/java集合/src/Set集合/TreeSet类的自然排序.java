package Set集合;

import java.util.*;
/**
 * 
 * @author 崔秦
 *
 *	调用的是compareTo()方法来比较元素之间的大小关系，然后将集合元素按照升序排列--自然排列
 *			从一个Comparable接口引入
 *	obj1.compareTo(obj2); if return 0 -- equal , num<0 obj1 < obj2
 *	
 *	既然有这样一个神奇的接口，那么的话如果要把对象放进TreeSet类里面，那么对象所在的类中必须实现接口啊哈哈
 */

//bad example
class Err{}

public class TreeSet类的自然排序 {
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		//first error: can't cast to java.lang.comparable
		//add two items:error
//		ts.add(new Err());
//		ts.add(new Err());
		//second: comparing items needs to change the items' kind to the same.
		//需要向treeset类中添加的应该是同一个类的对象
//		ts.add(new String("cuiqin"));
//		ts.add(new Date());
	}
}
