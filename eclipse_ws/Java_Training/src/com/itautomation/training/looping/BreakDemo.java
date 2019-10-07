package com.itautomation.training.looping;

public class BreakDemo {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) 
		{
			if( i % 2 != 0)
			{
				//break;
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("Main ended");
	}
}
