package final修饰符;
/**
 * @see
 * @author 崔秦
 */
/**
 * 从多个具有相同特征的类中抽象出一个抽象类，正抽象类作为子类的模板，避免了子类设计的随意性
 * 模板模式：抽象类作为多个子类的通用模板
 */
public abstract class 抽象类的作用 {
	//转速
	private double turnRate;
	public 抽象类的作用() {}//空的构造器，只是为了子类调用罢了
	//返回车轮半径的方法定义成为抽象方法，被子类调用即可
	public abstract double getRadius();
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	//计算速度
	public double getSpeed()
	{
		//速度 = r * 2 * PI * 转速
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}
/**
 *	模板模式：规则
 *		抽象父类可以只定义需要使用的某些方法，把不需要使用的作为抽象方法提供给子类重载
 *		父类中可能包含需要调用其他系列方法的方法，这些方法既可以由父类实现，也可以由子类实现。
 *		父类提供的方法只是定义了一个通用算法，事先并不完全由自身实现，而必须依赖于其子类的辅助
 */
