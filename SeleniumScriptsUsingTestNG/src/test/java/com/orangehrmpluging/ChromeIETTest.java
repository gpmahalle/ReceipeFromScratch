package com.orangehrmpluging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ChromeIETTest {
	WebDriver webDriver;
	
	@BeforeClass
	void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\ASDM\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get("www.google.com"); 
	}

}
