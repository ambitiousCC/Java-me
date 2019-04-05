package List集合;

import java.util.*;
//判断相等只需要那个equals方法返回true即可

class A{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class 判断list集合中元素相等的条件 {
	public static void main(String[] args)
	{
		List book = new ArrayList();
		book.add(new String("cuiqin1"));
		book.add(new String("cuiqin2"));
		book.add(new String("cuiqin3"));
		System.out.println(book);
		
		//delete
		book.remove(new A());
		System.out.println(book);
		//再次删除第一个对象
		book.remove(new A());
		System.out.println(book);
		//after all: we rewrite the equals() so it will always delete the first item form collection
		//attention ! the method set(int index, Object element)can't change the length of collection
	}
}
