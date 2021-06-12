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



public class base3 
{
   
	public RemoteWebDriver d1;
	public static final String USERNAME = "utkarshgupta_3spQrV";
	public static final String AUTOMATE_KEY = "uviCdeFchno6PCW6L4gq";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	

class TestClass1 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "chrome");
		capsHashtable.put("browser_version", "latest");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("os_version", "10");
    	capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 1");
		mainTestClass r1 = new mainTestClass();
		r1.executeTest(capsHashtable);
    }


}
class TestClass2 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "firefox");
		capsHashtable.put("browser_version", "latest");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("os_version", "10");
		capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 2");
		mainTestClass r2 = new mainTestClass();
    	r2.executeTest(capsHashtable);
  	}
}
class TestClass3 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "safari");
		capsHashtable.put("browser_version", "latest");
		capsHashtable.put("os", "OS X");
		capsHashtable.put("os_version", "Big Sur");
		capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 3");
		mainTestClass r3 = new mainTestClass();
    	r3.executeTest(capsHashtable);
  	}
}

class TestClass4 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "chrome");
		capsHashtable.put("browser_version", "86.0");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("os_version", "10");
    	capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 1");
		mainTestClass r4 = new mainTestClass();
		r4.executeTest(capsHashtable);
    }
}

class TestClass5 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "chrome");
		capsHashtable.put("browser_version", "87.0");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("os_version", "10");
    	capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 1");
		mainTestClass r5 = new mainTestClass();
		r5.executeTest(capsHashtable);
    }
}

public  RemoteWebDriver initalizeDriver() throws IOException {
	
		Thread object1 = new Thread(new TestClass1());
		object1.start();
		Thread object2 = new Thread(new TestClass2());
		object2.start();
		Thread object3 = new Thread(new TestClass3());
		object3.start();
		Thread object4 = new Thread(new TestClass4());
		object4.start();
		Thread object5 = new Thread(new TestClass5());
		object5.start();
		return d1;
  	}
	
	
	

	public RemoteWebDriver executeTest(Hashtable<String, String> capsHashtable) throws MalformedURLException {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
       		key = itr.next();
       		caps.setCapability(key, capsHashtable.get(key));
    	}
    	RemoteWebDriver d1;
		
			d1 = new RemoteWebDriver(new URL(URL), caps);
			
			
			
			d1.get("https://www.flipkart.com/");
		
			
		return d1;
	}
	


}










