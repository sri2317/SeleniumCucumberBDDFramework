package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(id="logout")
	WebElement btn_logout;

	@FindBy(id="save")
	WebElement btn_save;
	
	@FindBy(id="country")
	WebElement txt_country;
	
	@FindBy(id="address")
	WebElement txt_address;
	
	@FindBy(id="email")
	WebElement txt_email;
	
	@FindBy(id="phone")
	WebElement txt_phone;

	WebDriver driver;

	//constructor
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}
	
	public void enterCountry(String country) {
		txt_country.sendKeys(country);
	}
	
	public void enterAddress(String address) {
		txt_address.sendKeys(address);
	}
	
	public void enterEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void enterPhone(CharSequence[] phone) {
		txt_phone.sendKeys(phone);
	}
	
	public void clickOnSave() {
		btn_save.click();
	}

	
}

