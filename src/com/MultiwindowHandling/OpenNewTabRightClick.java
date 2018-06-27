package com.MultiwindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenNewTabRightClick {
	
	WebDriver driver;
    @Test
	public void setup() throws InterruptedException {
		
            System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("http://automate-apps.com/");
	        System.out.println(driver.getTitle());
	        Actions action = new Actions(driver);
	        WebElement element = driver.findElement(By.linkText("SELENIUM QUESTIONS"));
	        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	       /* Set<String> winid = driver.getWindowHandles();
	        Iterator<String> iter = winid.iterator();
	        iter.next();
	        String tab = iter.next();
	        driver.switchTo().window(tab);
	        System.out.println(driver.getTitle());*/
	        //driver.quit();
}
}
