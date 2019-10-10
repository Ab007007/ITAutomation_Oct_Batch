package com.itautomation.training.exceptions;

public class CompileTimeExceptionDemo
{
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Error while waiting!!!!!!");
		}
			System.out.println("Main Ended ");
	}

}
