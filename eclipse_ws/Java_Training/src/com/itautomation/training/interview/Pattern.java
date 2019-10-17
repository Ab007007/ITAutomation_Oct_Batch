package com.itautomation.training.interview;

public class Pattern 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to patterrn program");

		for(int i = 1 ; i<=5 ; i++ )
		{
			for(int j =1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
		System.out.println("Welcome to patterrn program--2");

		for(int i = 1 ; i<=5 ; i++ )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Welcome to patterrn program--3");

		for(int i = 1 ; i<=5 ; i++ )
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Welcome to patterrn program--4");
		for(int i = 1 ; i<=5 ; i++ )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1 ; i<=5 ; i++ )
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
