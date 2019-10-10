package com.itautomation.training.exceptions;

public class MultipleCatchBlockDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started!!!");
		String str = "aaa";;
		int a[] = new int[1];
		try
		{
			System.out.println("Length of the string " + str.length());
			a[0] = 100;
			System.out.println("Character at index 5"  + str.charAt(5));
			/*
			 * try { a[0] = 100; } catch(ArrayIndexOutOfBoundsException ex) {
			 * System.out.println("error"); }
			 */
					
		}
		catch(NullPointerException npe)
		{
			System.out.println("String may be null please check!!!!");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("check your array size!!!");
		}
		catch(Exception ex)
		{
			System.out.println("Generic Exception while reading !!!" + ex.getMessage());
		}
		System.out.println("Main Ended---");
	}

}
