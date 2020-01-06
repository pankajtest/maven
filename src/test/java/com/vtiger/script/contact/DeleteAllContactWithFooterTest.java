package com.vtiger.script.contact;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.BrowserUtility;
import com.vtiger.objectRepLib.Contact;
import com.vtiger.objectRepLib.ContactInformation;
import com.vtiger.objectRepLib.Home;

public class DeleteAllContactWithFooterTest extends BaseClass{
	@Test
	public void deleteAllContactWithFooterTest() {
		/*Click on ContactLink*/
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.getContactEdt().click();
		/* Click on ContactIcon "+" Link*/
		Contact ct = PageFactory.initElements(driver, Contact.class);
		ct.getContactIconPlus().click();
		ContactInformation ci = PageFactory.initElements(driver, ContactInformation.class);
		ci.getLastnameEdt().sendKeys("pan");
		ci.getSaveBtn().click();
		hp.getContactEdt().click();
		ct.getSelectAllCheckbox().click();
		ct.getDeleteFooterBtn().click();
		BrowserUtility bu = PageFactory.initElements(driver, BrowserUtility.class);
		bu.alertAccept();
		System.out.println("hello");
		System.out.println("hjdfguhdfsfffgjhhffh");
		
		System.out.println("hello world updated by supriyo");
		
		
	}

	

}
