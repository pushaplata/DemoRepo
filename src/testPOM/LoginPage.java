package testPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage  {
	
	 ChromeDriver driver;
	 public LoginPage(ChromeDriver driver){
	 this.driver= driver;
	}
	
	 public void ClickLoginButton(ChromeDriver driver) {
	driver.findElementByLinkText("Login").click();
		
	}
	 public void UserName(String usname, String pword) throws InterruptedException {
		 driver.findElementById("username").sendKeys(usname);
		 driver.findElementById("password").sendKeys(pword);
		 Thread.sleep(2000);
		}
	 
	 public void Submit() {
		 driver.findElement(By.className("button")).click();
	 }

}
