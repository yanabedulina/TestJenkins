package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ActionClass {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	 /* driver.navigate().to("https://www.amazon.com");
	  Actions contro=new Actions(driver);
	  WebElement pointer=driver.findElement(By.id("nav-link-accountList"));
	  contro.moveToElement(pointer).perform();
	  WebElement update=driver.findElement(By.linkText("Wedding Registry"));
	  contro.moveToElement(update).click().build().perform(); */
	  
	  
	  
	  driver.navigate().to("https://www.amazon.com");
	  Actions contro=new Actions(driver);
	  driver.getCurrentUrl();
	  String open=driver.getCurrentUrl();
	  System.out.println(open);
	  WebElement pointer=driver.findElement(By.id("nav-link-accountList"));
	  contro.moveToElement(pointer).perform();
	  Thread.sleep(2000);
	  String Hover=driver.getCurrentUrl();
	  System.out.println(Hover);
	  WebElement update=driver.findElement(By.linkText("Wedding Registry"));
	  contro.moveToElement(update).click().build().perform();
	  Thread.sleep(2000);
	  String after=driver.getCurrentUrl();
	  System.out.println(after);
	  
	  
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
