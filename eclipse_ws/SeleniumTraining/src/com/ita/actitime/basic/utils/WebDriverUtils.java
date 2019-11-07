package com.ita.actitime.basic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils 
{
	public static WebDriver driver = null;
	
	/**
	 * @author Aravinda
	 * @param - default method to execute Tests in chrome Browser
	 * @return - returns Chrome Browser
	 */
	public static WebDriver getMyDriver()
	{
		System.out.println("--[ LOG ]-- Crating Chrome Driver ");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}


	/**
	 * @author Aravinda
	 * @param identifer - id,name, classname, tagname,linktext,partiallinktext,css,xpath
	 * @param value - correstponding value associated to identifier
	 * @return - WEbElement or null 
	 */
	public static WebElement getMyElement(String identifer, String value)
	{
		
		WebElement ele  = null;
		System.out.println("Finding Element using " + identifer + " and its value " + value);
		switch (identifer) 
		{
		case "id":
			ele = driver.findElement(By.id(value));
			break;
		case "name":
			ele = driver.findElement(By.name(value));
			break;
		case "classname":
			ele = driver.findElement(By.className(value));
			break;
		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;
		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;
		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;
		default:
			ele = null;
			System.out.println(" Please check the Identifier..!!!!!!");
			break;
		}
		
		return ele;		
		
	}
	
	
	/**
	 * @author Aravinda
	 * @param identifer
	 * @param value
	 */
	public static void clickOnElement(String identifer, String value)
	{
		System.out.println("clicking on element with identifier " + identifer + " and " + value);
		getMyElement(identifer, value).click();
		
	}
	
	
	
	public static void typeOnElement(String identifer, String value,String textToType)
	{
		System.out.println("typing on element with identifier " + identifer + " and " + value);
		getMyElement(identifer, value).sendKeys(textToType);
		
	}
	
	
	
	
	
	
	
	
	
}
