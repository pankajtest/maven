package com.vtiger.genericlib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vtiger.genericlib.BaseClass;

public class BrowserUtility {
	public void waitForPageToLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait= new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public List<WebElement> selectByVisibleText(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		return options; 

		
		
	}
	public void ActionsMoveToElement(WebElement element)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
		
	}
	public void SelectByIndex(WebElement element, int index) {
		 Select sel= new Select(element);
			sel.selectByIndex(index);
	}
	public void SelectByValue(WebElement element, String data) {
		 Select sel= new Select(element);
			sel.selectByValue(data);
	}
	public void SelectByVisibleText(WebElement element,String Data) {
		Select sel1=new Select(element);
		sel1.deselectByVisibleText(Data);
		
	}
	public void alertAccept()
	{
		BaseClass.driver.switchTo().alert().accept();		
	}
	public void alertDismiss()
	{
		BaseClass.driver.switchTo().alert().dismiss();	
	}
	

}
