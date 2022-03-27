package com.adactin.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.com.Base_Class1;
import com.pageobjectmanager.PageObjectManager;
import com.reader.com.FileReaderManager;

public class Adactin_Runner_Property extends Base_Class1 {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver= browser_Launch(FileReaderManager.getInstanceFR().getInstanceCR().getBrowser());
		url(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
		PageObjectManager pom = new PageObjectManager(driver);
		sendkeys(pom.getInstanceLogin().getUsername(), FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
		sendkeys(pom.getInstanceLogin().getPassword(), FileReaderManager.getInstanceFR().getInstanceCR().getPassword());
		click(pom.getInstanceLogin().getLoginBtn());
		dropdown(pom.getInstanceSearch().getLocation(), "index", "6");
		dropdown(pom.getInstanceSearch().getHotels(), "index", "2");
		dropdown(pom.getInstanceSearch().getRoomtype(), "value", "Deluxe");
		dropdown(pom.getInstanceSearch().getNo_Rooms(), "visible", "5 - Five");
		clear(pom.getInstanceSearch().getCheckIn());
		sendkeys(pom.getInstanceSearch().getCheckIn(), "10/03/2022");
		clear(pom.getInstanceSearch().getCheckOut());
		sendkeys(pom.getInstanceSearch().getCheckOut(), "11/03/2022");
		dropdown(pom.getInstanceSearch().getAdults(), "index", "2");
		dropdown(pom.getInstanceSearch().getChildrens(), "value", "1");
		click(pom.getInstanceSearch().getSearchBtn());
		click(pom.getInstanceSelect().getRadioBtn());
		click(pom.getInstanceSelect().getContinueBtn());
		scroll_UpDown(1000);
		sendkeys(pom.getInstanceBook().getFirstName(),FileReaderManager.getInstanceFR().getInstanceCR().getFirstname());
		sendkeys(pom.getInstanceBook().getLastName(), FileReaderManager.getInstanceFR().getInstanceCR().getLastname());
		sendkeys(pom.getInstanceBook().getAddress(), FileReaderManager.getInstanceFR().getInstanceCR().getAddress());
		sendkeys(pom.getInstanceBook().getCardNo(), FileReaderManager.getInstanceFR().getInstanceCR().getCardNo());
		dropdown(pom.getInstanceBook().getCardType(), "index", "3");
		dropdown(pom.getInstanceBook().getExpMonth(), "visible", "December");
		dropdown(pom.getInstanceBook().getExpYear(), "visible", "2022");
		sendkeys(pom.getInstanceBook().getCvv(), FileReaderManager.getInstanceFR().getInstanceCR().getCvv());
		click(pom.getInstanceBook().getBookBtn());
		scroll_UpDown(3000);
		wait1(5);
		click(pom.getInstanceConfirm().getMyItineraryBtn());
		click(pom.getInstanceLogout().getClickHotel());
		scroll_UpDown(3000);
		click(pom.getInstanceLogout().getLogoutBtn());
	}

}