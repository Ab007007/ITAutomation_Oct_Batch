package com.itautomation.training.threads;

public class EvenNumberThread extends Thread
{

	
	public void run()
	{
		System.out.println("Printing Even numbers from 1 to 100");
		for (int i = 2; i < 100; i=i+2)
		{
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
		}
	}
}
