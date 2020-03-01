package POM;

import org.testng.annotations.Test;

import POM_site_pages.ForgotPassword;
import POM_site_pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class All_in_one_tests {
	WebDriver driver;
  @Test(priority=1)
/*  public void Forgot() {
	  driver.navigate().to("http://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");
	  ForgotPassword home=new ForgotPassword(driver);
	  home.PhoneField();
	  home.Search();
  }*/
  
  public void Login() {
	  driver.navigate().to("http://www.facebook.com");
	  HomePage obj=new HomePage(driver);
	  obj.EmailIdField();
	  obj.PasswordField();
	  obj.LoginButton();
	  driver.navigate().back();
  }
  @Test(priority=2)
	  public void Forgot() {
	  HomePage forg=new HomePage(driver);
	  forg.LoginButton(); //we have to create forgot account link click in homepage
	  ForgotPassword forgot= new ForgotPassword(driver);
	  forgot.PhoneField();
	  forgot.Search();
	  forgot.Cancelbt();
	  
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
