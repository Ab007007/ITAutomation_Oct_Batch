package com.itautomation.training.constructors;

public class Person
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
	
		return "\nThe value Stored in Person object is \nNAME : " + this.name + "\nAGE : " + this.age
				+ "\nHEIGHT : " + this.height + "\nWEIGHT :" + this.weight + "\nCOUNTRY : " + Person.country ;
	}


}