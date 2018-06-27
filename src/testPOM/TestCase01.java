package testPOM;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase01 extends BaseClass  {
	
	@Test
	    public void TC01() throws InterruptedException 
	    {
		//PageFactory.initElements(driver, LoginPage.class);
	    RegisterationPage reg = PageFactory.initElements(driver, RegisterationPage.class);
	                      reg.registeration();
	                      reg.testname("sweety");
	                      reg.username("Pushaplata");
	                      reg.password("aavya");
	                      reg.confirmPassword("aavya");
	                      reg.emailAddress("sweetythakur208@gmail.com");
	                      reg.comfirmEmailAddress("sweetythakur208@gmail.com");
	                      reg.ClicRegButton();
	                      
	    
		
		
	}

}

