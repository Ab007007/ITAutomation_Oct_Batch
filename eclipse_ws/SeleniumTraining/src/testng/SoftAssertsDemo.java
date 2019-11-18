package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertsDemo {

	@Test(dataProvider = "inputsForSum")
	public void validateSum(int a,int b)
	{
		SoftAssert sa  = new SoftAssert();
		System.out.println("Sum of 2 numbers " + a + " and " + b);
		sa.assertEquals(5 , a+b);
		System.out.println("Test Executed Successfully..");
		sa.assertAll();
		
	}
	
	
	
	
}
