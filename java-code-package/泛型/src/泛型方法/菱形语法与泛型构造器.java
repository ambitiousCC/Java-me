package 泛型方法;

class Foo {
	public <T> Foo(T t) {
		System.out.println(t);
	}
}
class Myclass<E> {
	public <T> Myclass(T t) {
		System.out.println("t的参数是："+ t);
	}
}
public class 菱形语法与泛型构造器 {
	//由来：类比泛型方法在方法签名中声明类型形参一样，JAVA允许在狗仔妻签名中声明类型形参，产生了所谓的泛型构造器
	//便利：不仅仅可以让Java根据数据参数的类型来推断类型形参的类型，我们可以现实的为构造器中的类型形参指定实际的类型
	public static void main(String[] args) {
		//泛型构造器中的T参数为String
		new Foo("崔秦爸爸");
		new Foo(666);
		//显示指定泛型构造器中的T的参数为String，md正确
		new <String> Foo("崔秦哥哥");
		//显示指定泛型构造器中的T参数为String，但是实际传入的玩意儿是double，所以不行
		//new <String> Foo(12.3);
		
		//Myclass类声明中的E形参是String类别
		//泛型构造器中声明的T形参时Integer类型
		Myclass<String> mc1 = new Myclass<>(5);
		//显示指定泛型构造器中声明的T形参是Integer类型
		Myclass<String> mc2 = new <Integer> Myclass<String>(5);
		//Myclass类声明的E形参是String类型
		//如果显示指定泛型构造器中的声明的T形参是Integer类型，就不能使用菱形语法
		//此时就不能使用菱形语法
		//Myclass<String> mc3 = new <Integer> Myclass<>();//及制定了泛型构造器中的类型形参是Integer类型，又想使用菱形语法，所以报错
	}
}
