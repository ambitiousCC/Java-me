package henu.cs.cq.test;

import henu.cs.cq.domain.*;

public class TestForTransport {
	public static void main(String[] args) throws Exception {
		//²âÊÔcar
		Car car = new Car();
		car.setNumsOfPassengers(12);
		System.out.println(car.toString());
		
		//²âÊÔ»ğ³µ
		Train train = new Train();
		train.setNumsOfPassengers(1000);
		System.out.println(train.toString());
		
		//·É»ú
		Plane plane = new Plane();
		System.out.println(plane.toString());
	}
}
