package testng.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ita.actitime.basic.utils.ActitimeUtils;


public class LoginTest
{
	WebDriver driver = null;
	
	@BeforeClass
	public void setupBrowser()
	{
		driver = ActitimeUtils.getMyDriver();
	}
	@BeforeMethod
	public void launch()
	{
		ActitimeUtils.launch();
	}
	
	@Test(priority = 0)
	public void loginWithValidCredentialsTest()
	{
		ActitimeUtils.login("admin", "manager");
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}
	
	
	@Test(priority = 1)
	public void loginWithInValidCredentialsTest()
	{
		ActitimeUtils.login("admin1", "manager1");
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}
	
	@AfterMethod
	public void logout()
	{
		ActitimeUtils.logout();
	}
	
	@AfterClass
	public void closeBrower()
	{
		driver.close();
	}
}
