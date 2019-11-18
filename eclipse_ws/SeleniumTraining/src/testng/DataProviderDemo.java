package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@Test(dataProviderClass = TestData.class,dataProvider = "dp")
	public void f(Integer n, String s) 
	{
		System.out.println("Index : " + n + " Value : " + s);
	}

	
	
	
}
