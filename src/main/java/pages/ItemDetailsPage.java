package main.java.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPage {
	
	private WebDriver driver;
	
	//Locators
	@FindBy(xpath = "//*[@id=\"swatchsize\"]/div[1]/ul/li[1]/label/div/img")
	private WebElement color;
	
	@FindBy(xpath = "/html/body/main/div/div[1]/div[2]/section/div[4]/button")
	private WebElement addToBasketButton;
	
	@FindBy(xpath = "//*[@id=\"swatchsize\"]/div[2]/ul[1]/li[1]/label/div/span")
	private WebElement size;
	
	//Constructors
	public ItemDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void changeColor() {
		color.click();
	} 
	
	public void addToBasket() {
		addToBasketButton.click();
	}
	
	public void selectSize() {
		size.click();
	}
}
