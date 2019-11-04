package com.ita.actitime.basic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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

}
