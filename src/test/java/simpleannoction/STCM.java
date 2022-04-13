package simpleannoction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.ShortMethod;

public class STCM  extends ShortMethod{

	@BeforeSuite
	public void Setproperty() {
		System.out.println("Set Property");	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Maven_Demo_Project\\Driver\\chromedriver.exe");
	}
//	@BeforeTest
//	public void BrowserLanching() {
//		System.out.println("Broswer lanching");
//
//	}
//
//
//	@BeforeClass
//	public void url() {
//		System.out.println("url");}
//
//	@BeforeMethod
//	public void login() {
//		System.out.println("login");
//
//
//	}
//
//
//	@Test
//	public void application_lanching() {
//		System.out.println("Amzon");
//
//	}
//
//
//	@Test //(priority = -1, enabled = false)
//	public void application() {
//		System.out.println("flipkart");
//
//	}
//
//
//	@AfterMethod
//	public void logout() {
//		System.out.println("logotu");
//	}
//
//
//	@AfterClass
//	public void Homepage() {
//		System.out.println("Home");
//	}
//
//
//	@AfterTest
//	public void close() {
//		System.out.println("close");
//	}
//
//
//	@AfterSuite
//	public void clean() {
//		System.out.println("clean");
//	}

}




