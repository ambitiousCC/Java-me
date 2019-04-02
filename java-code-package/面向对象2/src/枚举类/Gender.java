package 枚举类;

/**
 * 	枚举类通常应该设计成不可变类，成员变量不允许改变：应该建议用private final修饰
 * 	此时就需要显示定义带参数的构造器，在构造器中为这些成员变量指定初始值
 * 	显示定义了带参数的构造器，列出枚举值时就必须对应地传入参数
 */

public enum Gender {
	//此处的枚举值必需用相应的构造器来创建
	MALE("男"),FAMALE("女");//相当于new一个对象
	private final String name;
	//枚举的构造器只能用private 来修饰
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}
