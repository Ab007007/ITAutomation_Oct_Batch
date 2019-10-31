package com.ita.actitime.basic.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo 
{

	public static void main(String[] args) {
		System.out.println("Welcome to Form filling Application...");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/ITA/ITAutomation_Oct_Batch/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.xpath("//p[@id='demo']")))
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() 
		{

			@Override
			public Boolean apply(WebElement ele) {
				if(!(ele.getText().equals("Hello")))
				{
					System.out.println("Waiting!!!!!!");
					return false;
				}
				else
				{
					System.out.println("Displayed !!!!");
					return true;
				}
			}
		};
		
		wait.until(fun);
		
		
		String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Message dispalyed is : " + msg);
		
		String msg2 = driver.findElement(By.xpath("//p[@id='demo2']")).getText();
		System.out.println(msg2);
				
		
	}
}
