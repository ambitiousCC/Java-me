package henu.cs.cq.test;

import henu.cs.cq.domain.Circle;
import henu.cs.cq.domain.Square;
import henu.cs.cq.domain.Triangle;

public class TestForFigure {
	public static void main(String[] args) throws Exception{
		//测试圆类
		Circle circle = new Circle();
		circle.setR(9);
		System.out.println(circle.toString());
		
		//测试三角形
		Triangle triangle = new Triangle();
		triangle.setLen(2,2,2);
		System.out.println(triangle.toString());
		
		//测试正方形
		Square square = new Square();
		square.setL(2);
		System.out.println(square.toString());
	}
}
