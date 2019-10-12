package henu.cs.cq.domain;

public class Square extends Figure{
	public double l;
	public Square() {
		super("this is the square");
	}
	public Square(double l) {
		super("this is the square");
		super.setArea(calArea(l));
		super.setGrith(calGirth(l));
	}

	/**
	 * ¼ÆËã¹«Ê½
	 * @param l
	 * @return
	 */
	public double calArea(double l) {
		return Math.pow(l, 2);
	}

	public double calGirth(double l) {
		return l*4.0;
	}
	
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
		setArea(l);
		setGirth(l);
	}
	
	public void setArea(double l) {
		super.setArea(calArea(l));
	}
	
	public void setGirth(double l) {
		super.setGrith(calGirth(l));
	}
	
	@Override
	public String toString() {
		return "Square [l=" + l + ",Area="+getArea()+",Girth="+getGrith()+"]";
	}
	
}
