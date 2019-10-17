package com.itautomation.training.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.itautomation.training.accessmodifiers.Person;



public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		List al = new ArrayList();
		
		al.add(10);
		al.add("abcd");
		al.add("person OBJ");
		printCollection(al);
		
		System.out.println("Inserting element at 0 th index");
		al.add(0, "NewElement_" + new Date().toString() );
		printCollection(al);
		
		System.out.println("remove the element at last index");
		al.remove(al.size()-1);
		printCollection(al);
		
		
		System.out.println("replace the element value at 1 index");
		al.add(1,"XYZ");
		al.remove(2);
		printCollection(al);
		
		printCollectionUsingForEach(al);
			
		printUsingIterator(al);
		
		
		
	}

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
