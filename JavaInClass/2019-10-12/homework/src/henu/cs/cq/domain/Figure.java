package henu.cs.cq.domain;

public class Figure {
	private String name = "this is a figure";
	private double area;
	private double grith;
	
	public Figure() {
		System.out.println(getName());
	}
	
	public Figure(String name) {
		setName(name);
		System.out.println(getName());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getGrith() {
		return grith;
	}
	
	public void setGrith(double grith) {
		this.grith = grith;
	}
	
}
