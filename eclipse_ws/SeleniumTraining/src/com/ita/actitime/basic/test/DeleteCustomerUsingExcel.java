package com.ita.actitime.basic.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.actitime.basic.utils.ActitimeUtils;
import com.ita.actitime.basic.utils.ExcelUtils;
import com.ita.actitime.basic.utils.FileReaderUtils;

public class DeleteCustomerUsingExcel extends ActitimeUtils
{

	static
	{
		driver = getMyDriver();
	}
	
	public static void main(String[] args) throws IOException
	{
		String customerName =null;
		System.out.println("Creating customer");
		launch();
		String username = FileReaderUtils.getMyPropertyValue("username"); 
		String password = FileReaderUtils.getMyPropertyValue("password"); 
		login(username,password);
		int rowCount = ExcelUtils.getRowCount("customer");
		for(int i = 1; i< rowCount ; i++)
		{
			selectModule("Tasks");
			customerName = ExcelUtils.getMyExcelValue("customer", i, 0);
			searchCustomerToDelete(customerName);
			deleteCustomer();
			selectModule("Reports");
		}
		logout();
	}

	
	
}
