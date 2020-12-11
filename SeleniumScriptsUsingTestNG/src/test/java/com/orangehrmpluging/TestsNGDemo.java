package com.orangehrmpluging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsNGDemo {
	
	WebDriver driver;
	@BeforeClass
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\ASDM\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}

	/*
	 * @Test(priority=2) void enterURL() {
	 * 
	 * }
	 */
	
	
	@BeforeMethod
	void login() 
	{
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

	}
		
	@Test
	public void adminTest()
	{
		driver.findElement(By.linkText("Admin")).click();
	}
	@Test
	public void leaveTest()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	}
	@Test
	public void pimTest()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Time")).click();
		
	}
	@AfterMethod
	void logout()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();;
	}
	
	@AfterClass
	void closeBrowser()
	{
		driver.close();
	}
	
	
	

}
