package this实例;

public class dog {
	public void jump()
	{
		System.out.println("跳一跳");
	}
	public void run()
	{
		/**
		 * 反例：重新new一个dog对象
		 * 类名 标识符 = new 类();
		 * dog d = new dog();
		 * d.jump();
		 */
		//引用dog对象中已经存在的jump方法
		/**
		 * 书中原话:
		 * this可以代表任何对象，当this出现在某个方法体中时，他所代表的对象是不确定的，但是他的类型是确定的：它所代表的
		 * 只能是当前类的实例；只有当这个方法被调用时，它所代表的对象才被确定下来，谁调用这个方法，this就代表谁。
		 */
		this.jump();
		System.out.println("跑一跑");
		//同一个对象的两个方法之间的依赖：Java允许对象的一个成员直接调用另一个成员，可以省略this!!
		jump();
		//大部分，普通方法访问同类其他方法，成员变量无须this
		//如果：方法中有个局部变量和成员变量同名，需要再该方法中访问这个被覆盖的成员变量，则必须使用this
	}
}
