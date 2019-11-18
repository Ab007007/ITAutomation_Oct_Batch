package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bikes
{

	@Test(groups = {"mahendra","bike"})
	public void bike1()
	{
		Reporter.log("I'm a bike from mahendra");
	}
	
	@Test(groups = {"hundai","bike "})
	public void bike2()
	{
		Reporter.log("I'm a bike from hundai");
	}
	
	@Test(groups = {"maruthi","bike"})
	public void bike3()
	{
		Reporter.log("I'm a bike from maruthi");
	}
	
}
