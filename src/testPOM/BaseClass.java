package testPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void BrowserLaunch() {
	
		System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.get("http://www.thetestingworld.com/");
	}
	@AfterMethod
	public void teardown() {
	
	driver.close();
}
}
	
