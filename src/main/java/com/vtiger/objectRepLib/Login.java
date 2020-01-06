package com.vtiger.objectRepLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="user_name")
	private WebElement UserNameEdt;
	@FindBy(name="user_password")
	private WebElement PasswordEdt;
	@FindBy(id="submitButton")
	private WebElement LoginButton;
	
	public WebElement getUserNameEdt() {
		return UserNameEdt;
	}
	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	/* Business Method*/
	
	public void LoginToApp(String USERNAME, String PASSWORD) {
		UserNameEdt.sendKeys(USERNAME);
		PasswordEdt.sendKeys(PASSWORD);
		LoginButton.click();
		
		
	}
	

}
