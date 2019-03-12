package 类的继承;

class mather {
	
}

class father {
	public String tag = "崔秦";
}
class son extends father{
	//
	private String tag = "cuiqin";
}
public class 覆盖的特殊情形{
	public static void main(String[] args)
	{
		son p = new son();
		//不能访问私有变量
		//System.out.println(p.tag);
		//显示向上转型，访问爸爸的公共实例变量
		System.out.println(((father)p).tag);//使p变量强制向上转型为父亲类对象，注意括号里面的是父亲的名字
	}
}
