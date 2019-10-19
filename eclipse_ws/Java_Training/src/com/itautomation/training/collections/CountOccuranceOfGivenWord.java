package com.itautomation.training.collections;

public class CountOccuranceOfGivenWord {

	public static void main(String[] args) {
		String str = "Hi how are you today , today evening i'm coming with you . i'm going to home town today night Hi how are you going tomorrow";
		
		String strToSearch = "evening";
		int count = 0;
		String[] words =  str.split(" ");
		
		for (String word : words) 
		{
			if(word.equals(strToSearch))
			{
				count++;
			}
			
		}
		
		System.out.println("total occurance of a given String is " + count);
	}
}
