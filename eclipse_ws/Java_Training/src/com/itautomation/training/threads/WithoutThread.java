package com.itautomation.training.threads;

public class WithoutThread 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Printing Odd numbers from one to 100");
		
		for (int i = 1; i < 100; i=i+2)
		{
			Thread.sleep(2000);
			System.out.println("Odd number : " + i);
			
		}
		
		
		System.out.println("Printing Even numbers from 1 to 100");
		for (int i = 2; i < 100; i=i+2)
		{
			Thread.sleep(2000);
			System.out.println("Even number : " + i);
			
		}
		
		
		System.out.println("Printing from 1 - 100 ");
		for (int i = 1; i < 100; i++)
		{
			Thread.sleep(2000);
			System.out.println("numbers from 1-100 : "  + i);
		}
		
		
	}

}
