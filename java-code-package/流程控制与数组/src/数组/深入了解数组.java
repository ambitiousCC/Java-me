package 数组;

public class 深入了解数组 {
	public static void main(String[] args)
	{
		//哈？？没有多维数组，只是可以当做一位数组处理
		//因为不管意义上的几维数组，都是一位数组的变形
		String[][] newnewArr0 = new String[4][];
		for (int i = 0;i<newnewArr0.length;i++)
		{
			System.out.println(newnewArr0[i]);
		}
		//可以看到是x-y 型 (4,?)
		//给二维数组赋值的方法
		newnewArr0[0] = new String[8];
		newnewArr0[0][0] = "woc";
		newnewArr0[0][1] = "woca";
		newnewArr0[0][2] = "wokao";
		newnewArr0[0][3] = "woqiao";
		for(int i = 0;i<newnewArr0[0].length;i++)
		{
			System.out.println(newnewArr0[0][i]);
			//输出这个二维数组中第一个索引值下面的所有的数组
		}
		newnewArr0[1] = new String[2];
		newnewArr0[1][0] = "hello world";
		newnewArr0[1][1] = "hello";
		for(String book:newnewArr0[1])
		{
			System.out.println(book);
		}
		System.out.println("--");
		//首尾照应：可以同时动态初始化二维数组的长度
		String[][] newArr0 = new String [3][4];
		
		//也可以用静态初始化
		String[][] newArr1 = new String [][] {new String[3],new String[]{"cuiqin"}};
		newArr0[0][1] = "cuo";
		for(int i = 0;i<newArr0[0].length;i++)
		{
			System.out.println(newArr0[0][i]);
		}
		System.out.println("分割线");
		for(int i = 0;i<newArr1[1].length;i++)
		{
			System.out.println(newArr1[1][i]);
		}
		//emmmm这里跳过去了使用Arrays工具的方法，注意复习 
		/**
		 * 首先要引入 java.util.*;
		 * Arrays.equals(array0,array1)	比较两个数组是否相等
		 * Arrays.copyOf(array,num)		复制一个拥有和array中元素一致,长度为num的数组
		 * Arrays.toString(array)		将数组中的元素化为字符串输出
		 * Arrays.fill(array,be,la,n)	将array中第(be+1)~(la+1)的元素赋值为n
		 * Array.sort(array)			对array中元素进行排序
		 */
		
	}
}


