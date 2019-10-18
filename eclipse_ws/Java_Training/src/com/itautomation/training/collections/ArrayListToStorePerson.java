package com.itautomation.training.collections;


import java.util.ArrayList;
import java.util.List;

import com.itautomation.training.constructors.Person;



public class ArrayListToStorePerson
{
	
	
	public static void main(String[] args) {
		
		ArrayListDemo ald  = new ArrayListDemo();
		List al =  new ArrayList();
//		Person p1 = new Person("Aravinda", 35, 5.8, 70);
//		Person p2 = new Person("Harry", 35, 7.5, 90);
//		Person p3 = new Person("Peter", 40, 6.8, 85);
//		Person p4 = new Person("Rakesh", 28, 6.0, 65);
//		Person p5 = new Person("Hemanth", 30, 5.8, 70);
//		
//		al.add(p1);
//		al.add(p2);
//		al.add(p3);
//		al.add(p4);
//		al.add(p5);
		
		al.add(new Person("Aravinda", 35, 5.8, 70));
		al.add(new Person("Harry", 35, 7.5, 90));
		al.add(new Person("Peter", 40, 6.8, 85));
		al.add(new Person("Rakesh", 28, 6.0, 65));
		al.add(new Person("Hemanth", 30, 5.8, 70));
		
		//ald.printUsingIterator(al);
		//ald.printCollectionUsingForEach(al);
		MyUtils.printCollection(al);
	}

}
