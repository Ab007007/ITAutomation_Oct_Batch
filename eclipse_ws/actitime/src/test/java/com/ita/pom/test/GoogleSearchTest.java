package com.ita.pom.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ita.pom.page.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest 
{
	WebDriver driver =null;
	GoogleSearchPage gsp = null;
	
	
	@BeforeTest
	public void setupBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		gsp = new GoogleSearchPage(driver);
	}
	
	@Test
	public void printAugoSuggetionsTest()
	{
		gsp.launchGooglePage();
		gsp.typeOnSearchBox("IBM");
		gsp.printAutoSuggestions();
	}
	
	
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	

}
