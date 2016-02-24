package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	private static final String USER_EMAIL = "testuser@test.com";
	
	private static final String USER_PASSWORD = "testuser";
	
	//Locators
	@FindBy(id = "txt-signin-rollover-email")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"txt-signin-rollover-password\"]")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/header/div/nav[2]/div[1]/div/div[2]/div/div/div[1]/form/div[3]/input")
	private WebElement loginButton;
	
	//Constructors
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setCredentials() {
		email.sendKeys(USER_EMAIL);
		password.sendKeys(USER_PASSWORD);
		loginButton.click();
	}
}
