package com.ita.actitime.basic.switchTo;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class ActitimeAlertDemo extends ActitimeUtils
{

	public static void main(String[] args) {
		
		driver =  getMyDriver();
		launch("http://localhost/login.do");
		login("admin","manager");
		clickOnElement("xpath", "//div[text()='TASKS']/parent::a");
		clickOnElement("xpath", "//div[@class='addNewContainer']");
		clickOnElement("xpath", "//div[contains(text(),'New Customer')]");
		typeOnElement("id", "customerLightBox_nameField", "Junk");
		
		clickOnElement("id", "customerLightBox_cancelBtn");
		
		String msg = driver.switchTo().alert().getText();
		
		System.out.println("msg : " + msg);
		
		driver.switchTo().alert().dismiss();
		
		clickOnElement("id", "customerLightBox_cancelBtn");
		
		driver.switchTo().alert().accept();
		
	}
}
