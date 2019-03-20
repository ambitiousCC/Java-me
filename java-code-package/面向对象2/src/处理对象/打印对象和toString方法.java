package 处理对象;

class Person//声明类名不区分大小写呢
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
}

public class 打印对象和toString方法 {
	public static void main(String[] args)
	{
		//打印对象
		Person p = new Person("崔秦");
		System.out.println(p);//实际上是输出了和toString 的方法
		//toString是Object类里面的一个实例方法，所有的Java都是Object类的方法，所有的Java对象都有toString方法
		System.out.println(p.toString());
		//同时和其他基本类型一样只要是和""加法运算就会直接调用toString方法
		String pStr = p + "崔秦";
		String pStr2 = p.toString() + "崔秦";
		System.out.println(pStr + pStr2);
		
		//toString 是一个自我描述的过程,打印对象的时候总是 "类名+@+hashcode"
	}
	
}
