package com.ita.actitime.basic.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ActitimeUtils extends WebDriverUtils {
	public static void launch() {
		System.out.println("Launching Actitime applcation by Default ");
		driver.get("http://localhost/login.do");
	}

	public static void launch(String url) {
		System.out.println("Launching the applcation " + url);
		driver.get(url);
	}

	public static void login(String un, String pwd) {
		System.out.println("Logging into the application with " + un + " and " + pwd);
		typeOnElement("id", "username", un);
		typeOnElement("name", "pwd", pwd);
		clickOnElement("id", "loginButton");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}

	public static void clickOnHelp() {
		System.out.println("--- clicking on Help icon ---");
		Actions act = new Actions(driver);
		act.click(getMyElement("xpath", "//div[@class='popup_menu_button popup_menu_button_support']")).perform();
		;

	}

	public static void logout() {
		clickOnElement("id", "logoutLink");
	}

	public static void selectModule(String type) 
	{
		System.out.println("Selecting Module " + type);
		clickOnElement("xpath", "//a[div[text()='" + type.toUpperCase() + "']]");
		
	}

	
	public static void clickOnNewCustomerButton()
	{
		System.out.println("Clicking on New Customer Button to create a customer");
		clickOnElement("xpath", "//div[@class='addNewContainer']");
		clickOnElement("xpath", "//div[contains(text(),'New Customer')]");
		
		if(getMyElementText("id", "customerLightBox_titlePlaceholder").contentEquals("Create New Customer"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	
	public static void createCustomer(String cn, String cd)
	{
		System.out.println("Creating a customer with Customer name " + cn + " and Customer Desc " + cd);
		typeOnElement("id", "customerLightBox_nameField", cn);
		typeOnElement("id", "customerLightBox_descriptionField", cd);
		clickOnElement("id", "customerLightBox_commitBtn");
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		
		System.out.println("Success Message " + ele.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		
		
	}
	
	public static void searchCustomerToDelete(String customerName) {
		typeOnElement("xpath", "//div[@class='customersProjectsPanel']//input[@placeholder='Start typing name ...']", customerName);
		staticWait(2000);
		Actions act = new Actions(driver);
		act.moveToElement(getMyElement("xpath", "//div[@class='itemsContainer']//div[@class='title' and contains(text(),'" + customerName + "')]")).perform();
		act.click(getMyElement("xpath", "//div[@class='itemsContainer']//div[@class='title' and contains(text(),'" + customerName + "')]/following-sibling::div"))
		.perform();
		staticWait(2000);
	}
	
	public static void deleteCustomer() {
		clickOnElement("xpath", "//div[@class='customerNamePlaceHolder']/following-sibling::div");
		clickOnElement("xpath", "//div[div[@class='customerNamePlaceHolder']]/following-sibling::div[@class='dropdownContainer actionsMenu']//div[text()='Delete']");
		clickOnElement("id", "customerPanel_deleteConfirm_submitTitle");
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		System.out.println("Success Message " + ele.getText());
		wait.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		//getMyElement("xpath", "//div[@class='customersProjectsPanel']//input[@placeholder='Start typing name ...']").clear();
	}

}
