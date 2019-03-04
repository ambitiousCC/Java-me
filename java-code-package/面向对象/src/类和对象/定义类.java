package 类和对象;

//三种最常见的成员：构造器、成员变量、方法
/**
 * 定义类的一般语法
 * [修饰符] class 类名
 * {
 * 		构造器
 * 		成员变量
 * 		方法
 * }
 */

/**
 * 定义构造器
 * [修饰符] 构造器名 {形参列表}
 * {
 * 		//可执行语句组成的构造器执行体
 * }
 * 修饰符可以省略，可以使public protected private 其中之一
 * ！构造器名必须与类名相同
 * 不一定需要，没有系统会给出默认的构造器，默认的构造器没有参数
 */

/**
 * 定义成员的变量：
 * [修饰符] 类型 成员变量名 [= 默认值];
 * 修饰符可以省略，也可以是：public,protected,private,static,final
 * 其中呢，public,protected,privated只能出现一个可以与static、final组合修饰方法
 * 类型：可以是java中的任意数据类型
 * 成员变量推荐英文
 */

/**
 * static！！！	静态成员不能直接访问非静态成员
 * static修饰的成员不能访问没有static修饰的成员
 * 原因见this实例
 */


/**
 * 定义方法：
 * [修饰符] 方法返回值类型 方法名(形参列表)
 * {
 * 	//可执行语句组成的方法
 * }
 * 方法返回值类型：任意支持的类型，包括基本和引用。
 * 方法体内必须有一个有效的return语句，返回一个变量或一个表达式必须与此处声明的类型相匹配。
 * 修饰符可以省略，也可以是：public,protected,private,static,final,abstract
 * protected private public 只能出现其一 abstract final 只能出现其一  它们与static组合起来修饰方法
 * 由于方法用于描述该类或该类的实例的行为特征或功能实现，建议以英文动词开头
 * 多组参数之间以英文逗号隔开，形参类型和形参名之间以英文空格隔开
 */
public class 定义类 {
	public String name;
	public int age;
	public void say(String content)
	{
		System.out.println(content);
	}
}
