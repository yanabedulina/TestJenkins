package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Iframes {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("https://jqueryui.com/droppable/");
	  
	  String window=driver.getWindowHandle();
	  System.out.println(window);
	  driver.switchTo().frame(0);
	  Actions drag=new Actions(driver);
	  drag.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();;
	  driver.switchTo().window(window);
	  driver.findElement(By.linkText("Sortable")).click();
	 
	  
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
