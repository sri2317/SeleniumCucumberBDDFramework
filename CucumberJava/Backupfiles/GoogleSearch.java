//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearch {
//	WebDriver driver =null;
//	
//	@Given("Launching the browser")
//	public void launching_the_browser() {
//		String projectpath = System.getProperty("user.dir");
//		System.out.println("Projectpath is :"+projectpath);
//		
//		//System.setProperty("webdriver.chrome.driver", "D:/Cucumber/CucumberJava/src/test/resources/drivers/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
//		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		//"D:/Cucumber/CucumberJava/src/test/resources/drivers/chromedriver.exe" :Absolute path
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //if page is open, but not all the elements are not launched
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		System.out.println("inside step : Launching the browser");
//		
//	}
//
//	@And("User is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.navigate().to("https://google.com");
//		System.out.println("inside step : User is on google search page ");	
//	}
//
//	@When("User enters the text in search box")
//	public void user_enters_the_text_in_search_box() {
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		System.out.println("inside step : User enters the text in search box ");	
//	}
//
//	@And("Clicks on search button")
//	public void clicks_on_search_button() {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		System.out.println("inside step : Clicks on search button ");
//	}
//
//	@Then("user should navigate to search results")
//	public void user_should_navigate_to_search_results() {
//		driver.getPageSource().contains("Online Course");
//		System.out.println("inside step : user should navigate to search results ");
//		driver.close();
//		driver.quit();
//	}
//
//}
