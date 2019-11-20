package testng.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ita.actitime.basic.utils.ActitimeUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LogintTestWithOutLibrary {

	WebDriver driver = null;
	ExtentReports reports = null;
	ExtentTest test = null;
	
	@BeforeSuite
	public void setupReports()
	{
		
		reports  = new ExtentReports("D:\\ITA_Automation\\eclipse_ws\\SeleniumTraining\\reports\\report_"
		+ActitimeUtils.getCurrentDateAndTime() + ".html", true);
		
	}
	@BeforeTest
	public void setup()
	{
		test = reports.startTest("setup");
		test.log(LogStatus.INFO, "Creating a Chrome Driver");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test.log(LogStatus.INFO, "Setting a implicit wait of 20 sec");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		reports.endTest(test);
		
	}



	@Test(priority =1)
	public void loginTest() throws InterruptedException
	{
		test = reports.startTest("Login Test");
		driver.get("http://localhost/login.do");

		test.log(LogStatus.PASS, "application is launched Successfully");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "Loged in Successfully");
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
		reports.endTest(test);
		
	}
	
	@Test(priority=2)
	public void loginTestWithInvalidCreds() throws InterruptedException
	{
		test = reports.startTest("Login Test with invalid credentials");
		driver.get("http://localhost/login.do");
		test.log(LogStatus.PASS, "application is launched Successfully");
		
		driver.findElement(By.id("username")).sendKeys("admmin1");
		driver.findElement(By.name("pwd")).sendKeys("manager1");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
		reports.endTest(test);
	}
	

	@AfterTest
	public void cleanup()
	{
		driver.close();
	}
	
	@AfterMethod
	public void checkTestExecutionStatus(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			TakesScreenshot ss = (TakesScreenshot) driver;
			File screenShot = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot,
					new File("D:\\ITA_Automation\\eclipse_ws\\SeleniumTraining\\screenshots\\" + "SS_" + ActitimeUtils.getCurrentDateAndTime() + ".png"));

		}
		
	}
	
	@AfterSuite
	public void saveReports()
	{
		reports.flush();
		reports.close();
	
	}
	
}
