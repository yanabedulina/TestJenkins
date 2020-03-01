package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class RelativeXpath {
	
	WebDriver driver;
	
	  @Test
	  public void f() {
	/*	  WebElement fieldname=driver.findElement(By.xpath("//*[@aria-label='First name']"));
	fieldname.sendKeys("Yana");
	      WebElement fieldsurname=driver.findElement(By.xpath("//*[@aria-label='Surname']"));
	fieldsurname.sendKeys("Bedulina");
          WebElement fieldmobile=driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']"));
    fieldmobile.sendKeys("2139999106");
          WebElement buttonsignin=driver.findElement(By.xpath("//*[@name='websubmit']"));
    buttonsignin.click();
          WebElement textlink=driver.findElement(By.xpath("//*[text()='Forgotten account?']"));
    textlink.click(); */
		  
		  WebElement month=driver.findElement(By.name("birthday_month"));
		  Select dropoffdownmonth=new Select(month);
		  dropoffdownmonth.selectByVisibleText("Dec");
		  
		  WebElement year=driver.findElement(By.name("birthday_year"));
		  Select dropoffdownyear=new Select(year);
		  dropoffdownyear.selectByVisibleText("1993");
		  
		  WebElement day=driver.findElement(By.name("birthday_day"));
		  Select dropoffdownday=new Select(day);
		  dropoffdownday.selectByVisibleText("26");
		  
    
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
