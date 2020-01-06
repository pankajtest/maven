package com.vtiger.script.contact;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.BrowserUtility;
import com.vtiger.objectRepLib.Contact;
import com.vtiger.objectRepLib.ContactInformation;
import com.vtiger.objectRepLib.Home;

public class DeleteContactWithActionAndClickOnCancelTest extends BaseClass {
	@Test
	public void deleteContactWithActionAndClickOnCancelTest() {
		/*Click on ContactLink*/
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.getContactEdt().click();
		/* Click on ContactIcon "+" Link*/
		Contact ct = PageFactory.initElements(driver, Contact.class);
		ct.getContactIconPlus().click();
		/*Enter the Last name & pass the Value*/
		ContactInformation ci = PageFactory.initElements(driver, ContactInformation.class);
		ci.getLastnameEdt().sendKeys("pan");
		/* Click on save Button*/
		ci.getSaveBtn().click();
		/* Again Click on ContactBtnLink*/
		hp.getContactEdt().click();
		/* Click on Delete Button in Actio Field*/
		ct.getDeleteContactWithActionBtn().click();
		/* Click on cancel pop up Button*/
		BrowserUtility bu = PageFactory.initElements(driver, BrowserUtility.class);
		bu.alertDismiss();

}
}
