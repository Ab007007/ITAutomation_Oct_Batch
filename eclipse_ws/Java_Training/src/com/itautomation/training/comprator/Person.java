package com.itautomation.training.comprator;

public class Person {

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
}
