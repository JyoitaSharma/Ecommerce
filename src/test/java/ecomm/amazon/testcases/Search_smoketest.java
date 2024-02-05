package ecomm.amazon.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ecomm.amazon.pageobj.PO_Registration;
import ecomm.amazon.pageobj.PO_Search;
import ecomm.amazon.utils.Browsermanager;


public class Search_smoketest {
	
	@Test(priority=1 )
	@Parameters({"browser","url"})
	public void tc_01_amazonsearch(String browser,String url)
	{
      WebDriver driver=Browsermanager.getDriver(browser,url);
        
        PO_Search obj= PageFactory.initElements(driver,PO_Search.class);
        obj.SearchAProduct("Iphone");
        Assert.assertEquals(driver.getTitle(),"Iphone");
 
 

	}
	@Test(priority=2 )
	public void login_Signin(String browser,String url)
	
	{
	      WebDriver driver=Browsermanager.getDriver(browser,url);
	      PO_Registration obj= PageFactory.initElements(driver,PO_Registration.class);
	      obj.SigninExisting(url);
	      Assert.assertEquals(driver.getTitle(),"Welcome to Amazon");
	      
	      
	
	
	
}
	@Test(priority=3 )
	public void New_registration(String browser,String url)
	
	{
	      WebDriver driver=Browsermanager.getDriver(browser,url);
	      PO_Registration obj= PageFactory.initElements(driver,PO_Registration.class);
	      obj.ClickSignup();
	      obj.NewRegistration(url);
	      Assert.assertEquals(driver.getTitle(),"Welcome to Amazon");
	      
	      
	
	{
	}
}
}