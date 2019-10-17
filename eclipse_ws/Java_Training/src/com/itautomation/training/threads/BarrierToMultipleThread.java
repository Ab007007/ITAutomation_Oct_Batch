package com.itautomation.training.threads;

public class BarrierToMultipleThread {

	public static void main(String[] args) 
	{
		EvenNumberUsingRunnable obj =  new EvenNumberUsingRunnable();
		
		Thread t1 = new Thread(obj);
		t1.start();
		System.out.println("thread 2*******************************");
		Thread t2 = new Thread(obj);
		t2.start();
	
	}
}
