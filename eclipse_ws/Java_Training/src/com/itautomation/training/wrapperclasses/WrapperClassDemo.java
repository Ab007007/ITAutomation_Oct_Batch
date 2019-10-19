package com.itautomation.training.wrapperclasses;

public class WrapperClassDemo 
{
	public static void main(String[] args) {
//		int a = 10;
		
		String a = "10";
		Integer aObj = Integer.valueOf(a);
		
		System.out.println(a);
		System.out.println("Multiply salary by 2 times");

		System.out.println((aObj*2));
		
		String doubleValue = "5.8";
		
		Double height =  Double.valueOf(doubleValue);
		System.out.println(height);
	}

}
