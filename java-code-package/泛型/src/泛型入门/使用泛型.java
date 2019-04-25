package 泛型入门;
import java.util.*;
/**
 * @author 崔秦
 *	参数化类型：创建集合就已经指定了集合的类型
 */

//for example
public class 使用泛型 {
	public static void main(String[] args)
	{
		//创建一个只想要保存字符串的List集合
		List<String> strList = new ArrayList<String>();
		strList.add("cuiqin");
		strList.add("cuiqin2");
		
		//error
		//strList.add(9);
		strList.forEach(str -> System.out.println(str.length()));
	}
}
