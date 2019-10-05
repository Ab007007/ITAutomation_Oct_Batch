package com.itautomation.training.arrays;

import java.util.Scanner;

public class GenerateMultiplicationTable 
{
	
	public static void main(String[] args)
	{
		String choice = "no";
		do
		{
			System.out.println("Welcome to Multiplication Table ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number for which you want to generate table???");
			int num = sc.nextInt();
			
			System.out.println("Enter the max number till which you want to generate table..");
			int maxNum = sc.nextInt();
			System.out.println("Generating a Table for " + num);
			
			for (int i = 1; i <=maxNum ; i++) 
			{
				System.out.println(num + " * "+ i + " = " + i * num);
			}
			
			System.out.println("Do you want to continue????? yes /no ");
			choice = sc.next();
		}while(choice.equals("yes"));
	
	System.out.println("Main Ended...");
	}

}
