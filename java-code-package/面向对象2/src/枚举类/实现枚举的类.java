package 枚举类;

/**
 * 
 * @author 崔秦
 *
 *	Enum类中包含的方法：
 *		int compareTo(E o):	用于与指定枚举对象比较！顺序！，只能与相同类型的枚举实例比较。枚举对象位于指定枚举对象之后：N*；前：-N；否则：0
 *		String name():		返回此枚举实例的名称，名称就是定义美剧雷士列出的所有枚举值之一。：优先toString
 *		int ordinal():		返回枚举值在枚举类中的索引值（枚举值在枚举声明中的位置，第一个枚举值的索引值为零）
 *		String toString():	枚举常量的名称，name差不多，toString优先	
 *		public static<T extends Enum<T>> T valueOf(Class<T> enumType, String name):
 *			用于返回指定枚举类中指定名称的枚举值。名称必须与该枚举类中声明枚举值是所用的标识符完全匹配，不允许使用额外的空白字符
 */

public class 实现枚举的类 {
	public void judge(枚举 s)
	{
		//switch语句里的表达式可以是枚举值
		switch (s)
		{
		case SPRING:
			System.out.println("春暖花开");
			break;
		case SUMMER:
			System.out.println("夏日炎炎");
			break;
		case FALL:
			System.out.println("秋高气爽");
			break;
		case WINTER:
			System.out.println("冬日雪飘");
			break;
		}
	}
	public static void main(String[] args)
	{
		//枚举类默认有一个values()方法，返回该枚举类的所有实例
		for (枚举 s:枚举.values())
		{
			System.out.println(s);
		}
		//使用枚举实例时，可通过EnumClass.variable形式来访问
		new 实现枚举的类().judge(枚举.SPRING);
	}
}
