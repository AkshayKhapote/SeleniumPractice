package PageFactory20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createNewAccount {
	
	WebDriver driver;

	public createNewAccount(WebDriver driver) {
		
	 this.driver= driver;
	 
	 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div//ul[@class='menusubnav']//li[5]//a")
	 WebElement newCustomerAccountLik;
	
	@FindBy(xpath="//input[@name='cusid']")
	
	WebElement customerID;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement account_type;
	
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement initialDeposite;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void clickonNewAccount() {
		newCustomerAccountLik.click();
	}
	public void enterCustomerID (String cusIDval) {
		customerID.sendKeys(cusIDval);
		
	}
	
	public Select selectAccountType( ) {
		 
			 Select account = new Select(account_type);
			    account.selectByValue("Savings");	
			    
			    return account;
		}

	public void enterrInitialAmmount(String amount) {
		initialDeposite.sendKeys(amount);
	}
	public void clickOnSubmitbutton() {
		submit.click();
	}
	}
	


