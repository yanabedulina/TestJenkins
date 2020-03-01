package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AbsoluteXpath {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  WebElement fieldemail=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input)[1]"));
fieldemail.sendKeys("yana@gmail.com");
      WebElement fieldpassword=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input)[2]"));
fieldpassword.sendKeys("5757575");
      WebElement button=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input"));
button.click();



 
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
 driver=new ChromeDriver();
 driver.navigate().to("http://www.facebook.com");
 
 
  }

  @AfterClass
  public void afterClass() {
  }

}
