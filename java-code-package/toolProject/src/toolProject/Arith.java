package toolProject;

import java.math.BigDecimal;

public class Arith {
	//默认除法运算精度
	private static final int DEF_DIV_SCALE = 10;
	//private not be used
	private Arith() {}
	//count now!!!
	public static double add(double v1, double v2) 
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	public static double sub(double v1, double v2) 
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	public static double mul(double v1, double v2) 
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	//对于除法：：除不尽的时候
	//精确到小数点以后的10位四舍五入
	public static double div(double v1, double v2) 
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public static void main(String[] args)
	{
		System.out.println("0.05 + 0.01 = " + Arith.add(0.05, 0.01));
		System.out.println("1.0 + 0.42 = " + Arith.sub(1.0, 0.42));
		System.out.println("4.015 * 100 = " + Arith.mul(4.015, 100));
		System.out.println("123.3 / 100 = " + Arith.div(123.3, 100));
	}
	
}
