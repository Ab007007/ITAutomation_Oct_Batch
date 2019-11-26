package com.ita.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "username")
	WebElement usernameTextbox;
	
	@FindBy(name = "pwd")
	WebElement passwordTextbox;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	
	public void loginToActiTime(String un, String pwd)
	{
		usernameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pwd);
		loginButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public LoginPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
}
