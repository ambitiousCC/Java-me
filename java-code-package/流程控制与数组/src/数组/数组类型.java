package 数组;

public class 数组类型 {
	public static void main(String[] args)
	{
		//我的妈，一个数组中的数组元素的类型是唯一的。
		//数组也是一种数据类型
		//先定义数组，再初始化数组
		
		//定义数组方法如下
		//type[] arrayName;使用这一种！！！
		//type arrayName[];
		
		//先要进行数组的初始化后才可以使用数组
		//必须赋初始值
		
		//静态初始化：由系统决定数组长度，由程序猿显示决定数组元素的初始值
		//arrayName = new type[]{el1,el2,...};
		//初始化数组是数组元素的类型是定义数组所指定的数组元素类型的子类
		Object[] objArr0;
		objArr0 = new String[] {"JAVA","C++"};//String 是 Object子类
		//静态初始化
		Object[] objArr1;
		objArr1 = new Object[] {"JAVA","C#"};
		//静态初始化的简化格式
		Object[] objArr2 = {"JAVA","VB"};
		//这也是在数组的定义和初始化同时完成，使用简化的静态初始化写法 
		
		//动态初始化：开始只是指定数组长度，系统指定初始值
		//arrayName = new type[length];
		//定义和初始化同时完成
		int[] prices = new int[5];
		
		//了解一下动态初始化的系统的初始值
		/**
		 * 整数类型	0
		 * 浮点类型	0.0
		 * 字符类型	'\u0000'
		 * 布尔值		false
		 * 引用类型	null	--《类、数组、接口
		 */
	}
}
