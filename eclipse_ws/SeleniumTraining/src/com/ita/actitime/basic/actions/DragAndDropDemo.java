package com.ita.actitime.basic.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class DragAndDropDemo extends ActitimeUtils
{

	
	public static void main(String[] args) {
		
		driver = ActitimeUtils.getMyDriver();
		launch("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement srcWebEle = driver.findElement(By.id("draggable"));
		WebElement destWebEle = driver.findElement(By.id("droppable"));
		act.dragAndDrop(srcWebEle, destWebEle).perform();
		
		
	}
}
