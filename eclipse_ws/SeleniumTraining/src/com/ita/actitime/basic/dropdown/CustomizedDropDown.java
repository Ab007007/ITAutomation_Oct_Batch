package com.ita.actitime.basic.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Form filling Application...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[@class='userSelectorButton']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dowd, Roy')]/parent::div")).click();
		
		
		
		
		
		
	}
}
