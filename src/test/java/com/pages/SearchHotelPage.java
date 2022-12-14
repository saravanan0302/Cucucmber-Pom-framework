package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class SearchHotelPage extends LibGlobal {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[1]")
	private WebElement Hotellocation;
	@FindBy(xpath = "(//select[@class='search_combobox'])[2]")
	private WebElement hotelName;
	@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
	private WebElement TypeofRoom;
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement numberofRooms;
	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement adulCount;
	@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
	private WebElement childCount;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchBtn;

	public WebElement getHotellocation() {
		return Hotellocation;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getTypeofRoom() {
		return TypeofRoom;
	}

	
	public WebElement getNumberofRooms() {
		return numberofRooms;
	}

	public WebElement getAdulCount() {
		return adulCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void SearchHotel(String location, String hotel, String roomtype,
			String NoofRooms, String adultscount, String childcount) {
		SelectByVisibleText(getHotellocation(), location);
		SelectByVisibleText(getHotelName(), hotel);
		SelectByVisibleText(getTypeofRoom(), roomtype);
		SelectByVisibleText(getNumberofRooms(), NoofRooms);
		SelectByVisibleText(getAdulCount(), adultscount);
		SelectByVisibleText(getChildCount(), childcount);
	}

	public void btnclicksearch() {
		btnClick(getSearchBtn());

	}

}