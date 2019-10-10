package com.itautomation.training.exceptions;

public class ThrowsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Started!!!");
		
		sleepForSomeTime(3000);
		
		System.out.println("Main Ended---");
	}

	
	public static void sleepForSomeTime(int ms) throws InterruptedException
	{
		System.out.println("Waiting for " + ms);
		Thread.sleep(3000);
		System.out.println("Completed My Sleep " + ms);
	}
}
