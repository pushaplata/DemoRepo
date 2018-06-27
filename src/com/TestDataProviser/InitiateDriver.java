package com.TestDataProviser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitiateDriver {

	WebDriver driver;
	@BeforeMethod
	public void yahooLogin() {
		 
	    System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
         driver.get("http://www.thetestingworld.com/index.php?option=com_users&view=registration&Itemid=588");
	}
	
	@AfterMethod
	public void teardown() {
	
	driver.quit();
}
}
