package com.itautomation.training.threads;

public class RunnableManager
{

	public static void main(String[] args) {
		
		EvenNumberUsingRunnable obj =  new EvenNumberUsingRunnable();
		OddNumberUsingRunnable obj2 =  new OddNumberUsingRunnable();
		
		Thread t1 = new Thread(obj);
		
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main " + i);
		}
		
		
	}
}
