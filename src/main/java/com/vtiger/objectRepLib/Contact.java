package com.vtiger.objectRepLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BrowserUtility;



public class Contact {
	public BrowserUtility utitlty = new BrowserUtility();
	 @FindBy(xpath="//img[@alt='Create Contact...']")
	 private WebElement ContactIconPlus;
	 
	 public WebElement getContactIconPlus()
	 {
		 return ContactIconPlus;
	 }
	 @FindBy(name="selectall")
	 private WebElement selectAllCheckbox;

	public WebElement getSelectAllCheckbox() {
		return selectAllCheckbox;
	}
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
   private WebElement deleteHeaderBtn;

	public WebElement getDeleteHeaderBtn() {
		return deleteHeaderBtn;
	}
	@FindBy(xpath="(//input[@value='Delete'])[2]")
	   private WebElement deleteFooterBtn;

		public WebElement getDeleteFooterBtn() {
			return deleteFooterBtn;
		}
	@FindBy(id="viewname")
	private WebElement contactfilter;

	public WebElement getContactfilter() {
		return contactfilter;
	}
	
	@FindBy(id = "viewname") private WebElement filterDD;
	public void selectFilterDDByIndex(int index) {
		utitlty.SelectByIndex(filterDD, index);
	}
	@FindBy(xpath="//a[text()='pan']/../../td/a[text()='del']")
	private WebElement deleteContactWithActionBtn;

	public WebElement getDeleteContactWithActionBtn() {
		return deleteContactWithActionBtn;
	}
	@FindBy(xpath="//a[text()='pan']/../../td/a[text()='del']")
	private WebElement withoutSelectingDeleteContactbtn;

	public WebElement getwithoutSelectingDeleteContactbtn() {
		return withoutSelectingDeleteContactbtn;
	}
	

}
