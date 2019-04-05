package Set集合;

import java.util.TreeSet;

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	//重写方法：；让判断相等
	public boolean equals(Object obj)
	{
		return true;
	}
	//再次重写方法:总是返回一，就是总是认为它们相等
	public int compareTo(Object obj)
	{
		return 1;
	}
}

public class TreeSet类的测试2 {
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//添加同一个对象
		System.out.println(set.add(z1));//add successfully!
		
		System.out.println(set);
		//修改第一个集合的变量
		((Z)(set.first())).age = 9;
		//输出第二个集合发现也被修改了 -- 可看到他们已经被判断成为相同的对象
		System.out.println(((Z)(set.last())).age);
	}
	
}
