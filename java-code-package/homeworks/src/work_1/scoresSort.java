package work_1;

import java.util.*;
/**
 *  @author 崔秦
 *  @function	输出成绩的数组的前三个大
 *	 总结一下吧：
 *	语句都知道，就是不会用：
 *		Arrays.sort()方法是用倒序排列的
 *		针对倒序输出最大，那么就只能从后往前输出，定义i的方式变化
 *		逻辑符号	||	&& 傻傻分不清
 */
public class scoresSort {
	public static void main(String[] args)
	{
		int[] scores = {94,34,67,65,45,78,100,32,-20};
		
		scoresSort p = new scoresSort();
		p.test(scores);
	}
	public void test(int[] books)
	{
		Arrays.sort(books);
		int num = 0;
		for(int i = books.length - 1;i > 0; i--)
		{
			if(books[i]>100 || books[i]<0)
			{
				continue;
			}
			num++;
			if(num>3)
			{
				break;
			}
			System.out.println(books[i]);
		}
	}
}
