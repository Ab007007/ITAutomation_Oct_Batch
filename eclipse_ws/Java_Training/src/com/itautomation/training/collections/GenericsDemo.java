package com.itautomation.training.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericsDemo 
{
	public static void main(String[] args)
	{
		
		{
			List<Integer> al =  new ArrayList<Integer>();
			int age = 45;
			al.add(10);
			al.add(20);
			al.add(age);
			MyUtils.printCollection(al);
			System.out.println("Inserting element at 0 th index");
			MyUtils.printCollection(al);
			
			System.out.println("remove the element at last index");
			al.remove(0);
			MyUtils.printCollection(al);
			
			
			System.out.println("replace the element value at 1 index");
		
			al.remove(2);
			MyUtils.printCollection(al);
			
			MyUtils.printCollectionUsingForEach(al);
				
			MyUtils.printUsingIterator(al);
			
			
			
		}

	}

}
