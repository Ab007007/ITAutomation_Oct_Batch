package com.ita.actitime.basic.tooltips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to Auto Suggestions Demo...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	
		String toolTip = driver.findElement(By.xpath("//a[@class='gb_B gb_pc']")).getAttribute("title");
		
		System.out.println(toolTip);
		driver.close();
	}

}
