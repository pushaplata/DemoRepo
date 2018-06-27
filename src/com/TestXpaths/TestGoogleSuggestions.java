package com.TestXpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGoogleSuggestions {
	static WebDriver driver;
	
	public static void main(String[] args) {
		 
	    System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
        
       driver.get("https://www.google.com/");
	
	
	
	
	
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("testing");
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println(list.size());
		
		for(int i=0; i<=list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("testing techniques")) {
				list.get(i).click();
				break;
			}
			
		}
	}
}
	

