package final修饰符;
/**
 * @see		面向对象.类的继承.重写父类||面向对象.类的继承.重写父类的子类 ||面对对象.深入构造器.重载
 * @author 崔秦
 */

/**
 * final修饰的方法不能被重写
 * 不希望使用子类重写父类：final一下
 * 比如：getClass()
 */
public class final方法 {
	public final void test() {}
	private final void cuiqin() {}
}

class Sub extends final方法 {
	//public void test() {}//重写无效
	//可以自己定义一个和父类一样但是被private修饰的方法
	public void cuiqin() {}
	//final修饰的方法只是不能被重写，可以重载
	//public final void test() {}//ide的要求
	public final void cuiqin(String arg) {}
}
