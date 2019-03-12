package 方法详解;

public class 递归方法 {
	//方法递归：包含了隐式循环，不需要循环语句就能执行
	//定义：一个方法体内调用它本身
	//求解数学题:f(0)=1,f(1)=4,f(n + 2)=2*f(n+1)+f(n)
	
	public static int fn(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n==1)
		{
			return 4;
		}
		else
		{
			//return fn(n+2)-2*fn(n+1);
			//递归是需要向已知的条件去变型：求的值是更大，递增，求的值更小，递减
			return 2*fn(n-1)+fn(n-2);
		}
	}
	//递归的方法可以用来遍历一个文档中的所有文件
	
	public static void main(String[] args)
	{
		System.out.println(fn(10));
		
	}
}
