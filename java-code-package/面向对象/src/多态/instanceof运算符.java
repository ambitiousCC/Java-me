package 多态;

public class instanceof运算符 {
	// (通常)引用类型变量 instanceof 类(可以是接口),用来判读前面的对象是否是后面的类，或者其子类、实现类的实例。
	//	操作数
	//要么与后面的类相同，要么与后面的类具有父子继承关系
	
	public static void main(String[] args)
	{
		Object hello = "Hello";//object是所有类的父亲？！
		//instanceof 可以视作一种运算符 和 +-*/等效
		System.out.println("d");
		System.out.println("字符串--<Object:"+ (hello instanceof Object));
		System.out.println("字符串--<String:"+ (hello instanceof String));
		System.out.println("字符串--<Math:"+ (hello instanceof Math));
		//comparable接口
		System.out.println("字符串--<comparable:"+ (hello instanceof Comparable));
		//String 与 Math
		String a = "Hello~";
		//字符串与math无继承关系：报错
		//System.out.println("String--<Math:"+ a instanceof Math);
		System.out.println(a+"通常先保证Instanceof的判断然后再用(type)转型");
	}
}
