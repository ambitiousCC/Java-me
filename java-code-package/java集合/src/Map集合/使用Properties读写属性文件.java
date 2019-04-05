package Map集合;
import java.io.*;
import java.util.*;
/**
 * @author 崔秦
 *	没错：这个就是和那个属性文件有关
 *	属性文件里面的属性名称，属性值只能是字符串类型，所以key/value都是字符串类型
 *
 *	相当于一个key/value都是String类型的Map
 *
 *	方法如下
 *		String getProperty(String key): 获取Properties中指定属性名对应的属性值，类似于Map 的 get(Object key)方法
 *		String getProperty(String key, String defaultValue) 设置属性值，类似于Hashtable的put()方法	
 *		Object setProperty(String key, String values)	设置属性值 类似于Hashtable的put()方法
 *		void load(InputStream inStream)	从属性文件(输入流) 中加载 key-value 对， 把加载到的key-value对追加到Properties里面
 *		void store(OutputStream out, String comments) 将Properties 中的key-value 对输出到指定的属性文件中
 */

public class 使用Properties读写属性文件 {
	public static void main(String[] args) throws Exception
	{
		Properties props = new Properties();
		//添加属性
		props.setProperty("username", "Frandaaaa");
		props.setProperty("password", "cuiqin");
		
		//将属性的对应添加到系统属性文件中
		props.store(new FileOutputStream("users.ini"), "comment line");
		
		//create a new properties target
		Properties props2 = new Properties();
		
		//add properties to this new target
		props2.setProperty("gender", "male");
		
		//add the key-value of users.ini file to the props2
		props2.load(new FileInputStream("users.ini"));
		System.out.println(props2);
	}
}
