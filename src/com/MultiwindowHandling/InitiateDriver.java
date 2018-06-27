package com.MultiwindowHandling;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitiateDriver {
	
	 WebDriver driver;
        @BeforeMethod
		public void setup() {
			
	            System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
		        driver= new ChromeDriver();
		        
		        driver.get("https://www.ebay.in");
		        
		        Select sel= new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		        sel.deselectByIndex(5);
		        
		       /* driver.findElement(By.xpath("//a[contains(text(),'Wealth')]")).click();
		        WebElement wb= driver.findElement(By.xpath("//a[contains(text(),'Fair Practice Code for Lenders')]"));
		        List <WebElement> list= driver.findElements(By.xpath("//a"));
		        System.out.println(list.size());
		        for(WebElement w:list) {
		        	System.out.println(w.getText());
		      
		        }
		        Actions act= new Actions(driver);
		        act.moveToElement(wb).perform();
		        driver.findElement(By.xpath("//a[contains(text(),'Fair Practice Code for Lenders')]")).click();
		        System.out.println(driver.getTitle());*/
		        
		   //  .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		        
		       
		}
@AfterMethod
public void teardown() {
	driver.quit();
}

}
