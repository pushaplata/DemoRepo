package com.MultiwindowHandling;

import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowHAandle extends InitiateDriver {
	@Test
	public void TC_001()  {
		String mainwondow="";
		
	Set<String> handles=driver.getWindowHandles();
	
	 for(String s: handles) {
		 System.out.println(s);
		 
		 driver.switchTo().window(s);
		 System.out.println(driver.getTitle());
		 if(driver.getTitle().equalsIgnoreCase("RBS")) 
		 {
			  mainwondow=s;
		
	        }
		 
			 driver.switchTo().window(mainwondow);
		 
	}
	

	}
}

