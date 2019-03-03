package 数组;

public class 使用数组 {
	public static void main(String[] args)
	{
		//静态
		Object[] newArr;
		newArr = new Object[] {"李刚","a"};
		Object[] newArr0 = {"a","b"};
		//动态
		Object[] newArr1 = new Object[4];
		System.out.println(newArr0[0]);
		System.out.println(newArr1[2]);
		//给数组赋值
		newArr1[2] = "崔秦";
		System.out.println(newArr1[2]);
		
		//Object[] newArr2 = {"a","b","c","d"};
		int[] newArr2 = new int[4];
		for(int i = 0;i<newArr2.length;i++)
			System.out.println(newArr2[i]);//遍历数组元素的方法
		
	}
}
