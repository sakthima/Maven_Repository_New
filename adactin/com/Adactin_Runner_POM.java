package com.adactin.com;

import org.openqa.selenium.WebDriver;

import com.base.com.Base_Class1;
import com.pageobjectmanager.PageObjectManager;

public class Adactin_Runner_POM extends Base_Class1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=browser_Launch("chrome");
		url("https://adactinhotelapp.com/");
		PageObjectManager pom = new PageObjectManager(driver);
		sendkeys(pom.getInstanceLogin().getUsername(), "sakthivelu");
		sendkeys(pom.getInstanceLogin().getPassword(), "sakthi@123");
		click(pom.getInstanceLogin().getLoginBtn());
		dropdown(pom.getInstanceSearch().getLocation(), "value", "New York");
		dropdown(pom.getInstanceSearch().getHotels(), "visible", "Hotel Creek");
		dropdown(pom.getInstanceSearch().getRoomtype(), "index", "3");
		dropdown(pom.getInstanceSearch().getNo_Rooms(), "value", "5");
		clear(pom.getInstanceSearch().getCheckIn());
		sendkeys(pom.getInstanceSearch().getCheckIn(), "06/03/2022");
		clear(pom.getInstanceSearch().getCheckOut());
		sendkeys(pom.getInstanceSearch().getCheckOut(), "07/03/2022");
		dropdown(pom.getInstanceSearch().getAdults(), "visible", "2 - Two");
		dropdown(pom.getInstanceSearch().getChildrens(), "index", "1");
		click(pom.getInstanceSearch().getSearchBtn());
		click(pom.getInstanceSelect().getRadioBtn());
		click(pom.getInstanceSelect().getContinueBtn());
		scroll_UpDown(1000);
		sendkeys(pom.getInstanceBook().getFirstName(), "sakthi");
		sendkeys(pom.getInstanceBook().getLastName(), "velu");
		sendkeys(pom.getInstanceBook().getAddress(), "No.14, Kamarajar Nagar, Korattur, Chennai.");
		sendkeys(pom.getInstanceBook().getCardNo(), "1234567891234567");
		dropdown(pom.getInstanceBook().getCardType(), "visible", "VISA");
		dropdown(pom.getInstanceBook().getExpMonth(), "index", "12");
		dropdown(pom.getInstanceBook().getExpYear(), "index", "12");
		sendkeys(pom.getInstanceBook().getCvv(), "999");
		click(pom.getInstanceBook().getBookBtn());
		scroll_UpDown(3000);
		wait1(5);
		click(pom.getInstanceConfirm().getMyItineraryBtn());
		click(pom.getInstanceLogout().getClickHotel());
		scroll_UpDown(2000);
		click(pom.getInstanceLogout().getLogoutBtn());
	}

}
