package 内部类_使用内部类;

//需要：内部类不能用static修饰
/*
 * 	省略访问控制符：在同包下的类访问
 * 	protected 同包的其太累和外部类的子类访问
 * 	public任意地方访问：语法：OuterClass.InnerClass varName有包增加包名
 */
/*
 * 	非静态内部类只能寄生外部类对象：外部类以外调用语法：
 * 	OuterInstance.new InnerConstructor()
 * 	外部类实例		  new一个	构造器
 */
class out 
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}
public class 外部类以外使用内部类 {
	public static void main(String[] args)
	{
		out.In in = new out().new In("baba");
    /*等价：
     * 	out.In in;//定义内部类变量
     * 	out out = new out();
     *  in = out.new In("baba"); 
     * 	 
     */
	}
}
