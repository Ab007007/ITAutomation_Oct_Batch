package com.ita.actitime.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementsAutomation
{

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome to Form filling Application...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("HB");
		driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.linkText("Submit")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
