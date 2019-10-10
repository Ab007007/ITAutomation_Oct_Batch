package com.itautomation.training.exceptions;

public class BalanceInSufficientException extends Exception
{
	/*
	 * 1. class shhould be suffixed with Exception
	 * 2. class should be a sub class of Exception
	 * 3. Keep atleast one constructor
	 */
	public BalanceInSufficientException()
	{
		System.out.println("Your Balance is too low!!! Check your Balance");
	}

	
	public BalanceInSufficientException(double balance, int withdraw)
	{
		System.out.println("Your Balance is " + (int)balance + " and you are trying to withdraw " +withdraw + " !!!!");
	}
	
}
