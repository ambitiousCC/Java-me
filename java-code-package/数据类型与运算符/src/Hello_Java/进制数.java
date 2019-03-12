package Hello_Java;
/**
 * Description:值得一提的是，对于二进制数的转换需要彻底了解
 * <br>网站:<a href="https://www.baidu.com">百度</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:检查数字类型
 * <br>Date: 2019.2.28
 * @author 崔秦
 * @version 1.0
 */
public class 进制数 {
	public static void main(String[] args)
	{
		byte s = 34;
		//当输入的数据过大，需要使用long声明变量，最重要的是要在数据的末尾加入L，虽然不分大小写，但是l容易混淆
		long a = 9999999999999L;
		//整数值《==进制数都是
		int ocaralValue = 013;//八进制：0
		int hexValue = 0x23;//十六进制:0x或0X
		int binValue = 0b1000000;//二进制:0b或者0B
		
		//输出的数都自动转换成为了十进制数
		System.out.println(a+s);
		System.out.println(ocaralValue);
		System.out.println(hexValue+"\n"+binValue);
	}
}
