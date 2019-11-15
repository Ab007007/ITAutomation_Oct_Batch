package com.ita.actitime.basic.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class JavaScriptExecutorScrollToView extends ActitimeUtils
{

	public static void main(String[] args) {
		
		driver = getMyDriver();
		launch("http://formy-project.herokuapp.com/scroll");
		JavascriptExecutor js  =  (JavascriptExecutor) driver;
		
		WebElement ele = getMyElement("id", "name");
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
		
		//launch()
	}
}
