package main.java.tests;

import java.util.concurrent.TimeUnit;

import main.java.pages.ItemDetailsPage;
import main.java.pages.LandingPage;
import main.java.pages.LoginPage;
import main.java.pages.SaleMenu;
import main.java.pages.ShirtsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HMTest {
	private WebDriver driver;

	@BeforeSuite
	public void setup() throws Exception {
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setCredentials();
	}
	@Test
	public void viewShirtTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickSaleMenu();
		
		SaleMenu saleMenu = new SaleMenu(driver);
		saleMenu.clickWomenLink();
		saleMenu.clickShirtsLink();
	}
	
	
	@Test
	public void performSearchTest() throws InterruptedException {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.search("рокля");
	}
	
	@Test
	public void buyItemTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setCredentials();
		
		landingPage.clickSaleMenu();
		
		SaleMenu saleMenu = new SaleMenu(driver);
		saleMenu.clickWomenLink();
		saleMenu.clickShirtsLink();
		
		ShirtsPage shirtsPage = new ShirtsPage(driver);
		shirtsPage.clickFirstItem();
		
		ItemDetailsPage item = new ItemDetailsPage(driver);
		item.changeColor();
		item.selectSize();
		item.addToBasket();

		landingPage = new LandingPage(driver);
		landingPage.logout();
	}
	
	@Test
	public void checkBasket() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.checkBasket();
	}

	@AfterTest
	public void logOut() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.logout();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
	
}
