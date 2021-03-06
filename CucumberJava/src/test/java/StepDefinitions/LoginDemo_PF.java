package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemo_PF {

	WebDriver driver =null;
	LoginPage_PF login; //object or instance
	HomePage_PF home;
	


	@Given("browser is open")

	public void browser_is_open() {
		System.out.println("====I am inside,LoginDemo_PF class====");
		System.out.println("inside step : Launching the browser");

		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is :"+projectpath);

		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver = SingletonDriverClass.getInstance();
		//driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //if page is open, but not all the elements are not launched
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {

		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException{

		driver = SingletonDriverClass.getInstance();
		login = new LoginPage_PF(driver); // constructor cntl on method 
		login.enterUsername(username); //page object model using page factory concept
		login.enterpassword(password);
		Thread.sleep(1000);

		//		driver.findElement(By.id("name")).sendKeys(username);
		//		driver.findElement(By.id("password")).sendKeys(password);
		//		Thread.sleep(2000);
	}

	@And("user click on login")
	public void user_click_on_login() throws InterruptedException {

		login.ClickonLogin();

		//driver.findElement(By.id("login")).click();
		Thread.sleep(10000);
	}

	//	@Then("user is navigated to the home page")
	//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	//		
	//		home = new HomePage_PF(driver);
	//		home.checkLogoutIsDisplayed();
	//		//driver.findElement(By.id("logout")).isDisplayed();
	//		Thread.sleep(2000);


}

