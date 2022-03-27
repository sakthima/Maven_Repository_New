package com.testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Simple_Annotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Setting the Browser");
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Launching the Browser");
	}
	
	@BeforeClass
	public void url() {
		System.out.println("Launching the url");
	}	
	
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	
	@Test
	public void searchMobile() {
		System.out.println("Search for Mobile Phones");
	}	
	
	@Test
	public void searchLaptop() {
		System.out.println("Search for Laptop");
	}	
	
	@AfterMethod
	public void verifyResult() {
		System.out.println("Verify the Test results");
	}
	
	@AfterClass
	private void logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	
	@AfterSuite
	public void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
