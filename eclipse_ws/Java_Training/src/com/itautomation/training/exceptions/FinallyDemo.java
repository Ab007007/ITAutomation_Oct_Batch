package com.itautomation.training.exceptions;

public class FinallyDemo {
	
	public static void main(String[] args)
	{
		System.out.println(" Main Started..!!!!");
		
		int a[] = new int[0];
		
		try
		{
			a[0] =100;
		}
		catch(StringIndexOutOfBoundsException aiob)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("finally Executed");
		}
		System.out.println(" Main Ended..!!!");
		
		
		
		try
		{
			System.out.println("hello");
		}
		finally
		{
			System.out.println("finally");
		}
		
		
		
		
		
	}

}
