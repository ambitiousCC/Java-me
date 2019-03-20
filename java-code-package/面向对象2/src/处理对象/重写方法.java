package 处理对象;
/**
 * @see		面向对象.多态.instanceof运算符||equals方法
 * @author 	崔秦
 */

/**
* 	重写equals方法需要符合的要求：
* 	自反性					x.equals(x) 返回true
* 	对称性					y.equals(x) 与 x.equals(y) 返回结果一致
* 	传递性					x.equals(y) 返回true y.equals(z) 返回true 则 x.equals(z) 也要返回true
* 	一致性					x.equals(y) 无论调用几次，都要有相同的结果
* 	对任意x					x.equals(null) 一定返回false
*/

class 人
{
	private String name;
	private String idStr;
	public 人() {}
	
	public 人(String name, String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	public String getName()
	{
		return this.name;
	}
	public String getStr()
	{
		return this.idStr;
	}

	//自定义equals方法
	public boolean equals(Object obj)
	{
		//同一个对象
		if(this == obj)
		{	
			return true;
		}
		//obj是人对象
		//判断是否为人类实例：不使用instanceof ：a instanceof b 当a是b的实例或者子类时都会返回true，因而使用a.getClass()==人.class
		if(obj != null && obj.getClass() == 人.class) 
		{
			人 personObj = (人)obj;
			//当前对象的idStr与对象的idStr相等时才可以判断两个对象相等
			if(this.getStr().equals(personObj.getStr()))
			{
				return true;
			}
		}
		return false;
	}

}

public class 重写方法 {
	//希望两个类型相同的对象相等，并且关键对象相同，需要改写方法
	public static void main(String[] args)
	{
		人 p1 = new 人("崔秦", "123132121");
		人 p2 = new 人("秦崔", "123132121");
		人 p3 = new 人("秦秦", "12313212");
		
		//id相同，对象相同，类相同，名字不同
		System.out.println("p1和p2" + p1.equals(p2));
		//id不同，对象相同，类相同
		System.out.println("p1和p3" + p1.equals(p3));
	}
	
}
