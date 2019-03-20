package final修饰符;

public class 抽象类的作用的子类  extends 抽象类的作用
{
	//子类调用父类的抽象方法，重新构造
	public double getRadius()
	{
		return 0.28;//重载返回半径
	}
	public static void main(String[] args)
	{
		抽象类的作用的子类 csm = new 抽象类的作用的子类();
		csm.setTurnRate(15);//转速
		System.out.println(csm.getSpeed());
	}
}
