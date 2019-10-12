package henu.cs.cq.domain;

public class Transport {
	private String name;
	private String price;//价格
	private String comfort;//舒适度
	private String speed;//速度
	private int numsOfPassengers;
	
	public Transport() {
		this.name = "未定义的交通工具";
	}
	public Transport(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getComfort() {
		return comfort;
	}
	public void setComfort(String comfort) {
		this.comfort = comfort;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getNumsOfPassengers() {
		return numsOfPassengers;
	}
	public void setNumsOfPassengers(int numsOfPassengers) throws Exception {
		if(numsOfPassengers<0) {
			throw new Exception("乘客人数必须为正整数");
		}
		this.numsOfPassengers = numsOfPassengers;
	}

	@Override
	public String toString() {
		if(numsOfPassengers==0) {
			return "Transport ["+name+":price=" + price + ", comfort=" + comfort + ", speed=" + speed + 
					",未设置最大乘客数]";
		} else {
			return "Transport ["+name+":price=" + price + ", comfort=" + comfort + ", speed=" + speed + ", numsOfPassengers="
					+ numsOfPassengers + "]";
		}
	}
}
