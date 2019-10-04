package com.itautomation.training.methods;

public class OverloadingDemo {
	
	public static void main(String[] args) {
		
		OverloadingDemo od  = new OverloadingDemo();
		od.sumofTwoNumbers(10, 20);
		od.sumofTwoNumbers(14, 20);
		od.sumofTwoNumbers(5, 5);
		od.sumofTwoNumbers(2.5, 3.5);
		od.sumofTwoNumbers("A", "B");
	//	od.sumofTwoNumbers(true, false);
		
	}
	
	void sumofTwoNumbers(int a , int b)
	{
		int c;
		c =  a +b;
		
		System.out.println("Sum of two numbers is : " + c);
	}
	
	void sumofTwoNumbers(double a , double b)
	{
		double d = a + b;
		System.out.println("Sum of two numbers is : " + d);
	}
	
	
	void sumofTwoNumbers(String a, String b)
	{
		System.out.println("Conatinating two Strings " + a+b);
	}
	
}
