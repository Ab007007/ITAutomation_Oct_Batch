package com.itautomation.training.comprable;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	String name;
	int age;
	int sso;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person Name : " + this.name + " Age " + this.age + " SSO " + this.sso;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	Person(String name,int age, int sso)
	{
		this.name = name;
		this.age = age;
		this.sso = sso;
	}

	@Override
	public int compareTo(Person p) {
		if(age == p.age )
		{
			return 0;
		}
		else if (age >=p.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}



public class PersonManager 
{
	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		
		al.add(new Person("Aravinda", 35, 12354));
		al.add(new Person("Harish", 34, 12354));
		al.add(new Person("Girish", 75, 12354));
		al.add(new Person("Prakash", 35, 12354));
		al.add(new Person("Ramesh", 90, 12354));
		al.add(new Person("Suresh", 25, 12354));
		
		Collections.sort(al);
		for (Person person : al) {
			System.out.println(person);
		}
	}
	
	
	
	

}
