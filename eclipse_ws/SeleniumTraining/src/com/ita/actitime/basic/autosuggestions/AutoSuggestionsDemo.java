package com.ita.actitime.basic.autosuggestions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Welcome to Auto Suggestions Demo...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("IBM");
		
		Thread.sleep(5000);
		
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
