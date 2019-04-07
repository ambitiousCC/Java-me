package 操作集合的工具类Collections;
import java.util.*;

/*
 * 	具体的方法查api
 */

//for example
public class 查找和替换操作 {
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);//输出输入顺序
		
		System.out.println(Collections.max(nums));//
		System.out.println(Collections.min(nums));
		Collections.replaceAll(nums, 0, 1);//将nums中的0使用1来代替
		System.out.println(nums);
		
		//判断-5在list集合中的出现次数， 返回1
		System.out.println(Collections.frequency(nums, -5));
		Collections.sort(nums);//升序
		System.out.println(nums);
		//排序以后的集合才有顺序才能使用二分法来查询
		System.out.println(Collections.binarySearch(nums, 3));
	}
}
