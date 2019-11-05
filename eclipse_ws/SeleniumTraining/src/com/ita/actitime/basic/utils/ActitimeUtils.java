package com.ita.actitime.basic.utils;


public class ActitimeUtils extends WebDriverUtils
{
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
	}
}
