package com.itautomation.training.exceptions;

public class ExceptionsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started!!!");
		String str = null;;
		int a[] = new int[0];
		try
		{
			System.out.println("Length of the string " + str.length());
					
		}
		catch(NullPointerException npe)
		{
			System.out.println("String may be null please check!!!!");
		}
		
		try
		{
			a[0] = 1;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("check your array size!!!");
		}
		System.out.println("Main Ended---");
	}

}
