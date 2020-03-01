package POM;

import org.testng.annotations.Test;

import POM_site_pages.ForgotPassword;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Forgot_Account_Test {
	WebDriver driver;
  @Test
  public void Forgot() {
	  driver.navigate().to("http://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");
	  ForgotPassword home=new ForgotPassword(driver);
	  home.PhoneField();
	  home.Search();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "/Users/yanabedulina/Desktop/geckodriver");
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
