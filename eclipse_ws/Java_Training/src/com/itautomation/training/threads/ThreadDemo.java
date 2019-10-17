package com.itautomation.training.threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread " + Thread.currentThread().getName());
		OddNumberThread ont = new OddNumberThread();
		ont.setPriority(10);
		ont.setName("** OddNumberThread ** ");
		
		EvenNumberThread ent = new EvenNumberThread();
		ent.setName("** EvenNumberThread ** ");
	
		ont.start();
		
		System.out.println("Thread name1 " + ont.getName());
		
		ent.start();
		System.out.println("Thread name2 " + ent.getName());
		System.out.println("Printing from 1 - 100 ");
		for (int i = 1; i < 100; i++) {
			//Thread.sleep(2000);
			System.out.println("numbers from 1-100 : " + i);
		}

	}
}
