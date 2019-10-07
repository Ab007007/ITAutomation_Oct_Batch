package com.itautomation.training.conditional;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) 
	{
		System.out.println("Calculate Marks based on Grade...");
		String choice = "no";
		do
		{
			System.out.println("Enter enter your grade...");
			Scanner sc = new Scanner(System.in);
			String grade = sc.next();
	
			switch (grade) 
			{
			case "A":
				System.out.println("Your marks falls in between 90-99%");
				break;
	
			case "B":
				System.out.println("Your marks falls in between 80-89%");
				break;
	
			case "C":
				System.out.println("Your marks falls in between 70-79%");
				break;
	
			case "D":
				System.out.println("Your marks falls in between 50-69%");
				break;
	
			case "E":
				System.out.println("You Need to improve.!!!");
				break;
	
			default:
				System.out.println(" None of the Case block is matched please check your input!!!\n"
						+ "it should be with in A-E !");
				break;
			}
			System.out.println("Do you wnat to continue..????? yes / no");
			choice = sc.next();
			
			}while(choice.equals("yes"));
		
		System.out.println("Main ended!!!");
	} //End of mail

}
