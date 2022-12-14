package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class BookHotelPage extends LibGlobal {
	public BookHotelPage() {
		 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firsName;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccNum;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement ccType;
	@FindBy(id = "cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement ccYear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement bookBtn;

	public WebElement getFirsName() {
		return firsName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public void bookingHotel(String firstname,String lastname,String billingaddress,
	String creditcardnumber,String cardtype,String expiryMonth,String expiryYr,String cvvnumber) {
	type(getFirsName(),firstname);
	type(getLastName(),lastname);
	type(getAddress(),billingaddress);
	type(getCcNum(),creditcardnumber);
	SelectByVisibleText(getCcType(),cardtype);
	SelectByVisibleText(getCcMonth(),expiryMonth);
	SelectByVisibleText(getCcYear(),expiryYr);
	type(getCvv(), cvvnumber);
	
	}

	public void clickBookbtn() {
		btnClick(getBookBtn());

	}

}
