package com.ita.actitime.basic.test;

import java.io.IOException;

import com.ita.actitime.basic.utils.ActitimeUtils;
import com.ita.actitime.basic.utils.ExcelUtils;
import com.ita.actitime.basic.utils.FileReaderUtils;

public class CreateCustomerUsingExcel extends ActitimeUtils
{
	static
	{
		driver = getMyDriver();
	}
	
	public static void main(String[] args) throws IOException
	{
		String cn,cd;
		System.out.println("Creating customer");
		launch();
		String username = FileReaderUtils.getMyPropertyValue("username"); 
		String password = FileReaderUtils.getMyPropertyValue("password"); 
		login(username,password);
		selectModule("Tasks");
		
		int rowCount = ExcelUtils.getRowCount("customer");
		for(int i = 1; i< rowCount ; i++)
		{
			cn = ExcelUtils.getMyExcelValue("customer", i, 0);
			cd = ExcelUtils.getMyExcelValue("customer", i, 1);
			clickOnNewCustomerButton();
			createCustomer(cn,cd);
			
		}
		
		logout();
		
	}
}
