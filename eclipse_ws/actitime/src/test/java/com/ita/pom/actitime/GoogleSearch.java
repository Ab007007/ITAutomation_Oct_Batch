package com.ita.pom.actitime;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ita.pom.utils.MyUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	WebDriver driver = null;
	ExtentReports reports = null;
	ExtentTest test = null;
	
	@BeforeSuite
	public void setUpReports()
	{
		File file  = new File("reports");
		reports = new ExtentReports(file.getAbsolutePath() + "//reports_" + MyUtils.getCurrentDateAndTime() + ".html", true);
	}

	@BeforeTest
	public void setupBrowser() 
	{
		test = reports.startTest("setupBrowser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test.log(LogStatus.INFO	, "Driver Object is created for Chrome Driver " );
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		test.log(LogStatus.INFO	, "Ipmlicit Wait is set with 30 sec by default " );
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO	, "Browser is maximized for Better Execution exp" );
		
		reports.endTest(test);
		test = null;
		
	}

	@Test(dataProviderClass = TestData.class,dataProvider = "companies")
	public void googleSearch(String searchCompany) {
		//String searchCompany = "IT Automation";
		test = reports.startTest("googleSearch");
		test.log(LogStatus.INFO, "Launching Google Chrome Browser " );
		driver.get("https://www.google.com/");
		test.log(LogStatus.PASS, "Google Page is successfully Launched " );
		
		test.log(LogStatus.INFO, "Searching for  " + searchCompany );
		driver.findElement(By.name("q")).sendKeys(searchCompany);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));

		List<WebElement> autoSuggetions = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='sbl1']/span"));

		test.log(LogStatus.INFO, "total suggestions displayed is : " + autoSuggetions.size());
		/*
		 * for (WebElement suggestion : autoSuggetions) {
		 * System.out.println(suggestion.getText()); }
		 * 
		 */
		Iterator<WebElement> it = autoSuggetions.iterator();
		while (it.hasNext()) {
			WebElement suggestion = it.next();
			test.log(LogStatus.INFO , suggestion.getText());

		}
		
		reports.endTest(test);
	}
	
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	@AfterSuite
	public void saveReports()
	{
		reports.flush();
		reports.close();
	}
}
