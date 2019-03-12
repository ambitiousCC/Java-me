package 深入构造器;
public class 初始化 {
	//必须包含一个及以上，没有系统自动创建
	//初始：布尔，引用，实例变量
	public String name;
	public int age;
	public 初始化(String name,int age)//woc，构造器大哥
	{
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args)
	{
		初始化  p = new 初始化("崔秦",18);
		System.out.println(p.name);
		System.out.println(p.age);
	}
}
