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

public class NewWindow {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("https://facebook.com");
	  WebElement forgotpassword=driver.findElement(By.linkText("Forgotten account?"));
	  Actions newwindow=new Actions(driver);
	  newwindow.keyDown(Keys.SHIFT).click(forgotpassword).keyUp(Keys.SHIFT).build().perform();
	  
	  String parentwindow=driver.getWindowHandle();
	  System.out.println(parentwindow);
	  Set<String> windows=driver.getWindowHandles();
	  for(String contr:windows) {
		  System.out.println(contr);
		  if(contr.equals(parentwindow)) {
			  driver.switchTo().window(contr);
		  }
		//  driver.switchTo().window(contr);
		  
	  }
	  driver.findElement(By.name("email")).sendKeys("yana");
	  
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
