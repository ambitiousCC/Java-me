package Queue集合;

public class 介绍 {
	public static void main(String[] args)
	{
		System.out.println("模拟队列：先进先出型数据结构，通常不匀速随机访问队列中的元素\n"
				+ "void add(Object e) 将指定的元素加入此队列的尾部\n"
				+ "Object element() 获取队列头部的元素，不删除\n"
				+ "boolean offer(Object e) 将指定的元素加入到队列的尾部，但是用容量有限的队列时，这个方法比add(Object e)更好\n"
				+ "Object peek() 获取队列头部的元素，不删除，队列为空返回null\n"
				+ "Object poll() 获取队列的头部的元素，删除元素，~~~~~~~~~\n"
				+ "Object remove() 获取头部的元素并且删除\n");
	}
}
