package testPOM;

import org.testng.annotations.Test;

public class TestCase02 extends BaseClass {
	
	@Test(enabled = false)
	public void TC02() throws InterruptedException  
	{
		LoginPage lp= new LoginPage(driver);
		          lp.ClickLoginButton(driver);
		          lp.UserName("Pushap","aavya@1234");
		          //lp.Password("aavya@1234");
		          lp.Submit();
		          
	}

}
