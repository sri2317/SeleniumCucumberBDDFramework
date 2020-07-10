package StepDefinitions;

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
//		home = new HomePage_PF(driver);
//		Thread.sleep(2000);
//		home.checkLogoutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000);
		System.out.println("On home page");
	}


	@When("^Enter HomePage details (.*) and  (.*)$")
	public void enter_HomePage_details_address_and_email(String address, String email) {
		System.out.println("Home page details");
		driver = SingletonDriverClass.getInstance();
		home = new HomePage_PF(driver);
		home.enterAddress(address);
		home.enterEmail(email);
	}

	@And("user click on Save")
	public void user_click_on_Save() {
		System.out.println("user click on Save");
		//home = new HomePage_PF(driver);
//		home.clickOnSave();
	}

	@Then("user details should be saved")
	public void user_details_should_be_saved() {
		System.out.println("user details saved");

		driver.close();
		driver.quit();
	}


}