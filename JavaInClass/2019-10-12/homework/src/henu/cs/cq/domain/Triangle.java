package henu.cs.cq.domain;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figure{
	public double a;
	public double b;
	public double c;
	
	public Triangle() {
		super("this is the triangle without clearly length for three sides");
	}
	public Triangle(double a, double b, double c) {
		super("this is the triangle");
		super.setArea(calArea(a,b,c));
		super.setGrith(calGirth(a,b,c));
	}
	public double calArea(double a, double b, double c) {
		double p = 0.5*(a+b+c);
		return Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
	}
	public double calGirth(double a, double b, double c) {
		return a+b+c;
	}
	public void setArea(double a, double b, double c) {
		super.setArea(calArea(a,b,c));
	}
	public void setGirth(double a, double b, double c) {
		super.setGrith(calGirth(a,b,c));
	}
	public List getABC() {
		List list = new ArrayList();
		list.add(a);
		list.add(b);
		list.add(c);
		return list;
	}
	
	public String getLen() {
		return "[a="+a+"b="+b+"c="+c+"]";
	}
	
	public void setLen(double a, double b, double c) throws Exception {
		//检验能否构成三角形
		if(a+b>c&&a+c>b&&c+b>a) {
			this.a = a;
			this.b = b;
			this.c = c;
			setArea(a,b,c);
			setGirth(a,b,c);
		} else {
			throw new Exception("无法构造三角形");
		}
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ",Area="+getArea()+",Girth="+getGrith()+"]";
	}
}
