package com.TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test(priority=3,groups="Tilte")
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1,groups="Logo")
	public void GoogleLogoTest() {
		boolean ba=driver.findElement(By.id("hplogo")).isDisplayed();
	}
	@Test(priority=2,groups="mailLink")
	public void mailLinkTest() {
		boolean bl=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4,groups="Test")
	public void Test1() {
		System.out.println("test1");
	}
	@Test(priority=6)
	public void Test2() {
		System.out.println("test2");
	}
	@Test(priority=5)
	public void Test3() {
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
