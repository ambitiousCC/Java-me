package CheckChar;

public class specialWr {

	public static void main(String[] args)
	{
		//直观的封边二进制中的分割位,使用下划线对数值没有影响
		int binVal = 0B1000_0000_0000_0000_0000_0000_0000_0011;
		double pi = 3.14_15_92_65_36;
		
		System.out.println(binVal);
		System.out.print(pi);
	}
}
