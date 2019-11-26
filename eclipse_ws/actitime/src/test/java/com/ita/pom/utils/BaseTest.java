package com.ita.pom.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	
	
	public WebDriver driver = null;
	public ExtentReports reports = null;
	public ExtentTest test = null;
	
	@BeforeSuite
	public void setupReports()
	{
		File file = new File("reports");
		reports  = new ExtentReports(file.getAbsolutePath() + "\\report_"
		+ MyUtils.getCurrentDateAndTime() + ".html", true);
		
	}
	@BeforeTest
	public void setup()
	{
		System.out.println("Creating driver");
		test = reports.startTest("setup");
		test.log(LogStatus.INFO, "Creating a Chrome Driver");
	//	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		test.log(LogStatus.INFO, "Setting a implicit wait of 20 sec");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
					new File("D:\\ITA\\ITAutomation_Oct_Batch\\eclipse_ws\\actitime\\reports\\screenshots\\" + "SS_" + MyUtils.getCurrentDateAndTime() + ".png"));

		}
		
	}
	
	@AfterSuite
	public void saveReports()
	{
		reports.flush();
		reports.close();
	
	}

}
