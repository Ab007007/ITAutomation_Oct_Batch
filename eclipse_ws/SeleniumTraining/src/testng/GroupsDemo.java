package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsDemo 
{
	
	// Regression, Unit, Smoke, Stage, Production
	@Test(groups = {"mahendra","cars"})
	public void testXUV500()
	{
		Reporter.log("I'm testing XUV 500");
	}

	@Test(groups = {"mahendra","cars"})
	public void testXUV300()
	{
		Reporter.log("I'm testing XUV 300");
	}

	@Test(groups = {"maruthi","cars"})
	public void testSwift()
	{
		Reporter.log("I'm testing Swift");
	}

	@Test(groups = {"maruthi","cars"})
	public void testBreza()
	{
		Reporter.log("I'm testing Breza");
	}

	@Test(groups = {"hundai","cars"})
	public void testi10()
	{
		Reporter.log("I'm testing testi10");
	}
	@Test(groups = {"hundai","cars"})
	public void testi20()
	{
		Reporter.log("I'm testing testi20");
	}
	
}
