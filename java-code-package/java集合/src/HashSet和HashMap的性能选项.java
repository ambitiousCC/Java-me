/*
 * 		对于HashSet 以及其子类来说采用的是hash算法来决定集合中的元素的存储位置，通过hash算法来控制集合的大小，
 * 		而对于HashMap、Hashtable	以及其子类来说呢，他们采用的是是hash算法来决定Map中的key的存储，通过
 * 	hash算法来增加key集合的大小
 * 		可以存储元素的位置当存储一个元素的时候是有最好的性能的，但是呢如果产生冲突的时候，多个元素会在hash表里面
 * 	在同一个位置以链表的形式来存储，而且存储式的元素必须按照放入时的顺序来读取
 * 
 * 		hash算法有关的:hashSet hashMap hashtable: 都有共有的属性
 * 			容量
 * 			初始化容量
 * 			尺寸：就是当前hash表中的记录的数量
 * 			负载因子： 大小= size/capacity,通过这个可以推断，这个值相对小的时候就具有：冲突少，容易插入
 * 		但是呢，iterator不易迭代的属性
 * 
 * 	负载极限：决定了hash表中的最大填满程度：达到这个负载程度的时候呢，hash表就会自动成倍增加容量,
 * 			同时将原来的元素重新放入型的存储内存中（经历了重新分配），过程是rehashing
 * 	默认的负载极限：0.75，就是0.75n的被填满时会发生rehashing
 */
public class HashSet和HashMap的性能选项 {
	public static void main(String[] args)
	{
		System.out.println("");
		
	}
}
