package com.vtiger.objectRepLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformation {
	 @FindBy(name="lastname")
	 private WebElement lastnameEdt;

	public WebElement getLastnameEdt() {
		return lastnameEdt;
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	@FindBy(xpath="(//a[text()='Contacts'])[2]")
	private WebElement contactlink;

	public WebElement getContactlink() {
		return contactlink;
	}

}
