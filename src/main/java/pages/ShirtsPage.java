package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShirtsPage {
	
	private WebDriver driver;
	
	//Locators
	@FindBy(xpath = "/html/body/main/div/div[2]/div[2]/div/div[2]/div[4]/section[1]/div/div/div[1]/article/div[1]/img")
	private WebElement firstItem;
	
	
	//Constructors
	public ShirtsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFirstItem() {
		firstItem.click();
	} 
}
