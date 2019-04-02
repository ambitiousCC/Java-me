package 集合概念;

import java.util.*;

public class foreach遍历集合 {
	public static void main(String[] args)
	{
		//create collection
		Collection books = new HashSet();
		
		//add items
		books.add("aa");
		books.add("cuiqinbaba");
		books.add("cuiqin");
		
		//foreach method code 
		for(Object obj : books)
		{
			//book 已经不是集合元素本身了
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("cuiqin"))
			{
				//注意：如果集合中只有一个元素，那么是不报错甚至是成功移除，但是多个一定报错
				//一定要避免这个异常
				//详细原因：	西永只是一次吧集合元素的值赋给迭代变量，迭代变量不是元素本身
				//因此在foreach循环中的迭代变量没意义
				//books.remove(book);//ConcurrentModificationException异常
			}
			System.out.println(books);
		}
			
		
	}
}
