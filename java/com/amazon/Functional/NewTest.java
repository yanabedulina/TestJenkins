package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver\\chromedriver.exe");
 driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

}

