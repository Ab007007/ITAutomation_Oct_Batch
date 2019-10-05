package com.itautomation.training.accessmodifiers;

public class AccessModifiers 
{
	
	final static int i = 100;
	
	
	public static void main(String[] args) {
		
		AccessModifiers am1 = new AccessModifiers();
		AccessModifiers am2 = new AccessModifiers();
		AccessModifiers am3 = new AccessModifiers();
		AccessModifiers am4 = new AccessModifiers();
		AccessModifiers am5 = new AccessModifiers();
		AccessModifiers am6 = new AccessModifiers();
		
		System.out.println(am1.i);
		System.out.println(am2.i);
		System.out.println(am3.i);
		System.out.println(am4.i);
		System.out.println(am5.i);
		System.out.println(am6.i);
		
	}

}
