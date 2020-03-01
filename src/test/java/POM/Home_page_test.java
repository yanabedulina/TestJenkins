package POM;

import org.testng.annotations.Test;

import POM_site_pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Home_page_test {
	public WebDriver driver;
  @Test(priority=1)
  public void login() {
	  
	  HomePage home=new HomePage(driver);
	  home.EmailIdField();
	  home.PasswordField();
	  home.LoginButton();
	  
	  
  }
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String website, String br) {
	  
	      if(br.equalsIgnoreCase("Chrome")) {
	    	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
			  driver = new ChromeDriver();
			  driver.navigate().to(website);
	      }else if(br.equalsIgnoreCase("Firefox")) {
	    	  System.setProperty("webdriver.gecko.driver", "/Users/yanabedulina/Desktop/geckodriver");
	          driver = new FirefoxDriver();
	          driver.navigate().to(website);
	      }else{
	    	  System.out.println("Check name");
	      }
	      
	      }
  

  @AfterClass
  public void afterClass() {
  }

}
