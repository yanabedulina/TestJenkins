package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Alerts {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	  
	  WebElement cookies=driver.findElement(By.xpath("//*[text()='ACCEPT']"));
	  cookies.click();
	  
	  WebElement alert=driver.findElement(By.xpath("//*[text()='Simple Alert']"));
	  alert.click();
	  
	  driver.switchTo().alert().accept();
	 //driver.switchTo().alert().dismiss();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
 driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
