package com.itautomation.training.interview;

import java.io.ObjectInputStream.GetField;

class SingleTon
{
	//Single ton class is a class which returns only one Object at any point of time
	// Max object created to class in one
	
	static SingleTon st = null;
	private SingleTon()
	{
		System.out.println("Default constructor called....");
	}
	
	public static SingleTon getMySingleTonObj()
	{
		if(st == null)
		{
			st = new SingleTon();
		}
		
		return st;
	}
	
	public void welcomeMsg(String user)
	{
		System.out.println("Welcome to Single ton " + user);
	}
	
	
}


public class SingleTonManager
{
	public static void main(String[] args) 
	{
		SingleTon st1 = SingleTon.getMySingleTonObj();
		SingleTon st2 = SingleTon.getMySingleTonObj();
		SingleTon st3 = SingleTon.getMySingleTonObj();
		SingleTon st4 = SingleTon.getMySingleTonObj();
		SingleTon st5 = SingleTon.getMySingleTonObj();
		SingleTon st6 = SingleTon.getMySingleTonObj();
		SingleTon st7 = SingleTon.getMySingleTonObj();
		SingleTon st8 = SingleTon.getMySingleTonObj();
		SingleTon st9 = SingleTon.getMySingleTonObj();
		SingleTon st10 = SingleTon.getMySingleTonObj();
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