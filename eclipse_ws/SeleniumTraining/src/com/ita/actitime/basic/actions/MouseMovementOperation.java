package com.ita.actitime.basic.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class MouseMovementOperation extends ActitimeUtils {
	public static void main(String[] args) throws InterruptedException {
		driver = getMyDriver();
		launch("https://www.flipkart.com/");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))));
		closeButton.click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='TVs & Appliances']"))).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).perform();
		Thread.sleep(2000);

	}

}
