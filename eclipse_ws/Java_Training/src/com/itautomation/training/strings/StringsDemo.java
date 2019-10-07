package com.itautomation.training.strings;

public class StringsDemo 
{
	public static void main(String[] args)
	{
		//Internally strings are stored as character array
		//Immutable - once created the value can not be changed
		
		String str  =new String("abc");
		System.out.println("Before changing the content " + str +  " and the address is " + str.hashCode());
		str = str.concat("pqr");
		System.out.println("After changing the content " + str + " and the address is " + str.hashCode());
	}

}
