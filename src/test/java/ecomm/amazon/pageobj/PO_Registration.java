package ecomm.amazon.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class PO_Registration {
WebDriver Driver;	
	public PO_Registration(WebDriver driver) {
		this.Driver=driver;
	}
		
		@FindBy(how=How.CLASS_NAME,using="Sign in")
		private WebElement Signin_button;
		@FindBy(how=How.CLASS_NAME,using="email")
		private WebElement Email;
		@FindBy(how=How.ID,using="continue")
		private WebElement Continue;
		@FindBy(how=How.ID,using="signInSubmit")
		private WebElement FinalSignin;
		@FindBy(how=How.CLASS_NAME,using="Start here.")
		private WebElement new_signup;
		
		@FindBy(how=How.ID,using="ap_customer_name")
		private WebElement cust_name;
		@FindBy(how=How.ID,using="ap_email")
		private WebElement cust_email;
		@FindBy(how=How.ID,using="ap_password")
		private WebElement cust_password;
		@FindBy(how=How.ID,using="ap_password_check")
		private WebElement cust_password_confirm;
		@FindBy(how=How.CLASS_NAME,using="a-button-input")
		private WebElement confirm_button;
		//Methods
		public void ClickSignin() {
			Signin_button.sendKeys();
			Reporter.log("Clicked Signin button:",true);
		}
		public void ClickSignup() {
			new_signup.sendKeys();
			Reporter.log("Clicked Signup button:",true);
		}
		public void SigninExisting(String arg) {
			ClickSignin();
			Email.sendKeys(arg);
			Reporter.log("Email entered"+arg,true);
			Continue.click();
			cust_password.sendKeys(arg);
			Reporter.log("Password entered"+arg,true);
			FinalSignin.click();
			String actual=Driver.getTitle();
			String expected="Welcome";
			Reporter.log("Login successful:"+arg,true);
			Assert.assertEquals(actual, expected,"Login Failed");
		}
			
			public void NewRegistration(String arg) {
				ClickSignup();
				cust_name.sendKeys(arg);
				Reporter.log("Full Name entered"+arg,true);
				cust_email.sendKeys(arg);
				Reporter.log("Email is entered"+arg,true);
				cust_password.sendKeys(arg);
				Reporter.log("Password entered"+arg,true);
				cust_password_confirm.sendKeys(arg);
				confirm_button.click();
				String actual=Driver.getTitle();
				String expected="Welcome";
				Reporter.log("User registered:"+arg,true);
				Assert.assertEquals(actual, expected,"Registration Failed");
		
	}
	//

}
