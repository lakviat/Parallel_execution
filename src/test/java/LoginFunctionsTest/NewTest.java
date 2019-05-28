package LoginFunctionsTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	String url;
  
	@Test
  public void etsyLogin() {
		
	driver.get(url);	
	
  }
  
  
	@BeforeClass
	
	@Parameters({"browser"})
	
	public void beforeClass(String browser) {
	 if(browser.equals("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	 } else if(browser.equals("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	 }else if (browser.equals("safari")) {
		 driver = new SafariDriver();
	 } else if (browser.equals("ie")) {
		 WebDriverManager.iedriver().setup(); 
		 driver = new InternetExplorerDriver();
	  
	  
	  
  }

	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 url = "https://www.etsy.com/";
	}
  
	@AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.quit();
  }

}
