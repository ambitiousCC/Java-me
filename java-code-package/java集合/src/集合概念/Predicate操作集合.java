package 集合概念;

/**
 * 	@see		面向对象.包和import声明和import_static.包测试
 */

import java.util.*;
import java.util.function.Predicate;//为什么还要单独引进这个包？？？：傻猪猪，看关联文件：不能引用子包啊亲！


/*						作为对象：是函数式接口：可以使用lambda
 * 	new method removeif(Predicate filter)
 * 	fuction		批量删除符合filter的条件的所有元素,换一种说法就是过滤集合
 */

public class Predicate操作集合 {
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add(new String("cuiqin"));
		books.add(new String("cuiqinbaba"));
		books.add(new String("cuiqindiedie"));
		books.add(new String("cuiqinhaha"));
		books.add(new String("cuiqinxixi"));
		
		//use lambda
		books.removeIf(ele -> ((String)ele).length() < 10);
		
		//print items
		System.out.println(books);
		
		//foreach
		for(Object obj:books)
		{
			System.out.println(obj);
		}
		
		//iterator
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
		}
		
		//统计功能: 测试出现cuiqin的元素，长度大于10的，baba的元素
		System.out.println(calAll(books, ele ->((String)ele).contains("cuiqin")));
		System.out.println(calAll(books, ele ->((String)ele).contains("baba")));
		System.out.println(calAll(books, ele ->((String)ele).length() > 10));
	}

	//自定义那个统计方法：输出的是总和数据
	private static int calAll(Collection books, Predicate p) {
		int total = 0;
		for(Object obj : books)
		{
			//使用Predicate的test()方法来判断对象是否满足Predicate满足的条件
			//如此舒服！！！！！
			if(p.test(obj))
			{
				total ++;
			}
		}
		
		return total;
	}
}
