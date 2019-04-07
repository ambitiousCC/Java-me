package 操作集合的工具类Collections;
//操作Set List Map
import java.util.*;

/*
 *	void reverse(List list) 翻转顺序？？ 	
 *	void shuffle(List list)	随机排序：模拟洗牌动作
 *	void sort(List list)	根据自然排序指定
 *	void sort(List list, Comparator c) 根据自然顺序对指定的List集合元素按照升序排序
 *	void swap(List list, int i, int j)指定的List集合中的i处元素和j处元素进行交换
 *	void rotate(List list, int distance) 是正数时，将list集合后面的distance个元素
 *		整体移动到前面;当distance为负数时候，将list集合的钱distance个元素"整体"
 *			字面意思：旋转
 */

//for example
public class 排序操作 {
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		Collections.reverse(nums);//反转
		System.out.println(nums);
		Collections.sort(nums);//升序
		System.out.println(nums);
		Collections.shuffle(nums);//洗牌
		System.out.println(nums);
	}
}
