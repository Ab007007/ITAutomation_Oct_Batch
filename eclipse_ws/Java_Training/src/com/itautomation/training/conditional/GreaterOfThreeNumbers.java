package com.itautomation.training.conditional;

import java.util.Scanner;

public class GreaterOfThreeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Greater number program");
		String choice = "no";
		do
		{
			System.out.println("Enter 3 numbers");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number - ");
			int a = sc.nextInt();
			System.out.println("Enter Second Number - ");
			int b = sc.nextInt();
			System.out.println("Enter Third Number - ");
			int c = sc.nextInt();
			
			if(a > b && a > c)
			{
				System.out.println("First number is the greatest Number..");
			}
			else if ( b > a && b > c)
			{
				System.out.println("Second number is the greatest Number..");
			}
			else if ( c > a && c > b)
			{
				System.out.println("Third number is the greatest Number..");
			}
			else if ( a == b && b == c)
			{
				System.out.println("Numbers are same.!!!!!");
			}
			System.out.println("Do you want to continue...????yes/no");
			choice =  sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		
		
	}
}
