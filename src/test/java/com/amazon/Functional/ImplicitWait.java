package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ImplicitWait {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("https://facebook.com");
	  
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  WebElement forgotpassword=driver.findElement(By.linkText("Forgotten account?"));
	  forgotpassword.click();
  }
  @BeforeClass
  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
		  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
