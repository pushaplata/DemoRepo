package com.TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	@BeforeSuite
	public void setup() {
		System.out.println("setup");
		
	}
	@BeforeTest
	public void lauchbrwser() {
		System.out.println("launch browser");
		
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login");
		
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("URL");
		
	}
	@Test
	public void googlelogoTest() {
		System.out.println("Gogle loogoTest");
	}
	
	@Test
	public void TitleTest() {
		System.out.println("google title");
	}
	@Test
	public void TsearchTest() {
		System.out.println("search teste");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	@AfterClass
	public void logoutfromapp() {
		System.out.println("logout fromApp");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete cookies");
		}
	
	@AfterSuite
	public void closeBroeser() {
		System.out.println("close the browser");
	}
	/*setup
launch browser
URL
login
google title
logout
login
search teste
logout
logout fromApp
delete cookies
PASSED: TitleTest
PASSED: TsearchTest
*/
		
		
		
		
		
		
	

}
