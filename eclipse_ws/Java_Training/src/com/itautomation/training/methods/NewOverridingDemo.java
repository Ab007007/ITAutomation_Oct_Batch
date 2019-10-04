package com.itautomation.training.methods;

public class NewOverridingDemo extends OverridingDemo
{
	
	public void test()
	{
		System.out.println("I'm from New OverridingDemo Class ");
	}

	public static void main(String[] args) {
		
		NewOverridingDemo nd = new NewOverridingDemo();   
		nd.test();   // I'm from New OverridingDemo Class 
		nd.oldTest();
		OverridingDemo od = new OverridingDemo();		
		od.test();   //I'm from OverridingDemo Class 
		od.oldTest();
		OverridingDemo superObj = new NewOverridingDemo();
		superObj.test();					//
		superObj.oldTest();
	}
}
