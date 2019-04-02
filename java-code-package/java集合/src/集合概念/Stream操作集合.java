package 集合概念;
/**
 * @see		面向对象.Lambda表达式.方法引用和构造器引用
 */

/*													   int		 double		  long
 * 	流式API，代表多个支持串行和并行狙击操作的元素。including:	Stream IntStream DoubleStream LongStream
 * 	what we can see is that the Stream is the common 流 interface.
 * 
 * 	contacted Builder	 the programmer can use the Builder including Stream.Builder, IntStream.Builder, LongStream.Builder, 
 * 		DoubleStream.Builder to create 对应的流
 * 
 * 	the way to use it:
 * 		use Stream or XxxStream's builder() class-method to create Builder
 * 		repeat using add() of Builder to add items for 流
 * 		use build() of Builder to get the Stream
 * 		use the 聚集方法 of Stream 
 * 
 * attention !: for most 聚集方法 every method can only use once
 */ 

import java.util.stream.IntStream;

public class Stream操作集合 {
	public static void main(String[] args)
	{
		IntStream is = IntStream.builder()
			.add(20)
			.add(13)
			.add(-2)
			.add(18)
			.build();
		
		//调用聚焦的方法代码每次只能执行一行
//		System.out.println("all items of is have the biggest one is that: " + is.max().getAsInt());
//		System.out.println("all items of is have the smalles one is that: " + is.min().getAsInt());
//		System.out.println("the sum of all items of is : " + is.sum());
//		System.out.println("the count of all items of is : " + is.count());
//		System.out.println("the average of all items of is : " + is.average().getAsDouble());
		
		//add method to print out
//		System.out.println("is所有元素的平方是否都大于20？" + is.allMatch(ele -> ele * ele > 20));
//		System.out.println("is是否包含任何元素大于20？" + is.anyMatch(ele -> ele * ele > 20));
		
		//制作一个新的映射哦，就是使用对应关系来创建一个新的stream 和函数是不是有点像呢 没错简直一模一样
		IntStream newIs = is.map(ele -> ele * 2 + 1);
		//使用方法引用的方式来遍历集合元素
		newIs.forEach(System.out::println);//引用类的类方法
	}
	
/**
 * 	对上面方法的解释吧：
 * 	都是一些常用的方法，具体的需要自己查看API
 * 		具体实现过程： 创建IntStream - 多次调用IntStream的聚集方法执行操作
 * 		聚集方法类别：
 * 			中间方法：允许流保持打开， 允许直接调用后续方法。中间方法返回的值是另一个值
 * 			末端方法：对流的最终操作。当对某个Stream执行末端方法后，流会被消耗，不可再用，因此只能使用一次哦
 * 			有状态的方法：给刘增加一些新的属性，唯一性啊、元素的最大数量啊、保证元素已排序的方式呗处理等等丫，因此有状态的方法往往需要一些更大的性能开销
 * 			短路方法：尽早结束对流的操作，不必检查所有的元素
 * 
 * 		中间方法：
 * 			filter(Predicate predicate) 过滤所有不符合predicate元素
 * 			mapToXxx(ToXxxFunction mapper)对流执行一对一的转换，返回的新流中包含了ToXxxFunction转换生成的所有元素
 * 			peek(Consumer action):依次对每个元素执行一些操作哦，返回的流与原有的流含含相同的元素，主要用于测试
 * 			distinct():用于排序流中所有重复的元素(判读重复的标准是使用equals()比较返回true),？？有状态的方法
 * 			sorted()	用于保证流中的元素在后续的访问中处于有序状态。这是一个有状态的方法
 * 			limit(long maxSize)保证对该流的后续访问中最大允许访问的元素的个数，又是一个有状态的、短路的方法
 * 		末端方法：
 * 			for(Consumer action)			遍历流中的所有元素，对每个元素都执行action
 * 			toArray()						转换成为数组
 * 			reduce()						合并流中的元素
 * 			min()							返回最大、小值
 * 			max()
 * 			count()							所有元素的数量
 * 			anyMatch(Predicate predicate)	判断是否至少包含一个元素符合predicate条件						
 * 			allMatch(Predicate predicate)	判断流中是否每个元素都符合predicate条件
 * 			noneMatch(Predicate predicate)	判断流中是否所有元素都不符合predicate条件
 * 			findFirst()						返回流中的第一个元素
 * 			findAny()						返回流中的任意一个元素
 */
	
}
