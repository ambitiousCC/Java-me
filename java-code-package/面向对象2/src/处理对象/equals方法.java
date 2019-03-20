package 处理对象;

class human
{
	//极端：不加判断的相等
	public boolean equals(Object obj)
	{
		return true;
	}
}

class pig {}

public class equals方法 {
/**	
 * 	比较希望得到一种方法是类似“值相等”的判断方法
 *	String 对象的 equals()方法 与==的判断标准没啥区别呀 也是要两个引用变量指向同一个对象才true
 *	可以重写此方法
 *	String已经重写了此方法，对于字符串的比较判断：只要两个字符串所包含的字符序列相同，通过equals()比较将返回true
 */
	//重写方法 -- 我行我素
	public static void main(String[] args)
	{
		human p = new human();
		System.out.println("修改方法以后是不是就可以为所欲为了呢？"+p.equals(new pig()));
		System.out.println("没错"+p.equals(new String("hello")));
		
	}
	
}
