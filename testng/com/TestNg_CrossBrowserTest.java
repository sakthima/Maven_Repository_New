package com.testng.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_CrossBrowserTest {
	
	static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeLogin(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\Driver99\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome Browser");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\Driver1\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 Thread.sleep(5000);
			System.out.println("Firefox Browser");
		} else {
			System.out.println("Invalid Browser");
		}
	}

	@Test
	public void loginMethod() {
		System.out.println("Login");
	}


	@AfterClass
	public void afterLogin() {
		
		System.out.println("Close Browser");
		driver.close();
	}
	
	
	
	

}
