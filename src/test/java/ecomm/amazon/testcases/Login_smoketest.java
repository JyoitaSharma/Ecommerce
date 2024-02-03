package ecomm.amazon.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Login_smoketest {
	
	@Test
	@Parameters({"browser","url"})
	public void tc_01_amazonsearch(String browser,String url)
	{
      WebDriver driver=Browsermanager.getDriver(browser,url);
        
        PO_Search obj= PageFactory.initElements(driver,PO_Search.class);
        obj.SearchAProduct("Iphone");
 
 


}
