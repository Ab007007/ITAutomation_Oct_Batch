package com.itautomation.training.constructors;

public class PersonManager 
{
	
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.name = "Xyz";
		p1.age = 30;
		p1.height = 5.7;
		p1.weight = 70;
		Person p2 = new Person();
		p2.name = "Aravinda";
		p2.age = 35;
		p2.height = 5.8;
		p2.weight = 70;
		
		
		System.out.println(p1);	
		System.out.println(p2);
		
		
		
		Person p3 = new Person("Smith", 45, 6.0, 80);
		System.out.println(p3);
		
	}

}


class Person
{
	
	String name;
	int age;
	double height;
	double weight;
	static String country= "India";

//  this - refers to current object or calling object
	
	
	public Person() {
		System.out.println("Default constructor called..");
	}
	
	
	
	public Person(String name,int age,double h,double w)
	{
		this.name = name;
		this.age = age;
		this.height = h;
		this.weight = w;
		
		
	}
	
	public String toString()
	{
	
		return "The value Stored in Person object is \nNAME : " + this.name + "\nAGE : " + this.age
				+ "\nHEIGHT : " + this.height + "\nWEIGHT :" + this.weight + "\nCOUNTRY : " + Person.country ;
	}


}
