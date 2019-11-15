package com.ita.actitime.basic.js;

import org.openqa.selenium.JavascriptExecutor;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class JavaScriptExecutorDemo extends ActitimeUtils
{

	public static void main(String[] args) {
		
		driver = getMyDriver();
		launch("http://formy-project.herokuapp.com/scroll");
		JavascriptExecutor js  =  (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, 1000);");
		
		
		
		
		//launch()
	}
}
