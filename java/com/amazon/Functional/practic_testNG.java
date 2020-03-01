package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class practic_testNG {
	WebDriver driver;
  @Test
  public void f() {
	  //driver.get("http://www.amazon.com");
	  driver.navigate().to("http://www.amazon.com");
	  driver.navigate().refresh();
	  driver.manage().window().maximize();
	  driver.navigate().back();
	  driver.navigate().forward();
	  
	  //driver.findElement(By.id("twotabsearchtextbox"));
	  WebElement field=driver.findElement(By.id("twotabsearchtextbox"));
	  field.sendKeys("computer");
	  WebElement button=driver.findElement(By.id("nav-search-submit-text"));
	  
	  WebElement prime=driver.findElement(By.linkText("Try Prime"));
	  //field.submit();
	  //Thread.sleep(6000);
	  prime.click();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
 driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
	  //driver.quit();
  }

}
