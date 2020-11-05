package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.URL;

public class webDriverTest {

//	@Test	
//	private static void freheart() {
//     System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Website\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//	}
	
	 public static final String USERNAME = "ketanbatra1";
	  public static final String AUTOMATE_KEY = "oBNrqv3Z3YEWYYubFxea";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "80");
	    
	    caps.setCapability("name", "ketanbatra1's First Test");
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
	  }

}
