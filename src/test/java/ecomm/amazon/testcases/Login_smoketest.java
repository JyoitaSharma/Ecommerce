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


public class Login_smoketest {
	
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
	@Parameters({"browser","url","username","password"})
	public void login_Signin(String browser,String url,String username,String password) throws InterruptedException
	
	{
	      WebDriver driver=Browsermanager.getDriver(browser,url);
	      PO_Registration obj= PageFactory.initElements(driver,PO_Registration.class);
	      PO_Registration login=new PO_Registration(driver);
	      login.enterUsername("username");
	      login.cust_password("password");
	      login.clickLogin();
	      Thread.sleep(3000);
	      Assert.assertEquals(driver.getTitle(),"Welcome to Amazon");
	      
	      
	
	
	
}
	@Test(priority=3 )
	@Parameters({"browser","url"})
	public void New_registration(String browser,String url) throws InterruptedException
	
	{
	      WebDriver driver=Browsermanager.getDriver(browser,url);
	      PO_Registration obj= PageFactory.initElements(driver,PO_Registration.class);
	      PO_Registration newcustomer=new PO_Registration(driver);
	      newcustomer.EnterName("name");
	      newcustomer.Email("email");
	      newcustomer.EnterPassword("password");
	      newcustomer.EnterPassword("password");
	      newcustomer.ConfirmSignUp();
	      Thread.sleep(3000);
	      Assert.assertEquals(driver.getTitle(),"Welcome to Amazon");
	      
	      
	
	{
	}
}
}