package 类的继承;
//首先声明：同名重写不是完全覆盖
public class 重写父类的子类 extends 重写父类{
	//在子类中重新定义一个和父类一样的方法：被称为方法覆盖,重写
	public void fly ()
	{
		System.out.println("我不能飞哈哈");
	}
	//调用父类被覆盖的方法：
	public void override()
	{
		//super显示调用父类被覆盖的实例方法
		//super用于限定该对象调用它从父类继承得到的实例变量或方法，因而不能使用static修饰方法
		//static修饰的方法是属于类的，调用的也可能是类而不是对象，super的限定就失去意义了
		super.fly();
	}
	//关于实例变量同名覆盖
	public int a = 7;
	//自己
	public void accessOwner()
	{
		System.out.println(a);
	}
	public void accessBase()
	{
		//限定对象为父类啦
		System.out.println(super.a);
	}
	
	//主方法
	public static void main(String[] args)
	{
		重写父类的子类 p = new 重写父类的子类();
		p.fly();
		p.override();//调用之后的方法
		//或者直接调用即可
		重写父类 d = new 重写父类();
		d.fly();
		
		//关于实例变量
		p.accessOwner();
		p.accessBase();//爸爸的实例变量
	}
/**
 * 		系统查找实例变量的顺序：
 * 	查找该方法中是否有同名局部变量
 * 		当前类中是由有同名实例变量
 * 	查找直接弗雷中是否包含，依次上溯查找所有父类
 * 
 * 		类变量就通过父类名作为调用者来访问被覆盖的类变量
 */
}
