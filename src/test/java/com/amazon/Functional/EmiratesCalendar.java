package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class EmiratesCalendar {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.navigate().to("https://www.emirates.com");
	  WebElement contin=driver.findElement(By.linkText("Continue"));
	  contin.click();
	  
	  //WebElement travel=driver.findElement(By.id("search-flight-date-picker-depart"));
	  //travel.click();
	  
	  WebElement depart=driver.findElement(By.xpath("(//*[text()='Departing'])[1]"));
	  depart.click();
	  
	  WebElement dptdate=driver.findElement(By.xpath("(//*[text()='26'])[1]"));
	  Thread.sleep(2000);
	  dptdate.click();
	  
  
  
  }
  private Exception sleep(int i) {
	// TODO Auto-generated method stub
	return null;
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
