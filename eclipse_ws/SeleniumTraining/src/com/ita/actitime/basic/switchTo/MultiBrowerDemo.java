package com.ita.actitime.basic.switchTo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class MultiBrowerDemo extends ActitimeUtils{

	
	public static void main(String[] args) {
		
		driver = getMyDriver();
		launch("https://www.irctc.co.in/eticketing/errors.html#");
		clickOnElement("linktext", "Contact Us");
		
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
	
		String parentID = it.next();
		String childID = it.next();
		
		System.out.println("Parent ID - " + parentID);
		System.out.println("Child ID - " + childID);
		
		driver.switchTo().window(childID);
		
		List<WebElement> eamilIDs = driver.findElements(By.xpath("//a"));
		
		for (WebElement emailID : eamilIDs) {
			System.out.println(emailID.getText());
		}
		driver.close();
		driver.switchTo().window(parentID);
		System.out.println(" -- Parent browser elements ---");
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.close();
		
		
		
		
		
		
	}
}
