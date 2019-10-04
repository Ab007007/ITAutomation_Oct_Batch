package com.itautomation.training.accessmodifier;

public class Circle extends GeometricFunctions
{
	//double radius = 3;
	final double PI = 3.142;
	@Override
	public void area() {
		
		System.out.println("Area of Circle is " + (PI* this.radius * this.radius) );
	}
	
	public Circle() 
	{
		System.out.println("Crating a Circle obj with radius as 3");
		this.radius = 3;
	}
	
	public Circle(double radius)
	{
		System.out.println("creating a circle obj with radius " + radius);
		this.radius = radius;
	}
}
