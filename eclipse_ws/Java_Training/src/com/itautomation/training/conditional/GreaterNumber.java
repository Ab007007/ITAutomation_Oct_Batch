package com.itautomation.training.conditional;

import java.util.Scanner;

public class GreaterNumber
{
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Greater number program");
		String choice = "no";
		do
		{
			System.out.println("Enter 2 numbers");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b)
			{ 
				System.out.println("First number is greater");
			}
			else if (b > a)
			{
				System.out.println("Second number is greater");
			}
			else
			{
				System.out.println("Both are equal....");
			}
		System.out.println("Do you want to continue...????yes/no");
		choice =  sc.next();
		}while(choice.equalsIgnoreCase("yes"));
			
		
		System.out.println("main ended");
	}
}
