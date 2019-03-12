package 类的继承;

public class 继承的子类 extends 继承 {

	//Java类中只有一个直接父亲，可以有无数个简介父亲
	//class Fruit extends Plant{}
	//class Apple extends Fruit{}
	//java.lang.Object类是所有类的父亲，要么直接要么间接
	public static void main(String[] args)
	{
		继承的子类 a = new 继承的子类();
		//子类并没有定义父类所有的成员变量
		//但是它爸爸有啊
		a.weight = 56;
		a.info();
	}
	
}
