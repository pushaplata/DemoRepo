package com.UloadFile.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
         driver.get("https://www.jabong.com/");
         
        
      
	}

		

	
}
