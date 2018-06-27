package com.ClearTrip.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.crypto.Data;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.collections.test.Employee;

public class ClearTripFlightBook {
	
	  static WebDriver driver;
	  public static String credentials;
	  public static String credentialsInfo[];
	  
	@BeforeMethod
	public void yahooLogin() throws InterruptedException  {
		 
	    System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        
        driver.findElement(By.xpath("//span[contains(text(),'Your trips')]")).click();
 		driver.findElement(By.xpath("//input[@id='SignIn']")).click();
 		
 	//Thread.sleep(3000);
	}
	
	@Test
	public void login() {
		
	    driver.switchTo().activeElement();
	    credentials=HashMapMain.ClearTripCredential().get("customer");
	    credentialsInfo= credentials.split("_");	

	
	
		
		driver.findElement(By.id("email")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(credentialsInfo[1]);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	@AfterMethod
	public void teardown() {
	
	//driver.quit();
}
	
	
	

}
