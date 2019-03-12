package 隐藏和封装;

public class 访问控制符 {
/**
 * 	提供了三个：private protected public
 * 	访问控制级别：private --> default --> protected --> public
 * 	default:不使用任何控制符号来修饰类或类成员
 * 	private:只能在此类的内部被访问
 * 	default:包访问权限=被相同的包下的其它类访问（包是不是package?）
 * 	protected:可以被一个包中的其它类访问，也可以被不同包中的子类访问
 * 	public:被所有类访问，不管任何关系 
 */
	//源文件中的所有类都没有使用public修饰，文件名可以是一切合法名
	private String name;//隐藏变量
	private int age;
	//提供了方法来操作name成员变量
	public void setName(String name)
	{
		//合法性校验
		if(name.length() > 6 || name.length() < 2)
		{
			System.out.println("您所需要设置的用户名必须在2~6之间");
			return;//返回方法
		}
		else
		{
			this.name = name;
		}
	}
	public String getName()
	{
		return this.name;
	}
	//提供操作age的成员变量
	public void setAge(int age)
	{
		//年龄合理校验
		if(age >100 || age < 12)
		{
			System.out.println("你的年龄不符合要求");
		}
		else
		{
			this.age = age;
		}
	}
	public int getAge()
	{
		return this.age;
	}
/**
 * 	如果一个类中的所有的实例变量全被private修饰封闭并且，拥有对应的setter和getter方法，这个类就是一个符合JavaBean规范的类
 * 	总是一个封装良好的类
 *  访问控制符：
 *  	类里面的大部分成员变量都应该使用private修饰 
 *  	static、类似全局变量的成员变量 ==考虑使用public
 *  	某个类主要做其他类的父类：类里面包含的大部分方法可能仅希望被器子类重写，而不像外界直接调用，应该使用protected修饰这些方法
 *  希望暴露给其它类自由调用的方法 == public == 类的构造器使用public从而允许在其他地方创建该类的实例。 -- 外部类通常都希望被其他类自由使用
 */
}
