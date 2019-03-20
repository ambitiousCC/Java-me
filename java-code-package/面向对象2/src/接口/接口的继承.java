package 接口;
/**
 * 	接口多继承
 */
//public修饰的接口必须与主文件名相同
interface interfaceA
{
	int PROP_A = 6;
	void testA();
}
interface interfaceB
{
	int PROP_B = 4;
	void testB();
}
interface interfaceC extends interfaceA,interfaceB
{
	int PROP_C = 2;
	void testC();
}
public class 接口的继承 {
	public static void main(String[] args)
	{
		//继承以后获得常量
		System.out.println(interfaceC.PROP_C);
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
	}
}
