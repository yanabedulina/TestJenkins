package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Facebook {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.navigate().to("http://www.facebook.com");
	  
	  WebElement fieldname=driver.findElement(By.xpath("//*[@aria-label='First name']"));
	  fieldname.sendKeys("Yana");
	  
	  WebElement fieldsurname=driver.findElement(By.xpath("//*[@aria-label='Surname']"));
	  fieldsurname.sendKeys("Bedulina");
	  
	  WebElement fieldemail=driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']"));
	  fieldemail.sendKeys("yana@gmail.com");
	  
	  WebElement password=driver.findElement(By.xpath("//*[@aria-label='New password']"));
	  password.sendKeys("57575757");
	  
	  WebElement month=driver.findElement(By.name("birthday_month"));
	  Select dropoffdownmonth=new Select(month);
	  dropoffdownmonth.selectByVisibleText("Dec");
	  
	  WebElement year=driver.findElement(By.name("birthday_year"));
	  Select dropoffdownyear=new Select(year);
	  dropoffdownyear.selectByVisibleText("1993");
	  
	  WebElement day=driver.findElement(By.name("birthday_day"));
	  Select dropoffdownday=new Select(day);
	  dropoffdownday.selectByVisibleText("26");
	  
	  WebElement gender=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
	  gender.click();
	  
	  WebElement buttonsignin=driver.findElement(By.xpath("//*[@name='websubmit']"));
	  buttonsignin.click();
	  
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
