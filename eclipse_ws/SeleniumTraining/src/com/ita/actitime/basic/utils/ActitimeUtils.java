package com.ita.actitime.basic.utils;

import org.openqa.selenium.interactions.Actions;

public class ActitimeUtils extends WebDriverUtils
{
	public static void launch()
	{
		System.out.println("Launching Actitime applcation by Default ");
		driver.get("http://localhost/login.do");
	}

	public static void launch(String url)
	{
		System.out.println("Launching the applcation " + url);
		driver.get(url);
	}
	
	public static void login(String un, String pwd)
	{
		System.out.println("Logging into the application with " + un + " and " + pwd);
		typeOnElement("id", "username", "admin");
		typeOnElement("name", "pwd", "manager");
		clickOnElement("id", "loginButton");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickOnHelp()
	{
		System.out.println("--- clicking on Help icon ---");
		Actions act =  new Actions(driver);
		act.click(getMyElement("xpath", "//div[@class='popup_menu_button popup_menu_button_support']")).perform();;
		
	}
	
	public static void logout()
	{
		clickOnElement("id", "logoutLink");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
