package 泛型与数组;
import java.util.*;

public class 泛型与数组 {
	public static void main(String[] args)
	{
		List<?>[] lsa = new ArrayList<?>[19];
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(23));
		oa[1] = li;
		Object target = lsa[1].get(0);
		//需要将第一个数组元素的第一个集合元素强制类型转换为String类型
		//，所以应该自己通过intanceof 运算符来保证它的数据类型
		if (target instanceof String)
		{
			String s = (String) target;
		}
	}
}
