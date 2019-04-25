package 深入泛型;
/**
 * @see
 * 		面向对象.多态.instanceof运算符
 */

/**
 * 	使用创建了实现类的接口和父类的时就不能包含类型形参(变量，常量，表达式，也成为数据形参)，不能包含与父类一样的形参
 *	error:public class A extends x<T>{}
 *	需要的时候：应该为类型形参传入一个实际的类型
 *	correct: public class A extends x<String>
 *
 * 	调用方法时候必须为所有的数据形参传入参数值，使用类、接口时也可以不为类型形参传入实际的类型参数
 * 	correct: public class A extends x
 * 
 * 	既然传入了一个实际的类型，那么继承的方法就必须注意要与实际的类型保持一致
 * 
 * 
 * 	并没有存在相应的泛型类：就是说：看起来像是有x<String> is the son class of x but actually it doesn't create a new class file
 * 
 * 	不管为泛型的类型形参传入了哪一种类型实参，依然被当成了同一个类处理，占用的是同一块内存狳，在静态方法、静态初始化块或者静态变量的声明和初始化中不允许使用类型形参
 */
//

//for example
public class 从泛型类派生子类<T> 
{
	//static T info;//Cannot make a static reference to the non-static type T
	T age;
	public void foo(T msg) {}
	//不能在静态方法声明中使用类型参数
	//public static void bar(T msg) {}//Cannot make a static reference to the non-static type T
	
	public static void main(String[] args)
	{
		//系统中不会真正生成泛型类，因此注意instanceof 运算符的要求，在这个运算符后面不能使用泛型类

		java.util.Collection<String> cs = new java.util.ArrayList<>();
		//if(cs instanceof java.util.ArrayList<String>) {
		//	//Cannot perform instanceof check against parameterized type ArrayList<String>. Use the form ArrayList<?> instead since further generic type information will be erased at runtime
		//}
	}
}
