package com.itautomation.training.looping;

public class ForLoopDemo
{
	public static void main(String[] args)
	{
		int marks[] = new int[8];
		
		String[] names = {"abc","def","pqr"};
		
		marks[0] = 35;
		marks[1] = 55;
		marks[2] = 65;
		marks[3] = 75;
		marks[4] = 85;
		marks[5] = 95;
		marks[6] = 96;
		marks[7] = 97;
		
		/*
		 * Syntax:
		 * ------
		 * for(initialization;condition;increment/decrement operator)
		 * {
		 * 
		 * i = i + 1;
		 * i = 0 + 1
		 * 1 =1
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		for(int i =0 ; i < marks.length ; i++ )
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("Main Ended");
	}
	

}
