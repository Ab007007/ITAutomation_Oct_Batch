package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodDemo {

	
	
	@BeforeMethod
	public void launch()
	{
		System.out.println(" -- launch --");
	}
	
	@Test
	public void createCustomer()
	{
		System.out.println(" -- Create Customer -- ");
	}
	
	@Test
	public void deleteCustomer()
	{
		System.out.println(" -- Delete Customer -- ");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println(" -- closing browser --");
	}
}
