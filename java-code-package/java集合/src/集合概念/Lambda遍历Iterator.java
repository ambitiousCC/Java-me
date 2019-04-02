package 集合概念;

import java.util.*;

/**
 *	@see	compare with Lambda遍历集合.java
 */

/*
 * 	forEachRemaining(Consumer action)		函数式接口，程序会依次将集合元素传给Consumer的accept(T t)方法(的唯一的抽象方法)
 */

//for example
public class Lambda遍历Iterator {
	public static void main(String[] args)
	{
		//创建集合
		Collection books = new HashSet();
		books.add("cuiqinhahaha");
		books.add("baba");
		
		//获取迭代器
		Iterator it = books.iterator();
		
		//use lambda: find the order , each time you add one item the item will be
		//the frist one.
		it.forEachRemaining(obj -> System.out.println("items:" + obj));
	}
}
