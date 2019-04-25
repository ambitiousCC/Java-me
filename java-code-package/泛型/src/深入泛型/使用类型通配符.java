package 深入泛型;

import java.util.*;
/*
 * 	对于不能确定传入实参类型的泛型，可以使用通配符<?> 元素类型可以匹配任何类型，但是不能把元素放入其中
 */

public class 使用类型通配符 {
	public static void main(String[] args)
	{
		List<?> c = new ArrayList<String>();
		//c.add("cuiqin");//不能添加元素：无法确定c集合中元素的类型
		//程序可以调用get()方法来返回List<?>集合指定索引处的元素，返回值是一个未知类型，但是他总是一个Object，把get()返回值赋给Object类型
		//的变量，或者放在任何希望是Object类型的地方都可以
	}
}
