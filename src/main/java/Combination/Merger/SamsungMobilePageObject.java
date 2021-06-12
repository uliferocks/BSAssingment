package Combination.Merger;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import Resources.base;
import Resources.base3;

public class SamsungMobilePageObject extends base3 {

	public RemoteWebDriver d1;
	//public WebDriver d;
	public SamsungMobilePageObject(RemoteWebDriver d1)
	{
		this.d1=d1;
		PageFactory.initElements(d1, this);
	}
	/*public SamsungMobilePageObject(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	} */
	
	private By mobileOption=By.xpath("//a[@title='Mobiles']");
	private By fAssured=By.xpath("//div[@class='_24_Dny _3tCU7L']");
	private By samsung=By.xpath("(//div[@class='_24_Dny'])[7]");
	//private By samsung=By.xpath("//label[@class='_2iDkf8 t0pPfW']");
	//private By samsung=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[2]/div[1]/div[2]/div[1]/label[1]/div[2]");
	private By sort=By.xpath("//div[contains(text(),'Price -- High to Low')]");
	private By names=By.xpath("//div[@class='_4rR01T']");
	private By price=By.xpath("//div[@class='_30jeq3 _1_WHN1']");
	private By productPageLink=By.xpath("//div[@class='_4rR01T']");
	private By productPageLinks=By.tagName("a");
	
	
	
	public WebElement mobileOption()
	{
		 return d1.findElement(mobileOption);
		
	}

	public WebElement fAssured()
	{
		 return d1.findElement(fAssured);
		
	}

	public WebElement brand()
	{
		 return d1.findElement(samsung);
		
	}

	public WebElement sort()
	{
		 return d1.findElement(sort);
		
	}

	public List<WebElement> names()
	{
		 return d1.findElements(names);
		
	}
	
	public List<WebElement> price()
	{
		 return d1.findElements(price);
		
	}
	
	public List<WebElement> productPageLink()
	{
		 return d1.findElements(productPageLink);
		
	}
	
	public List<WebElement> productPageLinks()
	{
		 return d1.findElements(productPageLinks);
		
	}
}
