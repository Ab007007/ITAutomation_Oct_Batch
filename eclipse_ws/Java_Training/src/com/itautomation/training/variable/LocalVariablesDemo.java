package com.itautomation.training.variable;

public class LocalVariablesDemo 
{

	//method
	public static void main(String[] args)
	{
		int i;
		i = 10;
		test();
		System.out.println(i);
		
	}

	
	public static void test()
	{
		int i;
		i = 20;
		System.out.println(i);
	}
}
