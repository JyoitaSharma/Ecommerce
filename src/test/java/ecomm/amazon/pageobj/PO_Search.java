package ecomm.amazon.pageobj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;	

public class PO_Search {
WebDriver Driver;
	
	public PO_Search(WebDriver driver) {
		this.Driver=driver;
		
	}
	//Elements
	@FindBy(how=How.NAME,using="field-keywords")
	private WebElement txtbx_search;
	@FindBy(how=How.ID,using="nav-search-submit-button\"")
	private WebElement button_search;
	//Methods
	public void SetSerchTextBox(String arg) {
		txtbx_search.sendKeys(arg);
		Reporter.log("Product entered in Search Box:"+arg,true);
	}
	
	public void ClickSerachbutton() {
		button_search.sendKeys();
		Reporter.log("Clciked Search button:",true);
	}
	//Business Method
	public void SearchAProduct(String arg) {
		ClickSerachbutton();
		SetSerchTextBox(arg);
		String actual=Driver.getTitle();
		String expected="Iphone";
		Reporter.log("able to search product:"+arg,true);
		Assert.assertEquals(actual, expected,"Product unvailable");
		
	}




}
