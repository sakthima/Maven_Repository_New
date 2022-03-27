package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.base.com.Base_Class1;
import com.pageobjectmanager.PageObjectManager;
import com.reader.com.FileReaderManager;
import com.testrunner.com.AdactinRunner1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class1 {
	
	static WebDriver driver = AdactinRunner1.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable { 
	   url(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
	}
	
	
//	@When("^user Enters The Username In The InputBox$")
//	public void user_Enters_The_Username_In_The_InputBox() throws Throwable {
//		sendkeys(pom.getInstanceLogin().getUsername(), FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
//	}
	
	@When("^user Enters The \"([^\"]*)\" Username In The InputBox$")
	public void user_Enters_The_Username_In_The_InputBox(String username) throws Throwable {
	   
		sendkeys(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enters The \"([^\"]*)\" Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox(String password) throws Throwable {
	    
		sendkeys(pom.getInstanceLogin().getPassword(), password);
	}


//	@When("^user Enters The Password In The InputBox$")
//	public void user_Enters_The_Password_In_The_InputBox() throws Throwable { 
//		sendkeys(pom.getInstanceLogin().getPassword(), FileReaderManager.getInstanceFR().getInstanceCR().getPassword());
//	}

	@Then("^user Clicks The Login Button And It Navigates To The SearchHotelPage$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage() throws Throwable {
		click(pom.getInstanceLogin().getLoginBtn());
	}
	
	
	

	@When("^user Select The Location In The Dropdown$")
	public void user_Select_The_Location_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceSearch().getLocation(), "value", "New York");
	}

	@When("^user Select The Hotels In The Dropdown$")
	public void user_Select_The_Hotels_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceSearch().getHotels(), "visible", "Hotel Sunshine");
	}

	@When("^user Select The RoomType In The Dropdown$")
	public void user_Select_The_RoomType_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceSearch().getRoomtype(), "index", "3");
	}

	@When("^user Select The NumberOfRooms In The Dropdown$")
	public void user_Select_The_NumberOfRooms_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceSearch().getNo_Rooms(), "value", "5");
	}

	@When("^user Select The AdultsPerRoom In The Dropdown$")
	public void user_Select_The_AdultsPerRoom_In_The_Dropdown() throws Throwable { 
		dropdown(pom.getInstanceSearch().getAdults(), "visible", "2 - Two");
	}

	@When("^user Select The ChildrenPerRoom In The Dropdown$")
	public void user_Select_The_ChildrenPerRoom_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceSearch().getChildrens(), "index", "1");
	}

	@Then("^user Clicks The Search Button And It Navigates To The SelectHotelPage$")
	public void user_Clicks_The_Search_Button_And_It_Navigates_To_The_SelectHotelPage() throws Throwable {
		click(pom.getInstanceSearch().getSearchBtn());
	}

	@When("^user Clicks The Select Hotel Radio Button$")
	public void user_Clicks_The_Select_Hotel_Radio_Button() throws Throwable {
		click(pom.getInstanceSelect().getRadioBtn());
	}

	@Then("^user Clicks The Continue Button And It Navigates To The BookHotelPage$")
	public void user_Clicks_The_Continue_Button_And_It_Navigates_To_The_BookHotelPage() throws Throwable { 
		click(pom.getInstanceSelect().getContinueBtn());
	}

	@When("^user Enters The FirstName In The InputBox$")
	public void user_Enters_The_FirstName_In_The_InputBox() throws Throwable {
		sendkeys(pom.getInstanceBook().getFirstName(), FileReaderManager.getInstanceFR().getInstanceCR().getFirstname());
	}

	@When("^user Enters The LastName In The InputBox$")
	public void user_Enters_The_LastName_In_The_InputBox() throws Throwable {
		sendkeys(pom.getInstanceBook().getLastName(), FileReaderManager.getInstanceFR().getInstanceCR().getLastname());
	}

	@When("^user Enters The Billing Address In The InputBox$")
	public void user_Enters_The_Billing_Address_In_The_InputBox() throws Throwable {
		sendkeys(pom.getInstanceBook().getAddress(),FileReaderManager.getInstanceFR().getInstanceCR().getAddress());
	}

	@When("^user Enters The CreditCardNo In The InputBox$")
	public void user_Enters_The_CreditCardNo_In_The_InputBox() throws Throwable {
		sendkeys(pom.getInstanceBook().getCardNo(), FileReaderManager.getInstanceFR().getInstanceCR().getCardNo());
	}

	@When("^user Select The CreditCardType In The Dropdown$")
	public void user_Select_The_CreditCardType_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceBook().getCardType(), "index", "3");
	}

	@When("^user Select The ExpMonth In The Dropdown$")
	public void user_Select_The_ExpMonth_In_The_Dropdown() throws Throwable {
		dropdown(pom.getInstanceBook().getExpMonth(), "value", "6");
	}

	@When("^user Select The ExpYear In The Dropdown$")
	public void user_Select_The_ExpYear_In_The_Dropdown() throws Throwable {  
		dropdown(pom.getInstanceBook().getExpYear(), "index", "12");
	}

	@When("^user Enters The CvvNumber In The InputBox$")
	public void user_Enters_The_CvvNumber_In_The_InputBox() throws Throwable {
		sendkeys(pom.getInstanceBook().getCvv(), FileReaderManager.getInstanceFR().getInstanceCR().getCvv());
	}
	

	@Then("^user Clicks The BookNow Button And It Navigates To The BookingConfirmationPage$")
	public void user_Clicks_The_BookNow_Button_And_It_Navigates_To_The_BookingConfirmationPage() throws Throwable {   
		click(pom.getInstanceBook().getBookBtn());
		wait1(5);
	}

	@Then("^user Clicks The MyItinerary Button And It Navigates To The LogoutPage$")
	public void user_Clicks_The_MyItinerary_Button_And_It_Navigates_To_The_LogoutPage() throws Throwable {
		click(pom.getInstanceConfirm().getMyItineraryBtn());
	}

	@When("^user Clicks The FirstOrderId In The CheckBox$")
	public void user_Clicks_The_FirstOrderId_In_The_CheckBox() throws Throwable { 
		click(pom.getInstanceLogout().getClickHotel());
	}

	@Then("^user Clicks The Logout Button And It Navigates To The ClickHereToLoginAgain Page$")
	public void user_Clicks_The_Logout_Button_And_It_Navigates_To_The_ClickHereToLoginAgain_Page() throws Throwable {
		click(pom.getInstanceLogout().getLogoutBtn());
	}


}
