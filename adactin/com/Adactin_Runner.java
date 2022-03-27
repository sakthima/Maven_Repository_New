package com.adactin.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.com.Base_Class1;
import com.pom.com.BookHotel;
import com.pom.com.BookingConfirmation;
import com.pom.com.LoginPage;
import com.pom.com.LogoutPage;
import com.pom.com.SearchHotelPage;
import com.pom.com.SelectHotelPage;

public class Adactin_Runner extends Base_Class1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver=browser_Launch("chrome");
		url("https://adactinhotelapp.com/");
		LoginPage login = new LoginPage(driver);
		sendkeys(login.getUsername(), "sakthivelu");
		sendkeys(login.getPassword(), "sakthi@123");
		click(login.getLoginBtn());
		SearchHotelPage search = new SearchHotelPage(driver);
		dropdown(search.getLocation(), "value", "New York");
		dropdown(search.getHotels(), "visible", "Hotel Sunshine");
		dropdown(search.getRoomtype(), "index", "4");
		dropdown(search.getNo_Rooms(), "index", "5");
		clear(search.getCheckIn());
		sendkeys(search.getCheckIn(), "05/03/2022");
		clear(search.getCheckOut());
		sendkeys(search.getCheckOut(), "06/03/2022");
		dropdown(search.getAdults(), "visible", "2 - Two");
		dropdown(search.getChildrens(), "value", "1");
		click(search.getSearchBtn());
		SelectHotelPage hotel = new SelectHotelPage(driver);
		click(hotel.getRadioBtn());
		click(hotel.getContinueBtn());
		scroll_UpDown(300);
		BookHotel book = new BookHotel(driver);
		sendkeys(book.getFirstName(), "sakthi");
		sendkeys(book.getLastName(), "velu");
		sendkeys(book.getAddress(), "No.14, Kamarajar Nagar, Korattur, Chennai-80.");
		sendkeys(book.getCardNo(), "1234123412341234");
		dropdown(book.getCardType(), "index", "3");
		dropdown(book.getExpMonth(), "visible", "December");
		dropdown(book.getExpYear(), "value", "2022");
		sendkeys(book.getCvv(), "123");
		click(book.getBookBtn());
		scroll_UpDown(2000);
		wait1(10);
		BookingConfirmation confirm = new BookingConfirmation(driver);
		click(confirm.getMyItineraryBtn());
		scroll_UpDown(3000);
		LogoutPage logout = new LogoutPage(driver);
		click(logout.getClickHotel());
		scroll_UpDown(3000);
		click(logout.getLogoutBtn());
		screenShot("Pom.Mp");
		
	}
}
