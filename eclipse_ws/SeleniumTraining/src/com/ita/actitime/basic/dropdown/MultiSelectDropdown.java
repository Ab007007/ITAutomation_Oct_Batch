package com.ita.actitime.basic.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown
{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Form filling Application...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ITA/ITAutomation_Oct_Batch/html/multiSelect.html");
		
		Select sel  = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		sel.selectByValue("audi");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		for (WebElement webElement : selectedOptions) {
			System.out.println(webElement.getText());
			
		}
		Thread.sleep(2000);
		sel.deselectByVisibleText("Saab");
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("Audi");
		
		Thread.sleep(2000);
		sel.selectByIndex(1);
		sel.selectByValue("audi");
		sel.selectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		sel.deselectAll();
		Thread.sleep(2000);
		
	}

}
