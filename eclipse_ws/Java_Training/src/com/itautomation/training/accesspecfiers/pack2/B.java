package com.itautomation.training.accesspecfiers.pack2;

import com.itautomation.training.accesspecfiers.pack1.A;
import com.itautomation.training.accesspecfiers.pack1.X;

public class B extends A 
{
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.protectedVariable = 10;
		b1.publicVariable = 20;
		b1.protectedTest();
		b1.publicTest();
	}
}
