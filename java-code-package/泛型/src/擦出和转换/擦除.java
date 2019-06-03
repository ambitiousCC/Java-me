package 擦出和转换;

import java.util.*;

//擦除原理：当把一个具有泛型信息的对象赋给另一个没有泛型信息的变量时，所有在尖括号之间的类型信息都将被扔掉。
// List<String> -> List ，集合元素的类型检查变成了类型参数的上限(Object)

//创一个类型形参上限是Number的类
class Apple<T extends Number>
{
	T size;
	public Apple() {}
	public Apple(T size) 
	{
		this.size = size;
	}
	public void setSize(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		return this.size;
	}
}
public class 擦除 {
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<>(6);
		//a的getSize()方法返回到Integer对象
		Integer as = a.getSize();
		//把a对象赋给Apple变量，丢失尖括号里面的类型信息
		Apple b = a;
		//此时b知道a的size类型是Number,而不是Integer
		Number size1 = b.getSize();
		//你看这里如果创建Integer对象存储b的getSize方法返回的值，会报错！！
		//Integer size2 = b.getSize();//Type mismatch: cannot convert from Number to Integer
		
		//对于泛型而言，可以直接把一个List 对象直接赋给一个List<String>对象，编译器仅仅提示未经检查的转换
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li;//会丢失li的泛型信息，就是集合里面的类型信息：典型的擦除
		//会出现警告提示，但是objk：Java允许直接把List对象赋给一个List<Type>(Type可以是任意类型)类型的变量
		List<String> ls = list;
		//只要访问ls里面的元素，会出现异常的
		System.out.println(ls.get(0));//但是把其中的元素当做String类型对象取出的时候就会引发异常
		
		//一毛一样的错误，可以看做是引发问题的原理
//		List<Integer> li2 = new ArrayList ();
//		li2.add(4);
//		li2.add(5);
//		System.out.println((String)li2.get(0));
	}
}
