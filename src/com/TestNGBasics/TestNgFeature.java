package com.TestNGBasics;

import org.testng.annotations.Test;

public class TestNgFeature {
	@Test
	public void LoginTest() {
		System.out.println("login Test");
		int a=6/0;
	}
	@Test(dependsOnMethods="LoginTest")
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	@Test(dependsOnMethods="LoginTest")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	@Test(dependsOnMethods="LoginTest")
	public void RegPageTest() {
		System.out.println("Reg Page Test");
	}
}
