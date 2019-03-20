package final修饰符;
/**
 * @see
 * @author 崔秦
 *
 *	final 修饰的类不能有子类
 */
final class shabi {
	
}
/*class erzi extends shabi {
	//The type erzi cannot subclass the final class shabi
}*/
public class final类 {
	public static void main(String[] args)
	{
		System.out.println("子类可以对父类的内部数据访问操作，导致不安全，所以可以用final进行修饰，比如java.lang.Math");
	}
}
