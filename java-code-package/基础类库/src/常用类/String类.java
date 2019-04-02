package 常用类;

/*
 * 	知识科普：String 和 StringBuffer封装字符串
 * 	String 是不可边类	创建以后的字符串不能被修改啦，指导这个对象被销毁
 * 		StringBuffer 则是一个字符序列可变的字符串，就是通过这个方法转换成为了一个想要的字符串，可以调用它的toString方法将其转换成为一个String对象
 * 			append() insert() reverse() setCharAt() setLength()
 * 
 * 	新增的StirngBuilder :	没有实现线程安全但是性能高啊	所以如果创建可变的字符串对象就先考虑这个吧
 * 		三种方法都实现了 CharSequence() 接口，可以认为这个接口是一个字符串的协议接口
 */

/**
 * 	各种构造器：你自己查书！！！P190
 *	
 *	注意咯：String		对象是不可变的，所以中途会有许多的临时变量呢，
 *		但是使用StringBuffer和StringBuilder就没有这个问题哦，而且！最方便的是他们的字符串的长度是可以改变的呢
 *		他们都有的两个属性：	length		--		length()/setLength(int len)方法来访问和修改字符序列的长度
 *						capacity	--		StringBuilder 	容量、一般比length大，不用管它
 */

public class String类 {
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		//追加字符串
		sb.append("java");//sb = "java"
		//插入
		sb.insert(0, "hello ");//sb = "hello java"
		//替换
		sb.replace(5, 6, ",");//sb = "hello, java"
		//删除
		sb.delete(5, 6);//sb = "hellojava"
		System.out.println(sb);
		//反转
		sb.reverse();//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());//长度
		System.out.println(sb.capacity());//容量
		//改变长度，只是保留前面的
		sb.setLength(5);//sb = "avajo"
		System.out.println(sb);
		
	}
}
