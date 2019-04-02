package Set集合;

import java.util.HashSet;

/**
 * 	@see		java.集合.集合概念.概述		
 * 
 * 	as for the set collection : the program can't remmber the order of items and it can't include the 
 * 	same items or it will return error.
 * 
 * 	now we need to learn about the HashSet class
 */

class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}

class B
{
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	public int hashCode()
	{
		return 1;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}

public class HashSet类 {
	//按照hash算法来存储集合中的元素
	/*	special points
	 * 		不能保证元素排列顺序，顺序可能于添加顺序不同，顺序也有可能发生变化
	 * 		HashSet不是同步的，如果多个线程同时访问一个HashSet 有多个线程同时修改了HashSet集合是，必须通过代码来保证同步
	 * 		集合元素值可以是null
	 * 
	 * 	存储过程：调用对象的hashCode() to get the hashCode --> 根据这个值来决定对象在HashSet中的存储位置，如果有两个元素通过equals
	 * 	方法比较反悔了true 但是他们的hashCode方法返回值不同，那么就会存储在不同的位置
	 * 		综上：	判断两个元素相等的标准是： 两个对象通过equals()比较相等，并且两个对象的hashCode()方法返回值也相等
	 */
	public static void main(String[] args)
	{
		HashSet books = new HashSet();
		//添加对象
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		//添加了留个对象，但是只返回了四个：A、B两类由于equals和hashcode的值不同就不能判断相等
		System.out.println(books);
	}
	/*
	 * 总结：
	 * 		使用hash而不是用数组(存储速度最快(是因为hash可以通过对象的hash值来决定存放位置，而数组不能改变长度而且索引值是按照顺序来的
	 * 
	 * 	把HashSet中存储元素的地方看做是格子，当通过equals方法判断为false时，会存储在不同的格子，因此会导致性能下降
	 * 
	 * 	重写hashCode方法时候需要注意的问题
	 * 		同一个对象多次调用hashCode() method needs to return the same pointer
	 * 		两个对象通过equals返回true时候两个对象的hashCode方法应该返回相同的值
	 * 		然后就是对象中用作equals()方法比较标准的实例变量都应该用于计算hashCode值
	 */
}
