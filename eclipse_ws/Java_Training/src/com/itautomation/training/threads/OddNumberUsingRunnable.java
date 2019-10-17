package com.itautomation.training.threads;

public class OddNumberUsingRunnable implements Runnable
{

	
	public void run() {
		for (int i = 1; i < 100; i=i+2) 
		{
			System.out.println("OddNumberUsingRunnable" + i);
			
		}
	}

}
