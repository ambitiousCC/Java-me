package Hello_Java;
/**
 * Description:检查浮点数
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */
public class 对于精度数的第一次简介 {
	public static void main(String[] args)
	{
		//float型需要在赋值的数据后面加上f/F，同理double型需要加入d/D
		
		float af = 3.343434f;
		
		System.out.println(af);
		
		//特殊除法
		double a = 0.0;
		
		System.out.println(34/a);
		//报错System.out.println( 0/0);
		
		//引入无穷大的概念,两种浮点数类型的无穷一致
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		
		System.out.println(c==d);
	}
}
