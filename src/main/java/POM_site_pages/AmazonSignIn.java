package POM_site_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignIn {
	WebDriver driver;

	@FindBy(xpath="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@aria-labelledby='a-autoid-0-announce']")
	WebElement signin;
	public AmazonSignIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void EmailIdField() {
		email.sendKeys("yana@gmail.com");
	}
	public void PasswordField() {
		password.sendKeys("7777777");
	}
	public void SignInButton() {
		signin.click();
	}

}
