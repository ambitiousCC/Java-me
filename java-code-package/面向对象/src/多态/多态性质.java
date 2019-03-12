package 多态;
//编译时类型	由声明该变量时所使用的类型决定
//									}运行类型不一致，可能出现所谓的多态
//运行时类型	有实际赋给该变量的对象决定	

//对象的实例变量不具备多态性,输出的是父辈的
//而父辈字辈同时拥有同名方法，会出现多态性

class BaseClass {
	public int book = 4;
	public void base()
	{
		System.out.println("父辈的普通方法");
	}
	public void test()
	{
		System.out.println("父辈被覆盖的方法");
	}
}
public class 多态性质 extends BaseClass{
	//隐藏父类的实例变量
	public String book = "什么鱼";
	public void test()
	{
		System.out.println("子类的覆盖");
	}
	public void sub()
	{
		System.out.println("子类的普通方法");
	}
	public static void main(String[] args)
	{
		//不存在多态
		BaseClass bc = new BaseClass();
		//显而易见是父类方法
		bc.base();
		bc.test();
		//子类方法
		多态性质 sc = new 多态性质();
		System.out.println(sc.book);
		sc.base();
		sc.test();
	/**
	 * 实际上编译和运行的两个阶段是被上面代码简化了
	 * BaseClass p;//声明 	-->		编译阶段
	 * p = new BaseClass();//运行  --> 运行阶段
	 */
		//多态性质
		BaseClass dt = new 多态性质();
		//只会访问父类的实例变量
		System.out.println(dt.book);
		//具有多态的方法
		//继承的方法,但只执行当前类下的方法
		dt.test();
		//只有父辈有的方法
		dt.base();
		//会出错：父辈没有的方法
		//dt.sub();
	}
/**		发现：多态命令下：实例变量是编译时类型(父辈)	
 *		编译时类型(父辈)独有的是编译时类型(父辈)			
 *  	运行时类型(子辈)继承了的是运行时类型(子辈)			
 *  	
 *  	Person p = new child()
 *  	引用变量在编译阶段只能调用其编译时类型Person所具有的的方法，运行时执行它child运行时类型所具有的的方法 -》会执行child覆盖的方法
 *  	因而调用声明Person没有的方法是会报错的,有的方法正常
 *  	
 *  	只能用Person中有的方法，不能调用child中定义的方法
 *  
 *  	通过引用变量来访访问其包含的实例变量时，系统总是试图访问它编译时类型所定义的成员变量
 */	
}

