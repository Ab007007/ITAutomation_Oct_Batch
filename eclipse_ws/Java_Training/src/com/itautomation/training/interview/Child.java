package com.itautomation.training.interview;

class Parent
{
	public Parent()
	{
		System.out.println("Super class no arg constructor ");
	}
	
	public Parent(String name)
	{
		System.out.println("Super class param const " + name);
	}
}

public class Child extends Parent
{
	public Child()
	{
		this("SSS");
		System.out.println("subclass class no arg constructor");
	}
	
	public Child(String name)
	{
		super("SSS");
		System.out.println("subclass class param const " + name);
	}
	
	public static void main(String[] args) {
		 Child c1 = new Child();
		 Child c2 = new Child();
		 Child c3 = new Child();
		 Child c4 = new Child();
		 Child c5 = new Child();
		 Child c6 = new Child();
	}
	
}
