package com.itautomation.training.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set s  = new TreeSet();
		
		
		s.add("XYZ");
		s.add("ABC");
		s.add("PQR");
		s.add("LMN");
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
