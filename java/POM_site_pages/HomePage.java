package POM_site_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(name="email")
	WebElement email;
	@FindBy(name="pass")
	WebElement password;
	@FindBy(xpath="//*[@aria-label='Log In']")
	WebElement login;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void EmailIdField() {
		email.sendKeys("yana@gmail.com");
	}
	public void PasswordField() {
		password.sendKeys("7777777");
	}
	public void LoginButton() {
		login.click();
	}
	
	
	
}

























