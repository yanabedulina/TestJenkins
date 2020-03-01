package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ClassAssigment {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("http://www.facebook.com");
	  WebElement fieldemail=driver.findElement(By.id("email"));
	  fieldemail.sendKeys("yana@gmail.com");
	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys("57575757");
	  WebElement button=driver.findElement(By.id("u_0_b"));
	  button.click();
  }
  @BeforeClass
  public void beforeClass() {
		  System.out.println("This is before class annotation");
		  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
	 driver=new ChromeDriver();
	 
	// driver.navigate().back();
	 
	// WebElement prime=driver.findElement(By.linkText("Try Prime"));
  }

  @AfterClass
  public void afterClass() {
  }

}
