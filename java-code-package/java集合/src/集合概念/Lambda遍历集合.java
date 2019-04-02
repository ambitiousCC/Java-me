package 集合概念;

//forEach : 参数需要一个函数式接口

/*
 * 	恰好Iterable接口是Collection接口的父接口
 *	when use the method forEach(Consumer action) of Iterable interface, the program will convey the items to the method named accept(T t)
 *								方法
 *	and accept(T t) is the only  abstract method.
 *	正因为Consumer 是一个函数式接口，可以使用Lambda表达式来遍历集合元素
 */

//for example

import java.util.*;

public class Lambda遍历集合 {
	public static void main(String[] args)
	{
		//create the collection
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("cuiqinbaba");
		books.add("cuiqinhaha");
		//forEach()
		//send the items to obj one by one automatically
		books.forEach(obj -> System.out.println("迭代元素：" + obj));//逐一输出
		
	}
}