package com.ita.pom.utils;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyUtils {

	
	public static String getCurrentDateAndTime() {
		Date d = new Date();

		String date = d.toString();

		date = date.replace(" ", "_").replace(":", "_");
		
		return date;
	}
	
	public static void verifyTitile(WebDriver driver ,String expectedTitle)
	{
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
}
