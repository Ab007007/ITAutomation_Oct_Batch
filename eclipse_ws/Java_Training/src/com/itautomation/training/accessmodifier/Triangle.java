package com.itautomation.training.accessmodifier;

public class Triangle extends GeometricFunctions
{
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle is " + (0.5 * this.height * this.width));
		
	}
	
	
	public Triangle() 
	{
		System.out.println("Creating a Triangle obj with default height : 10 and width : 5");
		this.height = 10;
		this.width = 5;
	}
	
	
	public Triangle(double height,double width)
	{
		System.out.println("Creating a Triangle obj with default height " + height + " and width :" + width);
		
		this.height = height;
		this.width = width;
	}
	
	
	
}
