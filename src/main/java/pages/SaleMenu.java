package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaleMenu {

	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/main/div/div[2]/div[1]/div[1]/nav/ul/li/div/div/div/div[1]/ul/li[2]/a")
	private WebElement shirtsLink; 
	
	@FindBy(xpath = "/html/body/main/div/div[2]/div[1]/div[1]/nav/ul/li/div/div/div/div[1]/h4/span")
	private WebElement womenLink;

	public SaleMenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickWomenLink() {
		womenLink.click();
	}
	
	public void clickShirtsLink() {
		shirtsLink.click();
	}
}
