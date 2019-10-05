package com.itautomation.training.looping;

public class DoWhileLoopDemo
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
		 * do
		 * {
		 * 
		 * }while(condition);
		 */
		int i = 0;
		do
		{
			System.out.println(marks[i]);
			i  = i + 1;
		}while(i < marks.length);
		
		
		
		
		
		
		
		
		System.out.println("Main Ended");
	}
	

}
