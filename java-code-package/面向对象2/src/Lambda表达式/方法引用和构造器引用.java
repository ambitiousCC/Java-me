package Lambda表达式;

/**
 * 
 * @author 崔秦
 * 
 * 	引用的方法：
 * 		引用类方法				(a,b,..) -> 类名.类方法(a,b,..)				类名::类方法
 * 		引用特定对象的实例方法		  			特定对象.实例方法(a,b,...)			特定对象::实例方法
 * 		某类对象的实例方法	接口中地第一个参数作为调用者，后面的参数全传给方法作为参数		类名::实例方法
 * 							(a,b,..) ->	a.实例方法(b,...)				
 * 		引用构造器		被实现的方法的全部参数传给该构造器作为参数					类名::new
 * 										new 类名(a,b,..)			
 */
public class 方法引用和构造器引用 {
	public static void main(String args)
	{
		System.out.println("具体的介绍看其他的");
	}
}
