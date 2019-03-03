package 数组;

public class 作业练习 {
	
	public static void main(String[] args)
	{
		//输出有模有样的九九乘法表
		for(int i = 1;i < 10;i++)
		{
			for(int j = 1;j < i+1 ;j++)
			{
				System.out.print(i+"*"+j+"="+i*j);
				if(j<i)
					System.out.print(",");
			}
			System.out.print("\n");
		}
		
		//输出等腰三角形
		/**
		 * 行	空格数	星号
		 * 1	4-1		1
		 * 2	4-2		3
		 * 3	4-3		5
		 * 4	4-4		7
		 * 最大的笑点就是：我竟然一开始还控制后面的空格个数？？完全不需要的，只用管前面的空格和插入的星号就可以了
		 */
		int num = 5;
		for(int i = 1;i<5;i++)
		{
			for(int j = 1;j<num-i;j++)//控制空格
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=i*2-1;k++)//控制星号个数
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

