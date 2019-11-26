package com.ita.pom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomerPage {

	WebDriver driver = null;
	@FindBy(id = "customerLightBox_nameField")
	WebElement cnTextBox;
	
	@FindBy(id = "customerLightBox_descriptionField")
	WebElement cdTextBox;
	
	@FindBy(id = "customerLightBox_commitBtn")
	WebElement ccButton;	
	
	
	public void createCustomer(String cn, String cd)
	{
		cnTextBox.sendKeys(cn);
		cdTextBox.sendKeys(cd);
		ccButton.click();
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success Message " + ele.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
	}
	
	public CreateCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
