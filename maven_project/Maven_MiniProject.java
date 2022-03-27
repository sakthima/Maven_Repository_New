package com.maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.Base_Class1;

public class Maven_MiniProject extends Base_Class1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		driver=browser_Launch("chrome");
		url("https://www.google.com/");
		WebElement google = driver.findElement(By.name("q"));
		sendkeys(google, "adactin");
		wait1(5);
		WebElement search = driver.findElement(By.name("btnK"));
		click(search);
		WebElement link = driver.findElement(By.xpath("//h3[text()='Adactin.com - Hotel Reservation System']"));
		click(link);
		WebElement user = driver.findElement(By.id("username"));
		sendkeys(user, "sakthivelu");
		WebElement pass = driver.findElement(By.id("password"));
		sendkeys(pass, "sakthi@123");
		WebElement login = driver.findElement(By.id("login"));
		click(login);
		WebElement location = driver.findElement(By.id("location"));
		dropdown(location, "value", "New York");
		WebElement hotel = driver.findElement(By.name("hotels"));
		dropdown(hotel, "visible", "Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.name("room_type"));
		dropdown(roomtype, "index", "4");
		WebElement rooms = driver.findElement(By.name("room_nos"));
		dropdown(rooms, "value", "2");
		dropdown(rooms, "visible", "4 - Four");
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		clear(checkin);
		sendkeys(checkin, "05/03/2022");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		clear(checkout);
		sendkeys(checkout, "06/03/2022");
		WebElement adult = driver.findElement(By.name("adult_room"));
		dropdown(adult, "index", "2");
		WebElement children = driver.findElement(By.name("child_room"));
		dropdown(children, "value", "2");
		WebElement searchbtn = driver.findElement(By.name("Submit"));
		click(searchbtn);
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		click(radio);
		WebElement continu = driver.findElement(By.name("continue"));
		click(continu);
		WebElement first = driver.findElement(By.name("first_name"));
		scroll_UpDown1(first);
		sendkeys(first, "sakthi");
		WebElement last = driver.findElement(By.name("last_name"));
		sendkeys(last, "velu");
		WebElement adress = driver.findElement(By.name("address"));
		sendkeys(adress, "No.14,Kamarajar Nagar,Korattur,Chennai-80");
		WebElement credit = driver.findElement(By.name("cc_num"));
		sendkeys(credit, "1234123412341234");
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		dropdown(cardtype, "index", "2");
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		dropdown(month, "value", "12");
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		dropdown(year, "visible", "2022");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		sendkeys(cvv, "1234");
		WebElement book = driver.findElement(By.name("book_now"));
		click(book);
		WebElement iti = driver.findElement(By.name("my_itinerary"));
		scroll_UpDown1(iti);
		click(iti);
		WebElement logout = driver.findElement(By.name("logout"));
		scroll_UpDown1(logout);
		click(logout);
		screenShot("Maven_MP_");
		
		
	}

}
