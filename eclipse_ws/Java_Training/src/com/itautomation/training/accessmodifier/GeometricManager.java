package com.itautomation.training.accessmodifier;

public class GeometricManager {
	
	public static void main(String[] args) {
		
		Circle c  = new Circle();
		c.area();
		
		Triangle t = new Triangle();
		t.area();
				
		
		Circle c1 =  new Circle(1.5);
		c1.area();
		Triangle t1 =  new Triangle(1.5, 2);
		t1.area();
		
	}

}
