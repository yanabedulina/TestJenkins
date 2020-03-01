package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class FacebookNewWindow {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("https://facebook.com");
	  
	  WebElement fieldemail=driver.findElement(By.id("email"));
	  fieldemail.sendKeys("yana@gmail.com");
	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys("57575757");
	  WebElement button=driver.findElement(By.xpath("//*[@aria-label='Log In']"));
	  button.click();
	  
	  WebElement recover=driver.findElement(By.linkText("Recover Your Account"));
	  Actions newwindow=new Actions(driver);
	  newwindow.keyDown(Keys.SHIFT).click(recover).keyUp(Keys.SHIFT).build().perform();  
	  
	  String parentwindow=driver.getWindowHandle();
	  System.out.println(parentwindow);
	  Set<String> windows=driver.getWindowHandles();
	  for(String contr:windows) {
		  System.out.println(contr);
		  if(contr.equals(parentwindow)) {
			  driver.switchTo().window(contr);
		  }
	  
	  }
	  WebElement newphone=driver.findElement(By.xpath("//*[@aria-label='Phone number']"));
	  newphone.sendKeys("989898989899");
	  
	  
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
