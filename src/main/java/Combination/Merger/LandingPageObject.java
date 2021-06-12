package Combination.Merger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import Resources.base;
import Resources.base3;

public class LandingPageObject extends base3 {

	public RemoteWebDriver d;
	//public WebDriver d;
	public LandingPageObject(RemoteWebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	/*
	public LandingPageObject(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	} */
	
	private By popup=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	private By searchbutton=By.xpath("//button[@class='L0Z3Pu']");
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	
	//By q=By.id("search");
	
	public WebElement search()
	{
		return search;
		
	}

	public WebElement popup()
	{
		 return d.findElement(popup);
		
	}

	public WebElement searchbutton()
	{
		 return d.findElement(searchbutton);
		
	}

/*public WebElement popup()
	{
		 return d1.findElement(popup);
		
	}

	public WebElement searchbutton()
	{
		 return d1.findElement(searchbutton);
		
	}
*/

}
