package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;



public class base4 
{
	//public WebDriver d;
		public RemoteWebDriver d1;
		//public Properties p;
		public static final String AUTOMATE_USERNAME = "utkarshgupta_3spQrV";
		public static final String AUTOMATE_ACCESS_KEY = "uviCdeFchno6PCW6L4gq";
		public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		
			public  RemoteWebDriver initalizeDriver() throws IOException
			//public  WebDriver initalizeDriver() throws IOException
		{
			    
			/*String path = System.getProperty("user.dir");
			p=new Properties();
			FileInputStream fis= new FileInputStream(path+"\\src\\main\\java\\Resources\\data.properties");
			p.load(fis);
			String site = p.getProperty("site"); 
			String browser = p.getProperty("browser");		
			if(browser.equalsIgnoreCase("chrome"))
			{System.setProperty("webdriver.chrome.driver", "G:\\BHAI\\setup sele win 64 bit\\Sele jar\\chrome driver\\chromedriver.exe");
			d=new ChromeDriver();}
			
			if(browser.equalsIgnoreCase("firefox"))
			{System.setProperty("webdriver.gecko.driver", "G:\\BHAI\\setup sele win 64 bit\\Sele jar\\chrome driver\\geckodriver.exe");
			d=new FirefoxDriver();} */
		
				DesiredCapabilities caps = new DesiredCapabilities();
				 
			    caps.setCapability("os_version", "10");
			    caps.setCapability("resolution", "1920x1080");
			    caps.setCapability("browser", "Chrome");
			    caps.setCapability("browser_version", "latest-beta");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
			    caps.setCapability("build", "BStack Build Number 1");
		   
			    DesiredCapabilities caps1 = new DesiredCapabilities();
				 
			    caps.setCapability("os_version", "10");
			    caps.setCapability("resolution", "1920x1080");
			    caps.setCapability("browser", "firefox");
			    caps.setCapability("browser_version", "latest");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
			    caps.setCapability("build", "BStack Build Number 1");
		   
			  
			    
				
				
			 d1 = new RemoteWebDriver(new URL(URL), caps);
			 
			 
			 
			 //d1.get(site);
			 d1.get("https://www.flipkart.com/");
			 d1.manage().window().maximize();
			 d1.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
			 return d1;
			
			/* d.get(site);
			 
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
			
			return d; */
		}
	}	
		  
