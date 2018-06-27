package DDFramwork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
	
	ChromeDriver driver;
	 public TestPage(ChromeDriver driver){
	 this.driver= driver;
		
	}
	
	 
public void EnterData(String Name,String Username) {
		
		driver.findElement(By.id("jform_name")).clear();
		driver.findElement(By.id("jform_name")).sendKeys(Name);
		
		driver.findElement(By.id("jform_username")).clear();
		driver.findElement(By.id("jform_username")).sendKeys(Username);
		
		

	
}
}