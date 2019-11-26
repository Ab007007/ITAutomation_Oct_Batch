package com.ita.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

	@FindBy(xpath = "//div[@class='addNewContainer']")	
	WebElement addNewButton;
	
	@FindBy(xpath = "//div[contains(text(),'New Customer')]")	
	WebElement newCustomerButton;
	
	
	public void clickOnAddNewButton()
	{
		addNewButton.click();
	}
	
	public void clickOnNewCustomer()
	{
		newCustomerButton.click();
	}
	
	public void clickOnNewCustomerButton()
	{
		clickOnAddNewButton();
		clickOnNewCustomer();
	}
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
