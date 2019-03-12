package 逻辑运算符;
/**语法
 * @author 崔秦
 * @version 1.0
 * 				char -->
 * 						int --> long --> float --> double
 * 	byte -->	short-->
 * 
 * */

public class signs {
	public static void main(String[] args)
	{
		/**
		 * 	逻辑运算符：
		 * &&
		 * & -->
		 * 		不短路的::::短路的理解：如果第一个满足条件，就会直接跳出语句
		 * | -->
		 * ||
		 * !
		 * ^	异或，当两个操作数不同时才会返回true
		 */
		System.out.println(!true);
		
		//测试短路
		int a = 5;
		int b = 10;
		if(a>4 | b++ >10)
		{
			System.out.println(a+"\n"+b);//不短路，即使是前面的表达式满足了，仍然会执行后面的表达式
			
		}
		
		int c = 5;
		int d = 10;
		if(c>4 || d++ >10)//短路了就不会执行后面的语句了
		{
			System.out.println(c+"\n"+d);
		}
		
		//简化的if语句：三目运算符：?
		//公式：expression ? if-true-statement : if-faulse-statement
		String str = 5 > 3 ? "yes" : "no";
		System.out.println(str);
		
		//三目表达式没有if-else型语句可读，但是简化，也可以执行复杂的判断
		int e = 11;
		int f = 12;
		String str0 = e < f ? "e小于f" : (e < f ? "e小于fa" : "e等于f");
		System.out.print(str0);
	}
}




