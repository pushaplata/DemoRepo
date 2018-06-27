package com.dataDriven.test;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParamterizdTest {
	
	public static void main(String[] args) {
		//Logger log1= Logger.getLogger(ParamterizdTest.class);

		 System.setProperty("webdriver.chrome.driver", "G:\\SweetyWP\\AutomationTesting\\chromedriver_win32 (1)\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	         driver.get("http://www.thetestingworld.com/index.php?option=com_users&view=registration&Itemid=588");
		
		Xls_Reader reader= new Xls_Reader("G:\\SweetyWP\\AutomationTesting\\src\\com\\testData\\testdata.xlsx");
		
		int rowCount= reader.getColumnCount("RegPage");
		reader.addColumn("RegPage", "Status");
	
		
		for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			System.out.println("************");
			
			String Name= reader.getCellData("RegPage", 0, rowNum);
			System.out.println(Name);
			
			
			String Username= reader.getCellData("RegPage", 1, rowNum);
			System.out.println(Username);
			
			String Password= reader.getCellData("RegPage", 2, rowNum);
			System.out.println(Password);
			
			String ConfirmPassword= reader.getCellData("RegPage", 3, rowNum);
			System.out.println(ConfirmPassword);
			
			String EmailAddress= reader.getCellData("RegPage", 4, rowNum);
			System.out.println(EmailAddress);
			
			
		         
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
				driver.findElement(By.id("jform_email22")).sendKeys(EmailAddress);
				
		 		reader.setCellData("RegPage", "Status", rowNum, "Pass");
		 		//log1.info("this is iformation");
			
			
		}
		

}

}