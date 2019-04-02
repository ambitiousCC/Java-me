package 常用类;

//超级大的误区：：：：：：：：：：：：你如果创建了一个和你使用的方法是一样的名字的类或者引用了对应的对象，那么的话就会把之前的方法覆盖！

/*
 * 	是一个工具类，提供了一些工具方法来操作对象，方法大多是“空指针”。
 * 		如果引用对象是null 引用就会报错
 * 			但是这时使用工具类中的toString(Object o)方法，就可以获得指针信息，比如o为null时就会返回null字符串
 */
import java.util.*;

class Bar
{
	public int bar;
}

public class ObjectsTest {
	//默认值是null
	static Objects obj;
	public Bar bar = null;
	public static void main(String[] args)
	{
		System.out.println(Objects.hashCode(obj));
		
		System.out.println(Objects.toString(obj));
		//要求obj不能为null，否则异常
		//System.out.println(Objects.requireNonNull(obj, "obj参数不能是null!!"));
		//可以对输入的进行校验：如果输入对象值为Null那么就会异常；否则赋值
	}
	
	public void Foo(Bar bar)
	{
		this.bar = Objects.requireNonNull(bar);
		System.out.println(this.bar);
	}
}

