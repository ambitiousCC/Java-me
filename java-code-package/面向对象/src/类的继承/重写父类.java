package 类的继承;
/**
 *	一般是继承的是子类不需要的方法，需要改写
 *	方法的改写：两同两小一大
 *		同：方法名、形参列表
 *		小：子类方法返回值类型比父类的..更小或相等、子类方法声明抛出的异常类应该比父类的..更小或相等
 *		大：子类方法的访问权限比父类..更大或相等
 *	覆盖方法和被覆盖方法必须一致
 *
 *	需要调用被覆盖的方法时：
 *		super -->被覆盖的是实例方法
 *		父类类名  -->		类方法
 *	private 完全隐藏到自己类中去了，子类也不能访问父类中的private 限制的父类 
 *
 *	！！注意重写和重载的区别
 */
public class 重写父类 {
	public int a = 5;
	public void fly ()
	{
		System.out.println("我会飞");
	}
}
