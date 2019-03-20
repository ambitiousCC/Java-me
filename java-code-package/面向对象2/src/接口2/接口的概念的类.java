package 接口2;
/**
 * @see		接口.接口的概念
 * @author 崔秦
 * @function为了测试不同包下的调用接口中的
 */
public class 接口的概念的类 {
	public static void main(String[] args)
	{
		//访问另一个包中接口的变量
		System.out.println(接口.接口的概念.MAX_CACHE_LINE);//50
		//证实了系统默认自动给成员变量增加了final修饰符
		//接口.接口的概念.MAX_SIZE = 24 ;
		//使用接口调用类方法
		System.out.println(接口.接口的概念.staticTest());
	}
}
