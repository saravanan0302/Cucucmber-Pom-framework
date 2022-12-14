package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class BookingConfirmationPage extends LibGlobal {
	public BookingConfirmationPage() {
	 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public void Orderumber() {
getattri(getOrderNo());
	}
	
}
