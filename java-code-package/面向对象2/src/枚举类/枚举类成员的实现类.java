package 枚举类;

public class 枚举类成员的实现类 {
	public static void main(String[] args)
	{
		//通过类valueOf()方法获取指定枚举类的枚举值
		//枚举类的成员 g = Enum.valueOf(枚举类的成员.class, "FEMALE");
		//直接为枚举值的name实例变量赋值
		//g.name = "girl";
		//直接访问枚举值的name实例变量
		//System.out.println(g + "代表：" + g.name);
		
		枚举类的成员 g = 枚举类的成员.valueOf("FEMALE");
		g.setName("girl");
		System.out.println(g+"代表"+g.getName());
		//不能重复设置名称，否则会提示，参数错误：选择的是FAMALE
		g.setName("man");
		System.out.println(g+"代表"+g.getName());
	}
	/*
	 * 	与使用普通类的方法：产生	产生对象方式不同，枚举类的实例只能是枚举值，而不是随意的通过new
	 */
}
