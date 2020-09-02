package feedbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclick {
	 public static WebDriver driver;
	
	
	public static void browserOn() {
		
		
		String browser="chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			 driver=new ChromeDriver();
		}
		
		
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			 driver=new FirefoxDriver();
			
			
			
		}
		

		driver.get("http://www.kamalacinemas.com/");
	    driver.manage().window().maximize();
	
			
		
		
		
		
	}
	

}
