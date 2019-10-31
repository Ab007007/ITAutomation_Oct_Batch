package com.ita.actitime.basic.autosuggestions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionsDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Welcome to Auto Suggestions Demo...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("IT");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		
		List<WebElement> autoSuggetions = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='sbl1']/span"));
		
		System.out.println("total suggestions displayed is : " + autoSuggetions.size());
		/*
		 * for (WebElement suggestion : autoSuggetions) {
		 * System.out.println(suggestion.getText()); }
		 * 
		 */
		Iterator<WebElement> it =  autoSuggetions.iterator();
		while (it.hasNext()) {
				WebElement suggestion = it.next();
				System.out.println(suggestion.getText());
			
		}
		driver.close();
	}
}
