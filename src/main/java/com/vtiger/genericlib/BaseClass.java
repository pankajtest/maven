package com.vtiger.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtiger.objectRepLib.Login;



public class BaseClass {

	public static WebDriver driver;
	public FileLib flib = new FileLib();
	
	@BeforeClass
	public void launchBrowser() throws Throwable {
		String Browser=flib.getPropertyData("Browser");
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.equals("Firefox")){
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("ie")){
			driver=new InternetExplorerDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		
	}
	@BeforeMethod
	public void loginToApplication() throws Throwable {
		System.out.println("Login To The Applicton");
		/*Read url, Username, Password from property file */
		Login lp = PageFactory.initElements(driver, Login.class);
		String url= flib.getPropertyData("Url");
		String USERNAME= flib.getPropertyData("UserName"); 
		String PASSWORD= flib.getPropertyData("Password");
		
		BrowserUtility bu = new BrowserUtility(); //used before launching url so that it is applicable for all 
		bu.waitForPageToLoad();
	    driver.get(url);
	    lp.LoginToApp(USERNAME, PASSWORD);
	    /*Create an object of login POM Class */
	  	
	}
	//@AfterMethod
	public void logOutToApplication() {
		System.out.println("====Logout======");
		/* Create an Object Of home pom class*/
	}
	//@AfterClass
	public void closeDriver() {
		System.out.println("====Close the browser=====");
		//driver.close();
	}

}
