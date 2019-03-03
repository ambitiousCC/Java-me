package 循环结构;

public class 控制循环专门用来测试return {
	public static void main(String[] args)
	{
		int i = 0;
		for(i = 0; i<5;i++)
		{
			System.out.println("i的值："+i);
			for(int j = 0;j<3;j++) {
				System.out.println("j的值为："+j);
				for(int k = 0;k<5;k++) 
				{
					System.out.println("k的值为："+k);
					if(k ==4)
						//测试发现，这里真的直接跳出了这个函数！！
						return;
				}
			}
		}
		System.out.print("不知道能不能运行这句话");
	}
}
