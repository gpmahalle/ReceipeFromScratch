package com.orangehrmpluging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	WebDriver driver;
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\ASDM\\chromedriver.exe"); 
		driver = new ChromeDriver();
		
	}
	
	void enterURL() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	void login() 
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}

	public static void main(String[] args) {
		
		//Opens the browser window
		
		
		//Passes the url
		
		
		//locate the username element and pass test data into it.
		
		SeleniumDemo sd = new SeleniumDemo();
		sd.openBrowser();
		sd.enterURL();
		sd.login();
		
	}

}
