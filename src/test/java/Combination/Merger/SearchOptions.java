package Combination.Merger;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import Resources.base3;


public class SearchOptions extends base3 {
	public RemoteWebDriver d;
	//public WebDriver d;
	
	@BeforeTest
	public void Start() throws IOException {
		d = executeTest();

	}

	@Test

	public void searchphone() throws IOException {
		LandingPageObject l=new LandingPageObject(d1);
		l.popup().click();
		l.search().sendKeys("Samsung Galaxy S10");
		l.searchbutton().click();
		
	}

	
	@Test(dependsOnMethods = { "searchphone" })
	public void SelectedPage() throws IOException, InterruptedException {
		SamsungMobilePageObject sm=new SamsungMobilePageObject(d1);
		Thread.sleep(6000L);
		sm.mobileOption().click();
		Thread.sleep(6000L);
		sm.brand().click();
		Thread.sleep(6000L);
		sm.fAssured().click();
		
		Thread.sleep(6000L);
		sm.sort().click();
	}
	
	@Test(dependsOnMethods = { "SelectedPage" })
	public void listedData()
	{
		SamsungMobilePageObject sm=new SamsungMobilePageObject(d1);
		
		 List<WebElement> productName = sm.names();
		 List<WebElement> displayPrice = sm.price();
		 List<WebElement> productPageLink = sm.productPageLink();
		 int n= productName.size();
		
		  for(int i=0;i<n;i++){
			  
			  { 	System.out.println("product name= "+ productName.get(i).getText());//fetching all the brands
			  		System.out.println("displayPrice= "+ displayPrice.get(i).getText());
			  		System.out.println("productPageLink= "+ productPageLink.get(i).getText());
			  		System.out.println("");
			  }	
	}
	
	}
	@AfterTest
	public void BurnDown() {
		d1.quit();
	} 

	}

	


