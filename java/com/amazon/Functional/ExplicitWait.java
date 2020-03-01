package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ExplicitWait {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("https://facebook.com");
	  
	  WebDriverWait ob=new WebDriverWait(driver, 10);
	 // WebElement forgotpassword=driver.findElement(By.linkText("Forgotten account?"));
	  WebElement forgot=ob.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Forgotten account?"))));
	  forgot.click();
	 // forgotpassword.click();
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
