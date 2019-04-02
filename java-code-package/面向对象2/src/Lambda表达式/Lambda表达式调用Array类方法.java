package Lambda表达式;

import java.util.Arrays;

public class Lambda表达式调用Array类方法 {
	public static void main(String[] args)
	{
		//静态初始化数组
		String[] arr1 = new String[] {"java", "fkava", "fkit", "ios", "android"};
		Arrays.parallelSort(arr1,(o1,o2) -> o1.length() - o2.length());//根据字符串的长度排序，字符越长，字符串越大
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[] {3,4,34,15,5};
		//left	代表数组中的前一个索引处的元素， 计算第一个元素时，left为1
		//right 代表数组中当前索引处的元素
		Arrays.parallelPrefix(arr2, (left,right) -> left * right);//前后值的乘积确定后面的值，3*4 12*34...
		System.out.println(Arrays.toString(arr2));
		long[] arr3 = new long[5];
		//oerand表示正在计算的元素索引
		Arrays.parallelSetAll(arr3, operand -> operand * 5);//将索引值乘五以后输出
		System.out.println(Arrays.toString(arr3));
	}
}
