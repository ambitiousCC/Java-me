package 枚举类;

/**
 * 	枚举类是类！！！有成员能量、方法、构造器
 * 
 *
 */
public enum 枚举类的成员 {
	MALE,FEMALE;
	//实例变量
	//public String name;
	//如果仅仅这样做：封装不良好，因而要设立方法对改变和调用值进行控制
	private String name;
	public void setName(String name)
	{
		switch (this)
		{
		case MALE:
			if(name.equals("man"))
			{
				this.name = name;
			}
			else
			{
				System.out.println("参数错误");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("girl"))
			{
				this.name = name;
			}
			else
			{
				System.out.println("参数错误");
				return;
			}
			break;
		}
	}
	public String getName()
	{
		return this.name;
	}
}

