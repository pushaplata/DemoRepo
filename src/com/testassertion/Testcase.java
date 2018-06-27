package com.testassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase {
	
	SoftAssert softAssert= new SoftAssert();
	
	@Test
	public void test1() {
		System.out.println("Open Browser");
		Assert.assertEquals(true,true);
		
		System.out.println("Enter UserName");
		System.out.println("Enter Password");
		System.out.println("Click on Sign in Button");
		
		Assert.assertEquals(true,true);
		System.out.println("Validate Home Page");
		
		softAssert.assertEquals(true,false);
		
		System.out.println("go to deal age");
		System.out.println("go to deal age1");
		softAssert.assertEquals(true,false);
		
		System.out.println("go to deal age3");
		System.out.println("go to deal age4");
		
		softAssert.assertEquals(true,false);
		System.out.println("go to deal ag3e");
		
		softAssert.assertAll();
		
		
	}

}
