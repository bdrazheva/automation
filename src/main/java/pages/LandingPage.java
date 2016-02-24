package main.java.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	private WebDriver driver;
	
	//page url
	private static final String PAGE_URL = "http://www2.hm.com/bg_bg/index.html";
	
	//Locators
	@FindBy(xpath = "/html/body/header/div/nav[2]/div[1]/div/div[2]/a[2]")
	private WebElement loginButton;
	
	@FindBy(xpath = "/html/body/header/div/nav[2]/div[1]/div/div[1]/a[3]")
	private WebElement logOutButton;
	
	@FindBy(xpath = "/html/body/header/div/div[1]/nav/ul/li[5]/a")
	private WebElement saleMenu;
	
	@FindBy(id = "main-search")
	private WebElement search;
	
	@FindBy(xpath = "/html/body/header/div/nav[2]/div[2]/div/a")
	private WebElement basket;
	
	//Constructors
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		this.driver.get(PAGE_URL);
		driver.switchTo().defaultContent();
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	} 
	
	public void clickSaleMenu() {
		saleMenu.click();
	}
	public void logout() {
		logOutButton.click();
	}
	
	public void search(String query) throws InterruptedException {
		search.sendKeys(query);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
	}
	
	public void checkBasket() {
		basket.click();
	}
}
