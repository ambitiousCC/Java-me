//package 深入泛型;
//
//import java.awt.*;
//import java.awt.List;
//import java.util.*;;
//
////既是当程序不希望List<?>是任何泛型的父类时候，只希望他代表的是某一类泛型List的父类
//
////for example
//abstract class shape
//{
//	public abstract void draw(Canvas c);
//}
//class circle extends shape{
//	public void draw(Canvas c)
//	{
//		System.out.println("on the map" + c + "draw a circle");
//	}
//}
//class Rectangle extends shape{
//	//实现画图方法
//	public void draw(Canvas c)
//	{
//		System.out.println("把一个矩形画在画布" + c + "上");
//	}
//}
//public class 设定类型通配符的上限
//{
//	public void drawAll(List<shape> shapes)
//	{
//		
//	}
//}
//为什么注释：因为特么的执行不了woc

/**
 * 	直接来介绍一下可以表示一系列借口泛型的父类，为了满足，提供了被限制的泛型通配符
 *	
 *	List<? extends Shape>
 *
 * 	比如上面的： List<Circle> 当做 List<? extends Shape>
 * 	也就是说：List<? extends Shape>可以表示:List<Circle>,List<Rectangle>的父类-----只要尖括号里面的类型是Shape的子类型
 * 
 * 	无法确定这个受限制的通配符的具体类型，所以不能把Shape对象或者其子类的对象加入到这个泛型集合之中
 */





