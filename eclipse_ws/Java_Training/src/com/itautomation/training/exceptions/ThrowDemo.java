package com.itautomation.training.exceptions;

import java.util.Scanner;

public class ThrowDemo 
{
	static double balance = 10000;
	public static void main(String[] args)
	{
		double tempBalance;
		String choice;
		System.out.println("------Amount withdraw Utility-----");
		Scanner sc =  new Scanner(System.in);
		
		do
		{
			System.out.println(" Please enter the amount to withdraw !!!");
			int withdraw = sc.nextInt();
			
			tempBalance = balance - withdraw;
			
			if(tempBalance <= 0)
			{
				try
				{
					throw new BalanceInSufficientException(balance,withdraw);
				}
				catch (Exception e)
				{
					System.out.println("Exception!!!!!");
				}
			}
			else
			{
				System.out.println("Amount debited successfully!!!");
				balance = tempBalance;
			}
			
			System.out.println("Your balance is " + (int)balance);
			System.out.println("Do you want to contiue");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("------Thank You------");
		
	}

}
