package com.itautomation.training.strings;

public class StringReverse
{
	public static void main(String[] args) {
		String str = "Hello all how are you today!!!";
		
		/*
		 * for (int i = 0; i < str.length(); i++) { System.out.print(str.charAt(i));
		 * 
		 * }
		 */
	// olleH lla
		String[] words = str.split(" ");
		for (String word : words) 
		{
			for (int i = word.length()-1; i >=0 ; i--)
			{
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		
	System.out.println();
	System.out.println("String reverse");
	
	for (int i = str.length()-1; i >=0 ; i--)
	{
		System.out.print(str.charAt(i));
	}
	}

}
