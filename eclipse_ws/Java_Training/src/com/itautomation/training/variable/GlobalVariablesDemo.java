package com.itautomation.training.variable;

public class GlobalVariablesDemo 
{
	
	static int x=100;

	//method
	public static void main(String[] args)
	{
		int i;
		i = 10;
		System.out.println(i); //10
		x = x + i;
		System.out.println(x);  //110
		test();
		System.out.println(x);  //
		
		
	}

	
	public static void test()
	{
		int i;
		i = 20;
		System.out.println(i); //20
		x = x + i;
		System.out.println(x); //130
	}
}
