package com.testrunner.com;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.com.Base_Class1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature\\com", glue = "com.stepdefinition.com", plugin = {"pretty","html:Report/Cucumber_Html_Report",
		"json:Report/Cucumber_Json_Report.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/Cucumber_Extend_Report.html"}, monochrome = true, 
dryRun = false, strict = false)
//tags = {"~@smoketest","~@smoketest1"})

public class AdactinRunner1 {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Base_Class1.browser_Launch("chrome");

	}

	@AfterClass
	public static void tearDown() throws IOException {
		// Base_Class1.screenShot("sscucum");
		// Base_Class1.close();
	}

}
