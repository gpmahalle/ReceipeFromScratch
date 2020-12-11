package com.orangehrmpluging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlTest2 {
	@Parameters({"uname","pass"})
	  @Test
	  public void paraTest(String user, String pwd) {
		  System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\ASDM\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  
		  	driver.findElement(By.name(user)).sendKeys("Admin");
			driver.findElement(By.id(pwd)).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
	  }
}
