package com.orangehrmpluging;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataTest {
  @Test(dataProvider = "dpTest")
  public void dt(String uname, String pass) {
	  System.out.println("Username  : "+ uname);
	  System.out.println("Password  : "+ pass);
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\ASDM\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
	  	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	  //Gauri Mahalle
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
//Mayuri Dalindre
  }

  @DataProvider(name ="dpTest")
  public Object[][] dp() {
    return new Object[][] {
       { "test", "test123" },
       { "Admin", "admin123" },
    };
  }
}
