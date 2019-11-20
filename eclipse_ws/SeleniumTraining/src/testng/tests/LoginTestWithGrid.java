package testng.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.ita.actitime.basic.utils.ActitimeUtils;
import com.ita.actitime.basic.utils.WebDriverUtils;


public class LoginTestWithGrid
{
	static WebDriver driver = null;
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		String nodeUrl = "http://192.168.0.85:5556/wd/hub";
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.addArguments("disable-infobars");
		
		
		driver = new RemoteWebDriver(new URL(nodeUrl),options);
		WebDriverUtils.driver = driver; 
		
		ActitimeUtils.launch();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.logout();
		
		
		
	}
}
