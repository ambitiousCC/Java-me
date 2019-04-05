package Map集合;

import java.util.*;
/*
 * 书的传送门：P238
 */

//for basic example
public class Map新增的方法 {
	public static void main(String[] args)
	{
		Map map = new HashMap();
		//成对放入key-value
		map.put("cuiqin1", 100);
		map.put("cuiqin2", 200);
		map.put("cuiqin3", 300);
		
		//Map中不存在的key-value 你傻逼嘛，操作也没什么用
		System.out.println(map);
		
		//使用原来有的value与传入参数计算出来的结果覆盖原来的value值
		map.merge("cuiqin2", 10, (oldVal, param) -> (Integer)oldVal + (Integer)param);
		System.out.println(map);
		
		//如果呢，key没有value为null那么的话，计算结果是新的value
		map.computeIfAbsent("java", (key) -> ((String)key).length());
		System.out.println(map);
		
		//存在就是计算结果替换
		map.computeIfPresent("java", (key, value) -> (Integer)value * (Integer)value);
		System.out.println(map);
	}
}
