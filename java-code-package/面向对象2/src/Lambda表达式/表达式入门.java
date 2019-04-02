package Lambda表达式;
/**
 * 
 * @author 崔秦
 *
 * Lambda表达式允许使用更加简洁的代码来创建只有一个抽象方法的接口
 * 
 * 	需需要之处重写的名字、返回值类型(void等) 只是需要给出形参列表，方法体
 * 	例如：
 * 		(形参列表)->{方法体}
 * 	其中：形参列表允许省略形参类型，如果只有一个参数，可以省略圆括号；
 * 		代码块只有一条语句时，花括号都可以省略
 * 	简化抽象方法
 */
interface Eatable
{
	void taste();
}
interface Flyable
{
	void fly(String weather);//定义抽象方法，省略方法体
}
interface Addable
{
	int add(int a, int b);
}
public class 表达式入门 {
	//调用需要的对象,在形参列表直接声明
	public void eat(Eatable e)
	{
		System.out.println(e);
		e.taste();
	}
	public void drive(Flyable f)
	{
		System.out.println("我在开车："+f);
		f.fly("【一如既往的春日】");
	}
	public void test(Addable add)
	{
		System.out.println("求和：5+3="+add.add(5, 3));//需要重写的方法
	}
	public static void main(String[] args)
	{
		表达式入门 lq = new 表达式入门();
		//可以省略的花括号·没有形参不能省略圆括号
		lq.eat(()-> System.out.println("苹果的味道不错"));
		//lambda只有一个形参可以省略括号，
		lq.drive(weather ->{
			System.out.println("今天天气是："+weather);
			System.out.println("直升机飞行平稳");
		});
		//只有一条语句，既是需要返回值，也可以省略return
		lq.test((a,b)->a + b);
	}
}
