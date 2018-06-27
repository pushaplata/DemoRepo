package com.TestDataProviser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotaion {
	WebDriver driver;
	@Test
	@Parameters({"Name","Username"})
	public void Login(String Name, String Username) {
		 
	    System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
         driver.get("http://www.thetestingworld.com/index.php?option=com_users&view=registration&Itemid=588");
         
         
         driver.findElement(By.id("jform_name")).clear();
 		driver.findElement(By.id("jform_name")).sendKeys(Name);
 		
 		driver.findElement(By.id("jform_username")).clear();
 		driver.findElement(By.id("jform_username")).sendKeys(Username);
 		
	}

}
