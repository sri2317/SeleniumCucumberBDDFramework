package StepDefinitions;

import org.junit.Assert;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

//import Pages.HomePage;
import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
//import pagefactory.LoginPage_PF;

public class HomePageDemo_PF {

	 WebDriver driver =null;
	//LoginPage_PF login; //object or instance
	HomePage_PF home ;
	//single_instance = null; 
	
	@Given("home page is open")
	
	public void home_page_is_open() throws InterruptedException {
		driver = SingletonDriverClass.getInstance();
		home = new HomePage_PF(driver);
		//Thread.sleep(2000);
		home.checkLogoutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("On home page");
	}


	@When("^Enter HomePage details (.*) and (.*) and (.*) and (.*)$")
	public void enter_HomePage_details_country_and_address_and_email(String country,String address, String email, String phone) {
		System.out.println("Home page details");
		driver = SingletonDriverClass.getInstance();
		home = new HomePage_PF(driver);
		
		home.enterCountry(country);
		home.enterAddress(address);
		home.enterEmail(email);
		home.enterPhone(phone);
		
	}

	@And("user click on Save")
	public void user_click_on_Save() {
		System.out.println("user click on Save");
		//home = new HomePage_PF(driver);
//		home.clickOnSave();
	}

	@Then("user details should be saved")
	public void user_details_should_be_saved() {
		home.clickOnSave();
		System.out.println("user details saved");
		home.success();
		
		driver.close();
		driver.quit();
	}


}