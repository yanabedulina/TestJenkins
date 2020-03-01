package com.amazon.Functional;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Screenshot {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
	  
	  driver.findElement(By.id("ap_email")).sendKeys("yanajj");
	  screenshots();
	  boolean displ=driver.findElement(By.id("continue")).isDisplayed();
	  System.out.println(displ);
	  Assert.assertEquals(true, displ);
	  driver.findElement(By.id("continue")).click();
	  String error=driver.findElement(By.xpath("//*[@class='a-list-item']")).getText();
	  System.out.println(error);

	  Assert.assertEquals("We cannot find an account with that email address", error);
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() throws IOException {
	  screenshots();
	  
	  
  }
 // public void screenshots() throws IOException {
  //File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  //FileUtils.copyFile(shots,new File("/Users/yanabedulina/Desktop/PeopleInTech/screen.png"));
  
  public void screenshots() throws IOException {
	 
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(shots,new File("/Users/yanabedulina/Desktop/PeopleInTech/"+timestamp()+"screen.png"));
  
  }
  public String timestamp() {
	  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
}
