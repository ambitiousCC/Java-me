package 操作集合的工具类Collections;
import java.util.*;

/**
 * 	三种方法总结一下：emptyXxx()	返回一个空的不可变得集合对象，既可以是List又可以是SortedSet,Set,还可以是Map,SortedMap
 * 	singletonXxx(),返回一个只包含指定对象的，不可变得集合对象，此处集合既可以是List，还可以是Map
 *	unmodiffiableXxx(),返回指定集合对象的不可变试图，此处的集合既可以是List,也可以是Set，SortedSet还可以是Map，SorteMap
 */

public class 设置不可变集合 {
	public static void main(String[] args)
	{
		//创建一个空的、不可变的对象
		List unmodifiableList = Collections.emptyList();
		//创建一个只有一个元素，而且不可改变的Set对象
		Set unmodifiableSet = Collections.singleton("cuiqin");
		//普通的Set对象
		Map scores = new HashMap();
		scores.put("语文", 150);
		scores.put("Java", 100);
		//返回普通对象的对应不可变的版本
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//任意一行代码都将引发UnsupportedOperationException异常
		//unmodifiableList.add("test");
		//unmodifiableSet.add("test");
		//unmodifiableMap.add("test");
	}
}
