package com.itautomation.training.comprator;

import java.util.ArrayList;
import java.util.Collections;

public class PersonManager {

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();

		al.add(new Person("Suresh", 25, 12354));
		al.add(new Person("Aravinda", 35, 12354));
		al.add(new Person("Harish", 34, 12354));
		al.add(new Person("Girish", 75, 12354));
		al.add(new Person("Ramesh", 90, 12354));
		al.add(new Person("Prakash", 35, 12354));

		for (Person person : al) {
			System.out.println(person);
		}

		System.out.println("Sort using name..");

		Collections.sort(al, new NameComprator());

		for (Person person : al) {
			System.out.println(person);
		}

		
		System.out.println("sorting using age...");
		Collections.sort(al, new AgeComprator());
		for (Person person : al) {
			System.out.println(person);
		}
	}
}
