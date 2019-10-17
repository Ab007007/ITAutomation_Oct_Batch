package com.itautomation.training.interview;

import java.io.ObjectInputStream.GetField;

class SingleTon1
{
	//Single ton class is a class which returns only one Object at any point of time
	// Max object created to class in one
	
	static SingleTon1 st = null;
	public  SingleTon1()
	{
		System.out.println("Default constructor called....");
	}
	
	public static SingleTon1 getMySingleTon1Obj()
	{
		if(st == null)
		{
			st = new SingleTon1();
		}
		
		return st;
	}
	
	public void welcomeMsg(String user)
	{
		System.out.println("Welcome to Single ton " + user);
	}
	
	
}


public class SingleTonWithPublic
{
	public static void main(String[] args) 
	{
		SingleTon1 st1 = SingleTon1.getMySingleTon1Obj();
		SingleTon1 st2 = new SingleTon1();
		SingleTon1 st3 = new SingleTon1();
		SingleTon1 st4 = new SingleTon1();
		SingleTon1 st5 =new SingleTon1();
		SingleTon1 st6 =new SingleTon1();
		SingleTon1 st7 = SingleTon1.getMySingleTon1Obj();
		SingleTon1 st8 = new SingleTon1();
		SingleTon1 st9 = SingleTon1.getMySingleTon1Obj();
		SingleTon1 st10 = SingleTon1.getMySingleTon1Obj();
		st1.welcomeMsg("Aravinda1");
		st2.welcomeMsg("Aravinda2");
		st3.welcomeMsg("Aravinda3");
		st4.welcomeMsg("Aravinda4");
		st5.welcomeMsg("Aravinda5");
		st6.welcomeMsg("Aravinda6");
		st7.welcomeMsg("Aravinda7");
		st8.welcomeMsg("Aravinda8");
		st9.welcomeMsg("Aravinda9");
		st10.welcomeMsg("Aravinda10");
	}
}