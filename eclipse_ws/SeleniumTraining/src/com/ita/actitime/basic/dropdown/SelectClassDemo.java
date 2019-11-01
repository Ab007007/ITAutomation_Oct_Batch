package com.ita.actitime.basic.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Form filling Application...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("HB");
		driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		Select sel =  new Select(driver.findElement(By.id("select-menu")));
		
		List<WebElement> options = sel.getOptions();
		
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		System.out.println("First selected element " + sel.getFirstSelectedOption().getText());
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("4");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("5-9");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Submit")).click();
		
	
		driver.close();
	
		
	}
}
