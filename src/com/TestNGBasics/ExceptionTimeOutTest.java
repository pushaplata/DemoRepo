package com.TestNGBasics;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	@Test(expectedExceptions=NumberFormatException.class)
	
	public void infinitLoop() {
		
		String i="100A";
		Integer.parseInt(i);
	}
	

}
