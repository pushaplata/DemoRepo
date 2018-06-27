package com.TestDataProviser;


import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DataProviderTest extends InitiateDriver {
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData1=ExcelUtil.getDataFromExcel();
		return testData1.iterator();
		
	}

	@Test(dataProvider="getTestData")
	
	public void RegisterationPage(String Name,String Username, String Password,String ConfirmPassword,String EmailAddress) {
		Logger log= Logger.getLogger(DataProviderTest.class);
		driver.findElement(By.id("jform_name")).clear();
		driver.findElement(By.id("jform_name")).sendKeys(Name);
		
		driver.findElement(By.id("jform_username")).clear();
		driver.findElement(By.id("jform_username")).sendKeys(Username);
		
		driver.findElement(By.id("jform_password1")).clear();
		driver.findElement(By.id("jform_password1")).sendKeys(Password);
		
		driver.findElement(By.id("jform_password2")).clear();
		driver.findElement(By.id("jform_password2")).sendKeys(ConfirmPassword);
		
		driver.findElement(By.id("jform_email1")).clear();
		driver.findElement(By.id("jform_email1")).sendKeys(EmailAddress);
		
		driver.findElement(By.id("jform_email2")).clear();
		driver.findElement(By.id("jform_email2")).sendKeys(EmailAddress);
		
	}
	
	
	
	
	
	


}
