package com.itautomation.training.constructors;

public class PersonManager 
{
	
	public static void main(String[] args) throws InterruptedException
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
		
		Thread.sleep(2000);
		
		Person p3 = new Person("Smith", 45, 6.0, 80);
		System.out.println(p3);
		
	}

}



