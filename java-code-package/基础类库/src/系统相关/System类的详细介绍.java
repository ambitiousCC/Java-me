package 系统相关;

/*
 * 	提供了大量的方法	etc：
 * 		垃圾回收	gc()
 * 		通知系统进行资源清理的runFinalization()
 * 		获取当前时间：currentTimeMillis() nanoTime() ==?>返回long整形		
 *  				不精确的毫秒数			许多操作系统不支持的纳秒单位
 *  	System	in	标准输入
 * 				out	标准输出
 * 				er	错误输出流
 * 	改变的三个方法
 * 		setIn()	
 * 		setOut()
 * 		setErr()
 * 
 * 	提供了identityHashCode(Object x)此方法返回指定对象的精确hashCode值		注意，这里的结果是根据对象的地址计算的
 * 			两个对象的identityHashCode相同那么两个对象绝对是同一个对象
 */

public class System类的详细介绍 {
	public static void main(String[] args)
	{
		//不同对象
		String s1 = new String("1");
		String s2 = new String("1");
		//合乎情理的：String 改写了 hashCode值 -- 根据字符串序列来计算的hashCode值
		//字符串内容相同因此：
		System.out.println(s1.hashCode() + "----" + s2.hashCode());
		//对象不同因此identityHashCode()的值不同
		System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));
		//下面是相同的字符串对象，因此他们的identityHashCode()相同，
		String a = "java";
		String b = "java";
		System.out.println(System.identityHashCode(a) + "----" + System.identityHashCode(b));
	}
}
