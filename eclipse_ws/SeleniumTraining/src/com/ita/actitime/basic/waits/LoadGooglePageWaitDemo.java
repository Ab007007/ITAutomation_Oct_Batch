package com.ita.actitime.basic.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadGooglePageWaitDemo 
{
	public static void main(String[] args) {
		System.out.println("Welcome to Auto Suggestions Demo...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/ITA/ITAutomation_Oct_Batch/html/PageLoadApp.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnContinue"))));
		
		System.out.println("Button is visible now..");
		ele.click();
		
		String title = driver.getTitle();
		
		if(title.equals("Google"))
		{
			System.out.println("Google Page is launched successfully");
		}
		else
		{
			System.out.println("Google Page is not loaded ");
		}
		
	}

}
