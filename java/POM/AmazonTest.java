package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM_site_pages.AmazonHomePage;
import POM_site_pages.AmazonSignIn;
import POM_site_pages.AmazonTryPrime;
import POM_site_pages.HomePage;

public class AmazonTest {
	WebDriver driver;
	  @Test
	  public void tryprime() {
		  driver.navigate().to("http://www.amazon.com");
		  
		  AmazonHomePage home=new AmazonHomePage(driver);
		  home.TryLink();
	  }
	  @Test
	  public void tryprimebutton() {
		  AmazonTryPrime trypr=new AmazonTryPrime(driver);
	      trypr.TryPrime();
	  }
	  @Test
	  public void signin() {
		  AmazonSignIn sign=new AmazonSignIn(driver);
	      sign.EmailIdField();
	      sign.PasswordField();
	      sign.SignInButton();
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





