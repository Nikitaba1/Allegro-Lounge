package com.Book_lounge.baseclass;
/**
 * @author Nikitaba Parmar
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Book_lounge.genericUtility.FileUtility;

public class BaseClass {
	FileUtility fu = new FileUtility();
	WebDriver driver;
	public static WebDriver sdriver;
	/**
	 * Lunching the Browser
	 * Using static driver fom Listener Implimentation class
	 * @throws Exception
	 */
	@BeforeClass
	public void lunchBrowser() throws Exception {
		String Browser=fu.getDataFromProperyFile("browser");
		if(Browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();	
		}else if(Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}else {
			driver = new FirefoxDriver();
		}
		sdriver=driver;
		System.out.println("Browser got Lunched");
	}
	/**
	 * Login To Book_Lounge Application
	 * @throws Exception
	 */
	@BeforeMethod
	public void loginToBookLounge() throws Exception {
		String URL= fu.getDataFromProperyFile("url");
		String Username= fu.getDataFromProperyFile("username");
		String Password= fu.getDataFromProperyFile("password");
		System.out.println("Login Sucessfully");
	}
	/**
	 * Logout From the Book_Lounge Application
	 */
	@AfterMethod
	public void LogoutFromBookLounge() {
		System.out.println("LogOut from the Book_Lounge application");
	}
	/**
	 * Closing the driver
	 */
	@AfterClass
	public void closetheBrowser() {
		driver.quit();
		System.out.println("Browser is closed");
	}

}
