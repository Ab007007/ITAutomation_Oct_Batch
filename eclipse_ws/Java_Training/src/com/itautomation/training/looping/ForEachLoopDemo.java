package com.itautomation.training.looping;

public class ForEachLoopDemo
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
		 * for(String localVariable : names)
		 * {
		 * 		System.out.println("localVariable");
		 * }
		 */
		for(int mark: marks)
		{
			System.out.println(mark);
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Main Ended");
	}
	

}
