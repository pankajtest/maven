package com.vtiger.objectRepLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BrowserUtility;

public class Home {

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	private WebElement ContactEdt;
	public WebElement getContactEdt() {
		return ContactEdt;
	}

	@FindBy(xpath="//a[text()='More']")
	private WebElement morelink;
	public WebElement getMorelink() {
		return morelink;
	}
	

}
