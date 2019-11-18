package testng;

import org.testng.annotations.DataProvider;

public class TestData
{

	
	/*
	 * Used to Store the data required for a Test
	 */
	
	@DataProvider
	public static  Object[][] dp() {
		return new Object[][] 
			{ 
			new Object[] { 1, "a" }, 
			new Object[] { 2, "b" }, 
			new Object[] { 3, "c" }, 
			new Object[] { 4, "d" }, 
		};
	}
	
	@DataProvider
	public static  Object[][] inputsForSum() {
		return new Object[][] 
			{ 
			new Object[] { 1, 2 }, 
			new Object[] { 2, 3 }, 
			new Object[] { 3, 4 }, 
			new Object[] { 4, 5 }, 
		};
	}
}
