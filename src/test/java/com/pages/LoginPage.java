package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUser;
	@FindBy(id = "password")
	private WebElement txtPass;
	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void Login(String username, String password) {
		type(getTxtUser(),username);
		type(getTxtPass(),password);
	}

	public void clicklogin() {
	btnClick(loginBtn);
	}
}
