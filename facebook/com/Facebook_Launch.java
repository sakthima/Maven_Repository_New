package com.facebook.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.Base_Class1;

public class Facebook_Launch extends Base_Class1{
	
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver=browser_Launch("chrome");
		url("https://www.facebook.com/");
//		WebElement email = driver.findElement(By.id("email"));
//		sendkeys(email, "sakthivelu470@gmail.com");
//		WebElement pass = driver.findElement(By.id("pass"));
//		sendkeys(pass, "9786243038");
//		WebElement login = driver.findElement(By.name("login"));
//		click(login);
//		WebElement acc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		click(acc);
//		Thread.sleep(3000);
//		WebElement day = driver.findElement(By.id("day"));
//		dropdown(day, "value", "10");
//		WebElement plus = driver.findElement(By.xpath("//i[@class='img sp_gMujFo71RwJ sx_25f620']"));
		scroll_UpDown(3000);
//		screenShot("ss");
		
		
		

	}

}
