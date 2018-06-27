package testPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class RegisterationPage {
	@FindBy(linkText="Registration") WebElement Reg_Link;
	@FindBy(name="jform[name]") WebElement Name_01;
	@FindBy(id="jform_username") WebElement User_Name;
	@FindBy(id="jform_password1") WebElement Pass_Word;
	@FindBy(id="jform_password2") WebElement Conf_Password;
	@FindBy(id="jform_email1") WebElement mail_Address;
	@FindBy(id="jform_email2") WebElement Conf_mailAddress;
	@FindBy(className="validate") WebElement Submit_Button;
	
	
	
	
	public void registeration() throws InterruptedException {
		Reg_Link.click();
		Thread.sleep(2000);
	}
	
	public void testname(String namel) {
		
		Name_01.sendKeys(namel);
	}
	
    public void username(String Username) {
	
    	User_Name.sendKeys(Username);
}
  
    public void password(String Password) {
    	
    	Pass_Word.sendKeys(Password);
}
    
    public void confirmPassword(String confPasword) {
    	
    	Conf_Password.sendKeys(confPasword);
}    

    public void emailAddress(String mailAddress) {
    	
    	mail_Address.sendKeys(mailAddress);
}     

    public void comfirmEmailAddress(String confMailAddress) {
	
    	Conf_mailAddress.sendKeys(confMailAddress);
}  
    
    public void ClicRegButton() {
    	
    	Submit_Button.click();
    }  
}
