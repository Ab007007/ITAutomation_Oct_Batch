package com.itautomation.training.interview;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		System.out.println("Please enter the String");
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		// NITIN

		StringBuffer sb = new StringBuffer(str);

		if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) 
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
