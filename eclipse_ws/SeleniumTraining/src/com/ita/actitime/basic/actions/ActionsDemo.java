package com.ita.actitime.basic.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.ita.actitime.basic.utils.ActitimeUtils;
import com.ita.actitime.basic.utils.WebDriverUtils;

public class ActionsDemo extends ActitimeUtils 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		driver = getMyDriver();
		launch("http://localhost/login.do");
		
		Actions act =  new Actions(driver);
		act.sendKeys("admin").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys("manager").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		
	}

}
