package ecomm.amazon.utils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsermanager {
	static WebDriver driver=null;
	public static WebDriver getDriver(String type,String url) {
		if(type.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();	
		 driver=new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")){
			 WebDriver driver=new FirefoxDriver();
		}
		else 
		{
			Assert.assertTrue(false,"No Browser found");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(url);
		 Reporter.log("Navigate using Browser:"+type+"URL"+url);
		 return driver;


	}


}
