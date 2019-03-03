package 循环结构;

public class 循环语句 {
	public static void main(String[] args)
	{
		//初始化循环条件
		int count = 0;
		while (count < 10)
		{
			System.out.println(count);
			count++;
		}
		System.out.println("循环完了");
		//有趣的死循环
		//int num = 0;
		//while (num < 10)
		//{
		//	System.out.println("死循环哈哈"+num);
		//	num++;
		//}
		
		//do-while，特点是不管满不满足都先循环一次
		int fix = 1;
		do 
		{
			System.out.println(fix);
			fix++;
		}while(fix<10);//看到这个分号了吗！！！
		System.out.println("do-while循环结束");
		//for(1;2;3)
		for (int b = 0,s = 0,p = 0;b < 10 && s < 4 && p < 10;p++)
		{
			System.out.println(b++);
			System.out.println(++s + p);
		}
		//值得注意的死循环
		//for (;;)
		//{
		//	System.out.println("=========");
		//}
		//最好在for循环前面就声明变量，全局作用
		//循环变量i/j/k
	}
}
