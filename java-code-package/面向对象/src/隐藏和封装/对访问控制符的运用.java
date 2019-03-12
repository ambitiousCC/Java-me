package 隐藏和封装;

public class 对访问控制符的运用 {
	public static void main(String[] args)
	{
		//引用
		访问控制符 p = new 访问控制符();
		//尝试访问隐藏的成员变量,报错
		//p.age = 1000;
		//隐藏了age变量，而方法正好访问了，因而即使年龄符合也不会正常
		p.setAge(155);//对方法不会隐藏，会提醒
		//System.out.println(p.name);始终访问不到
		System.out.println("未能设置变量时:"+p.getAge());//始终没有设置好age，返回0
		p.setAge(23);
		System.out.println("利用正确的方法可以访问到:"+p.getAge());
		//说明了不能直接操作类下面的隐藏变量，只能操作setter和getter方法
		p.setName("崔秦");
		System.out.print("成功利用正确方法setter设置好变量以后:"+p.getName());
	}
	/**
	 * 不能直接修改隐藏的变量
	 */
}
