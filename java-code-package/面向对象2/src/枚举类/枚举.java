package 枚举类;

/*
 * 	与生活联系，季节类只有四个对象；实例有限而且固定的类--枚举类
 * 
 * 
 * 	enum	一个java源文件中只能定义一个public访问的枚举类，filename一致
 * 		区别	默认继承java.lang.Enum 不能显示继承其他父类，这个类是想了两个接口serializable  comparable
 * 			enum定义、非抽象的枚举类默认会使用final，不能有子类
 * 			枚举类的构造器只能使用private访问控制符，省略了就会系统使用private；
 * 			所有实例必须在第一行显示流出，否则不能产生实例，列出实例会自动添加public static final不用添加
 * 	有value方法，可以很方便遍历所有枚举值
 * 
 */

public enum 枚举
{
	SPRING,SUMMER,FALL,WINTER;
}


