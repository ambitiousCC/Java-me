package 集合概念;

import java.util.*;

/*
 * 	Iterator是java集合框架中的成员哦，Collection and Map have the same method -- contain the items 容器
 * 	but Iterator mainly is used to visit collection's items.
 * 	Iterator对象被称为迭代器
 */

/*
 * 	我们从Iterator的底层构架开始学习
 * 	4 methods
 * 	~	boolean hasNext():	如果被迭代访问的集合元素还没有被遍历玩，返回true
 *  ~	Object next():		删除集合里面的下一个元素
 *  ~	void remove():		删除集合里面的上一次next方法中的返回额元素
 *  ~	void forEachRemaining(Consumer action)	这是新增的默认方法：可以被用来使用遍历集合元素
 *  
 *  发现：只能删除不能增加，只能迭代下一个元素
 */

//for example
public class Iterator遍历集合元素 {
	public static void main(String[] args)
	{
		//创建集合和添加元素
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("cuiqinbaba");
		books.add("cuiqinhaha");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext())//只能迭代下一个元素
		{
			//it.next()方法返回的数据类型是object 类型，因此需要强制转换
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("cuiqin"))
			{
				//从集合中删除上一次next()方法中返回的元素
				//books.remove(book);//java.util.ConcurrentModificationException不能修改集合元素
				//the reason why is that: fail-fast 快速失败机制，一点在迭代过程中检测到该集合已经被修改了(程序中的其他线程修改),to avoid the question of resource sharing 
				it.remove();
			}
			//对book赋值，但是呢不会改变集合元素的本身，输出了以后发现返回值并没有卵用：主角方法的迭代并不是吧集合元素本身就直接传给了迭代变量，而是把集合元素的值传给了迭代变量，所以修改
			//迭代变量的值对集合元素本身并没有任何影响，
			book = "test";
		}
		
		System.out.println(books);
		
		//对于Collection迭代时元素不能改变的问题：需要使用remove()方法来删除上一次next()方法返回的集合元素才能可以改变
		//for example
		//获取迭代器
		
	}
}