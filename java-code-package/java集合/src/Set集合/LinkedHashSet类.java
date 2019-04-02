package Set集合;

import java.util.*;
/**
 * 
 * @author 崔秦
 *
 *
 *	这个牛逼的子类：需要维护元素的插入顺序，因此性能比HashSet低一些
 */

public class LinkedHashSet类 {
	public static void main(String[] args)
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("cuiqin");
		books.add("cuiqingege");
		books.add("cuiqinbaba");
		
		System.out.println(books);
		//delete baba
		books.remove("cuiqingege");
		//review
		//books.add("cuiqin");不能重复添加相同的元素！！！set集合
		books.add("cuiqingege");//元素地顺序与添加顺序一致
		System.out.println(books);//
	}
}
