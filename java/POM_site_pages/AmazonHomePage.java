package POM_site_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;

	@FindBy(xpath="//*[@class='nav-sprite nav-logo-tagline nav-prime-try']")
	WebElement TryPrime;
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void TryLink() {
		TryPrime.click();
	}

}






