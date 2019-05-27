package 深入泛型;

import java.util.*;
/*
 * 	List<String> 不会被替代成为ListString
 * 
 * 	包含泛型声明的类型可以在定义变量中、创建对象时候传入一个类型实参，从而可以动态的生成无数个多逻辑上面的子类
 * 
 * 	可以为任何类、接口增加泛型声明。
 */

public class 定义泛型接口和类<T>//使用泛式声明 
{
	//define 
	private T info;
	
	//构造器不要加泛式声明
	
	public 定义泛型接口和类() {}
	
	//use the type of T to define
	public 定义泛型接口和类(T info)
	{
		this.info = info;
	}
	public void setInfo(T info)
	{
		this.info = info;
	}
	public T getInfo()
	{
		return this.info;
	}
	
	public static void main(String[] args)
	{
		//both XX<String> and XX<Double> are the children of XX<T> 
		
		//传给字符串类型，构造器参数只能是字符串类型
		定义泛型接口和类<String> a1 = new 定义泛型接口和类<>("cuiqin1");
		
		System.out.println(a1.getInfo());
		
		//传给T形参的是Double 构造器参数只能是Double 或者 double
		定义泛型接口和类<Double> a2 = new 定义泛型接口和类<>(83.8);
		
		System.out.println(a2.getInfo());
	}
}
