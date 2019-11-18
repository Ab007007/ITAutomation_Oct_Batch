package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class AssertsDemo {

	@Test(dataProvider = "inputsForSum",dataProviderClass = TestData.class)
	public void validateSum(int a,int b)
	{
		Reporter.log("Sum of 2 numbers " + a + " and " + b + "<br>");
		Assert.assertEquals(5 , a+b);
		Reporter.log("Test Executed Successfully..");
		
	}
	

}
