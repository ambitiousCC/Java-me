package Map集合;

/**
 * @author 崔秦
 * 
 * 出现的问题：程序再也无法准确访问到Map中的被修改过得Key
 */
import java.util.*;

public class 如果key是可变量 {
	public static void main(String[] args)
	{
		HashMap ht = new HashMap();
		
		ht.put(new A(60000), "cuiqin1");
		ht.put(new A(87563), "cuiqin2");
		
		//获得Hashtable 的key set 结合对应的Iterator迭代器
		Iterator it = ht.keySet().iterator();
		//修改count值
		A first = (A)it.next();
		first.count = 87563;
		
		System.out.println(ht);
		
		//发现只能删除没有被修改过得key所对应的key-value
		ht.remove(new A(87563));
		System.out.println(ht);
		
		//无法获取，因为此时key不能精确访问到 		    	
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(60000)));
		
		//一句话：不要使用可变的key值
	}
}
