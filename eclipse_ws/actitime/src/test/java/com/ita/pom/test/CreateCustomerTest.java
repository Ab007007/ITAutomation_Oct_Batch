package com.ita.pom.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ita.pom.page.CreateCustomerPage;
import com.ita.pom.page.DashBoardPage;
import com.ita.pom.page.LoginPage;
import com.ita.pom.page.TasksPage;
import com.ita.pom.utils.BaseTest;
import com.ita.pom.utils.MyUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerTest extends BaseTest
{
	LoginPage lp = null;
	DashBoardPage dp = null;
	TasksPage tp = null;
	CreateCustomerPage cp = null;
	
	
	@BeforeClass
	public void initializePages()
	{
		System.out.println("Create page objects..");
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
		tp = new TasksPage(driver);
		cp = new CreateCustomerPage(driver);
		
	}
	
	@BeforeMethod
	public void login()
	{
		test = reports.startTest("Before test - Login Functionality" );
		driver.get("http://localhost/login.do");
		test.log(LogStatus.INFO	, "Login with default credentials ");
		lp.loginToActiTime("admin", "manager");
		MyUtils.verifyTitile(driver, "actiTIME - Enter Time-Track");
		test.log(LogStatus.PASS, "Login to application Successfully");
		reports.endTest(test);
	}
	
	@Test
	public void createCustomer()
	{
		test = reports.startTest("create Customer Test " );
		test.log(LogStatus.INFO	, "Creating Customer Test ");
		dp.clickOnTasks();
		test.log(LogStatus.PASS, "clicking on  tasks is complete");
		
		tp.clickOnNewCustomerButton();
		test.log(LogStatus.PASS, "clicking on  Create Customer complete");
		
		cp.createCustomer("POM-Cust-1", "POM-Cust-Desc");
		test.log(LogStatus.PASS, "Customer Created Successfully");
		reports.endTest(test);
		
	}
	
	@AfterMethod
	public void logout()
	{
		test = reports.startTest("Logout " );
		test.log(LogStatus.INFO	, "Logging out of test ");
		dp.logout();
		test.log(LogStatus.PASS, "Logout Successfully");
		reports.endTest(test);
	}

}
