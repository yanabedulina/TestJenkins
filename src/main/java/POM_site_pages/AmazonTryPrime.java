package POM_site_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTryPrime {
	WebDriver driver;

	@FindBy(xpath="//*[@aria-labelledby='prime-header-CTA-announce']")
	WebElement TryPrimeButton;
	public AmazonTryPrime(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void TryPrime() {
		TryPrimeButton.click();
	}


}
