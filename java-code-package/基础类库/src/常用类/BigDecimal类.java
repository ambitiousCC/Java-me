package 常用类;

import java.math.*;

/*
 *	float and double 都容易造成精度丢失	尤其是在进行数学计算时候
 *	 因此呢 有BigDecimal类 
 *
 *	不推荐使用double 传入的值产生BigDecimal对象，因为不能确定传入的数字是double还是float类型，所以。。
 *		推荐使用基于String的构造器	new BigDecimal("0.1")
 *
 *	必须使用double浮点数作为参数的时候呢：应该通过BigDecimal.valueOf(double value)的静态方法来创建BigDecimal 对象
 */

public class BigDecimal类 {

 // 	下面是关于对精确浮点数进行常规算数运算：
		public static void main(String[] args)
		{
			BigDecimal f1 = new BigDecimal("0.05");
			BigDecimal f2 = BigDecimal.valueOf(0.01);
			BigDecimal f3 = new BigDecimal(0.05);
			//String
			System.out.println("使用String作为参数：");
			System.out.println("0.05 + 0.01 = " + f1.add(f2));
			System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
			System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
			System.out.println("0.05 / 0.01 = " + f1.divide(f2));
			System.out.println("---------------------------------");
		/*
		 * 	+		add
		 *  -		subtract
		 *  *		multiply
		 *  /		divide
		 */
			System.out.println("使用double作为参数：");
			System.out.println("0.05 + 0.01 = " + f3.add(f2));
			System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
			System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
			System.out.println("0.05 / 0.01 = " + f3.divide(f2));
			
		}
 
}
