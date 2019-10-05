package com.itautomation.training.accesspecfiers.pack1;

public class X
{
	public static void main(String[] args) {
		A a1 = new A();
		//a1.privateVariable = 10;
		a1.defaultVariable = 10;
		a1.protectedVariable = 20;
		a1.publicVariable = 30;
		
		a1.defaultTest();
		a1.protectedTest();
		a1.publicTest();
		
	}

}
