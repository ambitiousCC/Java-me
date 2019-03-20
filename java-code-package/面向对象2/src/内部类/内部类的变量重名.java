package 内部类;

//当出现外部类成员变量、内部类成员变量、内部类里的方法局部变量同名
//：使用this来区分
public class 内部类的变量重名 {
	private String prop = "外部类的实例变量";
	private class InClass
	{
		private String prop = "内部类的实例变量";
		public void info()
		{
			String prop = "内部类的方法的局部变量";
			//外部类名.this.varName 访问外部类的实例变量
			System.out.println("外部类的实例变量"+内部类的变量重名.this.prop);
			//通过this.varName 访问内部类里的
			System.out.println("内部类的实例变量:"+this.prop);
			//直接访问自己的
			System.out.println(prop);
		}
	}
	public void test()
	{
		InClass in = new InClass();
		in.info();
	}
	public static void main(String[] args)
	{
		new 内部类的变量重名().test();
	}
}
