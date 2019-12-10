package com.ita.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage
{

	
	@FindBy(xpath = "//a[div[text()='TASKS']]")
	WebElement tasksLink;
	
	@FindBy(xpath = "//a[div[text()='REPORTS']]")
	WebElement reportsLink;
	
	
	@FindBy(id = "logoutLink")
	WebElement logoutLink;
	
	public void clickOnTasks()
	{
		tasksLink.click();
	}
	
	
	public DashBoardPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		logoutLink.click();
	}
}
