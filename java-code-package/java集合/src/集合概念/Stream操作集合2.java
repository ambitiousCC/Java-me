package 集合概念;

import java.util.*;

public class Stream操作集合2 {
	public static void main(String[] args)
	{
		//创建集合
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("patient");
		books.add("excellent");
		books.add("cuiqinhahaha");
		
		//统计cuiqin
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).contains("cuiqin"))
				.count());
		//统计包括ent
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).contains("ent"))
				.count());
		//统计字符串数大于10
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).length() > 10)
				.count());
		//调用Collection对象的stream()方法将集合转换成为Stream
		//调用Stream mapToInt()方法来获取缘由的Stream对应的IntStream
		//		attention: mapToInt is a middle method so we still can use last method to progress
		books.stream().mapToInt(ele -> ((String)ele).length())
		//use forEach() method to show up all items of IntStream
		.forEach(System.out::println);
		
		//可以重复使用方法对集合里面的元素进行操作
		//程序只要调用Collectoin 中的stream()方法就可以返回集合对应的Stream,然后就可以使用那个的方法处理
		
	}
}
