package com.itautomation.training.collections;

import java.util.Iterator;
import java.util.List;

public class MyUtils {

	
	public static void printUsingIterator(List al) {
		System.out.println("Using iterator to  print the collection...");
		Iterator it =  al.iterator();
		
		while (it.hasNext()) {
			System.out.println(" -- Iterator printing value -- " + it.next());
			
		}
	}

	public static void printCollectionUsingForEach(List al) {
		System.out.println("#################################################################");
		System.out.println("##### PRINTING COLLECTIONS USING FOR EACH LOOP ###");
		for (Object object : al) {
			System.out.println(object);
		}
	}

	public static void printCollection(List al) {
		System.out.println("Total number of elements stored in collection obj : " + al.size());
		// Using for loop
		System.out.println("*************************************************************************");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is : " + al.get(i));
		}
	}
	
}
