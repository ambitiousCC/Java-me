package 集合概念;

import java.util.*;

/**
 * @see		概述
 * @author 崔秦
 *
 */

/*
 * 	具体方式：
 * 		boolean addAll(Colletion c)			把集合c中里面的所有原色添加到指定集合里面
 * 		void clean() 						清除所有元素，而且长度变成0
 * 		boolean contains(Object o)			返回集合中是否包含指定的元素
 * 		boolean	containAll(Collection c)	返回集合里面是否包含集合C中的元素
 * 		boolean	isEmpty()					返回集合是否为空，淡季和长度为0时返回true，否则返回false 
 * 		boolean iterator()					返回一个Iterator用于遍历集合里面的元素
 * 		boolean remove(Object o)			包含了一个或者多个元素o，方法只能删除第一个符合条件的元素
 * 		boolean removeAll(Collection c)		是删除集合c里面的所有元素		删除了一个以上(删除成功)return true
 * 		boolean retainAll(Collection c)		集合中删除集合c里面不包含的元素(相当于对使用这个方法的对象与集合C中的元素求交集)
 * 		int size()							返回集合中元素的个数
 * 		Object[] toArray()					神奇的把集合变成一个数组，字面意思哈啊哈哈
 */

//起飞咯：嘟嘟嘟嘟苏
public class Collection接口 {
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		//add items
		c.add("cuiqin");
		//集合脸不能放基本类型的值，但是有自动装箱丫
		c.add(4);
		System.out.println("The number of c's items: " + c.size());
		//delete the pointer items
		c.remove(4);
		System.out.println("now changed : " + c.size());
		//charge whether have the pointer items
		System.out.println("whether c includes the cuiqin String: " + c.contains("cuiqin"));
		c.add("your father is me,cuiqin");
		c.add(34);
		System.out.println("The items of c : " + c);//答应的结果和数组不一样哈，就是直接把东西往里面塞进去,元素之间用逗号隔开，但是如果你插入的字符串中也包含了逗号，非常容易搞混淆
		//转型？？类不一样但是使用方法差不多
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("cuiqinbaba");
		System.out.println("whether c collection include the books: " + c.containsAll(books));
		//count the similar items
		c.removeAll(books);
		System.out.println("now the items of c are : " + c);
		//delete all items of c
		c.clear();
		System.out.println("the items of c : " + c);//null
		//let the books contain the items of c
		books.retainAll(c);
		System.out.println("the items of book" + books);
		
		//after all, although two collection's classes are different but only see them as the collection it is the same when we use the
		//method of add, remove, clear and so on.
		
		//what's more, the reason why print out the [ele1, ele2, ...] is that the Collection all rewrite the method of toString().
		//this method can directly print all the items of collection
		//if you want to read all the items of collection one by one, you need to use other methods.
		//now the collection can remember all the kind of items.
	}
}
