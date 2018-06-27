package com.UloadFile.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
         driver.get("https://www.naukri.com/");
         
         driver.findElement(By.xpath("//").click();
         driver.switchTo().activeElement();
         driver.findElement(By.id("eLoginNew")).sendKeys("sweetythakur208@gmail.com");

	}
}
