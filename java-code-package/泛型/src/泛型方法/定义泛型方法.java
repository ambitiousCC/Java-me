package 泛型方法;

import java.util.*;

//负责将一个Object 数组的所有元素添加到一个Collection集合
public class 定义泛型方法 {
	
	/*
	static void fromArrayToCollection(Object[] a, Collection<Object> c)//方法有限，比如String不是Object的子类
	{
		for(Object o : a)
		{
			c.add(o);
		}
	}
	*/
	//声明一个泛型方法，方法中带一个T类型形参
										//T数组，		T集合
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o: a) {
			c.add(o);
		}
	}
	
	public static void main(String[] args)
	{
		String[] strArr = {"a", "b"};
		List<String> strList = new ArrayList<>();
		//fromArrayToCollection(strArr, strList);//编译即出错，对象不能相互贯通
		
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		
		//oa:Object数组、co:Object集合、sa：字符串数组、cs：字符串集合
		
		//T=Object		
		fromArrayToCollection(oa, co);
		//T=String
		fromArrayToCollection(sa,cs);
		//T=Object，明显这里从字符串升级到了Object类型
		fromArrayToCollection(sa,co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList();
		
		//ia:整数型，fa：浮点型，na：数字型，cn：数字型集合
		
		//T=Number
		fromArrayToCollection(ia,cn);
		//T=Number
		fromArrayToCollection(fa,cn);
		//T=Object
		fromArrayToCollection(na,cn);
		//T=Object，说明了Number是包含在Object里面的咧
		fromArrayToCollection(na,co);
		
		//直接报错：因为Number既不是String类型也不是它的子类，所以会报错
		//fromArrayToCollection(na,cs);
	}
	
	
/*
 * 	开始正式介绍定义泛式方法：
 * 		声明方法时定义了一个或者多个类型形参
 * 	修饰符 <T , S> 返回值类型 方法名(形参列表)
 *  {
 *  	//方法体...
 *  }
 */
}
