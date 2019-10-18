package com.itautomation.training.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set s  = new LinkedHashSet();
		
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(50);
		s.add(1000);
		s.add(-5);
		s.add(-100);
		s.add(20);
		printSetElements(s);
		
	}

	
	
	
	
	private static void printSetElements(Set s) 
	{
		System.out.println("Size of the Collection is : " + s.size());
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
