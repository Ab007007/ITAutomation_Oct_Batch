package com.ita.actitime.basic.switchTo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class TabbedBrowser extends ActitimeUtils
{

	public static void main(String[] args) {
		System.out.println("--- Handling Multi Browser in Selenium ---");
		driver = getMyDriver();
		launch();
		login("admin", "manager");
		clickOnHelp();
		//driver.findElement(By.linkText("User Guide"))
		clickOnElement("linktext", "User Guide");
		
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it =  windowIDs.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		driver.close();
		driver.switchTo().window(parentID);
		logout();
		driver.close();
		
	}
}
