package com.ita.pom.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class GoogleSearchPage {


	WebDriver driver = null;
	@FindBy(name = "q")
	WebElement searchBox ; 
	
	public void launchGooglePage()
	{
		driver.get("https://www.google.com/");
	}
	
	
	
	public void typeOnSearchBox(String text)
	{
		searchBox.sendKeys(text);
	}
	
	public void printAutoSuggestions()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		List<WebElement> autoSuggetions = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='sbl1']/span"));
		System.out.println("total suggestions displayed is : " + autoSuggetions.size());
		Iterator<WebElement> it = autoSuggetions.iterator();
		
		while (it.hasNext()) {
			WebElement suggestion = it.next();
			System.out.println(suggestion.getText());

		}
	}
	
	public GoogleSearchPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	
	}
	
	
	
	
	
	
}
