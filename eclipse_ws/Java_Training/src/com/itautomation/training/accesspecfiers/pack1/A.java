package com.itautomation.training.accesspecfiers.pack1;

public class A 
{
	
	/**
	 * we have total 8 members 
	 * 4. variables
	 * 	- 1.private
	 *  - 2.default
	 *  - 3.protected
	 *  - 4.public
	 * 4. methods
	 * 	- 1.private
	 *  - 2.default
	 *  - 3.protected
	 *  - 4.public
	 */
	//Global Variables and Instance variables
	private int privateVariable;
	int defaultVariable;
	protected int protectedVariable;
	public int publicVariable;
	
	private void privateTest()
	{
		
		System.out.println("**************************************************");
		System.out.println("Private Variable " + privateVariable);
		System.out.println("Default Variable " + defaultVariable);
		System.out.println("Protected Variable " + protectedVariable);
		System.out.println("Public Variable " + publicVariable);
		System.out.println();
	}
	
	void defaultTest()
	{
		System.out.println("**************************************************");
		System.out.println("Private Variable " + privateVariable);
		System.out.println("Default Variable " + defaultVariable);
		System.out.println("Protected Variable " + protectedVariable);
		System.out.println("Public Variable " + publicVariable);
		System.out.println();
	}
	
	protected void protectedTest()
	{
		System.out.println("**************************************************");
		System.out.println("Private Variable " + privateVariable);
		System.out.println("Default Variable " + defaultVariable);
		System.out.println("Protected Variable " + protectedVariable);
		System.out.println("Public Variable " + publicVariable);
		System.out.println();
	}
	public void publicTest()
	{
		System.out.println("**************************************************");
		System.out.println("Private Variable " + privateVariable);
		System.out.println("Default Variable " + defaultVariable);
		System.out.println("Protected Variable " + protectedVariable);
		System.out.println("Public Variable " + publicVariable);
		System.out.println();
	}

	public static void main(String[] args) {
		A aObj = new A();
		
		aObj.privateVariable = 10;
		aObj.defaultVariable = 20;
		aObj.protectedVariable = 30;
		aObj.publicVariable = 40;
		
		
		aObj.privateTest();
		aObj.protectedTest();
		aObj.defaultTest();
		aObj.publicTest();
	};
	
	
	
	
	
	
	
	
	
}
