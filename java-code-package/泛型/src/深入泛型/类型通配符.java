package 深入泛型;

import java.util.*;

/*
 * 	方法里面不确定的集合形参定义
 */

public class 类型通配符 {
	public void test(List c)//List是一个有泛型接口声明的接口，使用List 接口没有传入实际类型的参数，但是捏List中的元素的类型是不确定的
	{
		for(int i = 0; i < c.size(); i++)
		{
			System.out.println(c.get(i));
		}
	}
	
	//考虑一下下面的写法
	public void test2(List<Object> c)//调用此方法传入的实际参数值可能不是我们所期待的
	{
		for(int i = 0; i < c.size(); i++)
		{
			System.out.println(c.get(i));
		}
	}
	//for example
	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<>();
		//作为参数来调用前面的test2方法
		//test2(strList);//The method test2(List<Object>) in the type 类型通配符 is not applicable for the arguments (List<String>)
		
		//又可以看到数组
		Integer[] ia = new Integer[5];
		Number[] na = ia;//这个设计不安全
		
		//na[0] = 0.5;//编译通过但是运行不行
		
		List<Integer> iList = new ArrayList<>();
		//List<Number> nList = iList;//编译就出错
		
		//数组与泛型的区别：Foo 是 Bar 的子类型 ，数组中 Foo[] 依然是 Bar[] 子类型，但是泛型不是：F<Foo> is not G<Bar>'s son-type
	}
}
