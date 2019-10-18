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
		MyUtils.printCollection(al);
		
		System.out.println("Inserting element at 0 th index");
		al.add(0, "NewElement_" + new Date().toString() );
		MyUtils.printCollection(al);
		
		System.out.println("remove the element at last index");
		al.remove(0);
		MyUtils.printCollection(al);
		
		
		System.out.println("replace the element value at 1 index");
		al.add(1,"XYZ");
		al.remove(2);
		MyUtils.printCollection(al);
		
		MyUtils.printCollectionUsingForEach(al);
			
		MyUtils.printUsingIterator(al);
		
		
		
	}

	
}
