package 成员变量和局部变量;
/**
 * 
 * @author 崔秦
 * @纯概念
 * <br>	初始化·类的时候：只会给类变量初始化内存
 * <br>	创建一个关于类的对象以后，类变量只属于类，不属于对象
 * <br>	实例变量在创建实例时才指定内存并确定初始值
 * <br>	因而创建对象，只会给实例变量分配内存和初始化
 * <br> 此时创建多个新的对象，访问该对象下的这个类变量，都是访问的同一个区域
 * @局部变量考虑
 * <br>某类或某对象的固有信息
 * <br>某类中需要用一个比昂两来保存该类或这实例运行中的状态信息
 * <br>某个信息需要在多个类中共享
 */
public class 成员变量初始化和内存中的运行机制 {
	public static void main(String[] args)
	{
		System.out.println("成员变量与局部变量");
	}
	public static void test(int a)
	{
		a += 10;
		System.out.println(a);
	}
}
