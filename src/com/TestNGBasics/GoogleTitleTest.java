package com.TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test()
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google123","Testcase is failed");
	}
	@Test()
	public void getLogo() {
		boolean ba=driver.findElement(By.id("hplogo")).isDisplayed();
		
		Assert.assertTrue(ba);
		//Assert.assertEquals(ba, true);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
