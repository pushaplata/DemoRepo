package com.TestXpaths;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TestFunctiosInXpath {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://www.thetestingworld.com/index.php?option=com_content&view=article&id=144&Itemid=516");
        
        driver.findElement(By.xpath("//a[contains(text(),'FUNCTIONAL AUTOMATION')]/parent::li//following-sibling::li[@class='item-718']")).click();
      
        File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file, new File("G:\\SweetyWP\\AutomationTesting\\src\\ScreenShots\\123.jpg"));
       
        
        
	

}
}
