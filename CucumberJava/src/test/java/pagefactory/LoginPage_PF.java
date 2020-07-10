package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.SingletonDriverClass;

public class LoginPage_PF {


	@FindBy(id = "name") //creating locators
	@CacheLookup // same elements in memory - not be searched calling the method
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;

	WebDriver driver = SingletonDriverClass.getInstance();
	
	
//	constructor
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}

	public void ClickonLogin() {
		btn_login.click();
	}

	

}
