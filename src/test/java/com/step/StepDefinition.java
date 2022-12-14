package com.step;

import java.awt.AWTException;

import com.libglobal.LibGlobal;
import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import io.cucumber.java.en.*;

public class StepDefinition extends LibGlobal{

@Given("User launch adactinhotel web page")
public void userLaunchAdactinhotelWebPage() {
	launchBrowser();
	launchUrl("https://adactinhotelapp.com/HotelAppBuild2");
	maximizeWindow();
   
}

@When("User enters valid {string} and valid {string}")
public void userEntersValidAndValid(String username, String password) {
	LoginPage loginPage = new LoginPage();
	loginPage.Login(username, password);
    
}

@When("User clicks the login button and search hotel page should be opened")
public void userClicksTheLoginButtonAndSearchHotelPageShouldBeOpened() {
	LoginPage loginPage = new LoginPage();
	loginPage.clicklogin();
}

@When("User select the {string},{string},{string},{string},{string} and {string}")
public void userSelectTheAnd(String location, String hotel, String roomtype, String NoofRooms, String adultscount, String childcount) throws AWTException {

	SearchHotelPage searchHotelPage = new SearchHotelPage();
	searchHotelPage.SearchHotel(location, hotel, roomtype, NoofRooms, adultscount, childcount);

}

@When("User clicks the search button and select hotel page should be opened")
public void userClicksTheSearchButtonAndSelectHotelPageShouldBeOpened() {
	SearchHotelPage searchHotelPage = new SearchHotelPage();
	searchHotelPage.btnclicksearch();

}

@When("User select the radio button")
public void userSelectTheRadioButton() {
	SelectHotelPage selectHotelPage = new SelectHotelPage();
	selectHotelPage.selectradiobtn();
}

@When("User clicks the continue button")
public void userClicksTheContinueButton() {
	SelectHotelPage selectHotelPage = new SelectHotelPage();
	selectHotelPage.clickcontinuebtn();
}

@When("User enters {string},{string}, {string}, {string},{string},{string},{string} and {string}")
public void userEntersAnd(String firstname, String lastname, String billingaddress, 
		String creditcardnumber, String cardtype, String expiryMonth, String expiryYr, String cvvnumber) {
	BookHotelPage bookHotelPage = new BookHotelPage();
	bookHotelPage.bookingHotel(firstname, lastname, billingaddress, creditcardnumber, cardtype, expiryMonth,
			expiryYr, cvvnumber);
}

@When("User clicks Book now button and order number should be displayed")
public void userClicksBookNowButtonAndOrderNumberShouldBeDisplayed() throws InterruptedException {
	BookHotelPage bookHotelPage = new BookHotelPage();
	bookHotelPage.clickBookbtn();
	Thread.sleep(5000);
	BookingConfirmationPage bookingConfirmationPage = new BookingConfirmationPage();
	bookingConfirmationPage.Orderumber();
}


}
