package List集合;

import java.util.*;;

public class List的sort和replaceAll方法 {
	public static void main(String[] args)
	{
		List books = new ArrayList();
		books.add(new String("cuiqin1"));
		books.add(new String("cuiqin222"));
		books.add(new String("cuiqin33"));
		books.add(new String("cuiqin44444"));
		
		//使用目标类型为Comparator的Lambda表达式（函数式接口）根据长度排序
		books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
		System.out.println(books);
		//替换所有元素
		//Lambda表达式控制使用每个字符串的长度作为新的集合元素
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);//妈的输出的字符串长度
	}
}
