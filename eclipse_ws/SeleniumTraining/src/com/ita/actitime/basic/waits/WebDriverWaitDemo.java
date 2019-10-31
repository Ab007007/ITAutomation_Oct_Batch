package com.ita.actitime.basic.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo 
{

	public static void main(String[] args) {
		System.out.println("Welcome to Form filling Application...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/ITA/ITAutomation_Oct_Batch/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		WebDriverWait wait  =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@id='demo']"))));
		
		String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Message dispalyed is : " + msg);
		
		String msg2 = driver.findElement(By.xpath("//p[@id='demo2']")).getText();
		System.out.println(msg2);
				
		
	}
}
