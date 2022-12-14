package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioBtn;
	@FindBy(id = "continue")
	private WebElement contBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContBtn() {
		return contBtn;
	}

	public void selectradiobtn() {
		btnClick(getRadioBtn());
	}

	public void clickcontinuebtn() {
		btnClick(getContBtn());
	}

}
