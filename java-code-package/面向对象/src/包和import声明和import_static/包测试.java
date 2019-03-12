package 包和import声明和import_static;

//import语句应该在package语句之后，定义类之前；可以使用多次
import 方法详解.形参个数可变;
//使用import 导入指定包下面的全部类;*只能代表类不能代表包，不会引入该包下的子包
import 隐藏和封装.*;
//导入静态成员变量、方法；全部也是用*;引用的类名都可以省略
import static 类和对象.定义类.say;
import static 成员变量和局部变量.成员变量初始化和内存中的运行机制.*;
public class 包测试 {
	public static void main(String[] args)
	{
		//自由访问
		包 p = new 包();
		p.greatidea("崔秦");
		
		//访问不同包下的类方法:不管是什么关系，都需要注明完整的路径
		方法详解.方法重载.test();
		
		//创建不同包下的类对象
		//也可见：使用过于繁琐
		方法详解.参数传递 d= new 方法详解.参数传递();
		
		//引用import语句：向某个Java文件中导入指定包层次下某个类或全部类
		//import引入以后不用使用包全名了
		形参个数可变 m = new 形参个数可变();
		m.testa(5, "cuiqin","chenmengli");
		
		访问控制符 n = new 访问控制符();
		n.setAge(23);
		System.out.println(n.getAge());
		
		//！！如果两个包中的类同名，不能使用import语句直接引用，需要的是全名引用
		
		//import static语句,连类名都可以省略
		test(54);
		say("sb");
	}
}
