package 泛型入门;

import java.util.*;
/*
 * 	改进以后：在构造器后面不需要带完整的泛式信息，只要给出一对尖括号就可以			可以简化代码
 */
public class 菱形语法 {
	public static void main(String[] args)
	{
		//java7以后就能自动推断
		List<String> books = new ArrayList<>();
		books.add("cuiqin1");
		books.add("cuiqin2");
		
		//遍历集合
		books.forEach(ele -> System.out.println(ele.length()));
		
		//又是自动推断
		Map<String, List<String>> schoolsInfo = new HashMap<>();
		
		//又是自动推断
		List<String> schools = new ArrayList();
		
		schools.add("cuiqin3");
		schools.add("cuiqin4");
		schoolsInfo.put("cuiqin", schools);
		
		schoolsInfo.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}
