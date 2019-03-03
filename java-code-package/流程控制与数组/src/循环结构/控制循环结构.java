package 循环结构;

public class 控制循环结构 {
	public static void main(String[] args)
	{
		//break完全结束循环,continue只是搞定一次循环过程：一般是跳过特定的循环
		//直接控制
		int i = 0;
		for(i = 0;i<10;i++)
		{
			System.out.println(i);
			if(i ==2)
			{
				break;
			}
		}
		//循环的标识符:便于更好的标识循环
		System.out.println("第一个循环结束");
		outer0:
		for(i = 0;i<3;i++)
		{
			for (int j = 0;j < 9;j++) 
			{
				System.out.println("i的值为："+i+"j的值为："+j);
				if(j == 1)
				{
					break outer0;//功能真好！！！标识符必须在break所在外层之前定义才有意义
				}
			}
		}
		System.out.println("第er个循环结束");
		for(i = 0; i<5;i++)
		{
			System.out.println("i的值："+i);
			for(int j = 0;j<3;j++) {
				if(j == 1)
				{
					//这里就跳过了这一次循环
					continue;
				}
				System.out.println("j的值为："+j);
			}
			System.out.println("haha");
		}
	}
}
