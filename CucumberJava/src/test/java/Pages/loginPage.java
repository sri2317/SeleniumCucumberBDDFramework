package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

//	WebDriver driver;
//	
//	By txt_username = By.id("name"); //By is selenium webdriver class
//	
//	By txt_password = By.id("password");
//	
//	By btn_login = By.id("login");
//	
//	By btn_logout =By.id("logout");
	
	//all below methods called atomic 
	
	//to maintain a Webdriver driver variable in same class/ same instance - we are creating a constructor
	
//	public loginPage(WebDriver driver) {  //constructor
//		
//		this.driver = driver;
//		if(!driver.getTitle().equals("TestProject Demo")) {
//			throw new IllegalStateException("This is not login page , The current page is "
//					+ driver.getCurrentUrl());
//		}
//	}
//	
//	public void enterUsername(String username) {
//		driver.findElement(txt_username).sendKeys(username);
//		
//	}
//	
//	public void enterPassword(String password) {
//		driver.findElement(txt_password).sendKeys(password);
//		
//	}
//	
//	
//	public void clickLogin() {
//		
//	driver.findElement(btn_login).click();
//	}
//	
//	public void checkLogoutbtnisDisplayed() {
//		// TODO Auto-generated method stub
//		driver.findElement(By.id("logout")).isDisplayed();
//	}
//	
//	public void loginValidUser(String username, String password) {
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_username).sendKeys(password);
//		driver.findElement(btn_login).click();
//	}
}
