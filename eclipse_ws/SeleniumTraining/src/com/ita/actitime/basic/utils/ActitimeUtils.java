package com.ita.actitime.basic.utils;


public class ActitimeUtils extends WebDriverUtils
{
	public static void launch(String url)
	{
		System.out.println("Launching the applcation " + url);
		driver.get(url);
	}

}
