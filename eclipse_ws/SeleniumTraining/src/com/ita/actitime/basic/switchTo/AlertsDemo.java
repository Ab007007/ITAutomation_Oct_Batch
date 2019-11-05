package com.ita.actitime.basic.switchTo;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class AlertsDemo extends ActitimeUtils
{

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(" Welcome to popup handler ");
	
		driver = getMyDriver();
		launch("http://formy-project.herokuapp.com/keypress");
		
		//getMyElement("id", "navbarDropdownMenuLink").click()
		clickOnElement("id", "navbarDropdownMenuLink");
		clickOnElement("linktext", "Switch Window");
		if(getMyElement("xpath", "//h1").getText().equals("Switch Window"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		clickOnElement("id", "alert-button");
		String popUpMsg = driver.switchTo().alert().getText();
		System.out.println(popUpMsg);
	
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	
	}
}
