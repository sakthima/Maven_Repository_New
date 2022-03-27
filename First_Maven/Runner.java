package com.First_Maven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner extends Base_Class {
	 
	public static void main(String[] args) {
		
		browser_Launch();
		url("facebook.com");
//		sendkeys(element, "Sakthi");
//		close();
//		quit();
//		to("instagram.com");
//		back();
//		forward();
//		refresh();
//		alerts();
//		alerts1();
//		alerts2("Sakthi@123");
//		click();
//		double_Click();
//		context_Click();
//		moveto_Element(element);
//		drag_And_Drop(source, target);
//		robot1();
//		robot2();
//		frames("iframe");
//		frames1(2);
//		frames2(frameElement);
//		window_Handles(element);
//		dropdown(0);
//		dropdown1("Greens");
//		dropdown2("Greens");
//		check_Box(element);
//		is_Enable(element);
//		is_Display(element);
//		is_Select(element);
//		get_Options();
//		get_Title();
//		get_Currenturl();
//		get_Text(element);
//		get_Attribute(element, name);
//		wait1();
//		wait2(element);
//		screen_Shot();
//		scroll_Down();
//		scroll_Up();
//		get_First();
//		get_All();
//		is_Multiple();
//		click_Basic(element);
//		radio_Button(element);	
//	}
//
//}
//
//
//
//System.setProperty("webdriver.chrome.driver",
//		"C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\Driver\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.facebook.com/");
//driver.manage().window().maximize();
//Thread.sleep(2000);
//
//TakesScreenshot ts = (TakesScreenshot) driver;
//File source = ts.getScreenshotAs(OutputType.FILE);
//File des = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\Screenshot\\Screenshot\\fb.png");
//FileUtils.copyFile(source, des);
