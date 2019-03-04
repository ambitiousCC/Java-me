package this实例;

public class this作为返回值 {
	public int age;
	public this作为返回值 grow()
	{
		age++;
		return this;//this返回调用该方法的对象，
	}
	public static void main(String[] args)
	{
		this作为返回值 rt = new this作为返回值();
		
		rt.grow().grow().grow();
		
		System.out.println("new出的rt的age成员变量："+rt.age);
	}
}
//使用this作为方法的返回值可以让代码更加简洁，但是可能造成实际意义的模糊。