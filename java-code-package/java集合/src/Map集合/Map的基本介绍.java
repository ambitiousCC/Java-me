package Map集合;

/*
 * 	保存具有映射关系的数据，两个罐子：一个装key 一个装value
 */

/**
 * 	key	和 value 存在一个单向一对一的关系	
 * 	key --> value
 * 	可以发现，key没有顺序就可以看做是一个set集合	keySet()方法
 * 
 * 	字典Map：Map中的元素与元素之间可以重复，索引值不再使用整数值
 * 
 * 	功能P237
 */

// basic function of map

import java.util.*;
public class Map的基本介绍 {
	public static void main(String[] args)
	{
		Map map = new HashMap();
		//放入
		map.put("cuiqin1", 100);
		map.put("cuiqin2", 200);
		map.put("cuiqin3", 300);
		//多次放入的key-value对中的value 可以重复
		map.put("cuiqin4", 100);
		//放入重复的key 新的value 会覆盖 但是！！！返回的是被覆盖的值
		System.out.println(map.put("cuiqin1", 99));
		System.out.println(map);

		//判断是否包含指定的key
		System.out.println("是否包含值为 cuiqin2 的key: " + map.containsKey("cuiqin2"));
		//指定的value
		System.out.println("是否包含值为300的value: "
				+ map.containsValue(300));
		
		//妈的，获取所有组成的集合并且遍历所有的key-value对
		for(Object key : map.keySet())
		{
			//map.get(key)方法获取指定key对应的value
			System.out.println(key + "-->" + map.get(key));
		}
		//delete the value
		map.remove("cuiqin3");
		System.out.println(map);
		System.out.println(map.get("cuiqin1"));
	}
}
