package com.ita.actitime.basic.tooltips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipInActiTime 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		String toolTip = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
		
		System.out.println(toolTip);
		Thread.sleep(3000);
		driver.close();
	}

}
