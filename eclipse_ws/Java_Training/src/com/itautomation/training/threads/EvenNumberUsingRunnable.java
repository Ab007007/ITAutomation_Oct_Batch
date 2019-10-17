package com.itautomation.training.threads;

public class EvenNumberUsingRunnable implements Runnable
{

	
	public void run() {
		print();
	}
	
	
	public synchronized void print()
	{
		for (int i = 2; i < 100; i=i+2) 
		{
			System.out.println(Thread.currentThread().getName() + "-- " + i);
			
		}
	}

}
