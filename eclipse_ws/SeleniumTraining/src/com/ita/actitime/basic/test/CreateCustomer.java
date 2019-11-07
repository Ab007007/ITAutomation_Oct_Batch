package com.ita.actitime.basic.test;

import java.io.IOException;

import com.ita.actitime.basic.utils.ActitimeUtils;
import com.ita.actitime.basic.utils.FileReaderUtils;

public class CreateCustomer extends ActitimeUtils
{
	static
	{
		driver = getMyDriver();
	}
	public static void main(String[] args) throws IOException
	{
		System.out.println("Creating customer");
		launch();
		String username = FileReaderUtils.getMyPropertyValue("username"); 
		String password = FileReaderUtils.getMyPropertyValue("password"); 
		login(username,password);
		selectModule("Tasks");
		clickOnNewCustomerButton();
		createCustomer("ITA-FourthCustomer", "ITA-FourthCustomer-Desc");
		logout();
		
	}
}
