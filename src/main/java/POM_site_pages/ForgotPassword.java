package POM_site_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	WebDriver driver;
	
	@FindBy(id="identify_email")
	WebElement PhoneNumber;
	@FindBy(name="did_submit")
	WebElement SearchButton;
	@FindBy(xpath="//*[@classl='uiButtonText']")
	WebElement Cancel;
	
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void PhoneField() {
		PhoneNumber.sendKeys("22345689");
	}
	public void Search() {
		SearchButton.click();
	}
	public void Cancelbt() {
		Cancel.click();
		
	
	
	
	
	
	}

}
